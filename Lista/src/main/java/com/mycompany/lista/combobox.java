package com.mycompany.lista;


import java.awt.event.*;
import javax.swing.*;

public class combobox extends JFrame implements ActionListener{
    JComboBox<String> lista;
    public combobox(){
        setLayout(null);
        lista=new JComboBox<String>();
        lista.setBounds(20, 25, 70, 25);
        add(lista);
        lista.addItem("Algoritmos");
        lista.addItem("Estructura de datos");
        lista.addItem("Base de datos");
        lista.addItemListener((ItemListener) this);
    }
        
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==lista){
            String seleccionado=(String)lista.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public static void main(String[] args) {
        combobox cb=new combobox();
        cb.setBounds(40, 50, 400, 300);
        cb.setTitle("Formulario con lista desplegable");
        cb.setVisible(true);
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
