package com.mycompany.lista;


import java.awt.event.*;
import javax.swing.*;

public class MisBotones extends JFrame implements ActionListener{
    JButton miboton;
    public MisBotones(){ //metodo constructor: inicia la clase
      setLayout(null);
      miboton=new JButton("Saludos");
      miboton.setBounds(40,50, 90, 25);
      add(miboton);
      miboton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==miboton){
            JOptionPane.showMessageDialog(null,"Hola Inform@tica");
        }
    }
    
    public static void main(String[] args) {
      MisBotones mb=new MisBotones();
      mb.setBounds(20, 30, 300, 350);//x,y,ancho,alto
      mb.setTitle("Formulario con Botones");
      mb.setVisible(true);
      mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
