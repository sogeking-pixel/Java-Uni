/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema01listas;

import java.io.Serializable;

/**
 *
 * @author yerso
 */
public class Nodo{
    private Nodo siguiente;
    private Cuenta cuenta;

    public Nodo(Nodo siguiente,  Cuenta cuenta) {
        this.siguiente = siguiente;
        this.cuenta = cuenta;
    }

   

    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    

    
    
    
}
