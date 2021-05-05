
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang
 */
public class DAO {
    public Connection getConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databasename=AdventureWorks2019;";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String userName = "sa";
            String password = "hoang2110";
            Class.forName(driver);
            conn = DriverManager.getConnection(url,userName,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    } 
}
