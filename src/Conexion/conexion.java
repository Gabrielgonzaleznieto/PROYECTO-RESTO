/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel gonzalez
 */
public class conexion {

private static final String user="root"; //nombre de usuario

private static final String pass=""; //contraseña de tu MySQL

private static final String url="jdbc:mysql://localhost/prueba";

private static  Connection Conn;

 

public static Connection getConnection(){

try{

Conn=DriverManager.getConnection(url,user,pass);

}catch(SQLException e){

JOptionPane.showMessageDialog(null, "error de conexion "+e.getMessage());

}

return Conn;

}
    public static ResultSet getTabla(String Consulta) {
        Connection conn=getConnection();
        Statement st;
        ResultSet datos=null;
        try{
            st=conn.createStatement();
            datos=st.executeQuery(Consulta);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
}
  
    
    
    
    
    
    
    
    
    
    
    

