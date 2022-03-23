
package Proyecto;


public class plato 
{
    private int codigo;
    private String nombre;
    private double precio;
    private double inversion;
    private int calorias;
    private String fecha;

    public plato(int codigo, String nombre, double precio, double inversion, int calorias, String fecha)
            {
                this.codigo=codigo;
                this.nombre=nombre;
                this.precio=precio;
                this.inversion=inversion;
                this.calorias=calorias;
                this.fecha=fecha;    
            }   
    
     public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getInversion() {
        return inversion;
    }

    public int getCalorias() {
        return calorias;
    }

    public String getFecha() {
        return fecha;
    }
}
