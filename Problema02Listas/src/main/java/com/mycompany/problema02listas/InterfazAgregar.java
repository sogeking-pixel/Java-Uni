package com.mycompany.problema02listas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class InterfazAgregar extends  JFrame implements ActionListener
{
    
    arrayDeCuentas registroAux1=null;
    JTextField texNombre;
    JTextField texDescripcion;
    JTextField texNumeroCuenta;
    JTextField texCredito;
    
    JLabel texTLabelNombre;
    JLabel texTLabelDescripcion;
    JLabel texTLabelNumeroCuenta;
    JLabel texTLabelCredito;
    
    JButton btGuardar;
    JButton btRegresar;
    
    Principal auxPrincipal=null;
    
    int espaciador=40;

    public void recibirArray(arrayDeCuentas registro)
    {
        this.registroAux1=registro;
    }
    
    public InterfazAgregar(Principal interfaz1) {
        setLayout(null);
        
        
        
        
        btGuardar = new JButton("Grabar Dato");
        btGuardar.setBounds(160,235,150,25);
        add(btGuardar);
        btGuardar.addActionListener(this);
        
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(20,10,110,25);
        add(btRegresar);
        btRegresar.addActionListener(this);
        
        
        texTLabelNombre=new JLabel("Ingrese el nombre del dispositico:");    
        texTLabelNombre.setBounds(20,30+espaciador,210,25);
        add(texTLabelNombre);
        
        texTLabelDescripcion=new JLabel("Ingrege la Descripción:");    
        texTLabelDescripcion.setBounds(20,70+espaciador,150,25);
        add(texTLabelDescripcion);
        
        texTLabelNumeroCuenta=new JLabel("Ingrese el su codigo:");    
        texTLabelNumeroCuenta.setBounds(20,110+espaciador,180,25);
        add(texTLabelNumeroCuenta);
        
        
        
        
        texNombre=new JTextField("(Ejemplo:Talambo)");
        texNombre.setBounds(190+espaciador,30+espaciador,250,25);
        add(texNombre);
        
        texDescripcion=new JTextField("Ingrege la Descripción:");
        texDescripcion.setBounds(190+espaciador,70+espaciador,250,25);
        add(texDescripcion);
        
        texNumeroCuenta=new JTextField("(ejemplo: C-100)");    
        texNumeroCuenta.setBounds(190+espaciador,110+espaciador,250,25);
        add(texNumeroCuenta);
        
        
        
        auxPrincipal=interfaz1;
        
        cerrar();  
    }
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btRegresar){
            if (registroAux1!=null)
            {
                auxPrincipal.setRegistro(registroAux1);
            }
            this.setVisible(false);
            auxPrincipal.setVisible(true); 
        }
        if(e.getSource()== btGuardar)
        {
            if (registroAux1==null)
            {
                registroAux1=new arrayDeCuentas();
            }
            registroAux1.agregarCuenta(texNombre.getText(), texDescripcion.getText(), texNumeroCuenta.getText(), Float.parseFloat(texCredito.getText()));
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