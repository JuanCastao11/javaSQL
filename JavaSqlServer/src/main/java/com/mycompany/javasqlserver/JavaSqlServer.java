/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javasqlserver;

import java.sql.Connection;

/**
 *
 * @author juanm
 */
public class JavaSqlServer {

    public static void main(String[] args) {
      ConexionSqlServer con = new ConexionSqlServer();
      Connection conexion = con.obtenerConexion();
    }
}
///Juan Manuel Castaño