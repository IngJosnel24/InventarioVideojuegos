package POJOS;

/**
 *
 * @author Oneyker21
 */

public class POJOConsumible extends POJOProducto {
    private int idConsumible;
    private int idProducto;
    private String nombre;
    private double precioCompra;
    private String descripcion;
    private String fechaVencimiento;

    public POJOConsumible() {
    }

    public POJOConsumible(int idConsumible, int idProducto, String nombre, double precioCompra, String descripcion,
            String fechaVencimiento) {
        this.idConsumible = idConsumible;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdConsumible() {
        return idConsumible;
    }

    public void setIdConsumible(int idConsumible) {
        this.idConsumible = idConsumible;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
