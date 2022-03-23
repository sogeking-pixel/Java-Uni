package logica;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yerso
 */
public class CursoMatricula extends Curso implements Serializable {
    
    private int vez;
    private float notaU1;
    private float notaU2;
    private float notaU3;
    private float notaFinal;
    private float sust;

    public CursoMatricula(String nombre, int ciclo, int idCurso, int credito) {
        super(nombre, ciclo, idCurso, credito);
    }

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public float getNotaU1() {
        return notaU1;
    }

    public void setNotaU1(float notaU1) {
        this.notaU1 = notaU1;
    }

    public float getNotaU2() {
        return notaU2;
    }

    public void setNotaU2(float notaU2) {
        this.notaU2 = notaU2;
    }

    public float getNotaU3() {
        return notaU3;
    }

    public void setNotaU3(float notaU3) {
        this.notaU3 = notaU3;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public float getSust() {
        return sust;
    }

    public void setSust(float sust) {
        this.sust = sust;
    }
    
    
    
    
}
