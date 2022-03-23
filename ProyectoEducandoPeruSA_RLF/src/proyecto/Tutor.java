package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tutor extends CodigoComun{
    /*
    private String codTutor;    //10
    private String nomTutor;    //15
    private String sueldoTutor; //10
    
    */
    private final int LR = 37;
    private ArrayList profe= new ArrayList();
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    private RandomAccessFile fileRandom; //PARA ACCEDER AL ARCHIVO DE FORMA ALEATORIA
    private String RUTA_ARCHIVO = "src/archivos/TUTOR.txt"; //RUTA DEL ARCHIVO
    private File file = new File(RUTA_ARCHIVO); //VARIABLE PARA PODER MANIPULAR EL ARCHIVO
    private ManipulacionFile archivo = new ManipulacionFile();
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    
    
    public void escribir(String codTutor, String nomTutor, String sueldoTutor){
        codTutor = rrellenarEspacios(codTutor, 10);
        nomTutor = rrellenarEspacios(nomTutor, 15);
        sueldoTutor = rrellenarEspacios(sueldoTutor, 10);
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            
            fileRandom.seek(fileRandom.length()); //HACEMOS UN SALTO ANTES DE GUARDAR
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            fileRandom.writeBytes(codTutor);
            fileRandom.writeBytes(nomTutor);
            fileRandom.writeBytes(sueldoTutor);
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
    public String mostrarTodo(){
        return archivo.mostrarTodo(LR, RUTA_ARCHIVO);
    }
    
    public ArrayList nombreProfes(){
        profe = archivo.obtenerNombres(LR, RUTA_ARCHIVO, 10,25); //10 inicio, 25 fin
        return profe;
    }
    
}
