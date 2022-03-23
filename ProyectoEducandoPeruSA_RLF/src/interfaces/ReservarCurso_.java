
package interfaces;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import proyecto.Cursos;
import proyecto.Reservas;
import proyecto.Tutor;
import proyecto.UserCurso;
import proyecto.Usuarios;

public class ReservarCurso_ extends javax.swing.JFrame {
    private Usuarios user = new Usuarios();
    private Cursos curso = new Cursos();
    private UserCurso user_curso = new UserCurso();
    private Reservas reserva = new Reservas();
    private Tutor profe = new Tutor();
    
    
     
    private javax.swing.ButtonGroup botonGrupo;
    private javax.swing.JComboBox comboProfes;
    private javax.swing.JComboBox comboUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radioNO;
    private javax.swing.JRadioButton radioSI;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextField txtCostoCurso;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtFechaReserva;
    private javax.swing.JTextField txtNomCurso;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JLabel txtPantalla;
    
    private ArrayList nombresProfes = new ArrayList();
    private ArrayList nombresUser = new ArrayList();
    private boolean estado = false;
    public static int incremento=0 ;
    
    
    public ReservarCurso_() {
        incremento++;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RESERVAR CURSOS");
        unirRadios();
        obtenerAnho();
        txtFechaPago.setEnabled(false);
        verProfes();
        verUser();
        radioNO.setSelected(true);
    }
    
    private void verUser(){
        nombresUser = user.verUsuarios();
        String nom="";
        if(nombresUser.size() == 0){
            comboUser.addItem("VACIO");
            return;
        }
        comboUser.removeAllItems();
        for (int i = 0; i < nombresUser.size(); i++) {
            nom = (String) nombresUser.get(i);
            comboUser.addItem(nom);
        }
        
    }
    private void verProfes(){
        comboProfes.removeAllItems();
        nombresProfes = profe.nombreProfes();
        String nom="";
        for (int i = 0; i < nombresProfes.size(); i++) {
            nom = (String) nombresProfes.get(i);
            comboProfes.addItem(nom);
        }
    }
    private void obtenerAnho(){
        Calendar c2 = new GregorianCalendar();
        String annio="",mes="",dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString((c2.get(Calendar.MONTH))+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        txtFechaReserva.setText(dia+"/"+mes+"/"+annio);
        
    }
    
    private void unirRadios(){
        botonGrupo.add(radioSI);
        botonGrupo.add(radioNO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        botonGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodUser = new javax.swing.JTextField();
        txtNomUser = new javax.swing.JTextField();
        comboUser = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboProfes = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtCodCurso = new javax.swing.JTextField();
        txtNomCurso = new javax.swing.JTextField();
        txtCostoCurso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        radioSI = new javax.swing.JRadioButton();
        radioNO = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtFechaReserva = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        txtCodUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodUserKeyPressed(evt);
            }
        });

        jLabel10.setText("BUSCAR USUARIO:");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        jLabel3.setText("CODIGO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("COSTO:");

        comboProfes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("DOCENTE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCostoCurso)
                    .addComponent(txtNomCurso)
                    .addComponent(txtCodCurso)
                    .addComponent(comboProfes, 0, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCostoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboProfes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));

        jLabel7.setText("FECHA DE RESERVA:");

        radioSI.setText("SI");
        radioSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSIActionPerformed(evt);
            }
        });

        radioNO.setText("NO");
        radioNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNOActionPerformed(evt);
            }
        });

        jLabel8.setText("PAGAR AHORA:");

        jLabel9.setText("FECHA DE PAGO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaReserva)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioNO))
                    .addComponent(txtFechaPago)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNO)
                    .addComponent(radioSI)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("RESERVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtPantalla.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            this.dispose();
            VentanaPrincipal v = new VentanaPrincipal();
            v.setVisible(true);
        }catch(Exception ex){
            
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        /*USUARIOS*/
        String codUser = txtCodUser.getText();
        String nomUser = txtNomUser.getText();
        
        
        /*CURSOS*/
        String codCurso = txtCodCurso.getText();
        String nomCurso = txtNomCurso.getText();
        String costoCurso = txtCostoCurso.getText();
        String idDocente = String.valueOf(comboProfes.getSelectedIndex()+1);
        
        
        
        /*RESERVA*/
        String dateReserva = txtFechaReserva.getText();
        String estadoPago ="";
        if(estado){
            estadoPago = " "; // si pago
        }
        else{
            estadoPago = "*";// no pago xd
        }
        
        String datePago = txtFechaPago.getText();
        
        
        
        
        user.escribir(codUser, nomUser);
        curso.escribir(codCurso, nomCurso, costoCurso, idDocente,"12");
        user_curso.escribir(codUser, codCurso);
        reserva.escribir(dateReserva, estadoPago, datePago, codUser);
        txtPantalla.setText("REGISTRADO");
        
        verUser();
        
    }                                        

    private void radioSIActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(radioSI.isSelected()){
            estado = true;
            txtFechaPago.setEnabled(true);
            Calendar c2 = new GregorianCalendar();
        String annio="",mes="",dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString((c2.get(Calendar.MONTH))+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        txtFechaPago.setText(dia+"/"+mes+"/"+annio);
        }
    }                                       

    private void radioNOActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(radioNO.isSelected()){
            estado = false;
            txtFechaPago.setEnabled(false);
            txtFechaPago.setText("");
        }
    }                                       

    private void txtCodUserKeyPressed(java.awt.event.KeyEvent evt) {                                      
        txtPantalla.setText("");
    }                                     

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(comboUser.getSelectedItem().equals("VACIO")){return;}
        try{
            String nom = (String) comboUser.getSelectedItem();
            int nr = (comboUser.getSelectedIndex()+1);
            String cod = user.verCodigo(nr);
            txtNomUser.setText(nom);
            txtCodUser.setText(cod);
            
        }catch(Exception ex){
            
        }
        
        
    }                                        

    
}
