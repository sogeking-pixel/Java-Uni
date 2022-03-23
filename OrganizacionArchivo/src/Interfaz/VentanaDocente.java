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
public class VentanaDocente extends JFrame implements ActionListener{
    
    
    private JButton escogerCurso;
    private JButton subirNota;    
    private VentanaPrincipal ventanaP;
private EscogerCurso ventana;
   private SubirNotas ventanaNota;
   
   
   
    public VentanaDocente(VentanaPrincipal ventana){ //metodo constructor: inicia la clase
      ventanaP = ventana;
        
        setLayout(null);
        
      escogerCurso=new JButton("ESCOGER CURSO");
      escogerCurso.setBounds(40,30, 250, 30);
      add(escogerCurso);
      escogerCurso.addActionListener(this);  
        
      subirNota=new JButton("SUBIR NOTAS");      
      subirNota.setBounds(40,80, 250, 30);
      add(subirNota);
      subirNota.addActionListener(this);
      
      
      
      
     
      cerrar();
      
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==escogerCurso){
           
             if(ventana == null){
                ventana = new EscogerCurso(this);
                ventana.setBounds(20, 30, 1000, 500);
                ventana.setTitle("CO");
            }
            this.setVisible(false);
           ventana.setVisible(true);
        
        }
            
        if(e.getSource()==subirNota){
           if(ventanaNota == null){
                ventanaNota = new SubirNotas(this);
                ventanaNota.setBounds(20, 30, 500, 450);
                ventanaNota.setTitle("SUBIR NOTAS");
            }
            this.setVisible(false);
           ventanaNota.setVisible(true);
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
    
    
   