/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import Interfaz.Libro;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author yerso
 */
public class JavaApplication2 {

    
    public static void main(String[] args) {
       Libro libro50[]= new Libro[50];
        Libro libro250[]=new Libro[250];
        Libro libro500[]=new Libro[500];
        Libro libro1000[]=new Libro[1000];
        Libro libro5000[]=new Libro[5000];
        Libro libro10000[]=new Libro[10000];
        Libro libro100000[]=new Libro[100000];
        String b;
        for(int i=0; i<50; i++){
            int a = i+ 1000;
            b= GenerarPalabra();            
            libro50[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<250; i++){
            int a = i + 1000;
            b= GenerarPalabra();            
            libro250[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<500; i++){
            int a = i + 1000;
            b= GenerarPalabra();            
            libro500[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<1000; i++){
            int a = i + 1000;
            b= GenerarPalabra();            
            libro1000[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<5000; i++){
            int a = i+ 1000;
            b= GenerarPalabra();            
            libro5000[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<10000; i++){
            int a = i + 1000;
            b= GenerarPalabra();            
            libro10000[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        for(int i=0; i<100000; i++){
            int a = i + 1000;
            b= GenerarPalabra();            
            libro100000[i] = new Libro (a,b,"SOY UN LIBRO INTERESANTE", "SOY EL AUTOR" );
        }
        
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista50.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro50);  
        }catch(IOException e){
        } 
        
        
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista250.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro250);  
        }catch(IOException e){
        }  
        
        
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista500.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro500);  
        }catch(IOException e){
        }  
        
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista1000.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro1000);  
        }catch(IOException e){
        }  
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista5000.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro5000);  
        }catch(IOException e){
        }  
        
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista10000.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro10000);  
        }catch(IOException e){
        }  
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Lista100000.dat"))){
        //Escribimos en el fichero
            oos.writeObject(libro100000);  
        }catch(IOException e){
        }  
        
        
        
        
        
        
        
        JOptionPane.showMessageDialog(null,"vaina");
        Libro aux[]=new Libro[50];
        try(ObjectInputStream ois=new ObjectInputStream (new FileInputStream("Lista50.dat"))){
           while(true){
                aux=(Libro[])ois.readObject();                
           
           }
        
                
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }
    }
    
    
    public static String GenerarPalabra(){
//La variable palabra almacena el resultado final 
         String palabra = ""; 
//La variable caracteres es un número aleatorio entre 2 y 20 que define la 
//longitud de la palabra. 
         int caracteres = (int)(Math.random()*20)+2; 
//Con un bucle for, que recorreremos las veces que tengamos almacenadas en la 
//variable caracteres, que será como mínimo 2, iremos concatenando los 
//caracteres aleatorios. 
         for (int i=0; i<caracteres; i++){ 
//Para generar caracteres aleatorios hay que recurrir al valor numérico de estos 
//caracteres en el alfabeto Ascii. En este programa vamos a generar palabras con 
//letras minúsculas, que se encuentran en el rango 97-122. El método floor 
//devuelve el máximo entero. 
         int codigoAscii = (int)Math.floor(Math.random()*(122 -
         97)+97); 
//para pasar el código a carácter basta con hacer un cast a char 
         palabra = palabra + (char)codigoAscii; 
         } 
         return palabra; 
     } 
}


class BuquedaBinaria {
    
    public Libro binarySearch(Libro arr[], int izq, int derecha, int Codigo) {
        
        
        
        if (derecha >= izq && izq < arr.length - 1) {
            int mitad = izq + (derecha - izq) / 2;
            if (arr[mitad].getCodigoDeLibro() == Codigo)
                return arr[mitad];
            if (arr[mitad].getCodigoDeLibro() > Codigo)
                return binarySearch(arr, izq, mitad - 1, Codigo);
            return binarySearch(arr, mitad + 1, derecha, Codigo);
        }
        return null;
    }
    
}