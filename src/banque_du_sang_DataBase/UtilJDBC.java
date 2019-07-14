/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque_du_sang_DataBase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mmtsh
 */
public class UtilJDBC {
    
    
    public static Connection seConnecte(){
        Connection conn = null;
        String user = "sang";
        String password = "sang";
        String url = "jdbc:oracle:thin:@localhost:1521/xe";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UtilJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
