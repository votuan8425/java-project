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
public class quan_Huyen extends javax.swing.JFrame {

   DefaultTableModel tblModel = new DefaultTableModel();

public quan_Huyen() {
initComponents();
show_QH();
setLocationRelativeTo(null);

}
public void show_QH() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from quan_Huyen" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tbQH.getModel(); 
            String column[] = { "Mã quận huyện", "Tên quận huyện"};
            this.tblModel.setColumnIdentifiers(column);
            this.tbQH.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[2];
                   row[0] = rs.getString("ma_quanHuyen");
                   row[1] = rs.getString("ten_quanHuyen");
                   
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
tbQH = new javax.swing.JTable();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Quận Huyện");

tbQH.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã quận huyện", "Tên quận huyện"
}
));
jScrollPane1.setViewportView(tbQH);
if (tbQH.getColumnModel().getColumnCount() > 0) {
tbQH.getColumnModel().getColumn(0).setMinWidth(100);
tbQH.getColumnModel().getColumn(0).setMaxWidth(110);
}

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(129, 129, 129)
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(9, 9, 9)
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(40, Short.MAX_VALUE))
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
java.util.logging.Logger.getLogger(quan_Huyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(quan_Huyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(quan_Huyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(quan_Huyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new quan_Huyen().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tbQH;
// End of variables declaration//GEN-END:variables
}
