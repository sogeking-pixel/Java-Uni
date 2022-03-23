/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
public class VentanaAlumno extends JFrame implements ActionListener{
    
    
    private JButton registrarMatricula;
    private JButton mostrarRegistroTotal;    
    private VentanaPrincipal ventanaP;
    private RecordAcademico recordAcademico;
    private RegistroMatricula ventanaMatricula ;
   
   
   
    public VentanaAlumno(VentanaPrincipal ventana){ //metodo constructor: inicia la clase
      ventanaP = ventana;
        
        setLayout(null);
        
      registrarMatricula=new JButton("REGISTRAR MATRICULA");
      registrarMatricula.setBounds(40,30, 250, 30);
      add(registrarMatricula);
      registrarMatricula.addActionListener(this);  
        
      mostrarRegistroTotal=new JButton("MOSTRAR REGISTRO TOTAL");      
      mostrarRegistroTotal.setBounds(40,80, 250, 30);
      add(mostrarRegistroTotal);
      mostrarRegistroTotal.addActionListener(this);
      
      
      
      
     
      cerrar();
      
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==registrarMatricula){
             if(ventanaMatricula == null){
                ventanaMatricula = new RegistroMatricula(this);
                ventanaMatricula.setBounds(20, 30, 1000, 500);
                ventanaMatricula.setTitle("Inserción de Registros");
            }
            this.setVisible(false);
           ventanaMatricula.setVisible(true);
        }
            
        if(e.getSource()==mostrarRegistroTotal){
            if(recordAcademico == null){
                recordAcademico = new RecordAcademico(this);
                recordAcademico.setBounds(20, 30, 500, 500);
                recordAcademico.setTitle("Inserción de Registros");
            }
            this.setVisible(false);
           recordAcademico.setVisible(true);
        }
        
        
        
        
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
        ventanaP.setVisible(true);
    }
    
}
    
    
   