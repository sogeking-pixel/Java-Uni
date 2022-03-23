/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizacionproyectofinal;
//paquetes imagen

package Imagenes;
import java.awt.Graphics;
import java.awt.Image;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author jorge
 */
public class OrganizacionProyectoFinal extends JFrame implements ActionListener { 

    
    FondoPanel fondo= new FondoPanel();
    ImageIcon imagen;
    
    JButton miboton;
    
    JTextArea txtBox;   
    JScrollPane scroll; 
    
    
    public OrganizacionProyectoFinal(){
        this.setContentPane(fondo); //fondo
        setLayout(null);
      
        miboton=new JButton();
        miboton.setBounds(50,200,306,73 );
       
        ImageIcon imagen2= new ImageIcon("C:\\Users\\yerso\\Documents\\NetBeansProjects\\asdfghjkl\\src\\organizacionproyectofina\\BotonEntrar.png");
        miboton.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(miboton.getWidth(),miboton.getHeight(),Image.SCALE_SMOOTH)));
        fondo.add(miboton);
        miboton.addActionListener(this);
    }
     
    
    public static void main(String[] args) {
        OrganizacionProyectoFinal Principal=new OrganizacionProyectoFinal();
        Principal.setBounds(-10, 0, 1950, 1080);
        Principal.setTitle("Universidad de Springfield");
        Principal.setVisible(true);
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==miboton)
        {
            JOptionPane.showMessageDialog(null,"Resultados: \nid: ");
        }
        
        
    }

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Fondo 
    class FondoPanel extends JPanel
    {
        private Image fondoInicioSecion;
        
        @Override
        public void paint(Graphics g)
        {
            fondoInicioSecion=new ImageIcon(getClass().getResource("/imagenes/FONDO 01.png")).getImage();
            g.drawImage(fondoInicioSecion,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    ///Boton Entrar
  
   
    
}


