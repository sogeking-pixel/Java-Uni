/*
integrantes :
    SANCHEZ LEIVA YERSON OMAR
    ESCUDERO CHAVEZ ALVARO

*/
package Codigo;

import java.io.Serializable;

/**
 *
 * @author yerso
 */
public class Alumno implements Serializable{
    private String nombre;
    private String apellido;
    private int codigo;
    private int edad;
    private String ciudad;

    public Alumno(String nombre, String apellido, int codigo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", codigo=" + codigo + ", edad=" + edad + ", ciudad=" + ciudad + '}' + "\n";
    }

    

   
    
    
    
    
}
