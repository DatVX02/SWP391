/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBUtils implements Serializable{
   
    public static Connection makeConnection(){
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ShoesStylize";
            Connection con = DriverManager.getConnection(url,"sa","123453");
            return con;
       }catch(ClassNotFoundException ex){
           ex.printStackTrace();
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
        return null;
    }
}

