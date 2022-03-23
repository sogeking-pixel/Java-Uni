package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class UserCurso extends CodigoComun{
    /*
    private String codUser;  //TAM MAXIMO = 10
    private String codCurso; //TAM MAXIMO = 10
    */
    private final int LR = 22;
    
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    private RandomAccessFile fileRandom; //PARA ACCEDER AL ARCHIVO DE FORMA ALEATORIA
    private String RUTA_ARCHIVO = "src/archivos/USER_CURSO.txt"; //RUTA DEL ARCHIVO
    private File file = new File(RUTA_ARCHIVO); //VARIABLE PARA PODER MANIPULAR EL ARCHIVO
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    
    public void escribir(String cod_user, String cod_curso){
        cod_user = rrellenarEspacios(cod_user, 15);
        cod_curso = rrellenarEspacios(cod_curso, 10);
        
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            //seek --> ESTA FUNCION SIRVE PARA POSICIONARSE EN UN LUGAR ESPECIFICO DENTRO DEL ARCHIVO
            // NOS POSICIONAMOS AL FINAL DE ARCHIVO PARA PODER ESCRIBIR CADA REGISTRO
            fileRandom.seek(fileRandom.length());
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            fileRandom.writeBytes(cod_user);
            fileRandom.writeBytes(cod_curso);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("USER-CURSO GUARDADO CON EXITO");
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
