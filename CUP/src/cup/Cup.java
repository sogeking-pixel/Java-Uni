/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author yerso
 */
public class Cup {
    public static void checkLexer(){
        Leer ventana = new Leer();
        ventana.setVisible(true);
    }
    
    public static void generar() throws IOException, Exception{
        String path0="C:\\Users\\yerso\\Documents\\NetBeansProjects\\CUP\\";
        String path=path0+"src\\cup\\";
        String rutaC = path + "entradaCup.jflex";
        String fileG = "Syntactic.java";
        String[] rutaS = {"-parser","Syntactic", path+"Grammar.cup"};
        File archivo = new File(rutaC);
        JFlex.Main.generate(archivo);
        
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(path + "sym.java");
        
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move( Paths.get(path0+"sym.java"), Paths.get(path+"sym.java")  );
        Path rutaSin = Paths.get(path + fileG);
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
         Files.move( Paths.get(path0+fileG), Paths.get(path+fileG) );
         
    }
    
    public static void main(String[] args) throws Exception {
        
        checkLexer();
        //generar();
    }
}
