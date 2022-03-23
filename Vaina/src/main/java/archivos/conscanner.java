package archivos;

import java.util.Scanner;

public class conscanner {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nom=leer.next();
        System.out.println("su nombre es: "+nom);
    }
    
}
