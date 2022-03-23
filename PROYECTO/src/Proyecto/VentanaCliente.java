
package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class VentanaCliente extends JFrame
{  
    public VentanaCliente()
    {
        setTitle("CLIENTE");
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        DatosCliente mostrarC = new DatosCliente();
        add(mostrarC);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }
     class DatosCliente extends JPanel implements ActionListener
   {
       JLabel subtitle2, diaC, edadC, imagenC;
       JTextField cajaDiaC, cajaEdadC;
       JButton aceptarC, atrasC;
       
       public DatosCliente()
       {
           setLayout(null);
           
         subtitle2 = new JLabel("INGRESE SUS DATOS PARA UNA MEJOR EXPERIENCIA: ");
         subtitle2.setBounds(10,35,380,25);
         subtitle2.setForeground(Color.orange);
         subtitle2.setFont(new Font("american captain",0,23));
         add(subtitle2);
         
         diaC = new JLabel("¿QUÉ DÍA ES HOY?: ");
         diaC.setBounds(40,107,155,25);
         diaC.setForeground(Color.red);
         diaC.setFont(new Font("american captain",0,26));
         add(diaC);
       
         edadC = new JLabel("EDAD: ");
         edadC.setBounds(130,153,85,25);
         edadC.setForeground(Color.red);
         edadC.setFont(new Font("american captain",0,26));
         add(edadC);
         
         cajaDiaC = new JTextField();
         cajaDiaC.setBounds(190,105,150,25);
         add(cajaDiaC);
         
         cajaEdadC = new JTextField();
         cajaEdadC.setBounds(190,150,150,25);
         add(cajaEdadC);
         
         aceptarC = new JButton();
         aceptarC.setText("ACEPTAR");
         aceptarC.setFont(new Font("american captain",0,20));
         aceptarC.setForeground(Color.orange);
         aceptarC.setBackground(Color.red);
         aceptarC.setBounds(260,220,95,28);
         add(aceptarC);
         
         imagenC = new JLabel();
         ImageIcon fondoC = new ImageIcon("clientefondo.png");
         imagenC.setBounds(20,0,300,300);
         imagenC.setIcon(new ImageIcon(fondoC.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH)));
         add(imagenC);
         
        //*********** FIN ETIQUETAS ***** //
        
        //******** ACTION LISTENER ******//
        
        aceptarC.addActionListener(this);
        //fecha();
       }
       
       private void fecha(){
           
        Calendar c2 = new GregorianCalendar();
        String annio="", mes="", dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString(c2.get(Calendar.MONTH)+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        
        cajaDiaC.setText(dia+"/"+mes+"/"+annio);
        cajaDiaC.setEditable(false);
       }
        @Override
        public void actionPerformed(ActionEvent e) 
        {
         
            String diaCliente;
            String yearCliente;
            
            diaCliente = cajaDiaC.getText();
            yearCliente = cajaEdadC.getText();
            
            if(e.getSource() == aceptarC)
            {
                if(!diaCliente.equals("") &&  !yearCliente.equals(""))
                        {
                        if(diaCliente.equals("lunes") || diaCliente.equals("martes") || diaCliente.equals("miercoles") || diaCliente.equals("jueves") || 
                           diaCliente.equals("viernes") || diaCliente.equals("sabado") || diaCliente.equals("domingo"))
                        {
                        VentanaCliente2 muestrate2 = new VentanaCliente2();
                        muestrate2.setVisible(true); 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"INGRESA UN DÍA CORRECTO EN MINUSCULAS");
                        }
                        }
                 else
            {
                JOptionPane.showMessageDialog(null,"Faltan llenar los campos");
                
            }
            }
            
        }
   }
}
  
   

