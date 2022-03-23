
package Interfaz;


import java.awt.Frame;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import logica.Alumno;
import logica.Curso;
import logica.GestorFicheroSerializado;
import logica.Matricula;
import logica.Profesor;


public class VentanaPrincipal extends JFrame{ 
    
    
    
    private javax.swing.JButton administrado;    
    private javax.swing.JButton alumno;
    private javax.swing.JButton profesor;
     private VentanaAdmi ventanaAdmi;
     private VentanaAlumno ventanaAlumno;
     private VentanaDocente ventanaDocente;
     
     
      GestorFicheroSerializado<Alumno> gestorAlumnos = new GestorFicheroSerializado("src/archivos/Alumnos.dat");
      GestorFicheroSerializado<Curso> gestorCursos = new GestorFicheroSerializado("src/archivos/Cursos.dat");
      GestorFicheroSerializado<Matricula> gestorMatricula = new GestorFicheroSerializado("src/archivos/Matriculas.dat");
      GestorFicheroSerializado<Profesor> gestorProfesor = new GestorFicheroSerializado("src/archivos/Profesores.dat");
     
     
    
    
    public VentanaPrincipal(){
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
        //obtenerFecha();
    }
    private void configurarVentana() {
        this.setTitle("Sistema de matricula UGG.");                  // colocamos titulo a la ventana
        this.setSize(500, 339);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
     
    private void inicializarComponentes() {
        // creamos los componentes
        
        administrado = new javax.swing.JButton();
        alumno = new javax.swing.JButton();
        profesor = new javax.swing.JButton();
        
        
        // configuramos los componentes
        
        administrado.setText("ENTRAR COMO ADMINISTRAR");
        administrado.setFont(new java.awt.Font("Courier New", 1, 16));
        administrado.setBounds(80, 40, 300, 50); // X, Y, ANCHO, ALTO
        administrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorActionPerformed(evt);
            }
        });

         alumno.setText("ENTRAR COMO ALUMNO");
         alumno.setFont(new java.awt.Font("Courier New", 1, 16));
         alumno.setBounds(80, 120, 300, 50); // X, Y, ANCHO, ALTO
         alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoActionPerformed(evt);
            }
        });
        
         profesor.setText("ENTRAR COMO PROFESOR");
         profesor.setFont(new java.awt.Font("Courier New", 1, 16));
         profesor.setBounds(80, 200, 300, 50); // X, Y, ANCHO, ALTO
         profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });
        
       
        
        // adicionamos los componentes a la ventana
        this.add(administrado);
        this.add(alumno);
        this.add(profesor);
        
        
    }
    /*
    private void obtenerFecha(){
        Calendar c2 = new GregorianCalendar();
        String annio="",mes="",dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString((c2.get(Calendar.MONTH))+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        txtFecha.setText(dia+"/"+mes+"/"+annio);
    }
    */
    
    
     private void alumnoActionPerformed(java.awt.event.ActionEvent evt) {                                              
      if(ventanaAlumno==null){
            ventanaAlumno = new VentanaAlumno(this);
            ventanaAlumno.setTitle("ALUMNO");
            ventanaAlumno.setBounds(850, 400, 350, 200);
        }
        
        this.setVisible(false);
        ventanaAlumno.setVisible(true);
    }                                             
     
     
     private void profesorActionPerformed(java.awt.event.ActionEvent evt) {                                              
      if(ventanaDocente==null){
            ventanaDocente = new VentanaDocente(this);
            ventanaDocente.setTitle("DOCENTE");
            ventanaDocente.setBounds(850, 400, 350, 200);
        }
        
        this.setVisible(false);
        ventanaDocente.setVisible(true);
    }     
                                                 

    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        if(ventanaAdmi==null){
            ventanaAdmi = new VentanaAdmi(this);
            ventanaAdmi.setTitle("ADMINISTRADOR");
            ventanaAdmi.setBounds(850, 400, 350, 250);
        }
        
        this.setVisible(false);
        ventanaAdmi.setVisible(true);
           
        
        
        
        /*try{
            this.dispose();
            RegistrarMatricuala ventanRegistra = new RegistrarMatricuala();
            ventanRegistra.setVisible(true);
        }catch(Exception ex){
            
        }
        */
    }                                            

    
}
