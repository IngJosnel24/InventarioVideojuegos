package POJOS;

/**
 *
 * @author Oneyker21
 */
public class POJOConsumible extends POJOProducto {

    int id_Consumible;
    String fecha_vencimiento;

    public POJOConsumible(String fecha_vencimiento, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public POJOConsumible(int id_Consumible, String fecha_vencimiento, int id_producto, String nombre, float precio_compra, String descripcion, float Precio_Venta, int Cantidad) {
        super(id_producto, nombre, precio_compra, descripcion, Precio_Venta, Cantidad);
        this.id_Consumible = id_Consumible;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getId_Consumible() {
        return id_Consumible;
    }

    public void setId_Consumible(int id_Consumible) {
        this.id_Consumible = id_Consumible;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
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
