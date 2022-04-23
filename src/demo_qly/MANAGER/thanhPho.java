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
public class thanhPho extends javax.swing.JFrame {
   DefaultTableModel tblModel = new DefaultTableModel();

public thanhPho() {
initComponents();
show_TP();
setLocationRelativeTo(null);

}

public void show_TP() {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");       
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1");
            System.out.println("Connected to the database");           
            Statement st = con.createStatement();
            String orc = "select * from thanhPho" ;
            ResultSet rs = st.executeQuery(orc);
            this.tblModel = (DefaultTableModel)tbTP.getModel(); 
            String column[] = { "Mã thành phố", "Tên thành phố"};
            this.tblModel.setColumnIdentifiers(column);
            this.tbTP.setModel(tblModel);
            while(rs.next()){
                   Object[] row = new Object[2];
                   row[0] = rs.getString("ma_TP");
                   row[1] = rs.getString("ten_TP");

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
tbTP = new javax.swing.JTable();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("Thành Phố");

tbTP.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {

},
new String [] {
"Mã thành phố", "Tên thành phố"
}
));
jScrollPane1.setViewportView(tbTP);
if (tbTP.getColumnModel().getColumnCount() > 0) {
tbTP.getColumnModel().getColumn(0).setMinWidth(100);
tbTP.getColumnModel().getColumn(0).setMaxWidth(110);
}

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
.addContainerGap())
.addGroup(layout.createSequentialGroup()
.addGap(193, 193, 193)
.addComponent(jLabel1)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(25, 25, 25)
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(27, 27, 27))
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
java.util.logging.Logger.getLogger(thanhPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(thanhPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(thanhPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(thanhPho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new thanhPho().setVisible(true);
}
});
}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable tbTP;
// End of variables declaration//GEN-END:variables
}
