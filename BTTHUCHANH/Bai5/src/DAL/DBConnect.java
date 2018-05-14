/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author buihu
 */
public class DBConnect {
    static String urlCon = "jdbc:sqlserver://DESKTOP-4729RC4\\SQLEXPRESS:1433;databaseName=QuanLyBanHang; user=sa; password=sa";
    static Connection conn = null;
    public static Connection MoKetNoi() {
      try{
          conn = DriverManager.getConnection(urlCon);
          return conn;
      }  catch (SQLException ex){
          return null;
      }
    }
    
    
    
}
