
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RecordAcademico  extends JFrame implements ActionListener {
   
    
    JButton miboton;
    JButton miboton2;
    JTextArea txtBox;   
    JScrollPane scroll;
    private VentanaAlumno ventana;
    
     public RecordAcademico(VentanaAlumno ventana){
      setLayout(null);
      this.ventana = ventana;
      miboton=new JButton("Mostrar arhivo");
      miboton.setBounds(40,50,180,50);
      add(miboton);
      miboton.addActionListener(this);
      miboton2=new JButton("Consultar por ID");
      miboton2.setBounds(40,110,180, 50);
      miboton2.addActionListener(this);
      add(miboton2);
      txtBox = new JTextArea();
        
      scroll = new JScrollPane(txtBox);
      scroll.setBounds(250,50,220,300);
      add(scroll);
      cerrar();
    }
     
     @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==miboton){
           
        }
            if(e.getSource()==miboton2){
                
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
        ventana.setVisible(true);
    }
    
    
}
