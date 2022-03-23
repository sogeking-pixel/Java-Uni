
public class Producto {
    
    private int codigo;
    private String descripcion;
    private int stock;
    private Fecha fecha;

    public Producto(int codigo, String descripcion, int stock, Fecha fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.fecha = fecha;
    }

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    public void removerProducto (int cantidad){
        this.stock=this.stock-cantidad;
    }
    
    
    
}
