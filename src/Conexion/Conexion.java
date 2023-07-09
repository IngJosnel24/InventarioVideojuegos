package Conexion;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Oneyker21
 */
public class Conexion {

    
    private final String 
            conexionUrl = "jdbc:sqlserver://localhost:49720;"
            + "database=DB_ELTORO;"
            + "integratedSecurity = true;" + " encrypt= true;trustServerCertificate= true;";

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
