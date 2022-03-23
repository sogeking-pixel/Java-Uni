package archivos;

import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class ArchivoPlato {
    
    private RandomAccessFile fileRandom; 
    //private String RUTA_ARCHIVO = "src/ArchiosPlato/Plato.txt";
    private String salto=System.getProperty("line.separator");//hacer salto de linea
    private final int LR = 72; // LR = LONGITUD DE REGISTRO
    
    private String rrellenarEspacios(String texto, int tam){
        if(texto.length() > tam){return "TAMAÑO  EXEDIDO";}
        if(texto.length() != tam){
            int res = (tam - texto.length());//calcular cuantos espacios quedan disponibles de los 'N' espacios reservados
            for (int i = 0; i < res; i++) {
                texto+=" ";//rrellena los espacios faltantes con ESPACIOS en blanco
            }
        }
        return texto;
    }
    
    public void guardarEnArchivo(String codigo, String nombre, String precio, String inversion, String calorias, String ruta)
    {
        codigo = rrellenarEspacios(codigo, 10);
        nombre = rrellenarEspacios(nombre, 30);
        precio = rrellenarEspacios(precio, 10);
        inversion = rrellenarEspacios(inversion, 10);
        calorias = rrellenarEspacios(calorias, 10);
        //fecha = rrellenarEspacios(fecha, 15);
        
        
        try {
            fileRandom = new RandomAccessFile(ruta,"rw"); //accedemos al archivo
            
            //seek --> ESTA FUNCION SIRVE PARA POSICIONARSE EN UN LUGAR ESPECIFICO DENTRO DEL ARCHIVO
            // NOS POSICIONAMOS AL FINAL DE ARCHIVO PARA PODER ESCRIBIR CADA REGISTRO
            fileRandom.seek( fileRandom.length() );  
            //fileRandom.length()  --- > obtiene el tamaño total del archivo
            
            //ESCRIBIMOS EL REGISTRO DENTRO DEL ARCHIVO
            fileRandom.writeBytes(codigo);
            fileRandom.writeBytes(nombre);
            fileRandom.writeBytes(precio);
            fileRandom.writeBytes(inversion);
            fileRandom.writeBytes(calorias);
            //fileRandom.writeBytes(fecha);
            fileRandom.writeBytes(salto);
            fileRandom.close();
        } catch (Exception e) {
            //System.out.println("Error Al Escribir: "+e);
            JOptionPane.showMessageDialog(null, "ERROR: "+e);
        }
        
    }   
    private String descomponerLinea(String linea,int inicio,int fin){
        String cad="";
        for (int i = inicio; i < fin; i++) {
            char c = linea.charAt (i);
            cad += Character.toString(c);
        }
        return cad.replace(" ","");//sirve para borrar los espacios en blanco
    }
    
    
    public String buscarPorCodigo(String codigo, String ruta){
        int nr=0;
        int sr=0;//siguiente registro
        String lectura="";
        try {
            fileRandom = new RandomAccessFile(ruta,"r"); //accedemos al archivo
            
            for (int i = 0; i < fileRandom.length()/LR; i++) {
                fileRandom.seek(sr);
                lectura = fileRandom.readLine(); // leemos toda la linea
                lectura = descomponerLinea(lectura, 0, 10); // descompongo y me queda solo el dni
                
                if(codigo.equals(lectura)){
                    nr = i+1; // busco en que posicion del archivo se encuentra el dni que busc
                    break;
                }
                sr += LR;
            }
            if(nr == 0){
                lectura = "#";
            }
            else
            {
                int pos = (nr - 1) * LR;
                fileRandom.seek(pos);
                lectura = fileRandom.readLine(); // leer una linea del archivo
            }
            fileRandom.close();
            
            
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
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
        return lectura;
    }
    
    
}
