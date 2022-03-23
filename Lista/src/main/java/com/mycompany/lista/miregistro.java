package Codigos;

import java.util.Scanner;

public class miregistro {
 
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        persona datos[] = new persona[5]; 

        for (int i=0; i<5; i++){
          System.out.println("Dime el nombre de la persona "+i );
          String nom=leer.next();
          System.out.println("Dime el apellido de la persona "+i );
          String ape=leer.next();
          System.out.println("Dime la edad de la persona "+i );
          int ed=leer.nextInt();
          System.out.println("Dime la nota de la persona "+i );
          float n=leer.nextFloat();
          datos[i]=new persona(nom, ape, ed, n);
    }

    System.out.println("La persona 3 es " + datos[2].getNombre());

    }
}

// creamos la clase registro
class persona{
    String nombre;
    String apellidos;
    int edad;
    float nota; 

    public persona(String nom,String ape,int ed,float n){
        this.nombre=nom;
        this.apellidos=ape;
        this.edad=ed;
        this.nota=n;
    }


    public String getNombre() {
        return nombre;
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}