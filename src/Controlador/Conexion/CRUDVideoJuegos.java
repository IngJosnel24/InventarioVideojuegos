/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Conexion;

import Conexion.Conexion;
import POJOS.POJOConsumible;
import POJOS.POJOElectronico;
import POJOS.POJOVideoJuegos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SANDRA DIAZ
 */
public class CRUDVideoJuegos {
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void Guardar(POJOVideoJuegos video) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearVideoJuegos(?,?,?,?,?,?,?)}");

            cbst.setString(1, video.getNombre());
            cbst.setBigDecimal(2, video.getPrecio_compra());
            cbst.setBigDecimal(3, video.getPrecio_Venta());
            cbst.setString(4, video.getDescripcion());
            cbst.setInt(5, video.getCantidad());
            cbst.setString(6, video.getCategoria());
            cbst.setString(7, video.getPlataforma());
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Producto", "ID_Videojuegos", "Nombre", "Precio compra", "Precio venta", "Plataforma", "Categoria", "Cantidad", "Descripcion"};
        String[] registro = new String[9];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarVideoJuego}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("id_producto");
                registro[1] = rs.getString("id_videojuegos");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("precio_compra");
                registro[4] = rs.getString("precio_venta");
                registro[5] = rs.getString("plataforma");
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
}
