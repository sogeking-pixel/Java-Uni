package com.mycompany.lista;

import javax.swing.*;

public class Miformulario extends JFrame {
    public Miformulario(){
        setLayout(null);
    }
    
    public static void main(String[] args) {
        Miformulario mf=new Miformulario();
        mf.setBounds(20, 30, 300, 400); // x,y,ancho,alto
        mf.setTitle("Mi Primer Formulario");
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}