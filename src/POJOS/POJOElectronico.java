
/**
 *
 * @author Oneyker21
 */
package POJOS;

public class POJOElectronico extends POJOProducto {
  int id_electronicos;
  String marca;

    public POJOElectronico(String marca, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.marca = marca;
    }

    public POJOElectronico(int id_electronicos, String marca, int id_producto, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(id_producto, nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.id_electronicos = id_electronicos;
        this.marca = marca;
    }

    public int getId_electronicos() {
        return id_electronicos;
    }

    public void setId_electronicos(int id_electronicos) {
        this.id_electronicos = id_electronicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
