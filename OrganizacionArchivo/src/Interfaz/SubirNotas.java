/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;




import Interfaz.VentanaAdmi;
import Interfaz.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yerso
 */
public class SubirNotas  extends JFrame implements ActionListener {
    
     JButton Regitrara;
     JButton buscar;
      
     VentanaDocente v;
     JTextField textonumeroCuenta;
     JTextField textoNombre;
     JTextField textoInfo;
     JTextField textoSaldo;
     JTextField textoAnno;
     JLabel numeroCuenta;
     JLabel Nombre;
     JLabel Info;
     JLabel Saldo;
     JLabel anno;
     private ArrayList nombresCursos = new ArrayList();
    private ArrayList nombresAlumnos = new ArrayList();
     private int i=0;
     private File archivoCuenta = new File("Cuenta.dat");
    
    public SubirNotas(VentanaDocente v){ //metodo constructor: inicia la clase
      
      setLayout(null);
      
     
      
      
      
      Regitrara=new JButton("REGISTRAR ALUMNO");      
      Regitrara.setBounds(190,330, 160, 30);
      add(Regitrara);   
      Regitrara.addActionListener(this);
      
      
      
      
      Info = new JLabel("Codigo del curso: ");      
      Info.setBounds(20, 30, 180, 30);
      add(Info);      
      textoInfo = new JTextField();
      textoInfo.setBounds(200, 30, 250, 30);
      add(textoInfo);
      
      Info = new JLabel("Codigo del Alumno: ");      
      Info.setBounds(20, 80, 180, 30);
      add(Info);      
      textoInfo = new JTextField();
      textoInfo.setBounds(200, 80, 250, 30);
      add(textoInfo);
      
      
      buscar=new JButton("Buscar");      
      buscar.setBounds(90,130, 160, 30);
      add(buscar);   
      buscar.addActionListener(this);
      
      
      
      
      Info = new JLabel("NOTA 1: ");      
      Info.setBounds(20, 180, 180, 30);
      add(Info);      
      textoInfo = new JTextField();
      textoInfo.setBounds(200, 180, 250, 30);
      add(textoInfo);
      
      Saldo = new JLabel("NOTA 2: ");      
      Saldo.setBounds(20, 230, 100, 30);
      add(Saldo);   
      textoSaldo = new JTextField();
      textoSaldo.setBounds(200, 230, 250, 30);
      add(textoSaldo);
      
      anno = new JLabel("NOTA 3: ");      
      anno.setBounds(20, 280, 100, 30);
      add(anno);   
      textoAnno = new JTextField();
      textoAnno.setBounds(200, 280, 250, 30);
      add(textoAnno);
      
      limpiar();
      this.v =v;
      
      cerrar();
     
    }
    
    
     public void actionPerformed(ActionEvent b){
       
         if(b.getSource()== Regitrara){
            
              
        
        }
         
         if(b.getSource()== buscar){
            
            
          
        
        }
        
        
    }
     
     public boolean validarEdad(String edad){
        return edad.matches("[0-9]*");
    }
    
    private void limpiar(){
        
    }
    
     public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                   salida();
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void salida(){
        this.setVisible(false);
        v.setVisible(true);
    }
    
}
