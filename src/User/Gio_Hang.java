/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Gio_Hang extends javax.swing.JFrame {
    DefaultTableModel tblModel = new DefaultTableModel();

public Gio_Hang() {
initComponents();
        ngclList();
        setLocationRelativeTo(null);
    }
    public void ngclList() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select ma_DV, ma_goi from dichVu where ma_nguoi_lien_quan='07'";
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tblGH.getModel(); 
            String column[] = {"Mã dịch vụ", "Mã gói"};
            this.tblModel.setColumnIdentifiers(column);
            this.tblGH.setModel(tblModel);
                   System.out.println("108");

            while(rs.next()){
                   Object[] row = new Object[2];
                   row[0] = rs.getString("ma_DV");
                   row[1] = rs.getString("ma_goi");
                   this.tblModel.addRow(row);
            }       
               
            }
       catch(Exception E){
            System.out.println("Connection failed");
            E.printStackTrace();
        }
}

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
tblGH = new javax.swing.JTable();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setText("Giỏ hàng");

tblGH.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã dịch vụ", "Mã gói"
}
));
jScrollPane1.setViewportView(tblGH);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap(67, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(222, 222, 222))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(47, 47, 47))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(40, 40, 40)
.addComponent(jLabel1)
.addGap(33, 33, 33)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(41, Short.MAX_VALUE))
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
java.util.logging.Logger.getLogger(Gio_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Gio_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Gio_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Gio_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Gio_Hang().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tblGH;
// End of variables declaration//GEN-END:variables
}