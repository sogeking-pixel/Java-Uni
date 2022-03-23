
package Proyecto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 @author ALVAREZ LOYOLA BRUNO
 */

public class Interfaz extends JFrame implements ActionListener
{
    JLabel etiqueta, etiqueta2, etiqueta3;
    JLabel imagen, imagen2;
    JButton btnADM, btnUSER, btnEXIT;
    
    public Interfaz()
         {
             setTitle("PROYECTO RESTAURANTE - ALUMNO: ALVAREZ LOYOLA BRUNO");
             setSize(800,550);
             setLocationRelativeTo(null);
             setResizable(false);
             //Etiquetas componentes = new Etiquetas();
             //add(componentes);   
             setDefaultCloseOperation(EXIT_ON_CLOSE);
             etiquetas();
         }
    
    private void etiquetas(){
        
        setLayout(null);
        btnADM = new JButton();
     btnADM.setText("ADMIN");
     btnADM.setBounds(250, 290, 140, 50);
     ImageIcon login = new ImageIcon("login.png");
     btnADM.setIcon(new ImageIcon(login.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
     btnADM.setBackground(Color.lightGray);
     btnADM.setFont(new Font("ARIAL BLACK",0,11));
     btnADM.setForeground(Color.red);
     
     add(btnADM);
    
     
     btnUSER = new JButton();
     btnUSER.setText("CLIENTE");
     btnUSER.setBounds(410,290,140,50);
     ImageIcon user = new ImageIcon("user.png");
     btnUSER.setIcon(new ImageIcon(user.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
     btnUSER.setBackground(Color.lightGray);
     btnUSER.setFont(new Font("ARIAL BLACK",0,11));
     btnUSER.setForeground(Color.red);
    
     add(btnUSER);
     
     btnEXIT = new JButton();
     btnEXIT.setText("SALIR");
     btnEXIT.setBounds(330,350,140,50);
     ImageIcon salida = new ImageIcon("salida.png");
     btnEXIT.setIcon(new ImageIcon(salida.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
     btnEXIT.setBackground(Color.lightGray);
     btnEXIT.setFont(new Font("ARIAL BLACK",0,11));
     
     btnEXIT.setForeground(Color.red);
     add(btnEXIT);   
     
     //********* FIN DE BOTONES *********//
     
     etiqueta = new JLabel();
     etiqueta.setText("HOY ES UN BUEN DÍA PARA SONREIR");
     etiqueta.setBounds(235,40,350,40);
     etiqueta.setFont(new Font("AMERICAN CAPTAIN",0,30));
     etiqueta.setForeground(Color.YELLOW);
     add(etiqueta);
     
     etiqueta2 = new JLabel();
     etiqueta2.setText("¡BIENVENIDO! ELIGA UNA OPCIÓN:");
     etiqueta2.setFont(new Font("american captain",0,30));
     etiqueta2.setBounds(250,240,308,35);
     etiqueta2.setForeground(Color.YELLOW);
     add(etiqueta2);
     
     etiqueta3 = new JLabel();
     etiqueta3.setText("PLATO DEL DÍA: BUEN HUMOR");
     etiqueta3.setFont(new Font("american captain",0,30));
     etiqueta3.setBounds(270,430,325,40);
     etiqueta3.setForeground(Color.YELLOW);
     add(etiqueta3);
     
     
     imagen = new JLabel();
     ImageIcon logo = new ImageIcon("ayquerico3.png");
     imagen.setBounds(270,80,270,150);
     imagen.setIcon(new ImageIcon(logo.getImage().getScaledInstance(270,150,Image.SCALE_SMOOTH)));
     add(imagen);
     
     imagen2 = new JLabel();
     ImageIcon fondo = new ImageIcon("restaurant2.jpg");
     imagen2.setBounds(0,0,800,540);
     imagen2.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(800,540,Image.SCALE_SMOOTH)));
     add(imagen2);
     
      //************** FIN DE ETIQUETAS***********//
        
  
      
      
     //********** ACTION LISTENER*****************//
    btnADM.addActionListener(this); 
    btnUSER.addActionListener(this);
    btnEXIT.addActionListener(this);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnEXIT ){
            System.exit(0);
        }
       
        if(e.getSource() == btnADM ){
            VentanaADM  mostrarse = new VentanaADM();
            mostrarse.setVisible(true);
            this.dispose();
            
        }
        
        if(e.getSource() == btnUSER){
          VentanaCliente muestrate = new VentanaCliente();
          muestrate.setVisible(true);
          this.dispose();
        }
    }
}


