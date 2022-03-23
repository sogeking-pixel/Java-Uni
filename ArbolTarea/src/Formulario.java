/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





import arbol.Arbol;
import arbol.Nodo;
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
    
    private String hijo = null;
    private String padre = null;
    private String nodo = null;
   
    private Nodo raiz = null;
   
    public Formulario(){ //metodo constructor: inicia la clase
      setLayout(null);
      
      botonIngresar=new JButton("INGRESAR ELEMENTO AL ARBOL");      
      botonIngresar.setBounds(100,30, 300, 40);
      add(botonIngresar);
      botonIngresar.addActionListener(this);
      
      botonPreOrden=new JButton("MOSTRAR ARBOL");      
      botonPreOrden.setBounds(100,100, 300, 40);
      add(botonPreOrden);
      botonPreOrden.addActionListener(this);
      
      botonGrado=new JButton("GUARDAR");      
       botonGrado.setBounds(100,170, 300, 40);
      add( botonGrado);
       botonGrado.addActionListener(this);
      
      
      
     botonCredito=new JButton("Creditos");
     botonCredito.setBounds(150,670, 170, 30);
     add(botonCredito);
     botonCredito.addActionListener(this);
     
     
     areaText = new JTextArea ("");
     areaText.setBounds(50,240, 380, 410);
     add(areaText);
     areaText.setEditable(false);
     
     vaina = new JScrollPane (areaText);
     vaina.setBounds(50,240, 380, 410);
     add(vaina);   
     
     this.setResizable(false);
     
     this.arbol = new Arbol();
     raiz = arbol.sendRaiz();
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource()==botonIngresar)
       {
           this.hijo =  JOptionPane.showInputDialog("Inserta el nombre del hijo");
           this.padre =  JOptionPane.showInputDialog("Inserta el nombre del padre");
           if(padre.equals("null")){
               raiz.agregarHijo(new Nodo(hijo,raiz));
               arbol.setControl(true);
           }else{
               raiz = arbol.addHijo(hijo, padre, raiz);
           }
           if (arbol.isControl()){
                JOptionPane.showMessageDialog(null, "Se a;adido correctamente...");
               arbol.setControl(false);
           }
           else{
               JOptionPane.showMessageDialog(null, "El padre no fue encontrado1!!");
           }
              
            
            
       }
        
        
       if (e.getSource()==botonPreOrden)
       {
           arbol.getTextFile().setLength(0);
           arbol.getFirtsFile().setLength(0);
           arbol.visualizarArbol(raiz, false);
            
            
       }
       
      
       
       if (e.getSource()==botonGrado)
       {
           arbol.getTextFile().setLength(0);
           arbol.getFirtsFile().setLength(0);
           arbol.visualizarArbol(raiz, true);
           
           
           arbol.saveTreeStructureToFile(raiz, "out.tex", arbol.getTextFile());
           arbol.saveTreeStructureToFile(raiz, "readText.tex", arbol.getFirtsFile());
           
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