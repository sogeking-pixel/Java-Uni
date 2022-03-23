package com.mycompany.problema02listas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EliminarCuenta extends JFrame implements ActionListener  {
    
    arrayDeCuentas aux=null;
    
    JTextField texCuenta;
    JTextField texSucursal;

    
    JLabel labelCuenta;
    JLabel labelSucursal;

    
    JButton btBorrarCeunta;
    JButton btBorrarSucursal;
    JButton btRegresar;
    
    Principal auxPrincipal=null;
    


    public EliminarCuenta(Principal interfaz1,arrayDeCuentas datos) {
        setLayout(null);
        auxPrincipal=interfaz1;
        aux=datos;
        
        btBorrarCeunta = new JButton("Boorrar Cuenta");
        btBorrarCeunta.setBounds(40,160,150,25);
        
        btRegresar = new JButton("←");
        btRegresar.setBounds(20,10,50,25);
        
        btBorrarSucursal = new JButton("Borrar Sucursal");
        btBorrarSucursal.setBounds(200,160,150,25);
        
        labelCuenta=new JLabel("Ingrese el nombre de la Sucursal:");    
        labelCuenta.setBounds(20,70,210,25);
        
        labelSucursal=new JLabel("Ingrege la Descripción:");    
        labelSucursal.setBounds(20,100,150,25);
        
        texCuenta=new JTextField("Ejemplo: C-230");
        texCuenta.setBounds(225,70,210,25);
        
        texSucursal=new JTextField ("Ejemplo: UNT");
        texSucursal.setBounds(225,100,210,25);
        
        auxPrincipal=interfaz1;
        
        add(btBorrarCeunta);
        add(btBorrarSucursal);
        add(labelCuenta);
        add(labelSucursal);
        add(btRegresar);
        add(texSucursal);
        add(texCuenta);
        
        btBorrarSucursal.addActionListener(this);
        btBorrarCeunta.addActionListener(this);
        btRegresar.addActionListener(this);
        
        cerrar();  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btRegresar){
            this.setVisible(false);
            auxPrincipal.setVisible(true); 
        }
        if(e.getSource()== btBorrarCeunta)
        {
            if (this.aux==null)
            {
                JOptionPane.showMessageDialog(null,"No se ha agregado nada al Array","Error",JOptionPane.ERROR_MESSAGE);
            }else
            {
                aux.eliminarCuenta(texSucursal.getText(),texCuenta.getText());
            }
        }
        if (e.getSource()==btBorrarSucursal)
        {
            if (this.aux==null)
            {
                JOptionPane.showMessageDialog(null,"No se ha agregado nada al Array","Error",JOptionPane.ERROR_MESSAGE);
            }else
            {
                aux.eliminarSucursal(texSucursal.getText());
            }
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
        auxPrincipal.setVisible(true);
    }
}