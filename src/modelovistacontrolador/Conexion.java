/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelovistacontrolador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cliente
 */
public class Conexion {
 Connection con;
    String url="jdbc:mysql://localhost:3306/bd_Ventas";
    String user="root";
    String pass="12345678";
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            
        }
        return con;
    }   
}
