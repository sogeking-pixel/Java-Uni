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
public class Matricula implements Serializable {
    
    private int codigo;
    private int periodo;
    private int codAlumno;
    private ArrayList<CursoMatricula> cursos = new ArrayList<CursoMatricula>();
    private int creditoTotal;

    public Matricula(int codigo, int periodo) {
        this.codigo = codigo;
        this.periodo = periodo;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    public ArrayList<CursoMatricula> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<CursoMatricula> cursos) {
        this.cursos = cursos;
    }

    
   

    public int getCreditoTotal() {
        return creditoTotal;
    }

    public void setCreditoTotal(int creditoTotal) {
        this.creditoTotal = creditoTotal;
    }
    
    
}
