package com.my;

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


public class Principal extends JFrame implements ActionListener{ 
    
    JButton btAgregarDni;
    JButton btMostrarDnis;
    
    JTextArea txtBox; //caja de texto de salida 
    JScrollPane scroll; //barrita
    
    FileWriter fwDni = null; //para escribir dentro del fichero
    FileReader frDni = null;
    
    public Principal()
    {
        setLayout(null);
        
        btAgregarDni = new JButton("Agregar DNI");
        btAgregarDni.setBounds(80,70,150,25);
        btMostrarDnis = new JButton("Mostrar lista de DNI");
        btMostrarDnis.setBounds(80,140,150,25);
                
        txtBox = new JTextArea();
        scroll = new JScrollPane(txtBox);
        scroll.setBounds(270,50,200,220);
        add(btAgregarDni);
        add(btMostrarDnis);
        add(scroll);
        
        btAgregarDni.addActionListener(this);
        btMostrarDnis.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btAgregarDni){
            String dni = JOptionPane.showInputDialog(null,"Ingrese el N° DNI: ");
            if(validarDni(dni)==true){
                try{    
                    fwDni  = new FileWriter("MiDNI.txt",true);
                    fwDni.write(dni+"\n");
                    JOptionPane.showMessageDialog(null,"Registro Exitoso!!","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                    fwDni.close();
                }catch(IOException ex){
                    System.out.println(ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,dni+" no cumple con el formato ej:\nDNI: 12345678\nIntente nuevamente.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if(e.getSource()==btMostrarDnis){
                txtBox.selectAll(); 
                txtBox.replaceSelection(""); 
                String contenido;
                try {
                    frDni= new FileReader("MiDNI.txt");
                    BufferedReader buffer = new BufferedReader(frDni);
                    String temp = "";
                   
                    while(temp!=null){
                        temp = buffer.readLine();
                        if(temp!=null){
                            txtBox.append(temp+'\n');
                        }
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Principal regDni = new Principal();
        regDni.setBounds(700,300,600,350);
        regDni.setTitle("Almacen");
        regDni.setVisible(true);
        regDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static boolean validarDni(String dni){
        return dni.matches("^[0-9]{8}$");
    }
}
class Lista
{
    private Nodo campoDato=null;
    private Lista pSgte=null;

    public void insertarNodo(Nodo dato)
    {
        if(pSgte==null)
        {
            this.campoDato=new Nodo();
            campoDato=dato;
        }else
        {
            pSgte=new Lista();
            this.pSgte.campoDato=dato;
        }
    }
    public Nodo buscarNodoMatriculaEs(char matricula[])
    {
        Estudiante aux=null;
        Lista auxLista=null;
        char numeroMatricula[]=new char[10];
        Nodo resultante=null;
        boolean caso=true;
        
        aux=this.campoDato.getAuxEstudiante();
        numeroMatricula=aux.getCodigoDematriculo();
        if (numeroMatricula==matricula)
        {
            resultante=this.campoDato;
        }else
        {
            auxLista=this.pSgte;
            while (caso==true)
            {
                auxLista=auxLista.pSgte;
                resultante=auxLista.campoDato;
                aux=resultante.getAuxEstudiante();
                numeroMatricula=aux.getCodigoDematriculo();
                
                if (numeroMatricula==matricula)
                {
                    caso=false;
                }
                if (auxLista.pSgte==null)
                {
                    caso=false;
                    JOptionPane.showMessageDialog(null,"El Estudiante no existe");
                    resultante=null;
                }
            }
        }
        return resultante;
    }  
}
class Nodo
{
    private Estudiante auxEstudiante=new Estudiante();
    private Matricula auxMatricula=new Matricula();


    public Estudiante getAuxEstudiante() {
        return auxEstudiante;
    }


    public void setAuxEstudiante(Estudiante auxEstudiante) {
        this.auxEstudiante = auxEstudiante;
    }


    public Matricula getAuxMatricula() {
        return auxMatricula;
    }

    public void setAuxMatricula(Matricula auxMatricula) {
        this.auxMatricula = auxMatricula;
    }

    
}


class Estudiante
{
    private char codigoDematriculo[]=new char [10];
    private char apllidos[]=new char [20];
    private char direccion[]= new char [20];
    private char email[]=new char[30];
    private int edad;

    public char[] getCodigoDematriculo() {
        return codigoDematriculo;
    }

    public void setCodigoDematriculo(char[] codigoDematriculo) {
        this.codigoDematriculo = codigoDematriculo;
    }

    public char[] getApllidos() {
        return apllidos;
    }

    public void setApllidos(char[] apllidos) {
        this.apllidos = apllidos;
    }

    public char[] getDireccion() {
        return direccion;
    }

    public void setDireccion(char[] direccion) {
        this.direccion = direccion;
    }

    public char[] getEmail() {
        return email;
    }

    public void setEmail(char[] email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
}
class Matricula extends Curso
{
    private char codigoDematriculo[]=new char [10];
    private char apllidos[]=new char [20];

    public char[] getCodigoDematriculo() {
        return codigoDematriculo;
    }

    public void setCodigoDematriculo(char[] codigoDematriculo) {
        this.codigoDematriculo = codigoDematriculo;
    }

    public char[] getApllidos() {
        return apllidos;
    }

    public void setApllidos(char[] apllidos) {
        this.apllidos = apllidos;
    }
}
class Curso
{
   private char codigoDeCurso[]=new char [10];
   private char nombreDeCurso[]=new char [20];
   private int creditos;

    public char[] getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(char[] codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    public char[] getNombreDeCurso() {
        return nombreDeCurso;
    }

    public void setNombreDeCurso(char[] nombreDeCurso) {
        this.nombreDeCurso = nombreDeCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
   
   
}
