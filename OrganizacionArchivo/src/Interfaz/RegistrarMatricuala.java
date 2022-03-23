
package Interfaz;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import logica.GestorFicheroSerializado;
import logica.Matricula;


public class RegistrarMatricuala extends javax.swing.JFrame {

    
    private javax.swing.ButtonGroup botonGrupo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox comboUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioNO;
    private javax.swing.JRadioButton radioSI;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextField txtCostoCurso;
    private javax.swing.JTextField txtDocenteCurso;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtFechaReserva;
    private javax.swing.JTextField txtNomCurso;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JLabel txtPantalla;
    
    GestorFicheroSerializado<Matricula> gestorMatricula = new GestorFicheroSerializado("src/archivos/Matriculas.dat");
   
    public RegistrarMatricuala() {
        initComponents();
        obtenerFecha();
        unirRadios();
        this.setLocationRelativeTo(null);
        this.setTitle("PAGAR RESERVA");
        radioSI.setSelected(true);
        noEditarCajas();
        verUser();
    }
    
    
    
    private void noEditarCajas(){
        txtCodCurso.setEditable(false);
        txtCostoCurso.setEditable(false);
        txtDocenteCurso.setEditable(false);
        radioNO.setEnabled(false);
    }
    
    private void verUser(){
        
        String nom=" ";
        comboUser.removeAllItems();
        if(0 == 0){
            comboUser.addItem("VACIO");
            return;
        }
        
        for (int i = 0; i < 3; i++) {
            
            comboUser.addItem(nom);
        }
    }

    private void unirRadios(){
        botonGrupo.add(radioSI);
        botonGrupo.add(radioNO);
    }

    private void obtenerFecha(){
        Calendar c2 = new GregorianCalendar();
        String annio="",mes="",dia="";
        annio = Integer.toString(c2.get(Calendar.YEAR));
        mes = Integer.toString((c2.get(Calendar.MONTH))+1);
        dia = Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
        txtFechaPago.setText(dia+"/"+mes+"/"+annio);
    }
    
    
   
    private void initComponents() {

        botonGrupo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodUser = new javax.swing.JTextField();
        txtNomUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboUser = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodCurso = new javax.swing.JTextField();
        txtCostoCurso = new javax.swing.JTextField();
        txtDocenteCurso = new javax.swing.JTextField();
        txtNomCurso = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        radioSI = new javax.swing.JRadioButton();
        radioNO = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtFechaReserva = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        txtPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        jLabel3.setText("CODIGO:");

        jLabel4.setText("NOMBRE:");

        txtCodUser.setEditable(false);

        txtNomUser.setEditable(false);

        jLabel1.setText("BUSCAR USER:");

        comboUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        jLabel5.setText("CURSO:");

        jLabel6.setText("CODIGO:");

        jLabel7.setText("COSTO:");

        jLabel8.setText("DOCENTE:");

        txtCodCurso.setEditable(false);

        txtCostoCurso.setEditable(false);

        txtDocenteCurso.setEditable(false);

        txtNomCurso.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocenteCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtCostoCurso)
                    .addComponent(txtCodCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomCurso))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCostoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDocenteCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));

        jLabel9.setText("FECHA DE RESERVA:");

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

        jLabel10.setText("PAGAR AHORA:");

        txtFechaReserva.setEditable(false);

        jLabel11.setText("FECHA DE PAGO:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaReserva)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(radioSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(radioNO))
                    .addComponent(txtFechaPago)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNO)
                    .addComponent(radioSI)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPagar.setText("PAGAR AHORA");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        txtPantalla.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnPagar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void radioSIActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(radioSI.isSelected()){
            obtenerFecha();
            txtFechaPago.setEnabled(true);
        }
    }                                       

    private void radioNOActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(radioNO.isSelected()){
            txtFechaPago.setText("");
            txtFechaPago.setEnabled(false);
        }
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            this.dispose();
            VentanaPrincipal inicio = new VentanaPrincipal();
            inicio.setVisible(true);
        }catch(Exception ex){
            
        }
        
    }                                        

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int lrCursos = 49;
        int lrProfes = 37;
        int lrReserva = 43;
        int nr = comboUser.getSelectedIndex()+1;
        String codUser = txtCodUser.getText();
        if(codUser.equals("") || codUser.equals(" ")){
            return;
        }
        
        
        
        String fechaReserva = descomponerLineaNombres("as", 52, 67);
        String fechaPago = txtFechaPago.getText();
        
        String estadoPago = " ";
        
        //reserva.editar(nr, fechaReserva, fechaPago, codUser, estadoPago);
        txtPantalla.setText("PAGADO CON EXITO");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(comboUser.getSelectedItem().equals("VACIO")){return;}        
        try{
            String nom = (String) comboUser.getSelectedItem();
            int nr = (comboUser.getSelectedIndex()+1);
            //String cod = user.verCodigo(nr);
            txtNomUser.setText(nom);
            txtCodUser.setText("");
            
        }catch(Exception ex){
            
        }
        
        int indexCombo = comboUser.getSelectedIndex()+1;
        mostrarCursoYProfes(indexCombo);
    }                                        

    private void mostrarCursoYProfes(int nr){
        int lrCursos = 49;
        int lrProfes = 37;
        int lrReserva = 43;
        
        String codCurso="";
        String nomCurso="";
        String costoCurso="";
        String nomProfe="";
        
        String fechaReserva="";
        String fechaPago="";
        String estadoPago="";
        
        //tring lectura = archivo.cursoYProfesCompleto(nr, lrCursos, lrProfes, lrReserva);
        
        //codCurso = descomponerLineaNombres(lectura, 0, 10);
        //nomCurso = descomponerLineaNombres(lectura, 10, 30);
        //costoCurso = descomponerLineaNombres(lectura, 30, 37);
        //nomProfe = descomponerLineaNombres(lectura, 37, 52);
        
        //fechaReserva = descomponerLineaNombres(lectura, 52, 67);
       // fechaPago = descomponerLineaNombres(lectura, 67, 82);
        //estadoPago = descomponerLineaNombres(lectura, 92, 93);
        
        if(estadoPago.equals("*")){
            txtPantalla.setText("FALTA PAGAR");
            txtFechaReserva.setText(fechaReserva);
            
            radioSI.setEnabled(true);
            txtFechaPago.setEditable(true);
            btnPagar.setEnabled(true);
        }
        if(estadoPago.equals(" ")){
            txtPantalla.setText("PAGADO");
            txtFechaReserva.setText(fechaReserva);
            txtFechaPago.setText(fechaPago);
            radioSI.setEnabled(false);
            txtFechaPago.setEditable(false);
            btnPagar.setEnabled(false);
        }
        
        
        txtNomCurso.setText(nomCurso);
        txtCodCurso.setText(codCurso);
        txtCostoCurso.setText(costoCurso);
        txtDocenteCurso.setText(nomProfe);
        //txtFechaReserva.setText(fechaReserva);
        
        
    }
    private String descomponerLineaNombres(String linea,int inicio,int fin){
        String cad="";
        for (int i = inicio; i < fin; i++) {
            char c = linea.charAt (i);
            cad += Character.toString(c);
        }
        return cad;
    }
    

    
    
}
