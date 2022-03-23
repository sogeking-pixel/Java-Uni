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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import logica.Alumno;
import logica.Curso;
import logica.GestorFicheroSerializado;

/**
 *
 * @author yerso
 */
public class RegistroCurso  extends JFrame implements ActionListener {
    
     JButton Regitrara;
     VentanaAdmi v;
     JTextField textonumeroCuenta;
     JTextField textoNombre;
     JTextField textoInfo;
     JTextField textoSaldo;
     JLabel numeroCuenta;
     JLabel Nombre;
     JLabel Info;
     JLabel Saldo;
     private int i=0;
      private GestorFicheroSerializado<Curso> gestorAlumnos = new GestorFicheroSerializado("src/archivos/Cursos.dat");
    
    public RegistroCurso(VentanaAdmi v){ //metodo constructor: inicia la clase
      
      setLayout(null);
      Regitrara=new JButton("REGISTRAR CURSO");      
      Regitrara.setBounds(190,250, 160, 30);
      add(Regitrara);   
      Regitrara.addActionListener(this);
      
      numeroCuenta = new JLabel("Nombre del curso: ");
      numeroCuenta.setBounds(20, 30, 150, 30);
      add(numeroCuenta);
      textonumeroCuenta = new JTextField();
      textonumeroCuenta.setBounds(200, 30, 250, 30);
      add(textonumeroCuenta);
      
      Nombre = new JLabel("Codigo del curso: ");
      Nombre.setBounds(20, 80, 150, 30);
      add(Nombre);
      textoNombre = new JTextField();
      textoNombre.setBounds(200, 80, 250, 30);
      add(textoNombre);
      
      Info = new JLabel("Credito del curso: ");      
      Info.setBounds(20, 130, 180, 30);
      add(Info);      
      textoInfo = new JTextField();
      textoInfo.setBounds(200, 130, 250, 30);
      add(textoInfo);
      
      Saldo = new JLabel("Ciclo: ");      
      Saldo.setBounds(20, 180, 100, 30);
      add(Saldo);   
      textoSaldo = new JTextField();
      textoSaldo.setBounds(200, 180, 250, 30);
      add(textoSaldo);
      limpiar();
      this.v =v;
      cerrar();
     
    }
    
     public void actionPerformed(ActionEvent b){
       
         if(b.getSource()== Regitrara){
            
            
            String nombreCurso = textonumeroCuenta.getText();
             int codigo = Integer.parseInt( textoNombre.getText() );
             int credito = Integer.parseInt( textoInfo.getText() );
             int ciclo = Integer.parseInt( textoSaldo.getText() );
             
            Curso c = new Curso (nombreCurso, ciclo, codigo, credito);
            
            gestorAlumnos.guardarDato(c);
        
        }
        
        
    }
     
     public boolean validarEdad(String edad){
        return edad.matches("[0-9]*");
    }
    
    private void limpiar(){
        textoInfo.setText("");
        textoNombre.setText("");
        textoSaldo.setText("");
       textonumeroCuenta.setText("");
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
