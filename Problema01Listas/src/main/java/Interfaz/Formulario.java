/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;


import com.mycompany.problema01listas.Cuenta;
import com.mycompany.problema01listas.ListasCuenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yerso
 */
public class Formulario extends JFrame implements ActionListener{
    
    private RegistroCuenta registrar;    
    private JButton registrarAlumno;
    private JButton registrarMatricula;
    private JButton borrar;
    private JButton MostrarBorrar; 
    private JButton MostrarCuenta; 
    private int i;
    private int tamano;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
   
    private ListasCuenta listaBorrador ;
    private ListasCuenta listaInsertar;
    private Cuenta RegistroDeCuenta[] = new Cuenta[9];

    public Cuenta[] getRegistroDeCuenta() {
        return RegistroDeCuenta;
    }

    public void setRegistroDeCuenta(Cuenta[] RegistroDeCuenta) {
        this.RegistroDeCuenta = RegistroDeCuenta;
    }
   
    public Formulario(){ //metodo constructor: inicia la clase
      setLayout(null);
      registrarAlumno=new JButton("CREAR CUENTEA");      
      registrarAlumno.setBounds(40,30, 250, 30);
      add(registrarAlumno);
      registrarAlumno.addActionListener(this);
      
      registrarMatricula=new JButton("BUSCAR CUENTA");
      registrarMatricula.setBounds(40,80, 250, 30);
      add(registrarMatricula);
      registrarMatricula.addActionListener(this);
      
      borrar=new JButton("BORRAR CUENTA");
      borrar.setBounds(40,130, 250, 30);
      add(borrar);
      borrar.addActionListener(this);
      
      MostrarBorrar=new JButton("MOSTRAR CUENTAS BORRADAS");
      MostrarBorrar.setBounds(40,180, 250, 30);
      add(MostrarBorrar);
      MostrarBorrar.addActionListener(this);
      
      
      MostrarCuenta=new  JButton("MOSTRAR CUENTAS REGISTRADAS");
       MostrarCuenta.setBounds(40,230, 250, 30);
      add(MostrarCuenta);
      MostrarCuenta.addActionListener(this);
      
      
      listaBorrador = new ListasCuenta();
      listaInsertar = new ListasCuenta();
      inicializar();
      tamano();
    }
    
    public void inicializar(){
        for(int a=0; a<9; a++){
            RegistroDeCuenta[a]=null;
        }
            
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==registrarAlumno){
             if(registrar == null){
                registrar= new RegistroCuenta(this);
                registrar.setBounds(850, 400, 500, 350);//x,y,ancho,alto
                registrar.setTitle("Alumno");              
            }
            registrar.setVisible(true);
            this.setVisible(false);
        }
            
        if(e.getSource()==borrar){
            String apellido = JOptionPane.showInputDialog("INGRESE EL NUMERO DE CUENTA");
            Cuenta aux=null;
            
            aux = borra(apellido);
                
           
            
            if(aux == null){
                JOptionPane.showMessageDialog(null,"No existe esa Cuenta");
            }
            else{
                JOptionPane.showMessageDialog(null,"Eliminado \n"+ aux.toString());
                listaBorrador.insertarFinal(aux);
                
            }
        }
        
