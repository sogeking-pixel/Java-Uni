package archivos;

import java.io.*;
import java.util.Scanner;

public class LecturaTxt {
    public static void main(String[] args) {
        File fichero=new File("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Ficheros\\src\\archivos\\amigos.txt");
        Scanner s= null;        
        try{
            System.out.println("El contenido del fichero es:");
            s=new Scanner(fichero);
            
            while(s.hasNextLine()){
                String linea=s.nextLine();
                System.out.println(linea);               
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                if(s!=null) s.close();
            }catch(Exception ex2){
                System.out.println(ex2.getMessage());
            }
        }
    }
 
}
