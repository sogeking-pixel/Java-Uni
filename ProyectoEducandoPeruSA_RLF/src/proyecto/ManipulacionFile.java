
package proyecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManipulacionFile {
    // OBJETO PARA PODER ACCEDER ALEATORIAMENTE AL ARCHIVO
    private RandomAccessFile fileRandom; 
    private RandomAccessFile fileRandomAux; 
    private RandomAccessFile fileRandomUser; 
    private RandomAccessFile fileRandomCurso; 
    private RandomAccessFile fileRandomProfe; 
    private RandomAccessFile fileRandomReserva; 
    private String rutaAux = "src/archivos/auxi.txt";
    private File f1,f2;
    
    //RUTA DONDE ESTARA EL ARCHIVO
    private String RUTA_ARCHIVO = "src/archivos/archivo.txt";
    private File file = new File(RUTA_ARCHIVO);
    
    private ArrayList devolverNAME = new ArrayList();
    
    private String RUTA_USER = "src/archivos/USUARIOS.txt";
    private String RUTA_CURSO = "src/archivos/CURSOS.txt";
    private String RUTA_PROFE = "src/archivos/TUTOR.txt";
    private String RUTA_RESERVA = "src/archivos/RESERVAS.txt";
    
    private String nombre;      //TAMAÑO MAX = 15 caracteres
    private String apellido;    //TAMAÑO MAX = 15 caracteres
    private String edad;        //TAMAÑO MAX = 5  caracteres
    private String ciudad;      //TAMAÑO MAX = 20 caracteres
    
                                //TAMAÑO MAZ = 2  caracter
    private String salto=System.getProperty("line.separator");//hacer salto de linea
                                //SUMA TOTAL = 57 caracteres por registro(LR)
    
    private final int LR = 57; // LR = LONGITUD DE REGISTRO
    
    public void eliminarDocente(int nr, int lr, String ruta){
        
        int sr=0;//siguiente registro
        String lectura="";
        try {
            fileRandom = new RandomAccessFile(ruta,"rw"); //accedemos al archivo
            fileRandomAux = new RandomAccessFile(rutaAux, "rw");
            
            
            for (int i = 0; i < fileRandom.length()/lr; i++) {
                if(nr == i+1){
                    sr += lr;
                    continue;
                }
                fileRandom.seek(sr);
                lectura += fileRandom.readLine();
                lectura +=salto;
                sr += lr;
            }
            
            
            fileRandomAux.writeBytes(lectura);
            fileRandom.close();
            fileRandomAux.close();
            
            
            f1 = new File(ruta);
            f2 = new File(rutaAux);
            //Thread.sleep(15000);
            f1.delete();
            //Thread.sleep(1500);

            f2.renameTo(f1); //rrenombro el archivo
            
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
        }
    }
    
    
    private String rrellenarEspacios(String var, int tam){
        if(var.length() > tam){return "TAMAÑO  EXEDIDO";}
        if(var.length() != tam){
            int res = (tam - var.length());//calcular cuantos espacios quedan disponibles de los 'N' espacios reservados
            for (int i = 0; i < res; i++) {
                var+=" ";//rrellena los espacios faltantes con ESPACIOS en blanco
            }
        }
        return var;
    }
    
    public void modificarRegistro(int nRgistro,String nom,String ape, String ed, String lugar){
        nombre = rrellenarEspacios(nom,15);
        apellido = rrellenarEspacios(ape,15);
        edad = rrellenarEspacios(ed, 5);
        ciudad = rrellenarEspacios(lugar,20);
        
        //fileRandom = null;
        try {
            fileRandom = new RandomAccessFile(RUTA_ARCHIVO,"rw"); //accedemos al archivo
            
            
            int pos = (nRgistro - 1)* LR;
            fileRandom.seek(pos);
            
            fileRandom.writeBytes(nombre);
            fileRandom.writeBytes(apellido);
            fileRandom.writeBytes(edad);
            fileRandom.writeBytes(ciudad);
            fileRandom.writeBytes(salto);
            fileRandom.close();
            System.out.println("Registro Modificado..!");
            
        } catch (Exception e) {
            System.out.println("Error Al Escribir: "+e);
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
    
    public String buscarRegistro(int nr, int lr, String ruta, int inicio, int fin){
        int pos=0;
        String lectura="";
        try {
            fileRandom = new RandomAccessFile(ruta,"r"); //accedemos al archivo
            
            pos = (nr-1)*lr; //FORMULA PARA POSICIONARNOS EN EL REGISTRO 
            fileRandom.seek(pos);
            lectura = fileRandom.readLine();
            lectura = descomponerLinea(lectura, inicio, fin);
            fileRandom.close();
            
        } catch (Exception e) {
            System.out.println("Error Al Escribir: "+e);
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
    
    public String mostrarTodo(int lr, String ruta){
        int pos=0;
        int sr=0;//siguiente registro
        String lectura="";
        try {
            fileRandom = new RandomAccessFile(ruta,"r"); //accedemos al archivo
            
            
            for (int i = 0; i < fileRandom.length()/lr; i++) {
                fileRandom.seek(sr);
                lectura += (i+1)+")     "+fileRandom.readLine();
                lectura +="\n";
                sr += lr;
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
    
    private String descomponerLinea(String linea,int inicio,int fin){
        String cad="";
        for (int i = inicio; i < fin; i++) {
            char c = linea.charAt (i);
            cad += Character.toString(c);
        }
        return cad.replace(" ","");//sirve para borrar los espacios en blanco
    }
    private String descomponerLineaNombres(String linea,int inicio,int fin){
        String cad="";
        for (int i = inicio; i < fin; i++) {
            char c = linea.charAt (i);
            cad += Character.toString(c);
        }
        return cad;
    }
    
    public String verCursosYProfes(int lrCurso, int lrProfe){
        String curso = "";
        String idProfe="";
        String profe = "";
        String lectura = "";
        int srCurso=0;
        try {
            
            fileRandomCurso = new RandomAccessFile(RUTA_CURSO,"r"); //accedemos al archivo
            fileRandomProfe = new RandomAccessFile(RUTA_PROFE,"r"); //accedemos al archivo
            
            for (int i = 0; i < fileRandomCurso.length()/lrCurso; i++) {
                /*-------------------------------------*/
                fileRandomCurso.seek(srCurso);
                curso = fileRandomCurso.readLine();
                idProfe = descomponerLinea(curso, 37, 47);
                curso = descomponerLineaNombres(curso, 0, 20);
                /*-------------------------------------*/
                int posProfe = (Integer.parseInt(idProfe)-1) * lrProfe;
                fileRandomProfe.seek(posProfe);
                profe = fileRandomProfe.readLine();
                profe = descomponerLineaNombres(profe, 10, 25);
                /*-------------------------------------*/
                
                lectura += (i+1)+") "+curso+"  "+profe+salto;
                srCurso += lrCurso;
            }
            fileRandomProfe.close();
            fileRandomCurso.close();
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
        }
        return lectura;
    }
    public String verUsuariosRegistrados(int lrUser, int lrCur, int lrProfe){
        String user="";
        String curso="";
        String idProfe="";
        String profe="";
        String lectura="";
        int srUser = 0;
        int srCurso = 0;
        try {
            
            fileRandomUser = new RandomAccessFile(RUTA_USER,"r"); //accedemos al archivo
            fileRandomCurso = new RandomAccessFile(RUTA_CURSO,"r"); //accedemos al archivo
            fileRandomProfe = new RandomAccessFile(RUTA_PROFE,"r"); //accedemos al archivo
            
            for (int i = 0; i < fileRandomUser.length()/lrUser; i++) {
                /*-------------------------------------*/
                fileRandomUser.seek(srUser);
                user = fileRandomUser.readLine();
                user = descomponerLineaNombres(user, 0, 25);
                /*-------------------------------------*/
                fileRandomCurso.seek(srCurso);
                curso = fileRandomCurso.readLine();
                idProfe = descomponerLinea(curso, 37, 47);
                curso = descomponerLineaNombres(curso, 10, 20);
                /*-------------------------------------*/
                int posProfe = (Integer.parseInt(idProfe)-1) * lrProfe;
                fileRandomProfe.seek(posProfe);
                profe = fileRandomProfe.readLine();
                profe = descomponerLineaNombres(profe, 10, 25);
                /*-------------------------------------*/
                
                lectura += (i+1)+") "+user+"  "+curso+"  "+profe+salto;
                
                
                srUser += lrUser;
                srCurso += lrCur;
            }
            fileRandomUser.close();
            fileRandomProfe.close();
            fileRandomCurso.close();
            
            
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
        }
        return lectura;
    }
    public ArrayList obtenerNombres(int lr, String ruta, int inicio, int fin){
        int sr=0;
        String lectura="";
        try {
            fileRandom = new RandomAccessFile(ruta,"r"); //accedemos al archivo
            //System.out.println("NRS: "+fileRandom.length()/lr);
            for (int i = 0; i < fileRandom.length()/lr; i++) {
                fileRandom.seek(sr);
                lectura = fileRandom.readLine();
                lectura = descomponerLineaNombres(lectura, inicio, fin);
                devolverNAME.add(lectura);
                sr += lr;
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
        return devolverNAME;
    }
    
    public String cierreCaja(int lrCursos, int lrProfe){
        String curso = "";
        String profe = "";
        String lectura="";
        int precioCurso=0;
        int sueldoProfe = 0;
        String idProfe="";
        int sr=0;//siguiente registro
        try {
            fileRandomCurso = new RandomAccessFile(RUTA_CURSO,"r"); //accedemos al archivo
            fileRandomProfe = new RandomAccessFile(RUTA_PROFE,"r"); //accedemos al archivo
            
            lectura = "CURSO               PRECIO   PROFESOR       SUELDO\n";
            lectura += "--------------------------------------------------\n";
            for (int i = 0; i < fileRandomCurso.length()/lrCursos; i++) {
                fileRandomCurso.seek(sr);
                curso = fileRandomCurso.readLine();
                precioCurso += Integer.parseInt(descomponerLinea(curso, 30, 37)); //PRECIO DEL CURSO
                idProfe = descomponerLinea(curso, 37, 47);
                curso = descomponerLineaNombres(curso, 10, 37);
                /*---------------------------------------------------------*/
                int posProfe = (Integer.parseInt(idProfe)-1) * lrProfe;
                fileRandomProfe.seek(posProfe);
                profe = fileRandomProfe.readLine();
                sueldoProfe += Integer.parseInt(descomponerLinea(profe, 25, 35)); //SUELDO DE PROFES
                profe = descomponerLineaNombres(profe, 10, 35);
                
                
                lectura += curso +"  "+profe+salto;
                sr += lrCursos;
            }
            lectura += "--------------------------------------------------";
            lectura += salto + "COSTO TOTAL CURSOS: "+precioCurso ;
            lectura += salto + "SUELDO DE DOCENTES: "+sueldoProfe ;
            int res = precioCurso - sueldoProfe;
            lectura += salto +"DINERO TOTAL GANADO: "+res;
            fileRandomCurso.close();
            fileRandomProfe.close();
            
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
        }
        
        return lectura;
    }
    public String cursoYProfesCompleto(int nr, int lrCurso, int lrProfe, int lrReserva){
        String curso = "";
        String idProfe="";
        String profe = "";
        String lectura = "";
        try {
            
            fileRandomCurso = new RandomAccessFile(RUTA_CURSO,"r"); //accedemos al archivo
            fileRandomProfe = new RandomAccessFile(RUTA_PROFE,"r"); //accedemos al archivo
            fileRandomReserva = new RandomAccessFile(RUTA_RESERVA,"r"); //accedemos al archivo
            
            int posCurso = (nr-1)*lrCurso;
            fileRandomCurso.seek(posCurso);
            curso = fileRandomCurso.readLine();
            idProfe = descomponerLinea(curso, 37, 47);
            curso = descomponerLineaNombres(curso, 0, 37);
            
            /*-------------------------------------*/
            int posProfe = (Integer.parseInt(idProfe)-1) * lrProfe;
            fileRandomProfe.seek(posProfe);
            profe = fileRandomProfe.readLine();
            profe = descomponerLineaNombres(profe, 10, 25);
                /*-------------------------------------*/
            
            int posReserva = (nr-1) * lrReserva;
            fileRandomReserva.seek(posReserva);
            String reserva = fileRandomReserva.readLine();
            
            lectura += curso+profe+reserva+salto;
                
            
            fileRandomProfe.close();
            fileRandomCurso.close();
            fileRandomReserva.close();
        } catch (Exception e) {
            System.out.println("ARCHIVO NO EXISTE: "+e);
        }
        return lectura;
    }
    public void eliminarArchivo(){
        File ar = new File(RUTA_ARCHIVO);
        if (ar.delete()) {
            System.out.println("SE ELIMINO CORRECTAMENTE");   
        }else{
            System.out.println("ERROR AL ELIMINAR");
        }
    }
}
