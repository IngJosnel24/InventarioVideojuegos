/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mr540
 */
public class Venta {
    String id_Venta;
    String fecha;

    public Venta(String id_Venta, String fecha) {
        this.id_Venta = id_Venta;
        this.fecha = fecha;
    }

    public Venta() {
    }

    public String getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(String id_Venta) {
        this.id_Venta = id_Venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
