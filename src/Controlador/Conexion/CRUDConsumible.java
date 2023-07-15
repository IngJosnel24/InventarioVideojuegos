/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Conexion;

import Conexion.Conexion;
import POJOS.POJOConsumible;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class CRUDConsumible {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void Guardar(POJOConsumible Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearConsumible(?,?,?,?,?,?,?)}");

            cbst.setString(1, Cl.getNombre());
            cbst.setBigDecimal(2, Cl.getPrecio_compra());
            cbst.setBigDecimal(3, Cl.getPrecio_Venta());

            cbst.setString(4, Cl.getDescripcion());

            cbst.setInt(5, Cl.getCantidad());
            cbst.setString(6, Cl.getCategoria());

            cbst.setDate(7, Cl.getFecha_vencimiento());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Consumible", "Nombre", "Precio compra", "Precio venta", "Fecha vencimiento", "Categoria", "Cantidad"};
        String[] registro = new String[7];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarConsumible}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id_Consumible");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("precio_compra");
                registro[3] = rs.getString("precio_venta");
                registro[4] = rs.getString("fecha_vencimiento");
                registro[5] = rs.getString("Categoria");
                registro[6] = rs.getString("cantidad");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
            return null;

        }
    }

    public DefaultTableModel buscarDatosConsumible(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "Nombre", "Precio compra", "Precio venta", "Fecha vencimiento", "Categoria", "Cantidad"};
        String[] registro = new String[7];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarConsumible(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id_producto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("precio_compra");
                registro[3] = rs.getString("precio_venta");
                registro[4] = rs.getString("fecha_vencimiento");
                registro[5] = rs.getString("Categoria");
                registro[6] = rs.getString("cantidad");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void Eliminar(int id_producto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarConsumible(?)}");
            cbst.setInt(1, id_producto);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarDatos(POJOConsumible C1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarConsumible(?,?,?,?,?,?,?)}");

            cbst.setInt(1, C1.getId_Consumible());
            cbst.setString(2, C1.getNombre());
            cbst.setBigDecimal(3, C1.getPrecio_compra());
            cbst.setBigDecimal(4, C1.getPrecio_Venta());
            cbst.setString(5, C1.getDescripcion());
            cbst.setDate(6, C1.getFecha_vencimiento());
            cbst.setInt(7, C1.getCantidad());
            cbst.setString(8, C1.getCategoria());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
