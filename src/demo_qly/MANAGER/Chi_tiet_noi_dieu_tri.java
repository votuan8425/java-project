/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo_qly.MANAGER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Chi_tiet_noi_dieu_tri extends javax.swing.JFrame {
   DefaultTableModel tblModel = new DefaultTableModel();

public Chi_tiet_noi_dieu_tri() {
initComponents();
setLocationRelativeTo(null);
show_CTNDT();
}


public void show_CTNDT() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Chi_tiet_noi_dieu_tri" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tbCTNDT.getModel(); 
            String column[] = {"Mã điều trị", "Mã người liên quan", "Ngày chuyển tới", "Ngày chuyển đi", "Mã thành phố", "Mã quận huyện", "Mã phường xã" };
            this.tblModel.setColumnIdentifiers(column);
            this.tbCTNDT.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[7];
                   row[0] = rs.getString("ma_dieu_tri");
                   row[1] = rs.getString("ma_nguoi_cl");
                   row[2] = rs.getString("ngay_chuyen_toi");
                   row[3] = rs.getString("ngay_chuyen_di");
                   row[4] = rs.getString("ma_TP");
                   row[5] = rs.getString("ma_quanHuyen");
                   row[6] = rs.getString("ma_phuongXa");                  

                   this.tblModel.addRow(row);
                }                      
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
tbCTNDT = new javax.swing.JTable();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Chi tiết nơi điều trị");

tbCTNDT.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã điều trị", "Mã người liên quan", "Ngày chuyển đi", "Ngày chuyển tới", "Mã thành phố", "Mã quận huyện", "Mã phường xã"
}
));
jScrollPane1.setViewportView(tbCTNDT);
if (tbCTNDT.getColumnModel().getColumnCount() > 0) {
tbCTNDT.getColumnModel().getColumn(0).setMinWidth(80);
tbCTNDT.getColumnModel().getColumn(0).setMaxWidth(80);
tbCTNDT.getColumnModel().getColumn(1).setMinWidth(120);
tbCTNDT.getColumnModel().getColumn(1).setMaxWidth(120);
tbCTNDT.getColumnModel().getColumn(4).setMinWidth(120);
tbCTNDT.getColumnModel().getColumn(4).setMaxWidth(120);
tbCTNDT.getColumnModel().getColumn(5).setMinWidth(120);
tbCTNDT.getColumnModel().getColumn(5).setMaxWidth(120);
tbCTNDT.getColumnModel().getColumn(6).setMinWidth(120);
tbCTNDT.getColumnModel().getColumn(6).setMaxWidth(120);
}

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(300, 300, 300)
.addComponent(jLabel1)
.addContainerGap(367, Short.MAX_VALUE))
.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(21, 21, 21)
.addComponent(jLabel1)
.addGap(29, 29, 29)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(117, Short.MAX_VALUE))
);

pack();
}// </editor-fold>//GEN-END:initComponents

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
 */
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(Chi_tiet_noi_dieu_tri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Chi_tiet_noi_dieu_tri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Chi_tiet_noi_dieu_tri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Chi_tiet_noi_dieu_tri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Chi_tiet_noi_dieu_tri().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tbCTNDT;
// End of variables declaration//GEN-END:variables
}
