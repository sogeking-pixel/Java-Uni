/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lengujeautomatas;

import java.io.File;

/**
 *
 * @author yerso
 */
public class hola {
    public static void checkLexer(){
        Leer ventana = new Leer();
        ventana.setVisible(true);
    }
    
    public static void generarLexer(){
        String ruta="C:\\Users\\yerso\\Documents\\NetBeansProjects\\LaboratorioLenguaje01\\src\\lengujeautomatas\\entrada.jflex";
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
    public static void main(String[] args) {
        
        checkLexer();
       //generarLexer();
    }
}
