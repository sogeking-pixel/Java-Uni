
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ALVAREZ LOYOLA BRUNO
 */
public class Seleccion extends JFrame
{
    
    public Seleccion()
    {
        setTitle("VENTANA SELECCION");
        setSize(500,400);
        setLocationRelativeTo(null);
        setResizable(false);
        Seleccion2 muestrate6 = new Seleccion2();
        add(muestrate6);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    class Seleccion2 extends JPanel implements ActionListener
    {
        public JLabel subtitle3, imagen0;
        JButton btnPlatos, btnPostres;
        
        public Seleccion2()
        {
         
         setLayout(null);
         subtitle3 = new JLabel("SELECCIONA PLATOS O POSTRES: ");
         subtitle3.setBounds(20,65,340,32);
         subtitle3.setForeground(Color.orange);
         subtitle3.setFont(new Font("american captain",0,32));
         add(subtitle3);
         
        btnPlatos = new JButton("<html><center>INGRESAR DATOS DE PLATOS<html");
        btnPlatos.setFont(new Font("american captain",0,22));
        btnPlatos.setBackground(Color.LIGHT_GRAY);
        btnPlatos.setForeground(Color.yellow);
        btnPlatos.setBounds(80,150,150,100);
        add(btnPlatos);
        
        btnPostres = new JButton("<html><center>INGRESAR DATOS DE PLATOS<html");
        btnPostres.setFont(new Font("american captain",0,22));
        btnPostres.setBackground(Color.LIGHT_GRAY);
        btnPostres.setForeground(Color.yellow);
        btnPostres.setBounds(250,150,150,100);
        add(btnPostres);
            
        imagen0 = new JLabel();
        ImageIcon fondo0 = new ImageIcon("restaurant8.png");
        imagen0.setBounds(0,0,500,400);
        imagen0.setIcon(new ImageIcon(fondo0.getImage().getScaledInstance(500,400,Image.SCALE_SMOOTH)));
        add(imagen0);
        
        btnPlatos.addActionListener(this);
        btnPostres.addActionListener(this);
        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==btnPlatos)
            {
                Dias muestrate6 = new Dias();
                muestrate6.setVisible(true);
            }
            else if(e.getSource()==btnPostres)
            {
                Dias muestrate6 = new Dias();
                muestrate6.setVisible(true);
            }
        }
                
    }
}
