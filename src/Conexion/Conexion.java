package Conexion;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Oneyker21
 */
public class Conexion {

    
    private final String 
<<<<<<< HEAD
            conexionUrl = "jdbc:sqlserver://localhost:49720;"
            + "database=DB_ELTORO;"
//49720
=======
            conexionUrl = "jdbc:sqlserver://localhost:51386;"
            + "database=DB_ELTORO"
//51386
>>>>>>> dec30762279d61353fde2e3dd61411c4efab8cdd
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
