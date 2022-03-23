package logica;


import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yerso
 */
public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private int dni;
    private int codigo;
    private int anoIngreso;
    private int promedioPonderado;
    private ArrayList codMatriculas = new ArrayList();

    public Alumno(String nombre, String apellidos, int dni, int codigo, int anoIngreso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.codigo = codigo;
        this.anoIngreso = anoIngreso;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

    public ArrayList getCodMatriculas() {
        return codMatriculas;
    }

    public void setCodMatriculas(ArrayList codMatriculas) {
        this.codMatriculas = codMatriculas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", codigo=" + codigo + ", anoIngreso=" + anoIngreso + ", promedioPonderado=" + promedioPonderado + '}';
    }
    
    public void matricularse(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public int getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(int promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    
    
    
}
