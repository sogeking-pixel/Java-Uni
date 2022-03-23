/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolorganizacionarchivo;

/**
 *
 * @author yerso
 */
public class Nodo {
    private String dato;
    private Nodo Izquierda;
    private Nodo Derecha;
    private int factorEquilibrio;
    public Nodo(String dato) {
        this.dato = dato;
    }

    public Nodo(String dato, Nodo Izquierda, Nodo Derecha) {
        this.dato = dato;
        this.Izquierda = Izquierda;
        this.Derecha = Derecha;
        this.factorEquilibrio = 0;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo Derecha) {
        this.Derecha = Derecha;
    }

    public int getFactorEquilibrio() {
        return factorEquilibrio;
    }

    public void setFactorEquilibrio(int factorEquilibrio) {
        this.factorEquilibrio = factorEquilibrio;
    }

    

   
    
    
    
    
}
