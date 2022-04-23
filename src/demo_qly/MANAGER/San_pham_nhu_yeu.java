/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo_qly.MANAGER;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
 

public class San_pham_nhu_yeu extends javax.swing.JFrame {
   DefaultTableModel tblModel = new DefaultTableModel();
   Connection conn ;
   private ImageIcon format = null;
   String filename = null;
   DefaultTableModel model;
   byte[] path = null;
   Statement st;
  
   PreparedStatement pst = null;
public San_pham_nhu_yeu() {
initComponents();
setLocationRelativeTo(null);
show_SP();
//databaseConnection();
//show();


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
txt_tenSP = new javax.swing.JTextField();
txt_maSP = new javax.swing.JTextField();
txt_dvTinh = new javax.swing.JTextField();
JPath = new javax.swing.JTextField();
txt_Gia = new javax.swing.JTextField();
btnProduct_Image = new javax.swing.JButton();
jScrollPane1 = new javax.swing.JScrollPane();
tblSP = new javax.swing.JTable();
lblImage = new javax.swing.JLabel();
btnAdd = new javax.swing.JButton();
btnEdit = new javax.swing.JButton();
btnDelete = new javax.swing.JButton();
jImageName = new javax.swing.JTextField();
btnFind = new javax.swing.JButton();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Sản Phẩm Nhu Yếu");

jLabel2.setText("Mã sản phẩm");

jLabel3.setText("Tên sản phẩm");

jLabel4.setText("Hình ảnh");

jLabel5.setText("Đơn vị tính");

jLabel6.setText("Đơn giá");

btnProduct_Image.setText("TẢI LÊN");
btnProduct_Image.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnProduct_ImageActionPerformed(evt);
}
});

tblSP.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"
}
));
tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
tblSPMouseClicked(evt);
}
});
jScrollPane1.setViewportView(tblSP);
if (tblSP.getColumnModel().getColumnCount() > 0) {
tblSP.getColumnModel().getColumn(0).setMinWidth(100);
tblSP.getColumnModel().getColumn(0).setMaxWidth(110);
tblSP.getColumnModel().getColumn(3).setMinWidth(140);
tblSP.getColumnModel().getColumn(3).setMaxWidth(150);
tblSP.getColumnModel().getColumn(4).setMinWidth(100);
tblSP.getColumnModel().getColumn(4).setMaxWidth(110);
}

lblImage.setMaximumSize(new java.awt.Dimension(208, 212));
lblImage.setMinimumSize(new java.awt.Dimension(208, 212));

btnAdd.setText("THÊM");
btnAdd.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnAddActionPerformed(evt);
}
});

btnEdit.setText("SỬA");
btnEdit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnEditActionPerformed(evt);
}
});

btnDelete.setText("XÓA");
btnDelete.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnDeleteActionPerformed(evt);
}
});

btnFind.setText("TÌM KIẾM");
btnFind.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnFindActionPerformed(evt);
}
});

jButton1.setText("Quay lại");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jButton2.setText("Sắp xếp giá tăng dần");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setText("Sắp xếp giá giảm dần");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jButton4.setText("Sắp xếp theo mã");
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
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(24, 24, 24)
.addComponent(jLabel2))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel3))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel4))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel5))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel6)))
.addGap(66, 66, 66)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(txt_tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txt_dvTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jImageName, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(58, 58, 58)
.addComponent(btnProduct_Image))
.addComponent(JPath, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(64, 64, 64))
.addGroup(layout.createSequentialGroup()
.addComponent(txt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(btnFind)
.addGap(32, 32, 32))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(jButton4)
.addGap(67, 67, 67)))))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(36, 36, 36)
.addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton2)
.addGap(32, 32, 32)
.addComponent(jButton3)
.addGap(28, 28, 28))))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel1)
.addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
.addGroup(layout.createSequentialGroup()
.addGap(39, 39, 39)
.addComponent(jButton1)))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(83, 83, 83))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jLabel1))
.addGap(38, 38, 38)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(48, 48, 48)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(72, 72, 72)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(btnProduct_Image)
.addComponent(jImageName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txt_tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel3))
.addGap(51, 51, 51)
.addComponent(jLabel4)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
.addComponent(JPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txt_dvTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5))))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(49, 49, 49)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(txt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton3)
.addComponent(jButton4))))
.addGap(37, 37, 37)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(53, 53, 53))
);

