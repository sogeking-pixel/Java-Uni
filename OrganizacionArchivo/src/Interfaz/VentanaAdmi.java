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
public class VentanaAdmi extends JFrame implements ActionListener{
    
    
    private JButton registrarAlumno;
    private JButton registrarCurso;
    private JButton registrarProfesor;
    
    private JButton MostrarBorrar; 
    private JButton MostrarCuenta; 
 
    private VentanaPrincipal ventanaP;

    private RegistroAlumnos ventanaAlumno;
    private RegistroCurso ventanaCurso ;
    private  RegistroProfesores ventanaProfesor;
   
   
   
    public VentanaAdmi(VentanaPrincipal ventana){ //metodo constructor: inicia la clase
      ventanaP = ventana;
        
        setLayout(null);
      registrarAlumno=new JButton("REGISTRAR ALUMNO");      
      registrarAlumno.setBounds(40,30, 250, 30);
      add(registrarAlumno);
      registrarAlumno.addActionListener(this);
      
      registrarCurso=new JButton("REGISTRAR CURSO");
      registrarCurso.setBounds(40,80, 250, 30);
      add(registrarCurso);
      registrarCurso.addActionListener(this);
      
      registrarProfesor=new JButton("REGISTRAR PROFESOR");
      registrarProfesor.setBounds(40,130, 250, 30);
      add(registrarProfesor);
      registrarProfesor.addActionListener(this);
      
     
      cerrar();
      
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==registrarAlumno){
            if(ventanaAlumno == null){
                ventanaAlumno = new RegistroAlumnos(this);
                ventanaAlumno.setBounds(850, 400, 500, 380);//x,y,ancho,alto
                ventanaAlumno.setTitle("Registro Alumno");  
            }
             ventanaAlumno.setVisible(true);
            this.setVisible(false);
        }
         
            
        if(e.getSource()==registrarCurso){
           if(ventanaCurso == null){
                ventanaCurso = new RegistroCurso(this);
                ventanaCurso.setBounds(850, 400, 500, 350);//x,y,ancho,alto
                ventanaCurso.setTitle("Registro Curso");  
            }
             ventanaCurso.setVisible(true);
            this.setVisible(false);
        }
        
        if(e.getSource()==registrarProfesor){
           if(ventanaProfesor == null){
                ventanaProfesor = new RegistroProfesores(this);
                ventanaProfesor.setBounds(850, 400, 500, 350);//x,y,ancho,alto
                ventanaProfesor.setTitle("Registro Profesor");  
            }
             ventanaProfesor.setVisible(true);
            this.setVisible(false);           
           
            
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
    
    
   