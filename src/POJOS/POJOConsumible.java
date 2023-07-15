package POJOS;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Oneyker21
 */
public class POJOConsumible extends POJOProducto {

    int id_Consumible;
    Date fecha_vencimiento;

    public POJOConsumible(int id_Consumible, Date fecha_vencimiento, int id_producto, String nombre, BigDecimal  precio_compra, String descripcion, BigDecimal  Precio_Venta, int Cantidad, String Categoria) {
        super(id_producto, nombre, precio_compra, descripcion, Precio_Venta, Cantidad, Categoria);
        this.id_Consumible = id_Consumible;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public POJOConsumible(Date fecha_vencimiento, String nombre, BigDecimal  precio_compra, String descripcion, BigDecimal  Precio_Venta, int Cantidad, String Categoria) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad, Categoria);
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public POJOConsumible(int id_Consumible, Date fecha_vencimiento, String nombre, BigDecimal precio_compra, String descripcion, BigDecimal Precio_Venta, int Cantidad, String Categoria) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad, Categoria);
        this.id_Consumible = id_Consumible;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    
    
    public int getId_Consumible() {
        return id_Consumible;
    }

    public void setId_Consumible(int id_Consumible) {
        this.id_Consumible = id_Consumible;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    

}
