package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Reservas extends CodigoComun{
    /*
    private String fechaReserva; //15
    private String fechaPago;    //15
    private String codUser;      //10
    private String estadoDePago; //false Ó true 1
    
    */
    private final int LR = 43;
    
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    private RandomAccessFile fileRandom; //PARA ACCEDER AL ARCHIVO DE FORMA ALEATORIA
    private String RUTA_ARCHIVO = "src/archivos/RESERVAS.txt"; //RUTA DEL ARCHIVO
    private File file = new File(RUTA_ARCHIVO); //VARIABLE PARA PODER MANIPULAR EL ARCHIVO
    ////////////////////*****VARIABLE PARA LOS ARCHIVOS*******///////////////////////
    
    public void editar(int nr, String fechaReserva, String fechaPago, String codUser, String estadoDePago){
        fechaReserva = rrellenarEspacios(fechaReserva, 15);
        fechaPago = rrellenarEspacios(fechaPago, 15);
        codUser = rrellenarEspacios(codUser, 10);
        estadoDePago = rrellenarEspacios(estadoDePago, 1);
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            
            
            int pos = (nr - 1)* LR;
            fileRandom.seek(pos);
            
            fileRandom.writeBytes(fechaReserva);
            fileRandom.writeBytes(fechaPago);
            fileRandom.writeBytes(codUser);
            fileRandom.writeBytes(estadoDePago);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("Registro Modificado..!");
            
        } catch (Exception e) {
            System.out.println("Error Al Escribir: "+e);
        }
    }
    public void escribir(String fechaReserva, String estadoDePago, String fechaPago, String codUser){
        fechaReserva = rrellenarEspacios(fechaReserva, 15);
        fechaPago = rrellenarEspacios(fechaPago, 15);
        codUser = rrellenarEspacios(codUser, 10);
        estadoDePago = rrellenarEspacios(estadoDePago, 1);
        
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            //seek --> ESTA FUNCION SIRVE PARA POSICIONARSE EN UN LUGAR ESPECIFICO DENTRO DEL ARCHIVO
            // NOS POSICIONAMOS AL FINAL DE ARCHIVO PARA PODER ESCRIBIR CADA REGISTRO
            fileRandom.seek(fileRandom.length());
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            fileRandom.writeBytes(fechaReserva);
            fileRandom.writeBytes(fechaPago);
            fileRandom.writeBytes(codUser);
            fileRandom.writeBytes(estadoDePago);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("RESERVA GUARDADO CON EXITO");
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