pack();
}// </editor-fold>//GEN-END:initComponents
 public void show_SP() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
                }                      
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }
}


public Connection databaseConnection(){
   Connection conn;
   try{
       Class.forName("oracle.jdbc.driver.OracleDriver");    
       conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
       return conn;

}catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        return null;
        }

}


//public ArrayList<Product> productsList()  {
//    ArrayList<Product> productLists = new ArrayList<Product>();       
//    String orc = "select * from San_pham_nhu_yeu" ;
//    Statement st;
//    ResultSet rs;
// try{   
//    st = conn.createStatement();
//    rs = st.executeQuery(orc);
//    Product product = new Product();
//    while(rs.next()){
//    product.setMa_SP(rs.getString("ma_sp"));
//    product.setTen_SP(rs.getString("ten_sp"));
//    product.setHinhAnh(rs.getString("hinh_anh"));
//    product.setDon_vi_tinh(rs.getString("don_vi_tinh"));
//    product.setGia(rs.getInt("don_gia"));
//    } 
//} catch(Exception E){
//            System.out.println("Connection failed");
//            E.printStackTrace();
//}
//    return productLists;         
//}
//
//
//public void show()
//{
//   ArrayList <Product> data = productsList();
//   model = (DefaultTableModel)tblSP.getModel();
//   Object[] rows = new Object[4];
//
//   for (int i =0; i <data.size(); i++){
//   rows[0] = data.get(i).getMa_SP();
//   rows[1] = data.get(i).getTen_SP();
//   rows[2] = data.get(i).getproduct_image();
//   rows[3] = data.get(i).getDon_vi_tinh();
//   rows[4] = data.get(i).getGia();
//   model.addRow(rows);
//
//}
//}
//
//






private void btnProduct_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct_ImageActionPerformed
    String currentPath ="C:\\Users\\PC\\Documents\\NetBeansProjects\\test\\image";
    JFileChooser imageFilechooser = new JFileChooser(currentPath);
    int imageChooser = imageFilechooser.showOpenDialog(null);
    imageFilechooser.showOpenDialog(null);
    File f = imageFilechooser.getSelectedFile();  
    filename = f.getAbsolutePath();  
    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
    lblImage.setIcon(imageIcon);
    //jLocal.setText(filename);
    JPath.setText(filename);
    if (imageChooser == JFileChooser.APPROVE_OPTION)
{
     File imageFile = imageFilechooser.getSelectedFile();
     String imageFileName = imageFile.getName();
     jImageName.setText(imageFileName);
}

    try{
       File image = new File(filename);
       FileInputStream fis = new FileInputStream(image);
       ByteArrayOutputStream bos = new ByteArrayOutputStream();
       byte[] buf= new byte[1024];
         for (int readNum; (readNum= fis.read(buf))!= -1;)
          {
               bos.write(buf, 0, readNum);              
           }
        path=bos.toByteArray();
    }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
}//GEN-LAST:event_btnProduct_ImageActionPerformed

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     String orc ="insert into San_pham_nhu_yeu"
                 +"(ma_sp, ten_sp, hinh_anh, don_vi_tinh, don_gia, Duong_dan)"
                 +"values(?,?,?,?,?,?)";
      PreparedStatement pst = con.prepareStatement(orc);
        if ( txt_tenSP.getText().isEmpty() || jImageName.getText().isEmpty() || txt_dvTinh.getText().isEmpty() || txt_Gia.getText().isEmpty())
{
       JOptionPane.showMessageDialog(null,"Error!!!");

} else {
      pst.setString(1, txt_maSP.getText());
      pst.setString(2, txt_tenSP.getText());
      pst.setString(3, jImageName.getText());
      pst.setString(4, txt_dvTinh.getText());
      pst.setString(5, txt_Gia.getText());
      pst.setBytes(6, path);
}
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Insert Successfully");

   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());

}try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getString("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }   
}//GEN-LAST:event_btnAddActionPerformed