        if(e.getSource()==registrarMatricula){
                      
            String apellido = JOptionPane.showInputDialog("INGRESE EL NUMERO DE CUENTA");
            Cuenta aux = buscar(apellido);
            
            if(aux == null){
                JOptionPane.showMessageDialog(null,"No existe esa cuenta");
            }
            else{
                JOptionPane.showMessageDialog(null,"Encontrado \n"+ aux.toString() + "en la posicion: " + i);
            }
            
        } 
        if(e.getSource()== MostrarBorrar){
            String aux = null;
            aux = listaBorrador.listar();
           
            
            if(aux == null){
                JOptionPane.showMessageDialog(null,"No existe encuenta");
            }
            else{
                JOptionPane.showMessageDialog(null,"Eliminados: \n\n"+ aux);
                
                
            }
        }
        
        
         if(e.getSource()== MostrarCuenta){
            String aux = Mostrar();
            //aux = listaBorrador.listar();
           
            
            if(aux == null){
                JOptionPane.showMessageDialog(null,"No existe encuenta");
            }
            else{
                JOptionPane.showMessageDialog(null,"Registro: \n\n"+ aux);
                
                
            }
        }
        
        
    }
    
    public static void main(String[] args) {
      Formulario mb=new Formulario();
      
      mb.setBounds(850, 400, 350, 330);//x,y,ancho,alto
      mb.setTitle("Programa 01");
      mb.setVisible(true);
      mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public Cuenta buscar(String codigo){
      Cuenta hola = null;  
        Cuenta aux[]=null;
        try{
           
           FileInputStream archivo = new FileInputStream("Cuenta.dat");
           
           ObjectInputStream ois;
                    
           
           while(archivo.available()>0 ){
               
               ois = new ObjectInputStream(archivo);
                aux= (Cuenta[])ois.readObject();  
                
            }
           
           archivo.close();
           
       }catch(Exception e){
           
       }
        i =0;
        boolean b=false;
       if(aux!=null){
           while(i<9 && !b){
            if(aux[i]!=null){
                if(aux[i].getNumeroDeCuenta().equals(codigo)){
               
                    hola=aux[i];
                    b=true;
                }
                else{
               i++;
                }
            }
           
           else{
               i++;
           }
       }     
       }
       
       return hola;
    }
    
    
    
    public Cuenta borra(String codigo){
        File archivoEntrada = new File("Cuenta.dat");
        File archivoSalida = new File("temporal.dat");
        
        Cuenta  la=null;
      
                      
           
           Cuenta aux[] = RegistroDeCuenta;
           
                 i =0;
                 boolean b = false;
                 
                 
            if(aux!=null){
           while(i<9 && !b){
            if(aux[i]!=null){
                if(aux[i].getNumeroDeCuenta().equals(codigo)){
                        la = aux[i];
                        aux[i]=null;
                        b=true;
                }
                else{
               i++;
                }
            }
           
           else{
               i++;
           }
       }     
       }
                 
                     try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(archivoSalida))){
                                 //Escribimos en el fichero
                                  oos.writeObject(aux);                                    
                                    oos.close();
                                    archivoEntrada.delete();
                                    archivoSalida.renameTo(archivoEntrada);
                                    archivoSalida.delete();
            
                          }catch(IOException e){
                        }
                     
              RegistroDeCuenta = aux;
                 
               
                    
              
            
                 

      
        
       return la;
    }
    
    public void tamano(){
          
        Cuenta aux[]=null;
        try{
           
           FileInputStream archivo = new FileInputStream("Cuenta.dat");
           
           ObjectInputStream ois;
                    
           
           while(archivo.available()>0 ){
               
               ois = new ObjectInputStream(archivo);
                aux= (Cuenta[])ois.readObject();  
                
            }
           
           archivo.close();
           
       }catch(Exception e){
           
       }
        if(aux!=null){
            for(int i=0; i<9;i++){
           
           if(aux[i]!=null){
              
                tamano = i;
           }
           else{
               float c= i;
               Cuenta a = new Cuenta("a", "a", "a", c);
               listaInsertar.insertarFinal(a);
              
           }
           RegistroDeCuenta=aux;
                 
        
       }
        }else{
            tamano=0;
        }
        
        
        
        
         
    }
    
    public String Mostrar(){
        
        String hola = null;  
        Cuenta aux[]=null;
        try{
           
           FileInputStream archivo = new FileInputStream("Cuenta.dat");
           
           ObjectInputStream ois;
                    
           
           while(archivo.available()>0 ){
               
               ois = new ObjectInputStream(archivo);
                aux= (Cuenta[])ois.readObject();  
                
            }
           
           archivo.close();
           
       }catch(Exception e){
           
       }
       if(aux==null){
           aux=RegistroDeCuenta;
       }
        
       String vacio = "este espacio esta  vacio\n";
       for(int i=0; i<9;i++){
           
           if(aux[i]==null){
               if(hola == null){                    
                    hola = vacio+"\n";                   
             }
               else{
                   hola = hola + vacio+"\n"; 
               }
                
           }
           else{
               if(hola == null){                    
                    hola = aux[i].toString()+"\n";                   
             }
               else{
                   hola = hola + aux[i].toString()+"\n";
               }
                
           }
                 
        
       }
       return hola;
        
       
    }
    
}