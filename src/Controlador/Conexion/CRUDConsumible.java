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
            cbst.setFloat(2, Cl.getPrecio_compra());

            cbst.setFloat(3, Cl.getPrecio_Venta());

            cbst.setString(4, Cl.getDescripcion());
            cbst.setString(5, Cl.getFecha_vencimiento());
            cbst.setInt(6, Cl.getCantidad());
            cbst.setString(7, Cl.getCategoria());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    
    
    
    
    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto","ID_Consumible", "Nombre", "Precio compra", "precio venta", "Descripcion", "Fecha vencimiento", "Cantidad"};
        String[] registro = new String[8];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarConsumible}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id_producto");
                registro[1] = rs.getString("id_Consumible");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("precio_compra");
                registro[4] = rs.getString("Precio_Venta");
                registro[5] = rs.getString("descripcion");
                registro[6] = rs.getString("fecha_vencimiento");
                registro[7] = rs.getString("Cantidad");
                

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
            CallableStatement cbst = cn.prepareCall("{call ModificarConsumible(?,?,?,?,?,?,?,?)}");

            cbst.setInt(1, C1.getId_producto());
            cbst.setString(2, C1.getNombre());
            cbst.setFloat(3, C1.getPrecio_compra());
            cbst.setFloat(4, C1.getPrecio_Venta());
            cbst.setString(5, C1.getDescripcion());
            cbst.setString(6, C1.getFecha_vencimiento());
            cbst.setInt(7, C1.getCantidad());
            cbst.setString(8, C1.getCategoria());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
