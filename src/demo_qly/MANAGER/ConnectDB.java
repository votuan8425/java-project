/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_qly.MANAGER;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 19522
 */
public class ConnectDB {
    ConnectDB(){};
    public Connection createCon() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "123456");
            return connection;
        }
        catch(Exception E){
            E.printStackTrace();
            return null;
            
        }
    }
}
