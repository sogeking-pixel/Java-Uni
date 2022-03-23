package logica;


import java.io.ObjectOutputStream;
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
public class Profesor implements Serializable{
    private String nombres;
    private String apellidos;    
    private int codigo;
    private ArrayList codCurso= new ArrayList();

    public Profesor(String nombres, String apellidos, int codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(ArrayList codCurso) {
        this.codCurso = codCurso;
    }
    
    
    
    
}
