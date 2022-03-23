/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;


import com.mycompany.problema01listas.Cuenta;
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
import javax.swing.JTextField;

/**
 *
 * @author yerso
 */
public class RegistroCuenta  extends JFrame implements ActionListener {
    
     JButton Regitrara;
     Formulario v;
     JTextField textonumeroCuenta;
     JTextField textoNombre;
     JTextField textoInfo;
     JTextField textoSaldo;
     JLabel numeroCuenta;
     JLabel Nombre;
     JLabel Info;
     JLabel Saldo;
     
    
    public RegistroCuenta(Formulario v){ //metodo constructor: inicia la clase
      
      setLayout(null);
      Regitrara=new JButton("REGISTRAR CCUENTA");      
      Regitrara.setBounds(190,250, 160, 30);
      add(Regitrara);   
      Regitrara.addActionListener(this);
      
      numeroCuenta = new JLabel("Numero de cuenta: ");
      numeroCuenta.setBounds(20, 30, 150, 30);
      add(numeroCuenta);
      textonumeroCuenta = new JTextField();
      textonumeroCuenta.setBounds(200, 30, 250, 30);
      add(textonumeroCuenta);
      
      Nombre = new JLabel("Nombre de la sucursal: ");
      Nombre.setBounds(20, 80, 150, 30);
      add(Nombre);
      textoNombre = new JTextField();
      textoNombre.setBounds(200, 80, 250, 30);
      add(textoNombre);
      
      Info = new JLabel("Informacion de la sucursal: ");      
      Info.setBounds(20, 130, 180, 30);
      add(Info);      
      textoInfo = new JTextField();
      textoInfo.setBounds(200, 130, 250, 30);
      add(textoInfo);
      
      Saldo = new JLabel("Saldo: ");      
      Saldo.setBounds(20, 180, 100, 30);
      add(Saldo);   
      textoSaldo = new JTextField();
      textoSaldo.setBounds(200, 180, 250, 30);
      add(textoSaldo);
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
             
            if(!numero.equals("") && !nombre.equals("") && !info.equals("") && !saldo.equals("")){
                    if(validarEdad(saldo) ){
                        Cuenta aux = new Cuenta(nombre, info, numero, Integer.parseInt(saldo));
                        if(v.getListaBorrador().esVacia()){
                            v.getListaBorrador().insertarPrimero(aux);
                            JOptionPane.showMessageDialog(null,"SE REGISTRO CORRECTAMENTE");
                        }
                        else{
                            int a= v.getListaBorrador().getTamano() -1;
                            String apellido = JOptionPane.showInputDialog("INGRESE LA POSICION QUE QUIERE AGREGAR\n"
                                + "Se deve de tener en cuenta que la lista comienza en  0 y la ultima posicion de la lista es  "+ a+ "\n Si quiere agregarlo al final solo debe de escribir un numero superior a la ultima posicion");
                            boolean bandera= false;
                            
                            while(!bandera){
                                if(validarEdad(apellido)){
                                int posicion = Integer.parseInt(apellido);
                                
                                if( posicion >= 0 ){
                                    
                                    if(posicion > a){
                                        v.getListaBorrador().insertarFinal(aux);
                                    }
                                    else{
                                        v.getListaBorrador().insertarPosicion(aux, posicion);
                                    }
                                    JOptionPane.showMessageDialog(null,"SE REGISTRO CORRECTAMENTE");
                                    bandera = true;
                                    
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Ingrese una posicion correcta");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"NO ES UN NUMERO");
                                
                            }
                            }
                            
                            
                        }                       
        
                        
                        
                        limpiar();
                    }
                    else{
                       
                        JOptionPane.showMessageDialog(null,saldo+" no es un entero","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
            else{
                JOptionPane.showMessageDialog(null,"HAY CASILLAS EN BLANCOS");
                limpiar();
            }
            
        
        }
        
        
    }
     
     public boolean validarEdad(String edad){
        return edad.matches("[0-9]*");
    }
    
    private void limpiar(){
        textoInfo.setText("");
        textoNombre.setText("");
        textoSaldo.setText("");
       textonumeroCuenta.setText("");
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
