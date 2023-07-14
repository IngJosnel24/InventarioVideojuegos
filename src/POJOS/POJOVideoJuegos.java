
package POJOS;

/**
 *
 * @author Oneyker21
 */
public class POJOVideoJuegos extends POJOProducto{
    private int idVideoJuego;
    private String plataforma;

    public POJOVideoJuegos(String plataforma, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.plataforma = plataforma;
    }

    public POJOVideoJuegos(int idVideoJuego, String plataforma, int id_producto, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(id_producto, nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.idVideoJuego = idVideoJuego;
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

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(float Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
 
   
   
}


