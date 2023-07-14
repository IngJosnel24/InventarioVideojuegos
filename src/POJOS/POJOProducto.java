package POJOS;

/**
 *
 * @author Usuario
 */
public class POJOProducto {

    int id_producto;

    String nombre;
    float precio_compra;
    String descripcion;
    float Precio_Venta;
    String Categoria;
    int Cantidad;

    public POJOProducto(int id_producto, String nombre, float precio_compra, String descripcion, float Precio_Venta, String Categoria, int Cantidad) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.descripcion = descripcion;
        this.Precio_Venta = Precio_Venta;
        this.Categoria = Categoria;
        this.Cantidad = Cantidad;
    }

    public POJOProducto(String nombre, float precio_compra, String descripcion, float Precio_Venta, String Categoria, int Cantidad) {
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.descripcion = descripcion;
        this.Precio_Venta = Precio_Venta;
        this.Categoria = Categoria;
        this.Cantidad = Cantidad;
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

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

   

}
