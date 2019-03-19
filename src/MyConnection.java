/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis
 */
public class MyConnection {
    
    public Connection getConnection(){
       
        Connection con = null;
       

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/127.0.0.1/voting_db","root","");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }return null;
    }
    
}
