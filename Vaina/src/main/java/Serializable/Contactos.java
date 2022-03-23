package Serializable;

import java.io.Serializable;

public class Contactos implements Serializable  {
    
    protected String nombre;
    protected String apellido;
    protected int numero;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public Contactos(String nombre,String apellido,int numero){
    this.nombre=nombre;
    this.apellido=apellido;
    this.numero=numero;
    
    } 
    
}
