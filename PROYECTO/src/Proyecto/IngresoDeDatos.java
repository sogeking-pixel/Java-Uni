
package Proyecto;
import archivos.ArchivoPlato;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ALVAREZ LOYOLA BRUNO
 */
public class IngresoDeDatos extends JFrame implements ActionListener
{
    private String ruta;
    private ArchivoPlato plato;
    
   /* public static void main(String[] args) {
        IngresoDeDatos visible= new IngresoDeDatos("");
        visible.setVisible(true);
        
    }
    */
    JLabel codigo,nombre,precio,inversion,calorias,fecha, imagenFondo, imagenL;
        JTextField Fcodigo, Fnombre, Fprecio,Finversion,Fcalorias,Ffecha, FBuscar, cajaTexto2;
        JButton btnRegistar, btnModificar, btnRaciones, btnEliminar,btnEliminarT, btnBuscar, btnEscoba; 
        JTextArea mostrarTodo;
    
    public IngresoDeDatos(String ruta)
    {
        setTitle("VENTANA INGRESO DE PLATOS");
        setSize(600,450);
        setLocationRelativeTo(null);
        setResizable(false);
        
        //IngresarPlatos muestrate7 = new IngresarPlatos();
        //add(muestrate7);
        IngresarPlatos();
        this.ruta = ruta;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void IngresarPlatos()
        {
         setLayout(null);
         codigo = new JLabel("CODIGO: ");
         codigo.setBounds(35,35,70,25);
         codigo.setForeground(Color.white);
         codigo.setFont(new Font("american captain",1,22));
         add(codigo);
         
        Fcodigo = new JTextField();
        Fcodigo.setBounds(120,35,120,20);
        add(Fcodigo);
        
        nombre = new JLabel("Nombre: ");
        nombre.setBounds(35,65,80,25);
        nombre.setForeground(Color.white);
        nombre.setFont(new Font("american captain",0,22));
        add(nombre);
         
        Fnombre = new JTextField();
        Fnombre.setBounds(120,65,120,20);
        add(Fnombre);
         
        precio = new JLabel("PRECIO: ");
        precio.setBounds(35,95,80,25);
        precio.setForeground(Color.white);
        precio.setFont(new Font("american captain",0,22));
        add(precio);
         
        Fprecio = new JTextField();
        Fprecio.setBounds(120,95,120,20);
        add(Fprecio);
        
         inversion = new JLabel("INVERSION: ");
         inversion.setBounds(35,125,85,25);
         inversion.setForeground(Color.white);
         inversion.setFont(new Font("american captain",0,22));
         add(inversion);
         
        Finversion = new JTextField();
        Finversion.setBounds(120,125,120,20);
        add(Finversion);
         
         calorias = new JLabel("CALORIAS: ");
         calorias.setBounds(35,155,85,25);
         calorias.setForeground(Color.white);
         calorias.setFont(new Font("american captain",0,22));
         add(calorias);
         
        Fcalorias = new JTextField();
        Fcalorias.setBounds(120,155,120,20);
        add(Fcalorias);
         
         fecha = new JLabel("FECHA: ");
         fecha.setBounds(35,185,85,25);
         fecha.setForeground(Color.white);
         fecha.setFont(new Font("american captain",0,22));
         //add(fecha);
         
        Ffecha = new JTextField();
        Ffecha.setBounds(120,185,120,20);
        //add(Ffecha);

        imagenL = new JLabel();
        ImageIcon logoF = new ImageIcon("ayquerico3.png");
        imagenL.setBounds(295,45,240,130);
        imagenL.setIcon(new ImageIcon(logoF.getImage().getScaledInstance(240,130,Image.SCALE_SMOOTH)));
        add(imagenL);
        
        btnRegistar = new JButton("REGISTRAR");
        btnRegistar.setFont(new Font("american captain",0,18));
        btnRegistar.setBackground(Color.red);
        btnRegistar.setForeground(Color.white);
        btnRegistar.setBounds(20,220,98,25);
        add(btnRegistar);
        
        btnRaciones = new JButton("RACIONES");
        btnRaciones.setFont(new Font("american captain",0,18));
        btnRaciones.setBackground(Color.red);
        btnRaciones.setForeground(Color.white);
        btnRaciones.setBounds(230,220,98,25);
        add(btnRaciones);
        
        btnModificar = new JButton("MODIFICAR");
        btnModificar.setFont(new Font("american captain",0,18));
        btnModificar.setBackground(Color.red);
        btnModificar.setForeground(Color.white);
        btnModificar.setBounds(125,220,98,25);
        add(btnModificar);
        
        btnEliminar = new JButton("ELIMINAR");
        btnEliminar.setFont(new Font("american captain",0,18));
        btnEliminar.setBackground(Color.red);
        btnEliminar.setForeground(Color.white);
        btnEliminar.setBounds(335,220,98,25);
        add(btnEliminar);
        
        btnEliminarT = new JButton("ELIMINAR TODO");
        btnEliminarT.setFont(new Font("american captain",0,18));
        btnEliminarT.setBackground(Color.red);
        btnEliminarT.setForeground(Color.white);
        btnEliminarT.setBounds(460,385,120,25);
        add(btnEliminarT);
        
        cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(445,223,60,20);
        add(cajaTexto2);
        
        btnBuscar= new JButton();
        btnBuscar.setBounds(520,220,35,40);
        ImageIcon buscador = new ImageIcon("buscador.jpg");
        btnBuscar.setIcon(new ImageIcon(buscador.getImage().getScaledInstance(35,40,Image.SCALE_SMOOTH)));
        btnBuscar.setBackground(Color.white);
        add(btnBuscar);
        
        btnEscoba= new JButton();
        btnEscoba.setBounds(520,170,35,40);
        ImageIcon buscar = new ImageIcon("limpiar.png");
        btnEscoba.setIcon(new ImageIcon(buscar.getImage().getScaledInstance(35,40,Image.SCALE_SMOOTH)));
        btnEscoba.setBackground(Color.white);
        add(btnEscoba);
        
        mostrarTodo = new JTextArea();
        mostrarTodo.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        mostrarTodo.setBounds(20,250,450,130);
        add(mostrarTodo);
        
        imagenFondo = new JLabel();
        ImageIcon imagenF = new ImageIcon("restaurant4.jpg");
        imagenFondo.setBounds(0,0,600,450);
        imagenFondo.setIcon(new ImageIcon(imagenF.getImage().getScaledInstance(600,450,Image.SCALE_SMOOTH)));
        add(imagenFondo);
        
        btnRegistar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnEscoba.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource() == btnEscoba){
            limpiarCajas();
        }
        
        if(ae.getSource() == btnBuscar){
            System.out.println("buscarrrr");
            plato = new ArchivoPlato();
            
            
            String codBuscar = cajaTexto2.getText();
            //System.out.println("buscarr");
            String linea;
            
            String codigo;
            String nombre;
            String precio;
            String inversion;
            String calorias;
            if(!codBuscar.equals("")){
                
                linea = plato.buscarPorCodigo(codBuscar, ruta);
                
                codigo = descomponerLinea(linea, 0,10);
                nombre = descomponerLinea(linea, 10, 40);
                precio = descomponerLinea(linea, 40, 50);
                inversion = descomponerLinea(linea, 50, 60);
                calorias = descomponerLinea(linea, 60, 70);
                
                Fcodigo.setText(codigo);
                Fnombre.setText(nombre);
                Fprecio.setText(precio);
                Finversion.setText(inversion);
                Fcalorias.setText(calorias);
          
                mostrarTodo.setText("codigo: "+codigo+"\nnombre: "+nombre+"\nprecio: "+precio+"\ninvecion: "+inversion+"\ncalorias: "+calorias+"\n");
                
            }
                    
        }
        
        if(ae.getSource() == btnRegistar){
            plato = new ArchivoPlato();
            
            String cod = Fcodigo.getText();
            String nombre = Fnombre.getText();
            String precio = Fprecio.getText();
            String inversion = Finversion.getText();
            String calorias = Fcalorias.getText();
            
            
            
            plato.guardarEnArchivo(cod, nombre, precio, inversion, calorias, ruta);
            limpiarCajas();
            JOptionPane.showMessageDialog(this, "SE REGISTRO CORRECTAMENTE");
        }
        
    }
    private String descomponerLinea(String linea,int inicio,int fin){
        String cad="";
        for (int i = inicio; i < fin; i++) {
            char c = linea.charAt (i);
            cad += Character.toString(c);
        }
        //return cad.replace(" ","");//sirve para borrar los espacios en blanco
        return cad;//sirve para borrar los espacios en blanco
    }
    private void limpiarCajas(){
            Fcodigo.setText("");
            Fnombre.setText("");
            Fprecio.setText("");
            Finversion.setText("");
            Fcalorias.setText("");
            mostrarTodo.setText("");
        }
    
}
