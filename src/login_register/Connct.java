/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login_register;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camayma_sd2081
 */
public class Connct {
     private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "users_db";
    private static Integer portnumber = 3306 ;
//    private String middlename;
//    private String lastname;
//    private String email;
    private static String password = "";
//    private Integer number;
    
    public static Connection getConnection()
    {
       Connection connect = null;
       
       MysqlDataSource datasource = new MysqlDataSource();
       
       datasource.setServerName(servername);
       datasource.setUser(username);
       datasource.setPassword(password);
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
       
         try {
             connect = datasource.getConnection();
         } catch (SQLException ex) {
             Logger.getLogger( "Get Connection ->" + Connct.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       
       
       return connect;
    }

//    static Object getConnetion() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
