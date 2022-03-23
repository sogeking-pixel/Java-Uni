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
   
    private ListasCuenta listaBorrador ;

    public ListasCuenta getListaBorrador() {
        return listaBorrador;
    }

    public void setListaBorrador(ListasCuenta listaBorrador) {
        this.listaBorrador = listaBorrador;
    }
    
   
    public Formulario(){ //metodo constructor: inicia la clase
      setLayout(null);
      registrarAlumno=new JButton("AGREGAR CUENTEA");      
      registrarAlumno.setBounds(40,30, 250, 30);
      add(registrarAlumno);
      registrarAlumno.addActionListener(this);
     
      
      MostrarBorrar=new JButton("MOSTRAR CUENTA");
      MostrarBorrar.setBounds(40,180, 250, 30);
      add(MostrarBorrar);
      MostrarBorrar.addActionListener(this);
      listaBorrador = new ListasCuenta();
      
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
            
        
        if(e.getSource()== MostrarBorrar){
            
            String aux = null;
            aux = listaBorrador.listar();
           
            
            if(aux == null){
                JOptionPane.showMessageDialog(null,"NO SE SE TIENE AGREGADO A NINGUNA CUENTA");
            }
            else{
                JOptionPane.showMessageDialog(null,"AGREGADOS A LA LISTAS: \n\n" + aux);
                
                
            }
        }
        
        
    }
    
    public static void main(String[] args) {
      Formulario mb=new Formulario();
      
      mb.setBounds(850, 400, 350, 270);//x,y,ancho,alto
      mb.setTitle("Programa 01");
      mb.setVisible(true);
      mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
   
    
}