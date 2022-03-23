package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuarios extends CodigoComun{
    /*
    private String codigo;      // TAM MAXIMO = 10
    private String nombre;      // TAM MAXIMO = 15
    */
    private final int LR = 27;
    private ArrayList nombre = new ArrayList();
    
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    private RandomAccessFile fileRandom; //PARA ACCEDER AL ARCHIVO DE FORMA ALEATORIA
    private String RUTA_ARCHIVO = "src/archivos/USUARIOS.txt"; //RUTA DEL ARCHIVO
    private File file = new File(RUTA_ARCHIVO); //VARIABLE PARA PODER MANIPULAR EL ARCHIVO
    private ManipulacionFile archivo = new ManipulacionFile();
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    

    public void escribir(String codigo, String nombre){
        codigo = rrellenarEspacios(codigo, 10);
        nombre = rrellenarEspacios(nombre, 15);
        //COD_USER_CURSO   ---- 10 ESPACIOS
        
        String id="";
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            //seek --> ESTA FUNCION SIRVE PARA POSICIONARSE EN UN LUGAR ESPECIFICO DENTRO DEL ARCHIVO
            
            
            
            // NOS POSICIONAMOS AL FINAL DE ARCHIVO PARA PODER ESCRIBIR CADA REGISTRO
            fileRandom.seek(fileRandom.length());
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            fileRandom.writeBytes(codigo);
            fileRandom.writeBytes(nombre);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("USUARIO GUARDADO CON EXITO");
        } catch (Exception e) {
            System.out.println("Error Al Escribir en USUARIOS.txt: "+e);
        }
        finally{
            if (fileRandom != null) {
                try {
                   fileRandom.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar archivo de texto: "+e.getMessage());
                }   
            }
        }
    }
    public ArrayList verUsuarios(){
        return nombre = archivo.obtenerNombres(LR, RUTA_ARCHIVO, 10, 25); //10 inicio, 25 fin 
    }
    public String verCodigo(int nr){
        return archivo.buscarRegistro(nr, LR, RUTA_ARCHIVO, 0, 10);
    }
    
    
}
