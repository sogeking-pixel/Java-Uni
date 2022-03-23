
package interfaces;

import java.awt.Frame;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import proyecto.ManipulacionFile;
import proyecto.Tutor;

public class VentanaPrincipal extends JFrame{
    
    private javax.swing.JButton adminSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagarReserva;
    private javax.swing.JButton registrarDocente;
    private javax.swing.JButton reservarCurso;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtNombreBoton;
    private javax.swing.JButton verCierreCaja;
    private javax.swing.JButton verCursos;
    private javax.swing.JButton verUserRegistrados;
    
    private Tutor tutor;
    private ManipulacionFile archivos;
    private Docentes_ docente;
    
    public VentanaPrincipal(){
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
        obtenerFecha();
    }
    private void configurarVentana() {
        this.setTitle("Sistema de matricula UGG.");                  // colocamos titulo a la ventana
        this.setSize(665, 370);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
     
    private void inicializarComponentes() {
        // creamos los componentes
        reservarCurso = new javax.swing.JButton();
        verCierreCaja = new javax.swing.JButton();
        registrarDocente = new javax.swing.JButton();
        verCursos = new javax.swing.JButton();
        adminSistema = new javax.swing.JButton();
        pagarReserva = new javax.swing.JButton();
        verUserRegistrados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtFecha = new javax.swing.JLabel();
        txtNombreBoton = new javax.swing.JLabel();
        
        // configuramos los componentes
        
        reservarCurso.setText("RESERVAR CURSOS");
        reservarCurso.setBounds(15, 15, 210, 35); // X, Y, ANCHO, ALTO
        reservarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarCursoActionPerformed(evt);
            }
        });

        pagarReserva.setText("PAGAR RESERVA");
        pagarReserva.setBounds(15, 60, 210, 35); // X, Y, ANCHO, ALTO
        pagarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarReservaActionPerformed(evt);
            }
        });
        
        registrarDocente.setText("VER DOCENTES");
        registrarDocente.setBounds(15, 105, 210, 35); // X, Y, ANCHO, ALTO
        registrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDocenteActionPerformed(evt);
            }
        });
        
        verUserRegistrados.setText("VER USUARIOS REGISTRADOS");
        verUserRegistrados.setBounds(15, 150, 210, 35); // X, Y, ANCHO, ALTO
        verUserRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUserRegistradosActionPerformed(evt);
            }
        });
        
        verCursos.setText("VER CURSOS");
        verCursos.setBounds(15, 195, 210, 35); // X, Y, ANCHO, ALTO
        verCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCursosActionPerformed(evt);
            }
        });

        verCierreCaja.setText("VER CIERRE DE CAJA");
        verCierreCaja.setBounds(15, 240, 210, 35); // X, Y, ANCHO, ALTO
        verCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCierreCajaActionPerformed(evt);
            }
        });

        adminSistema.setText("ADMINISTRAR SISTEMA");
        adminSistema.setBounds(15, 285, 210, 35); // X, Y, ANCHO, ALTO
        adminSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSistemaActionPerformed(evt);
            }
        });
        
        
        txtArea.setEditable(true);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtArea.setRows(5);
        txtArea.setBounds(240, 60, 400, 260); // X, Y, ANCHO, ALTO
        //jScrollPane1.setBounds(240, 60, 400, 260); // X, Y, ANCHO, ALTO
        jScrollPane1.setViewportView(txtArea);

        
        txtFecha.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        txtFecha.setBounds(510, 10, 150, 35); // X, Y, ANCHO, ALTO

        txtNombreBoton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        //txtNombreBoton.setText("hola como estas buen weuyy");
        txtNombreBoton.setBounds(260, 20, 200, 35); // X, Y, ANCHO, ALTO
       
        
        // adicionamos los componentes a la ventana
        this.add(reservarCurso);
        this.add(verCierreCaja);
        this.add(registrarDocente);
        this.add(verCursos);
        this.add(adminSistema);
        this.add(pagarReserva);
        this.add(verUserRegistrados);
        this.add(txtArea);
        this.add(txtFecha);
        this.add(txtNombreBoton);
        this.add(jScrollPane1);
        
    }
    private void obtenerFecha(){
        Calendar c2 = new GregorianCalendar();
        String annio="",mes="",dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString((c2.get(Calendar.MONTH))+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        txtFecha.setText(dia+"/"+mes+"/"+annio);
    }
    
     private void reservarCursoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            ReservarCurso_ reserva = new ReservarCurso_();
            reserva.setVisible(true);
            this.dispose();
        }catch(Exception ex){
            
        }
    }                                             

    private void verCursosActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int lrCursos = 49;
        int lrProfes = 37;
        
        String consulta = "";
        archivos = new ManipulacionFile();
        consulta = archivos.verCursosYProfes(lrCursos, lrProfes);
        txtArea.setText(consulta);
        txtNombreBoton.setText("CURSOS Y PROFESORES");
    }                                         

    private void registrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        tutor = new Tutor();
        txtArea.setText(tutor.mostrarTodo());
        txtNombreBoton.setText("DOCENTES");
        
    }                                                

    private void pagarReservaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        /*PAGAR RESERVA*/
        try{
            this.dispose();
            PagarReserva_ pago = new PagarReserva_();
            pago.setVisible(true);
        }catch(Exception ex){
            
        }
    }                                            

    private void verCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int lrCursos = 49;
        int lrProfes = 37;
        archivos = new ManipulacionFile();
        String consulta = archivos.cierreCaja(lrCursos, lrProfes);
        txtArea.setText(consulta);
        txtNombreBoton.setText("CIERRE DE CAJA");
    }                                             

    private void adminSistemaActionPerformed(java.awt.event.ActionEvent evt){
       
        try{
            docente = new Docentes_();
            docente.setVisible(true);
            this.dispose();
        }catch(Exception ex){
            
        }
        
    }
    
    private void verUserRegistradosActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        int lrUsuarios = 27;
        int lrCursos = 49;
        int lrProfes = 37;
        
        String consulta = "";
        archivos = new ManipulacionFile();
        consulta = archivos.verUsuariosRegistrados(lrUsuarios, lrCursos, lrProfes);
        txtArea.setText(consulta);
        txtNombreBoton.setText("USUARIOS REGISTRADOS");
    }
}
