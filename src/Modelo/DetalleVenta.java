/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mr540
 */
public class DetalleVenta {
     int id_producto;
    int id_Venta;
    int cantidad;
    int precio;

    public DetalleVenta(int id_producto, int id_Venta, int cantidad, int precio) {
        this.id_producto = id_producto;
        this.id_Venta = id_Venta;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DetalleVenta() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
