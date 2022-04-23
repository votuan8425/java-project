/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Buy_User extends javax.swing.JFrame {

    DefaultTableModel tblModel = new DefaultTableModel();

public Buy_User() {
initComponents();
show_SP();
setLocationRelativeTo(null);

}

public void show_SP() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu order by ma_goi ASC" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblGNY.getModel(); 
            String column[] = {"Mã gói", "Tên gói", "Mức giới hạn", "Thời gian giới hạn", "Đơn giá"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblGNY.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[5];
                   row[0] = rs.getString("ma_goi");
                   row[1] = rs.getString("ten_goi");
                   row[2] = rs.getInt("muc_gioi_han");
                   row[3] = rs.getInt("thoi_gian_gioi_han");
                   row[4] = rs.getInt("don_gia");
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

jScrollPane1 = new javax.swing.JScrollPane();
tblGNY = new javax.swing.JTable();
jLabel1 = new javax.swing.JLabel();
txt_MG = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

tblGNY.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã gói", "Tên gói", "Mức giới hạn", "Thời gian giới hạn", "Đơn giá"
}
));
jScrollPane1.setViewportView(tblGNY);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Gói nhu yếu");

jLabel2.setText("Nhập mã gói nhu yếu");

jButton1.setText("Thêm");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(200, 200, 200)
.addComponent(jLabel1))
.addGroup(layout.createSequentialGroup()
.addGap(24, 24, 24)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addGap(45, 45, 45)
.addComponent(jLabel2)
.addGap(18, 18, 18)
.addComponent(txt_MG, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jButton1)))
.addContainerGap(31, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(41, 41, 41)
.addComponent(jLabel1)
.addGap(34, 34, 34)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txt_MG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel2)
.addComponent(jButton1))
.addGap(27, 27, 27))
);

pack();
}// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     String orc ="insert into dichVu"
                 +"(ma_DV, ma_nguoi_lien_quan, ma_goi, ma_dieu_tri)"
                 +"values(null,'07',?,'MDT7')";
      PreparedStatement pst = con.prepareStatement(orc);
        if (txt_MG.getText().isEmpty() )
{
       JOptionPane.showMessageDialog(null,"Error!!!");

} else {
      pst.setString(1, txt_MG.getText());

      }
      
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Insert Successfully");

   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());

}}//GEN-LAST:event_jButton1ActionPerformed

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
java.util.logging.Logger.getLogger(Buy_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Buy_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Buy_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Buy_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Buy_User().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tblGNY;
private javax.swing.JTextField txt_MG;
// End of variables declaration//GEN-END:variables
}
