
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Bruno
 */
public class Dias extends JFrame implements ActionListener{
    
    JLabel subtitle, imagen4;
    JButton atras,lunes, martes, miercoles, jueves, viernes, sabado, domingo;
    private IngresoDeDatos ingresar;
    
    public Dias()
    {
        setSize(600,400);
        setTitle("SELECCION DE DÍA");
        setLocationRelativeTo(null);
        setResizable(false);
        //Etiquetas3 componentes3 = new Etiquetas3();
        //add(componentes3);
        etiquetas3();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }    
    
    public void etiquetas3()
{
  
  setLayout(null);
    
  subtitle = new JLabel();
  subtitle.setText("SELECCIONA UN DÍA PARA EL INGRESO DE DATOS:");
  subtitle.setBounds(45, 40, 445, 45);
  subtitle.setFont(new Font("american captain",0,30));
  subtitle.setForeground(Color.red);
  add(subtitle);
  
  
  
  lunes = new JButton("LUNES");
  lunes.setBounds(50,140,100,50);
  lunes.setFont(new Font("american captain",0,25));
  lunes.setBackground(Color.blue);
  lunes.setForeground(Color.white);
  add(lunes);
  
  martes = new JButton("MARTES");
  martes.setBounds(160,140,100,50);
  martes.setFont(new Font("american captain",0,25));
  martes.setBackground(Color.blue);
  martes.setForeground(Color.white);
  add(martes);
  
  
  miercoles = new JButton("MIERCOLES");
  miercoles.setBounds(270,140,120,50);
  miercoles.setFont(new Font("american captain",0,25));
  miercoles.setBackground(Color.blue);
  miercoles.setForeground(Color.white);
  add(miercoles);
  
  jueves = new JButton("JUEVES");
  jueves.setBounds(410,140,100,50);
  jueves.setFont(new Font("american captain",0,25));
  jueves.setBackground(Color.blue);
  jueves.setForeground(Color.white);
  add(jueves);
  
  viernes = new JButton("VIERNES");
  viernes.setBounds(105,205,100,50);
  viernes.setFont(new Font("american captain",0,25));
  viernes.setBackground(Color.blue);
  viernes.setForeground(Color.white);
  add(viernes);
  
  sabado = new JButton("SABADO");
  sabado.setBounds(225,205,100,50);
  sabado.setFont(new Font("american captain",0,25));
  sabado.setBackground(Color.blue);
  sabado.setForeground(Color.white);
  add(sabado);
  
  domingo = new JButton("DOMINGO");
  domingo.setBounds(340,205,120,50);
  domingo.setFont(new Font("american captain",0,25));
  domingo.setBackground(Color.blue);
  domingo.setForeground(Color.white);
  add(domingo);
  
  atras = new JButton();
  atras.setText("ATRÁS");
  atras.setFont(new Font("american captain",0,20));
  atras.setForeground(Color.WHITE);
  atras.setBackground(Color.RED);
  atras.setBounds(450,300,95,35);
  add(atras);
 
  imagen4 = new JLabel();
  ImageIcon fondo3 = new ImageIcon("restaurant3.jpg");
  imagen4.setBounds(0,0,600,400);
  imagen4.setIcon(new ImageIcon(fondo3.getImage().getScaledInstance(600,400,Image.SCALE_SMOOTH)));
  add(imagen4);
  
  //********* ACTION LISTENER ***** //
  
  lunes.addActionListener(this);
  martes.addActionListener(this);
  miercoles.addActionListener(this);
  jueves.addActionListener(this);
  viernes.addActionListener(this);
  sabado.addActionListener(this);
  domingo.addActionListener(this);
  
  
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == lunes){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoLunes.txt";
            //System.out.println("LUNESSS");
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            ingresar.setVisible(true);
        }
        if(ae.getSource() == martes){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoMartes.txt";
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            ingresar.setVisible(true);
        }
        if(ae.getSource() == miercoles){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoMiercoles.txt";
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            ingresar.setVisible(true);
        }
        if(ae.getSource() == jueves){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoJueves.txt";
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            ingresar.setVisible(true);
        }
        if(ae.getSource() == viernes){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoViernes.txt";
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            
            ingresar.setVisible(true);
            
        }
        if(ae.getSource() == sabado){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoSabado.txt";
            
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            ingresar.setVisible(true);
            
        }
        if(ae.getSource() == domingo){
            String RUTA_ARCHIVO = "src/ArchivosPlato/platoDomingo.txt";
            ingresar = new IngresoDeDatos(RUTA_ARCHIVO);
            
            ingresar.setVisible(true);
        }
        
    }
}
