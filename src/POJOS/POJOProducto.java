package POJOS;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public class POJOProducto {

    int id_producto;
    String nombre;
    BigDecimal  precio_compra;
    String descripcion;
    BigDecimal  Precio_Venta;
    int Cantidad;
    String Categoria;

    public POJOProducto(int id_producto, String nombre, BigDecimal  precio_compra, String descripcion, BigDecimal  Precio_Venta, int Cantidad, String Categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.descripcion = descripcion;
        this.Precio_Venta = Precio_Venta;
        this.Cantidad = Cantidad;
        this.Categoria = Categoria;
    }

    public POJOProducto(String nombre, BigDecimal  precio_compra, String descripcion, BigDecimal  Precio_Venta, int Cantidad, String Categoria) {
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.descripcion = descripcion;
        this.Precio_Venta = Precio_Venta;
        this.Cantidad = Cantidad;
        this.Categoria = Categoria;
    }
    
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal  getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(BigDecimal  precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal  getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(BigDecimal  Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    

    
  
}
