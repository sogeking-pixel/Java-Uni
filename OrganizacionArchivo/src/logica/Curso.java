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
public class Curso implements Serializable{
    private String nombre;
    private int ciclo;
    private int idCurso;
    private int credito;
    private ArrayList codMatricula = new ArrayList();

    public ArrayList getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(ArrayList codMatricula) {
        this.codMatricula = codMatricula;
    }

    public Curso(String nombre, int ciclo, int idCurso, int credito) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.idCurso = idCurso;
        this.credito = credito;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
    
}
