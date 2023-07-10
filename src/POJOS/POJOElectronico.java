
/**
 *
 * @author Oneyker21
 */
package POJOS;

public class POJOElectronico extends POJOProducto {
    
    
    private int idElectronico;
    private int idProducto;
    private String codigo;
    private String nombre;
    private double precioCompra;
    private String descripcion;
    private String marca;
    private String categoria;

    public POJOElectronico(String Nombre, String Descripcion, String Cantidad, String Precio, String Categoria) {
        super( Nombre, Descripcion, Cantidad, Precio, Categoria);
    }

    public POJOElectronico(int idProducto, String nombre, String categoria, String Nombre, String Descripcion, String Cantidad, String Precio, String Categoria) {
        super(Nombre, Descripcion, Cantidad, Precio, Categoria);
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.categoria = categoria;
    }



    

    
    
   public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
