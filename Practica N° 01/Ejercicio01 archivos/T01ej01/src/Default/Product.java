package Default;

public class Product {
    //data abstraction
    private int code;
    private String description;
    private int stock;
    private int minStock;
    
    //procedimental abstraction
    
    public Product(int code, String description, int stock, int minStock){
        this.code = code;
        this.description = description;
        this.stock = stock;
        this.minStock = minStock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }
    
    public boolean compareCodes(int code){
        return getCode() == code;
    }
    
    public void addStock(int cant){
        this.stock = this.stock + cant;
    }
    
    public void removeStock(int cant){
        this.stock = this.stock-cant;
    }
    @Override
    public String toString() {
        return "Producto: "+code+"\n"+"Descripcion: "+description+"\n"+"Stock Actual: "+stock+"\nStock Minimo: "+minStock;
    } 
}
