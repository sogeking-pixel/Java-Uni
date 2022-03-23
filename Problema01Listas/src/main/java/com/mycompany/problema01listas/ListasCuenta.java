/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema01listas;


import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author yerso
 */
    public class  ListasCuenta {
    
   private int tamano;
   private Nodo inicio;

    public ListasCuenta() {
        this.tamano=0;
        this.inicio=null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
   
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamano(){
        return tamano;
    }
   
    public void vaciar(){
        inicio = null;
        tamano =0;
    }
   
    public void insertarPrimero(Cuenta alumno){
       
        Nodo nuevo = new Nodo(inicio, alumno);
        inicio = nuevo;
        tamano++;
    }
    
    public void insertarFinal(Cuenta cuenta){
        Nodo nuevo= new Nodo(null, cuenta);
        if(inicio == null){
            inicio = nuevo;
        }
        else{
            Nodo actual = inicio;
            while(actual.getSiguiente()!=null){
                actual = actual.getSiguiente();                
            }
            actual.setSiguiente(nuevo);            
            tamano++;
        }
    }
    
    public void insertarPosicion(Cuenta cuenta, int n){
        
        int i=0;       
        
        
        if(n==0){
            insertarPrimero(cuenta);
        }
        else{
            if(n==tamano-1){
                insertarFinal(cuenta);
            }
            else{
                Nodo actual = inicio;
                Nodo aux=null;
                    
                boolean b= false;
                while(!b){
                    if(i==n){
                       b=true;
                    }
                    else{                        
                        aux=actual;
                        actual= actual.getSiguiente();
                        i++;
                    }
                }
                Nodo nuevo= new Nodo(actual, cuenta);
                aux.setSiguiente(nuevo);
                tamano++;
            }
        }
                       
            
        
    }
    
public void remover(String apellido){
    
    
    if(this.inicio==null){
        JOptionPane.showMessageDialog(null,"NO HAY NINGUN ELEMENTO EN LA LISTA");
    }
    else{
        if(this.inicio.getCuenta().getNumeroDeCuenta().equals(apellido)){
            this.inicio = this.inicio.getSiguiente();            
            this.tamano--;
        }
        else{
            Nodo actual = this.inicio;
            while(actual.getSiguiente() != null && !actual.getSiguiente().getCuenta().getNumeroDeCuenta().equals(apellido)){
                actual = actual.getSiguiente();
            }
            if(actual.getSiguiente()==null){
                JOptionPane.showMessageDialog(null,"NO EXISTE EL ELEMENTO EN LA LISTA");
            }
            else{
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
               this.tamano--;
            }
        }
    }    
   

}
    
    public String listar(){
            Nodo actual = inicio;
            String lista=null;
            int i =0;
            
            
                while(actual != null){
                    
                    if(lista == null){
                        lista = i + ") " + actual.getCuenta().toString()+ " \n";
                    }
                    else{
                        lista = lista +  i + ") " + actual.getCuenta().toString()+ " \n";
                    }
                    actual = actual.getSiguiente();
                    i++;
               }
           
            
           
                
            
            return lista;
    }

    public boolean Buscar(String codigo){
        Nodo actual = inicio;
        boolean bandera = false;
        while(actual != null){
            if(actual.getCuenta().getNumeroDeCuenta().equals(codigo)){
                bandera = true;
            }
            
            actual = actual.getSiguiente();
        }
        
        return bandera;
    }
    
}
