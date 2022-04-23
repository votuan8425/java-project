/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo_qly.MANAGER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Goi_nhu_yeu extends javax.swing.JFrame {

   DefaultTableModel tblModel = new DefaultTableModel();
   Connection conn ;
   private ImageIcon format = null;
   DefaultTableModel model;
   Statement st;
public Goi_nhu_yeu() {
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
            String orc = "select * from Goi_nhu_yeu" ;
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

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
txt_MG = new javax.swing.JTextField();
txt_TG = new javax.swing.JTextField();
txt_GH = new javax.swing.JTextField();
txt_TGGH = new javax.swing.JTextField();
txt_DG = new javax.swing.JTextField();
jScrollPane1 = new javax.swing.JScrollPane();
tblGNY = new javax.swing.JTable();
btn_Add = new javax.swing.JButton();
btn_Edit = new javax.swing.JButton();
btn_Del = new javax.swing.JButton();
btn_Find = new javax.swing.JButton();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Gói nhu yếu");

jLabel2.setText("Mã gói");

jLabel3.setText("Tên gói");

jLabel4.setText("Mức giới hạn cho mỗi người");

jLabel5.setText("Thời gian giới hạn (Ngày)");

jLabel6.setText("Đơn giá");

tblGNY.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã gói", "Tên gói", "Mức giới hạn", "Thời gian giới hạn", "Đơn giá"
}
));
jScrollPane1.setViewportView(tblGNY);

btn_Add.setText("Thêm");
btn_Add.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btn_AddActionPerformed(evt);
}
});

btn_Edit.setText("Sửa");
btn_Edit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btn_EditActionPerformed(evt);
}
});

btn_Del.setText("Xóa");
btn_Del.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btn_DelActionPerformed(evt);
}
});

btn_Find.setText("Tìm kiếm");
btn_Find.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btn_FindActionPerformed(evt);
}
});

jButton1.setText("Quay lại");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jButton2.setText("Sắp xếp theo mã gói");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setText("Sắp xếp giá tăng dần");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jButton4.setText("Sắp xếp giá giảm dần");
jButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton4ActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(63, 63, 63)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel3)
.addComponent(jLabel2))
.addGap(55, 55, 55)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(txt_MG, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
.addComponent(txt_TG)))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel4)
.addGap(31, 31, 31)
.addComponent(txt_GH, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel6)
.addGap(33, 33, 33)
.addComponent(txt_DG, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton2)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(jLabel5)
.addGap(45, 45, 45)
.addComponent(txt_TGGH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(btn_Find)
.addGap(42, 42, 42)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(btn_Add)
.addGap(50, 50, 50)
.addComponent(btn_Edit)
.addGap(55, 55, 55)
.addComponent(btn_Del))
.addGroup(layout.createSequentialGroup()
.addGap(15, 15, 15)
.addComponent(jButton3)
.addGap(18, 18, 18)
.addComponent(jButton4)))
.addGap(13, 13, 13))))
.addGroup(layout.createSequentialGroup()
.addGap(37, 37, 37)
.addComponent(jButton1)
.addGap(219, 219, 219)
.addComponent(jLabel1)))
.addContainerGap(46, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(26, 26, 26)
.addComponent(jButton1)
.addGap(37, 37, 37)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(txt_MG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(25, 25, 25)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(txt_TG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(46, 46, 46)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(txt_GH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel1)
.addGap(29, 29, 29)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(49, 49, 49)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(btn_Find)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(btn_Add)
.addComponent(btn_Edit)
.addComponent(btn_Del))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addComponent(txt_TGGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(46, 46, 46)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(txt_DG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton2)
.addComponent(jButton3)
.addComponent(jButton4))))
.addContainerGap(41, Short.MAX_VALUE))
);

pack();
}// </editor-fold>//GEN-END:initComponents

private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
     try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     String orc ="insert into Goi_nhu_yeu"
                 +"(ma_goi, ten_goi,  muc_gioi_han, thoi_gian_gioi_han, don_gia)"
                 +"values(?,?,?,?,?)";
      PreparedStatement pst = con.prepareStatement(orc);

        if ( txt_MG.getText().isEmpty() || txt_TG.getText().isEmpty() || txt_GH.getText().isEmpty() || txt_TGGH.getText().isEmpty() || txt_DG.getText().isEmpty())
{
       JOptionPane.showMessageDialog(null,"Error!!!");

} else {
      pst.setString(1, txt_MG.getText());
      pst.setString(2, txt_TG.getText());
      pst.setString(3, txt_GH.getText());
      pst.setString(4, txt_TGGH.getText());
      pst.setString(5, txt_DG.getText());
}
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Insert Successfully");

   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());

}
       try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu" ;
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


}//GEN-LAST:event_btn_AddActionPerformed

private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
    try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
      String orc ="UPDATE Goi_nhu_yeu set ten_goi=?, muc_gioi_han=?, thoi_gian_gioi_han=?, don_gia=? where ma_goi=?" ;
      PreparedStatement pst = con.prepareStatement(orc);
        if ( txt_MG.getText().isEmpty() || txt_TG.getText().isEmpty() || txt_GH.getText().isEmpty() || txt_TGGH.getText().isEmpty() || txt_DG.getText().isEmpty())
{
       JOptionPane.showMessageDialog(null,"Error!!!");
} else {
      pst.setString(1, txt_TG.getText());
      pst.setString(2, txt_GH.getText());
      pst.setString(3, txt_TGGH.getText());
      pst.setString(4, txt_DG.getText());
      pst.setString(5,  txt_MG.getText());
}
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Update Successfully");

   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());
}
       try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu" ;
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
        }   }//GEN-LAST:event_btn_EditActionPerformed

private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
      try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu where ma_goi= '" + txt_MG.getText() +"'" ;
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
        }}//GEN-LAST:event_btn_FindActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Manage_manager hpage3 = new Manage_manager();
        hpage3.show();}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu ORDER BY ma_goi ASC" ;
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

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu ORDER BY don_gia ASC" ;
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
        }}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu ORDER BY don_gia DESC" ;
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

}//GEN-LAST:event_jButton4ActionPerformed

private void btn_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DelActionPerformed
try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     String orc ="delete from Goi_nhu_yeu where ma_goi=?";
      PreparedStatement pst = con.prepareStatement(orc);
      pst.setString(1, txt_MG.getText());
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Delete Successfully");
   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());
} 
try{
            DefaultTableModel tbModel = (DefaultTableModel) tblGNY.getModel();     
            tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from Goi_nhu_yeu" ;
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


}//GEN-LAST:event_btn_DelActionPerformed

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
java.util.logging.Logger.getLogger(Goi_nhu_yeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Goi_nhu_yeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Goi_nhu_yeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Goi_nhu_yeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Goi_nhu_yeu().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton btn_Add;
private javax.swing.JButton btn_Del;
private javax.swing.JButton btn_Edit;
private javax.swing.JButton btn_Find;
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tblGNY;
private javax.swing.JTextField txt_DG;
private javax.swing.JTextField txt_GH;
private javax.swing.JTextField txt_MG;
private javax.swing.JTextField txt_TG;
private javax.swing.JTextField txt_TGGH;
// End of variables declaration//GEN-END:variables
}
