/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.io.Serializable;

/**
 *
 * @author yerso
 */
public class Persona implements Serializable {
    private int dni;

    public Persona(int dni) {
        this.dni = dni;
    }

    
        
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DNI=" + dni + "\n";
    }
    
    
}
