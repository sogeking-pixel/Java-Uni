//Programa que permita ingresar N alumnos en un archivo binario
//Alumnos: Fernandez Vigo, Murrugarra Vigo, Arrelucea Arrelucea
//Fecha de elaboración: 25/11/2021

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal extends JFrame implements ActionListener{
    
    //BOTONES DE LA INTERFAZ
    JButton miboton;
    JButton miboton2;
    JButton miboton3;
    JButton miboton4;
    JButton miboton5;
    
     public principal(){
      setLayout(null);
      miboton=new JButton("Creación del archivo");
      miboton.setBounds(40,50,180,50);
      add(miboton);
      miboton.addActionListener(this);
      miboton2=new JButton("Ingresar alumno");
      miboton2.setBounds(40,110,180, 50);
      add(miboton2);
      miboton2.addActionListener(this);
      miboton3=new JButton("Mostrar alumnos");
      miboton3.setBounds(40,170, 180, 50);
      add(miboton3);
      miboton3.addActionListener(this);
      miboton4=new JButton("Eliminar Fichero Binario");
      miboton4.setBounds(40,230, 180, 50);
      add(miboton4);
      miboton4.addActionListener(this);
      miboton5=new JButton("Salir");
      miboton5.setBounds(40,290, 180, 50);
      add(miboton5);
      miboton5.addActionListener(this);
    }
    
    //VARIABLES
    String nombre;
    String apellido;
    String  edad;
    String lugarDeNacimiento;
    //Variable auxiliar
    Alumno c;
    
    File fichero = new File("registro.dat");
    
    //Eventos de los botones
    public void actionPerformed(ActionEvent e){
        Scanner sn = new Scanner (System.in);
        if(e.getSource()==miboton){
            //Si el fichero existe, lo indico en el mensaje de error
            if (fichero.exists()) {
                JOptionPane.showMessageDialog(null,"Fichero ya  existe","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                //sino existe lo creo y muestro un mensaje de confirmación
                try{
                if (fichero.createNewFile()) {
                    JOptionPane.showMessageDialog(null,"Operación realizada satisfactoriamente","Creacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                } 
                }catch(FileNotFoundException ex){
                    ex.printStackTrace();
                } catch (IOException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        if(e.getSource()==miboton2){
            //Si el archivo existe puedo leer los datos
            if (fichero.exists()) {
            //Leo los datos del alumno para ingresar al archivo binario
            nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante :");
            apellido=JOptionPane.showInputDialog("Ingrese el apellido del estudiante :");
            edad=JOptionPane.showInputDialog("Ingrese la edad del estudiante :");
            lugarDeNacimiento=JOptionPane.showInputDialog("Ingrese su lugar de nacimiento :");
            c = new Alumno(apellido, nombre, edad, lugarDeNacimiento);
            try{
                            ObjectOutputStream oos;
                            //Si el fichero esta vacio, escribiremos con Objectoutputstream
                            //Sino con MiObjectOutputStream
                            if (fichero.length() == 0) {
                                oos = new ObjectOutputStream(new FileOutputStream(fichero));
                            } else {
                                //el true es importante
                                oos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                            }
                            //Escribimos en el fichero
                oos.writeObject(c);
                 JOptionPane.showMessageDialog(null,"Operación realizada satisfactoriamente","Eliminación Exitosa",JOptionPane.INFORMATION_MESSAGE);
            }catch(IOException ex){
            } 
            //Si no existe muestro un mensaje de error
            }else
            {
                JOptionPane.showMessageDialog(null,"Primero cree el fichero binario","Error",JOptionPane.ERROR_MESSAGE);  
            }
        }  
        if(e.getSource()==miboton3){
            if (fichero.exists()) {
                try(ObjectInputStream ois=new ObjectInputStream (new FileInputStream(fichero))){
                //Mientras haya que leer que muestre en pantalla la información del alumno
                while(true){
                    Alumno aux=(Alumno)ois.readObject();
                    JOptionPane.showMessageDialog(null,aux.toString());
                }
             }catch(ClassNotFoundException ex){
             }catch(EOFException ex){
             }catch(IOException ex){
             }     
            }else{
                JOptionPane.showMessageDialog(null,"Primero cree el fichero binario","Error",JOptionPane.ERROR_MESSAGE);
            }   
        }
        if(e.getSource()==miboton4){
            if(fichero.exists()){
                fichero.delete();
                JOptionPane.showMessageDialog(null,"Operación realizada satisfactoriamente","Eliminación Exitosa",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El fichero para eliminar no existe","Error",JOptionPane.ERROR_MESSAGE);
            } 
        }
        if(e.getSource()==miboton5){
            System.exit(0);
        }
    }

    public static void main(String[] args) { 
        principal mf=new principal();
        mf.setBounds(20, 30, 400, 420); // x,y,ancho,alto
        mf.setTitle("Programa de Resitro de Alumnos - UNT");
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
