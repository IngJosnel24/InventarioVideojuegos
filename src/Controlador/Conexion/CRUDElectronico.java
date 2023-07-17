package Controlador.Conexion;

import Conexion.Conexion;
import POJOS.POJOElectronico;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDElectronico {

    private final Conexion con = new Conexion();
    private final Connection cn = con.conectar();

    public void Guardar(POJOElectronico eletronico) {
    try {
        CallableStatement cbst = cn.prepareCall("{call CrearElectronico(?,?,?,?,?,?,?)}");

        cbst.setString(1, eletronico.getNombre());
        cbst.setBigDecimal(2, eletronico.getPrecio_compra());
        cbst.setBigDecimal(3, eletronico.getPrecio_Venta());
        cbst.setString(4, eletronico.getDescripcion());
        cbst.setInt(5, eletronico.getCantidad());
        cbst.setString(6, eletronico.getCategoria());
        cbst.setString(7, eletronico.getMarca());
        

        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}



    public DefaultTableModel mostrarDatos2() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "ID_Electronico", "Nombre", "Precio compra", "Precio venta", " Marca", "Categoria", "Cantidad", "Descripcion"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarElectronico}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id_producto");
                registro[1] = rs.getString("id_electronicos");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("precio_compra");
                registro[4] = rs.getString("precio_venta");
                registro[5] = rs.getString("marca");
                registro[6] = rs.getString("Categoria");
                registro[7] = rs.getString("cantidad");
                registro[8] = rs.getString("descripcion");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
            return null;

        }
    }

    public DefaultTableModel buscarDatosElectronico(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "Codigo", "Nombre", "PrecioCompra", "Descripcion", "Marca", "Categoria"};
        String[] registro = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call BuscarElectronico(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Producto");
                registro[1] = rs.getString("Codigo");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("PrecioCompra");
                registro[4] = rs.getString("Descripcion");
                registro[5] = rs.getString("Marca");
                registro[6] = rs.getString("Categoria");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void eliminarElectronico(int idProducto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarElectronico(?)}");
            cbst.setInt(1, idProducto);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
}


