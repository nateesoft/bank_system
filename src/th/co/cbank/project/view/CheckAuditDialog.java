package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.util.NumberFormat;

public class CheckAuditDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(CheckAuditDialog.class);

    public CheckAuditDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        clearAllModel();

        tbProfile.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbSaveAccount.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransactionLoan.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));

        tbProfile.setRowHeight(30);
        tbSaveAccount.setRowHeight(30);
        tbTransaction.setRowHeight(30);
        tbTransactionLoan.setRowHeight(30);

        JTableHeader h1 = tbProfile.getTableHeader();
        h1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h2 = tbSaveAccount.getTableHeader();
        h2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h3 = tbTransaction.getTableHeader();
        h3.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));
        
        JTableHeader h4 = tbTransactionLoan.getTableHeader();
        h4.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, 12));

        tbProfile.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtWithdraw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProfile = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSaveAccount = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTransactionLoan = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานความเคลื่อนไหวรายบุคคล");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ตารางสมุดบัญชีเงินฝาก");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ยอดเงินนำฝาก");

        txtWithdraw.setEditable(false);
        txtWithdraw.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdraw.setText("0.00");
        txtWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("บาท");

        txtDeposit.setEditable(false);
        txtDeposit.setBackground(new java.awt.Color(255, 255, 204));
        txtDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDeposit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDeposit.setText("0.00");
        txtDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("บาท");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ยอดเงินถอน");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(txtWithdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ - สกุล", "เงินฝาก", "หุ้น", "หนี้"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProfile.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProfileMouseClicked(evt);
            }
        });
        tbProfile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbProfileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbProfileKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbProfile);
        if (tbProfile.getColumnModel().getColumnCount() > 0) {
            tbProfile.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProfile.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่ เวลา", "รายการ", "จำนวนหุ้น", "ฝากเงิน", "ถอนเงิน", "ค่าธรรมเนียม", "ยอด balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbTransaction);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ตารางข้อมูลลูกค้า");

        tbSaveAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสบัตร", "บัญชีเงินฝาก", "ยอดเงินฝาก", "ค่าธรรมเนียม"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSaveAccount);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("ตารางความเคลื่อนไหวเงินฝาก-ถอน พร้อมหุ้น");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ออก (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbTransactionLoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่ เวลา", "รายการ", "ยอดชำระหนี้", "ดอกเบี้ย", "ยอด balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbTransactionLoan);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("ตารางความเคลื่อนไหวเงินกู้");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProfileMouseClicked
        if (tbProfile.getSelectedRow() != -1) {
            loadData();
        }
    }//GEN-LAST:event_tbProfileMouseClicked

    private void tbProfileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProfileKeyReleased
        if (tbProfile.getSelectedRow() != -1) {
            loadData();
        }
    }//GEN-LAST:event_tbProfileKeyReleased

    private void tbProfileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProfileKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_tbProfileKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbProfile;
    private javax.swing.JTable tbSaveAccount;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTable tbTransactionLoan;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables

    private void clearAllModel() {
        DefaultTableModel model1 = (DefaultTableModel) tbProfile.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tbSaveAccount.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tbTransaction.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tbTransactionLoan.getModel();

        int size1 = model1.getRowCount();
        for (int i = 0; i < size1; i++) {
            model1.removeRow(0);
        }

        int size2 = model2.getRowCount();
        for (int i = 0; i < size2; i++) {
            model2.removeRow(0);
        }

        int size3 = model3.getRowCount();
        for (int i = 0; i < size3; i++) {
            model3.removeRow(0);
        }
        
        int size4 = model4.getRowCount();
        for (int i = 0; i < size4; i++) {
            model4.removeRow(0);
        }

        try {
            String sql = "select p_index, p_custcode, p_custname, "
                    + "p_custsurname, save_balance,hoon_qty,loan_balance "
                    + "from cb_profile order by p_custcode";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 1;
            while (rs.next()) {
                model1.addRow(new Object[]{
                    count,
                    rs.getString(2),
                    ThaiUtil.ASCII2Unicode(rs.getString(3)+" "+rs.getString(4)),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                });
                count++;
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadData() {
        DefaultTableModel model2 = (DefaultTableModel) tbSaveAccount.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tbTransaction.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tbTransactionLoan.getModel();

        int size2 = model2.getRowCount();
        for (int i = 0; i < size2; i++) {
            model2.removeRow(0);
        }

        int size3 = model3.getRowCount();
        for (int i = 0; i < size3; i++) {
            model3.removeRow(0);
        }
        
        int size4 = model4.getRowCount();
        for (int i = 0; i < size4; i++) {
            model4.removeRow(0);
        }

        String custCode = "" + tbProfile.getValueAt(tbProfile.getSelectedRow(), 1);

        try {
            String sql = "select b_cust_code, account_code, b_balance,b_fee "
                    + "from cb_save_account where b_cust_code='" + custCode + "'";
            ResultSet rs1 = MySQLConnect.getResultSet(sql);
            while (rs1.next()) {
                model2.addRow(new Object[]{
                    rs1.getString(1),
                    rs1.getString(2),
                    rs1.getString(3),
                    rs1.getString(4)
                });
            }

            rs1.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            String sql = "select t_date, t_time, t_custcode, t_acccode, t_balance, t_amount,"
                    + "money_in,money_out,t_fee,t_description "
                    + "from cb_transaction_save "
                    + "where t_custcode='" + custCode + "' "
                    + "order by t_date, t_time";
            ResultSet rs1 = MySQLConnect.getResultSet(sql);
            double deposit = 0.00;
            double withdraw = 0.00;
            double hoon = 0.00;
            while (rs1.next()) {
                model3.addRow(new Object[]{
                    rs1.getString("t_acccode"),
                    rs1.getString("t_date")+" "+rs1.getString("t_time"),
                    ThaiUtil.ASCII2Unicode(rs1.getString("t_description")),
                    rs1.getString("t_amount"),
                    rs1.getString("money_in"),
                    rs1.getString("money_out"),
                    rs1.getString("t_fee"),
                    rs1.getString("t_balance")
                });

                deposit += rs1.getDouble(5);
                withdraw += rs1.getDouble(6);
                hoon = rs1.getDouble(4);
            }

            txtDeposit.setText(NumberFormat.showDouble2(deposit));
            txtWithdraw.setText(NumberFormat.showDouble2(withdraw));

            rs1.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        // รายละเอียดเงินกู้
        try {
            String sql = "select t_date, t_time, t_custcode, t_acccode, t_balance, t_amount,t_interest,t_description "
                    + "from cb_transaction_loan "
                    + "where t_custcode='" + custCode + "' "
                    + "order by t_date, t_time";
            ResultSet rs1 = MySQLConnect.getResultSet(sql);
            while (rs1.next()) {
                model4.addRow(new Object[]{
                    rs1.getString("t_acccode"),
                    rs1.getString("t_date")+" "+rs1.getString("t_time"),
                    ThaiUtil.ASCII2Unicode(rs1.getString("t_description")),
                    rs1.getString("t_amount"),
                    rs1.getString("t_interest"),
                    rs1.getString("t_balance")
                });
            }
            rs1.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