private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
       int row = tblSP.getSelectedRow();
       int vv  = tblSP.getSelectedColumn();
       String tc = tblSP.getModel().getValueAt(row, 0).toString();

      try{
      String query = "SELECT * from San_pham_nhu_yeu where ma_sp='" +tc+"'";
      Connection Conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
      Statement stt = Conn.createStatement();
      ResultSet rs = stt.executeQuery(query); 
       if (rs.next())
      { 
       String ma_SP = rs.getString("ma_sp");
       String ten_SP = rs.getString("ten_sp");
       byte[] image = rs.getBytes("Duong_dan");
       String don_vi_tinh = rs.getString("don_vi_tinh");
       int gia = rs.getInt("don_gia");
       format = new ImageIcon(image);
      

       //JPath.setText(image.toString());
      //System.out.println("Text [Byte Format] : " + image);

      //System.out.println("Text [Byte Format] toString() : " + image.toString());
       //JPath.setText(image.toString());
       lblImage.setIcon(format);
       txt_maSP.setText(ma_SP) ;
       txt_tenSP.setText(ten_SP);
       txt_dvTinh.setText(don_vi_tinh);
       txt_Gia.setText(""+gia);
      
       
      }   
stt.close();
rs.close();
    }catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
}

//----------------------------//
    int i = tblSP.getSelectedRow();
    TableModel model = tblSP.getModel();

    jImageName.setText(model.getValueAt(i, 2).toString());
    JPath.setText("");




}//GEN-LAST:event_tblSPMouseClicked

private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
      String orc ="UPDATE San_pham_nhu_yeu set ten_sp=?, hinh_anh=?, don_vi_tinh=?, don_gia=?, Duong_dan=? where ma_sp=?" ;
      PreparedStatement pst = con.prepareStatement(orc);
        if ( txt_tenSP.getText().isEmpty() || jImageName.getText().isEmpty() || txt_dvTinh.getText().isEmpty() || txt_Gia.getText().isEmpty())
{
       JOptionPane.showMessageDialog(null,"Error!!!");

} else {
      pst.setString(1, txt_tenSP.getText());
      pst.setString(2, jImageName.getText());
      pst.setString(3, txt_dvTinh.getText());
      pst.setString(4, txt_Gia.getText());
      pst.setBytes(5, path);
      pst.setString(6, txt_maSP.getText());
}
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Update Successfully");

   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());

}   
try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }   
}//GEN-LAST:event_btnEditActionPerformed

private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
try{
     Class.forName("oracle.jdbc.driver.OracleDriver");       
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
     String orc ="delete from San_pham_nhu_yeu where ma_sp=?";
      PreparedStatement pst = con.prepareStatement(orc);
      pst.setString(1, txt_maSP.getText());
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Delete Successfully");
   } catch(Exception e)
{
       JOptionPane.showMessageDialog(this,e.getMessage());
}
try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }   
}//GEN-LAST:event_btnDeleteActionPerformed

private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu where ma_sp = '" + txt_maSP.getText() +"'" ;
            //PreparedStatement pst = con.prepareStatement(orc);
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        } }//GEN-LAST:event_btnFindActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Manage_manager hpage3 = new Manage_manager();
        hpage3.show();}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu ORDER BY ma_sp ASC" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }  

}//GEN-LAST:event_jButton4ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu ORDER BY don_gia ASC" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
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
      DefaultTableModel tbModel = (DefaultTableModel) tblSP.getModel();     
     tbModel.setRowCount(0);  
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from San_pham_nhu_yeu ORDER BY don_gia DESC" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblSP.getModel(); 
            String column[] = {"Mã sản phẩm", "Tên sản phẩm", "Hình ảnh", "Đơn vị tính", "Đơn giá", "Đường dẫn"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblSP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[6];
                   row[0] = rs.getString("ma_sp");
                   row[1] = rs.getString("ten_sp");
                   row[2] = rs.getString("hinh_anh");
                   row[3] = rs.getString("don_vi_tinh");
                   row[4] = rs.getInt("don_gia");
                   row[5] = rs.getBytes("Duong_dan");
                   this.tblModel.addRow(row);
             } 
                     
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        } 

}//GEN-LAST:event_jButton3ActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {

java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new San_pham_nhu_yeu().setVisible(true);
}
});
}



// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JTextField JPath;
private javax.swing.JButton btnAdd;
private javax.swing.JButton btnDelete;
private javax.swing.JButton btnEdit;
private javax.swing.JButton btnFind;
private javax.swing.JButton btnProduct_Image;
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JTextField jImageName;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JLabel lblImage;
private javax.swing.JTable tblSP;
private javax.swing.JTextField txt_Gia;
private javax.swing.JTextField txt_dvTinh;
private javax.swing.JTextField txt_maSP;
private javax.swing.JTextField txt_tenSP;
// End of variables declaration//GEN-END:variables
}
