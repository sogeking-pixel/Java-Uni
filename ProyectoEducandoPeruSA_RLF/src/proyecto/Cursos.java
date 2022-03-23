package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cursos extends CodigoComun{
    /*
    private String codCurso;    //TAM MAXIMO = 10
    private String nombreCurso; //TAM MAXIMO = 20
    private String costoCurso;  //TAM MAXIMO = 7
    private String codTutor;    //TAM MAXIMO = 10
    
    */
    private final int LR = 49; //LONGITUD POR REGISTRO
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    private RandomAccessFile fileRandom; //PARA ACCEDER AL ARCHIVO DE FORMA ALEATORIA
    private String RUTA_ARCHIVO = "src/archivos/CURSOS.txt"; //RUTA DEL ARCHIVO
    private File file = new File(RUTA_ARCHIVO); //VARIABLE PARA PODER MANIPULAR EL ARCHIVO
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    
    public void escribir(String codCurso, String nombreCurso, String costoCurso, String codTutor, String ciclo){
        codCurso = rrellenarEspacios(codCurso, 10);
        nombreCurso = rrellenarEspacios(nombreCurso, 20);
        costoCurso = rrellenarEspacios(costoCurso, 7);
        codTutor = rrellenarEspacios(codTutor, 10);
        ciclo = rrellenarEspacios(ciclo, 2);
        
        
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            //seek --> ESTA FUNCION SIRVE PARA POSICIONARSE EN UN LUGAR ESPECIFICO DENTRO DEL ARCHIVO
            // NOS POSICIONAMOS AL FINAL DE ARCHIVO PARA PODER ESCRIBIR CADA REGISTRO
            fileRandom.seek(fileRandom.length());
            
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            //fileRandom.writeBytes(nombre+apellido+edad+correo);
            fileRandom.writeBytes(codCurso);
            fileRandom.writeBytes(nombreCurso);
            fileRandom.writeBytes(costoCurso);
            fileRandom.writeBytes(codTutor);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("CURSO GUARDADO CON EXITO");
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
    
}
