//Programa que lee un poema y lo guarda en un archivo txt llamado poema.txt
//ALUMNOS: Fernandez Vigo, Arrelucea Arrelucea, Murrugarra Vigo
//Fecha de Elaboracion: 25/11/2021
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class principal extends JFrame implements ActionListener{
    
    //BOTONES
    JButton btAgregarV;
    JButton btMostrarV;
    
    JTextArea txtBox; //CAJA PARA MOSTRAR EL POEMA
    JScrollPane scroll; //BARRA DE SCROOLL
    
    FileWriter wr = null; //PARA ESCRIBIR DENTRO DEL FICHERO
    FileReader fr = null;
    
    
    public principal()
    {
        setLayout(null);
        btAgregarV = new JButton("Agregar verso");
        btAgregarV.setBounds(80,70,150,25);
        btMostrarV = new JButton("Mostrar poema");
        btMostrarV.setBounds(80,140,150,25);      
        txtBox = new JTextArea();
        scroll = new JScrollPane(txtBox);
        scroll.setBounds(270,50,200,220);
        add(btAgregarV);
        add(btMostrarV);
        add(scroll);
        btAgregarV.addActionListener(this);
        btMostrarV.addActionListener(this);
    }
    
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btAgregarV){
            String linea = JOptionPane.showInputDialog(null,"Ingrese el numero de linea ");
            String descripcion = JOptionPane.showInputDialog(null,"Ingrese la descripcion ");
            //CREAMOS UN OBJETO CON LOS ATRIBUTOS DEL POEMA
            Poema objeto = new  Poema(linea, descripcion);
                try{    
                    wr  = new FileWriter("poema.txt",true);
                    wr.write(objeto.getLinea()+";");
                    wr.write(objeto.getDescripcion()+";");
                    JOptionPane.showMessageDialog(null,"Registro Exitoso!!","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                    wr.close();
                }catch(IOException ex){
                    System.out.println(ex);
                }
        }else{
            if(e.getSource()==btMostrarV){
                txtBox.selectAll(); 
                txtBox.replaceSelection(""); 
                String contenido;
                try {
                    fr= new FileReader("poema.txt");
                    BufferedReader buffer = new BufferedReader(fr);
                    String temp = "";
                   //SE MUESTRA LO QUE TIENE EL TXT MIENTRAS EL TEMP SEA =  A NULO
                    while(temp!=null){
                        temp = buffer.readLine();
                        if(temp!=null){
                            txtBox.append(temp+'\n');
                        }
                    } 
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        principal regDni = new principal();
        regDni.setBounds(700,300,600,350);
        regDni.setTitle("Leer Poema - UNT");
        regDni.setVisible(true);
        regDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


// CREAMOS LA CLASE POEMA
class Poema{
    String linea;
    String descripcion;

    public Poema(String linea, String descripcion) {
        this.linea = linea;
        this.descripcion = descripcion;
    }

    public String getLinea() {
        return linea;
    }

    public String getDescripcion() {
        return descripcion;
    } 
}
