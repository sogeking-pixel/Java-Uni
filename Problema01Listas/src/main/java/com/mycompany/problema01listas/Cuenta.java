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
public class Cuenta implements Serializable{
    private String nombre;
    private String informacion;
    private String numeroDeCuenta;
    private float saldo;

    public Cuenta(String nombre, String informacion, String numeroDeCuenta, float saldo) {
        this.nombre = nombre;
        this.informacion = informacion;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta: [" + "NUMERO DE CUENTA: " + numeroDeCuenta + " ]\n [ Informacion = " + informacion + " , Nombre = " + nombre + ", saldo = " + saldo + "]\n";
    }
    
    
}
