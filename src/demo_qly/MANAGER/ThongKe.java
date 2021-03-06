/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo_qly.MANAGER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;
public class ThongKe extends javax.swing.JFrame {

/**
 * Creates new form ThongKe
 */
public ThongKe() {
initComponents();
}

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

jButton1 = new javax.swing.JButton();
jLabel1 = new javax.swing.JLabel();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jButton1.setText("Thống kê trạng thái bệnh nhân");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("BIỂU ĐỒ THỐNG KÊ");

jButton2.setText("Thống kê nơi điều trị");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setText("Thống kê số dư nợ");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

jButton4.setText("Quay lại");
jButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton4ActionPerformed(evt);
}
});

jButton5.setText("Thống kê tiêu thụ gói nhu yếu");
jButton5.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton5ActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jButton4)
.addGap(47, 47, 47)
.addComponent(jLabel1))
.addGroup(layout.createSequentialGroup()
.addGap(34, 34, 34)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton1)
.addComponent(jButton2))
.addGap(59, 59, 59)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton3)
.addComponent(jButton5))))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(28, 28, 28)
.addComponent(jLabel1))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jButton4)))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jButton5))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton3))
.addContainerGap(28, Short.MAX_VALUE))
);

pack();
}// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cons = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
Statement statement = cons.createStatement();
JasperDesign jd  = JRXmlLoader.load("C:\\Users\\PC\\Documents\\NetBeansProjects\\test\\src\\demo_qly\\MANAGER\\report1.jrxml");
String query="SELECT trang_thai, COUNT(*) as so_luong FROM Nguoi_lq_covid GROUP BY trang_thai";
JRDesignQuery updateQuery = new JRDesignQuery();
updateQuery.setText(query);
jd.setQuery(updateQuery);

JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, cons);

JasperViewer.viewReport(jp);
} catch(Exception E){
System.out.println("Connection failed");
E.printStackTrace();
}

}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Manage_manager hpage3 = new Manage_manager();
        hpage3.show();

}//GEN-LAST:event_jButton4ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cons = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
Statement statement = cons.createStatement();
JasperDesign jd  = JRXmlLoader.load("C:\\Users\\PC\\Documents\\NetBeansProjects\\test\\src\\demo_qly\\MANAGER\\report2_ndt.jrxml");
String query="select ma_dieu_tri,ten_noi_dieu_tri,suc_chua_hien_tai from Noi_dieu_tri";
JRDesignQuery updateQuery = new JRDesignQuery();
updateQuery.setText(query);
jd.setQuery(updateQuery);

JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, cons);

JasperViewer.viewReport(jp);
} catch(Exception E){
System.out.println("Connection failed");
E.printStackTrace();
}

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cons = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
Statement statement = cons.createStatement();
JasperDesign jd  = JRXmlLoader.load("C:\\Users\\PC\\Documents\\NetBeansProjects\\test\\src\\demo_qly\\MANAGER\\report3_du_no.jrxml");
String query="select userName, so_du_no from Chi_tiet_tai_khoan where ma_loai_tk = 'LTK2'";
JRDesignQuery updateQuery = new JRDesignQuery();
updateQuery.setText(query);
jd.setQuery(updateQuery);

JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, cons);

JasperViewer.viewReport(jp);
} catch(Exception E){
System.out.println("Connection failed");
E.printStackTrace();
}

}//GEN-LAST:event_jButton3ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cons = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
Statement statement = cons.createStatement();
JasperDesign jd  = JRXmlLoader.load("C:\\Users\\PC\\Documents\\NetBeansProjects\\test\\src\\demo_qly\\MANAGER\\report4_tieu_thu.jrxml");
String query="select ma_goi,tieu_thu from KHO_GOI";
JRDesignQuery updateQuery = new JRDesignQuery();
updateQuery.setText(query);
jd.setQuery(updateQuery);

JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, cons);

JasperViewer.viewReport(jp);
} catch(Exception E){
System.out.println("Connection failed");
E.printStackTrace();
}}//GEN-LAST:event_jButton5ActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[])  throws Exception{


java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new ThongKe().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JButton jButton5;
private javax.swing.JLabel jLabel1;
// End of variables declaration//GEN-END:variables
}
