
package POJOS;

/**
 *
 * @author Usuario
 */
public class POJOProducto {
    
    int ID_Producto;
    String Nombre;
    String Descripcion;
    String Cantidad;
    String Precio;
    String Categoria;

    public POJOProducto(int ID_Producto, String Nombre, String Descripcion, String Cantidad, String Precio, String Categoria) {
        this.ID_Producto = ID_Producto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Categoria = Categoria;
    }

    

    public POJOProducto(String Nombre, String Descripcion, String Cantidad, String Precio, String Categoria) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Categoria = Categoria;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
    
}
