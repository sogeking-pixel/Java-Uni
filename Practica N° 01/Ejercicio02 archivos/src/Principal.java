import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    JButton miboton;
    JButton miboton2;
    JButton miboton3;
    JButton miboton4;
    
    public Principal(){
      setLayout(null);
      miboton=new JButton("Introducir datos");
      miboton.setBounds(40,50,180,50);
      add(miboton);
      miboton.addActionListener(this);
      miboton2=new JButton("Buscar nota");
      miboton2.setBounds(40,110,180, 50);
      add(miboton2);
      miboton2.addActionListener(this);
      miboton3=new JButton("Hallar la nota promedio");
      miboton3.setBounds(40,170, 180, 50);
      add(miboton3);
      miboton3.addActionListener(this);
      miboton4=new JButton("Salir");
      miboton4.setBounds(40,230, 180, 50);
      add(miboton4);
      miboton4.addActionListener(this);
    }
    
    //Variables
    Alumno alumno;
    Alumno alumnos[]=new Alumno[100];
    int indice=-1;
    float promedio;
    int numeroAlumnos;
    int  expediente;
    String nombre;
    float  nota;
    float notaMedia;
    
    
    //Buscar alumno en el array
    public Alumno buscarAlumno (String nombre){
         Alumno auxAlumno=null;
         boolean noEncontrado=true;
         int i=0;
         if(indice!=-1){
             i=0;
             while(i<=indice && noEncontrado){
                 if(alumnos[i].getNombre().equals(nombre)){
                     auxAlumno =alumnos[i];
                     noEncontrado=false;
                 }
                 i++;
             }
         }
         return auxAlumno;
     }
    
    public void guardarAlumno(Alumno alumno){
         indice=indice+1;
         alumnos[indice]=alumno;
     }
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==miboton){
            expediente=Integer.valueOf(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE EXPEDIENTE"));
            nombre=JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ALUMNO");
            nota=Float.parseFloat(JOptionPane.showInputDialog("INGRESE LA NOTA DEL ALUMNO"));
            numeroAlumnos=numeroAlumnos+1;
            promedio=promedio+nota;
            guardarAlumno(new Alumno(expediente, nombre,nota));
        }
        if(e.getSource()==miboton2){
            nombre=JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ALUMNO");
            alumno=buscarAlumno(nombre);
            if(alumno!=null){
                
                 JOptionPane.showMessageDialog(null,"EL ALUMNO "+nombre+" TIENE DE NOTA "+ alumno.getNota());           
            }
            else{
                JOptionPane.showMessageDialog(null,"EL ALUMNO "+nombre+" NO EXISTE");           
            }
        }
        
        if(e.getSource()==miboton3){
            notaMedia=promedio/numeroAlumnos;
            JOptionPane.showMessageDialog(null,"LA MEDIA DE LA CLASE ES :"+ notaMedia);
        }
        
        if(e.getSource()==miboton4){
            System.exit(0); 
        }
    }
    
    public static void main(String[] args) {  
        Principal mf=new Principal();
        mf.setBounds(20, 30, 270, 340); // x,y,ancho,alto
        mf.setTitle("Programa número 2");
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
