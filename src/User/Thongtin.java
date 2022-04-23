/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Thongtin extends javax.swing.JFrame {

/**
 */
public Thongtin() {
initComponents();
showTT();
setLocationRelativeTo(null);
txt_MNCL.setEditable(false);
txt_Ho.setEditable(false);
txt_Ten.setEditable(false);
txt_CMND.setEditable(false);
txt_NS.setEditable(false);
txt_DC.setEditable(false);
txt_TT.setEditable(false);
txt_NDT.setEditable(false);
txt_LQDA.setEditable(false);


}

public void showTT()
{
try{      
   String query ="select* from Nguoi_lq_covid where ma_nguoi_lien_quan='07'";
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     //String orc ="update YUN.sanPham set ten_san_pham=?, ma_nha_cung_cap=?, ma_loai_hang=?, gia_nhap=?, gia_ban=? where ma_SP = ?";
      //con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED); // chỉnh giá sản phẩm cho Non-read
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(query);

        if (rs.next())
{
     txt_MNCL.setText(rs.getString("ma_nguoi_lien_quan"));
     txt_Ho.setText(rs.getString("ho"));
     txt_Ten.setText(rs.getString("ten"));
     txt_CMND.setText(rs.getString("CMND"));
     txt_NS.setText(rs.getString("nam_sinh"));
     txt_DC.setText(rs.getString("dia_chi"));
     txt_TT.setText(rs.getString("trang_thai"));
     txt_NDT.setText(rs.getString("noi_dieu_tri"));
     txt_LQDA.setText(rs.getString("lien_quan_den_ai"));
     txt_LSDQT.setText(rs.getString("lich_su_qua_trinh"));

}
       else { txt_CMND.setText("");}
   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());
}

}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jLabel7 = new javax.swing.JLabel();
jLabel8 = new javax.swing.JLabel();
jLabel9 = new javax.swing.JLabel();
jLabel10 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
txt_MNCL = new javax.swing.JTextField();
txt_Ten = new javax.swing.JTextField();
txt_Ho = new javax.swing.JTextField();
txt_NS = new javax.swing.JTextField();
txt_LSDQT = new javax.swing.JTextField();
txt_CMND = new javax.swing.JTextField();
txt_TT = new javax.swing.JTextField();
txt_LQDA = new javax.swing.JTextField();
txt_DC = new javax.swing.JTextField();
jLabel11 = new javax.swing.JLabel();
txt_NDT = new javax.swing.JTextField();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Thông tin");

jLabel2.setText("Mã người cách ly");

jLabel3.setText("Họ");

jLabel4.setText("Tên");

jLabel5.setText("CMND");

jLabel6.setText("Năm sinh");

jLabel7.setText("Địa chỉ");

jLabel8.setText("Trạng thái");

jLabel9.setText("Liên quan đến ai");

jLabel10.setText("Lịch sử quá trình");

jButton1.setText("Quay lại");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jLabel11.setText("Nơi điều trị");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jButton1)
.addComponent(jLabel2))
.addGap(176, 176, 176)
.addComponent(jLabel6)
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(txt_NS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txt_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txt_NDT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(244, 244, 244)
.addComponent(jLabel1))
.addGroup(layout.createSequentialGroup()
.addGap(122, 122, 122)
.addComponent(txt_MNCL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel3)
.addComponent(jLabel4))
.addGap(35, 35, 35)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(txt_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel5)
.addGap(23, 23, 23)
.addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel10)
.addGap(27, 27, 27)
.addComponent(txt_LSDQT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(86, 86, 86)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(82, 82, 82)
.addComponent(txt_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(jLabel8)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel9)
.addGap(18, 18, 18)
.addComponent(txt_LQDA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(jLabel7)
.addComponent(jLabel11))))
.addGap(0, 151, Short.MAX_VALUE))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(22, 22, 22)
.addComponent(jLabel1))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jButton1)))
.addGap(31, 31, 31)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(jLabel6)
.addComponent(txt_MNCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txt_NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(32, 32, 32)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(txt_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7)
.addComponent(txt_DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(38, 38, 38)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel11)
.addComponent(txt_NDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(32, 32, 32)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(45, 45, 45)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel10)
.addComponent(txt_LSDQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel8)
.addComponent(txt_TT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(32, 32, 32)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel9)
.addComponent(txt_LQDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
.addContainerGap(37, Short.MAX_VALUE))
);

pack();
}// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Manager_User MU = new Manager_User();
        MU.show();
}//GEN-LAST:event_jButton1ActionPerformed

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
java.util.logging.Logger.getLogger(Thongtin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Thongtin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Thongtin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Thongtin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Thongtin().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel10;
private javax.swing.JLabel jLabel11;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JTextField txt_CMND;
private javax.swing.JTextField txt_DC;
private javax.swing.JTextField txt_Ho;
private javax.swing.JTextField txt_LQDA;
private javax.swing.JTextField txt_LSDQT;
private javax.swing.JTextField txt_MNCL;
private javax.swing.JTextField txt_NDT;
private javax.swing.JTextField txt_NS;
private javax.swing.JTextField txt_TT;
private javax.swing.JTextField txt_Ten;
// End of variables declaration//GEN-END:variables
}
