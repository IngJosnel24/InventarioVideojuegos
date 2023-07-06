/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mr540
 */
public class Conexion {
    
    private final String 
            conexionUrl = "jdbc:sqlserver://localhost:1433;"
            + "database=DB_ELTORO"
            + "integratedSecurity = true;" + " encrypt= true;trustServerCertificate= true;";
//Puertos 1433 y 49720
    Connection cn;

    public Connection conectar() { //constructor de la clase
        try {
            //usando Driver Conector y cadena de conexion para conectar BD
            cn = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexión Establecida");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error de la conexión: " + e);

        }
        return null;
    }
    
}
