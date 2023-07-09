
package Controlador.Conexion;

import Conexion.Conexion;
import POJOS.POJOProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mr540
 */
public class CRUDProducto {

     private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void Guardar(POJOProducto Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearProducto(?,?,?,?,?)}");

            cbst.setString(1, Cl.getNombre());
            cbst.setString(2, Cl.getDescripcion());
            cbst.setString(3, Cl.getCantidad());
            cbst.setString(4, Cl.getPrecio());
            cbst.setString(5, Cl.getCategoria());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel mostrarDatosProducto() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "Nombre", "Descripcion", "Cantidad", "Precio", "Categoria"};
        String[] registro = new String[6];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProducto}");
            rs = cbstc.executeQuery();

            while (rs.next()) {

                registro[0] = rs.getString("ID_Producto");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Descripcion");
                registro[3] = rs.getString("cantidad");
                registro[4] = rs.getString("Precio");
                registro[5] = rs.getString("Categoria");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel buscarDatosProducto(String Dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "Nombre", "Descripcion", "Cantidad", "Precio", "Categoria"};
        String[] registro = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarProducto(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Producto");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Descripcion");
                registro[3] = rs.getString("cantidad");
                registro[4] = rs.getString("Precio");
                registro[5] = rs.getString("Categoria");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void EliminarProducto(int ID_Producto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarProducto(?)}");
            cbst.setInt(1, ID_Producto);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarDatosProducto(POJOProducto C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarProducto(?,?,?,?,?,?)}");

            cbst.setInt(1, C5.getID_Producto());
            cbst.setString(2, C5.getNombre());
            cbst.setString(3, C5.getDescripcion());
            cbst.setString(4, C5.getCantidad());
            cbst.setString(5, C5.getPrecio());
            cbst.setString(6, C5.getCategoria());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
