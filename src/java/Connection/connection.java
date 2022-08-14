/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;

/**
 *
 * @author Ariiq Yusuf
 */
public class connection {
    public Connection con; //buat atribut con dari class Connection
    public void openConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //tipe jdbc
            String url = "jdbc:mysql://localhost:3306/agenz";
            String username = "root"; //user login 
            String password = ""; //password login 
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Successfully Connected");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
