/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSqlServer {
    
    Connection conexion = null;
    
    String usuario = "databaseJava";
    String contrasena = "1234";
    String db = "ConexionJava";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection obtenerConexion() {
    
        try{
            
          String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db+";encrypt=true;trustServerCertificate=true;";
          conexion = DriverManager.getConnection(cadena, usuario, contrasena);
          JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
            e.printStackTrace();
        }
        return conexion;
        
    }
    
}
