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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author yerso
 */
public class RegistroMatricula  extends JFrame implements ActionListener {
    
     JButton Regitrara;
      JButton matricular;
     VentanaAlumno v;
     JTextField textonumeroCuenta;
     JTextField textoNombre;
     JTextField textoInfo;
     JTextField textoSaldo;
     JLabel numeroCuenta;
     JLabel Nombre;
     JLabel Info;
     JLabel Saldo;
     private JScrollPane vaina;
    private JTextArea areaText;
    
     private JScrollPane vaina1;
    private JTextArea areaText1;
     
     private int i=0;
     private File archivoCuenta = new File("Cuenta.dat");
    
    public RegistroMatricula(VentanaAlumno v){ //metodo constructor: inicia la clase
      
      setLayout(null);
      Regitrara=new JButton("agregar curso");      
      Regitrara.setBounds(160,400, 160, 30);
      add(Regitrara);   
      Regitrara.addActionListener(this);
      
      matricular=new JButton("MATRICULAR");      
      matricular.setBounds(650,400, 160, 30);
      add(matricular);   
      matricular.addActionListener(this);
      
      
      
      numeroCuenta = new JLabel("Codigo de matricula: ");
      numeroCuenta.setBounds(20, 30, 150, 30);
      add(numeroCuenta);
      textonumeroCuenta = new JTextField();
      textonumeroCuenta.setBounds(200, 30, 250, 30);
      add(textonumeroCuenta);
      
      Nombre = new JLabel("Periodo: ");
      Nombre.setBounds(20, 80, 150, 30);
      add(Nombre);
      textoNombre = new JTextField();
      textoNombre.setBounds(200, 80, 250, 30);
      add(textoNombre);
      
      
      
      areaText = new JTextArea ("");
     areaText.setBounds(50,130, 380, 250);
     add(areaText);
     areaText.setEditable(false);
     
     vaina = new JScrollPane (areaText);
     vaina.setBounds(50,130, 380, 250);
     add(vaina);   
     
      areaText1 = new JTextArea ("");
     areaText1.setBounds(50,130, 380, 250);
     add(areaText1);
     areaText1.setEditable(false);
     
     vaina1 = new JScrollPane (areaText1);
     vaina1.setBounds(500,30, 400, 350);
     add(vaina1);   
      
      limpiar();
      this.v =v;
      cerrar();
     
    }
    
     public void actionPerformed(ActionEvent b){
       
         if(b.getSource()== Regitrara){
            
            
            String numero = textonumeroCuenta.getText();
             String nombre = textoNombre.getText();
             String info = textoInfo.getText();
             String saldo = textoSaldo.getText();
             
            
            
        
        }
         
         if(b.getSource()== matricular){
            
            
            String numero = textonumeroCuenta.getText();
             String nombre = textoNombre.getText();
             String info = textoInfo.getText();
             String saldo = textoSaldo.getText();
             
            
            
        
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
