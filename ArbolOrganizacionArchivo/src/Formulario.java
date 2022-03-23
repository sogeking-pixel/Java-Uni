/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import arbolorganizacionarchivo.Arbol;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
/**
 *
 * @author yerso
 */
public class Formulario extends JFrame implements ActionListener{
       
    private Arbol arbol;
    private JButton botonPreOrden;
    private JButton botonInOrden;
    private JButton botonPostOrden;
    private JButton botonInvPreOrden;
    private JButton botonInvInOrden;
    private JButton botonInvPostOrden;
    private JButton botonGrado;
    private JButton botonPeso;
    private JButton botonCredito;
    private JButton botonIngresar;
    private JScrollPane vaina;
    private JTextArea areaText;
    
    
 
   
    public Formulario(){ //metodo constructor: inicia la clase
      setLayout(null);
      
      botonIngresar=new JButton("INGRESAR ELEMENTO AL ARBOL");      
      botonIngresar.setBounds(100,30, 300, 40);
      add(botonIngresar);
      botonIngresar.addActionListener(this);
      
      botonPreOrden=new JButton("PRE-ORDEN");      
      botonPreOrden.setBounds(50,100, 170, 35);
      add(botonPreOrden);
      botonPreOrden.addActionListener(this);
      
      botonInvPreOrden=new JButton("INVERSO-PRE-ORDEN");
     botonInvPreOrden.setBounds(260,100, 170, 35);
      add(botonInvPreOrden);
      botonInvPreOrden.addActionListener(this);    
      
      botonInOrden=new JButton("IN-ORDEN");
      botonInOrden.setBounds(50,160,  170, 35);
      add(botonInOrden);
      botonInOrden.addActionListener(this);
      
      botonInvInOrden=new JButton("INVERSO-IN-ORDEN");      
      botonInvInOrden.setBounds(260,160,  170, 35);
      add(botonInvInOrden);
      botonInvInOrden.addActionListener(this);
      
      botonPostOrden=new JButton("POST-ORDEN");      
      botonPostOrden.setBounds(50,220,  170, 35);
      add(botonPostOrden);
      botonPostOrden.addActionListener(this);    
      
     botonInvPostOrden=new JButton("INVERSO-POST-ORDEN");
      botonInvPostOrden.setBounds(260,220,  170, 35);
      add(botonInvPostOrden);
      botonInvPostOrden.addActionListener(this);
      
      
      
      
      
     botonGrado=new JButton("GRADOS DE CADA NODO");
      botonGrado.setBounds(50,280,  170, 35);
      add(botonGrado);
      botonGrado.addActionListener(this);    
      
      
      botonPeso=new JButton("PESO DE CADA NODO");
     botonPeso.setBounds(260,280,  170, 35);
      add(botonPeso);
      botonPeso.addActionListener(this); 
      
      
      
     botonCredito=new JButton("Creditos");
     botonCredito.setBounds(150,670, 170, 30);
     add(botonCredito);
     botonCredito.addActionListener(this);
     
     
     areaText = new JTextArea ("");
     areaText.setBounds(50,340, 355, 300);
     add(areaText);
     areaText.setEditable(false);
     
     vaina = new JScrollPane (areaText);
     vaina.setBounds(50,340, 380, 300);
     add(vaina);
     
     
     
     
     
     
     
    
     this.setResizable(false);
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource()==botonIngresar)
       {
           String dato =  JOptionPane.showInputDialog("Ingrese el dato que quiere registrar en el arbol");
           if(arbol == null){
               
               arbol = new Arbol(dato);
           }else{
               arbol.insertar(dato);
           }
              
            
            
       }
        
        
       if (e.getSource()==botonPreOrden)
       {
           if(verificar())
               areaText.setText(arbol.preOrden(arbol.getRaiz()));
            
            
       }
       
       if (e.getSource()==botonInvPreOrden)
       {
           if(verificar())
            areaText.setText(arbol.invPreOrden(arbol.getRaiz()));
       }
       
        if (e.getSource()==botonInOrden)
       {
           if(verificar())
                areaText.setText(arbol.inOrden(arbol.getRaiz()));
            
       }
        
       if (e.getSource()==botonInvInOrden)
       {
            if(verificar())
                areaText.setText(arbol.invInOrden(arbol.getRaiz()));
            
       }
       
        if (e.getSource()== botonPostOrden)
       {
           if(verificar())
                areaText.setText(arbol.posOrden(arbol.getRaiz()));
            
       }
        
       if (e.getSource()==botonInvPostOrden)
       {
           if(verificar())
                areaText.setText(arbol.invPosOrden(arbol.getRaiz()));
            
       }
       
       if (e.getSource()== botonPeso)
       {
          if(verificar())
            areaText.setText(arbol.peso(arbol.getRaiz()));
            
       }
       
       if (e.getSource()==botonGrado)
       {
            if(verificar())
                areaText.setText(arbol.grado(arbol.getRaiz()));
       }
       
       
       if (e.getSource()==botonCredito)
       {
           JOptionPane.showMessageDialog(null,"ORGANIZACION DE ARCHIVO\n\n Docente:\n" +
                                              "     -Diaz Pulido, Jose Arturo.\n\n" +
                                              "Alumnos:\n" +
                                              "     -Briceño Mora, Jorge.\n" +
                                              "     -Escudero Chavez, Alvaro.\n"+
                                              "     -Sanchez Leiva, Yerson Omar.\n"+
                                              "     -Tello Abanto, Khener.\n\n"+
                                              "--UNIVERSIDAD-NACIONAL-DE-TRUJILLO--\n"+
                                              "-------------Informática-VALLE----------\n");
       }    
    }
    
    private boolean verificar(){
        if(arbol == null){
            JOptionPane.showMessageDialog(null, "NO SE HA INGRESADO NINGUN DATO AL ARBOL!");
            return false;
        }
        else{
            return true;
        }
    }
            
    public static void main(String[] args) {
      Formulario mb=new Formulario();
      mb.setBounds(700, 200,510, 770);//x,y,ancho,alto
      mb.setTitle("ARBOL");
      mb.setVisible(true);
      mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
   
    
    
}