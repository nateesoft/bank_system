package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import th.co.cbank.project.log.Log;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;

public class CbProfileControl {

    public static boolean saveLoanAllow(String idCard, double tCreditAmt) {
        try {
            String sql = "update cb_profile set "
                    + "Loan_Credit_Amt = '" + tCreditAmt + "',"
                    + "Loan_Credit_Balance = '" + tCreditAmt + "' "
                    + "where p_CustCode='" + idCard + "';";
            MySQLConnect.exeUpdate(sql);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
            return false;
        }
    }

    public static ArrayList<Object[]> getApproveLimitMoreZero(String custCode) {
        ArrayList<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + custCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        }

        return list;
    }

    public static ArrayList<Object[]> searchCustomerApproveLimitMoreZero(String custCode, String searchText) {
        ArrayList<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + custCode + "' "
                    + "and p_custName like '%" + ThaiUtil.Unicode2ASCII(searchText) + "%'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        }
        
        return list;
    }
    
    public static ArrayList<Object[]> getProfileListOrderByCustCode() {
        ArrayList<Object[]> list = new ArrayList();
        try {
            String sql = "select p_custcode,p_custname,p_custsurname,save_balance,hoon_qty,loan_balance "
                    + "from cb_profile order by p_custcode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 1;
            while (rs.next()) {
                list.add(new Object[]{
                    count,
                    rs.getString("p_custcode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custname")+" "+rs.getString("p_custsurname")),
                    NumberFormat.showDouble2(rs.getString("save_balance")),
                    NumberFormat.showDouble2(rs.getString("hoon_qty")),
                    NumberFormat.showDouble2(rs.getString("loan_balance"))
                });
                count++;
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list;
    }
}
