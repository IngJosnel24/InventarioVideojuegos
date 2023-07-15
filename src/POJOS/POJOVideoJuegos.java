
package POJOS;

import java.math.BigDecimal;

/**
 *
 * @author Oneyker21
 */
public class POJOVideoJuegos extends POJOProducto{
    private int idVideoJuego;
    private String plataforma;

    public POJOVideoJuegos(int idVideoJuego, String plataforma, int id_producto, String nombre, BigDecimal precio_compra, String descripcion, BigDecimal Precio_Venta, int Cantidad, String Categoria) {
        super(id_producto, nombre, precio_compra, descripcion, Precio_Venta, Cantidad, Categoria);
        this.idVideoJuego = idVideoJuego;
        this.plataforma = plataforma;
    }

    public POJOVideoJuegos(String plataforma, String nombre, BigDecimal precio_compra, String descripcion, BigDecimal Precio_Venta, int Cantidad, String Categoria) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad, Categoria);
        this.plataforma = plataforma;
    }

    public int getIdVideoJuego() {
        return idVideoJuego;
    }

    public void setIdVideoJuego(int idVideoJuego) {
        this.idVideoJuego = idVideoJuego;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public BigDecimal getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(BigDecimal precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(BigDecimal Precio_Venta) {
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


