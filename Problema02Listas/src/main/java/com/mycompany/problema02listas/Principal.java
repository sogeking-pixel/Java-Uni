package com.mycompany.problema02listas;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal extends  JFrame implements ActionListener 
{
    arrayDeCuentas registro=null; 
    InterfazAgregar agregar=null;
    EliminarCuenta eliminar=null;
    JButton btAgregar;
    JButton btEliminar;
    JLabel texLabelDatos;
    
    JTextArea txtBox; //caja de texto de salida 
    JScrollPane scroll; //barrita

    public arrayDeCuentas getRegistro() {
        return registro;
    }

    public void setRegistro(arrayDeCuentas registro) {
        this.registro = registro;
    }
    
    
    
    
    public Principal()
    {
        setLayout(null);
        btAgregar = new JButton("Agregar Dispositivo");
        btAgregar.setBounds(60,70,180,25);
        btEliminar = new JButton("Eliminar Dispositivo");
        btEliminar.setBounds(60,140,180,25);
        texLabelDatos=new JLabel("Datos de archivo binario");
        texLabelDatos.setBounds(300,10,180,25);         
                
        txtBox = new JTextArea();
        scroll = new JScrollPane(txtBox);
        scroll.setBounds(270,50,250,250);
        add(texLabelDatos);
        add(btAgregar);
        add(btEliminar);
        
        add(scroll);
        
        btAgregar.addActionListener(this);
        btEliminar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== btAgregar){
         
            if (agregar==null)
            {
                agregar=new InterfazAgregar(this);
                agregar.setBounds(850, 400, 550, 350);//x,y,ancho,alto
                agregar.setTitle("Alumno");
            }
            if (registro!=null)
            {
                agregar.recibirArray(this.registro);
            }
            this.setVisible(false);
            agregar.setVisible(true);
        }
        if (e.getSource()==btEliminar)
        {
            if (eliminar==null)
            {
                eliminar=new EliminarCuenta(this,registro);
                eliminar.setBounds(850, 400, 500, 250);//x,y,ancho,alto
                eliminar.setTitle("Eliminar");
            }
            this.setVisible(false);
            eliminar.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Principal pricipal = new Principal();
        pricipal.setBounds(700,300,600,350);
        pricipal.setTitle("Cs");
        pricipal.setVisible(true);
        pricipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
}


class arrayDeCuentas
{
    private ArrayList <arrayDeCuenta> Cuentas=new ArrayList <arrayDeCuenta>();
    private int contadorDeCeuntas=0;

    public ArrayList<arrayDeCuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<arrayDeCuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

    public int getContadorDeCeuntas() {
        return contadorDeCeuntas;
    }

    public void setContadorDeCeuntas(int contadorDeCeuntas) {
        this.contadorDeCeuntas = contadorDeCeuntas;
    }
    
    public void agregarCuenta(String nombreDeSucursal,String infoCuenta, String numeroCuenta, float saldo)
    {
        Cuenta aux=new Cuenta();
        int auxContador=0;
        String auxString=null;
        arrayDeCuenta auxPrototipo=null;
        Cuenta auxCuenta=null;
        boolean banderaSalida=false;
        
        aux.setNombreDeSucursal(nombreDeSucursal);
        aux.setInfoCuenta(infoCuenta);
        aux.setNumeroCuenta(numeroCuenta);
        aux.setSaldo(saldo);
        while (this.contadorDeCeuntas>auxContador)          
        {
            if (this.Cuentas.get(auxContador)!=null)
            {
                auxPrototipo=this.Cuentas.get(auxContador);
                auxCuenta=auxPrototipo.getCuentas().get(0);
                auxString=auxCuenta.getNombreDeSucursal();
                if (auxString.equals(nombreDeSucursal))
                {
                    auxPrototipo.setContadorDeDimenciones(auxPrototipo.getContadorDeDimenciones()+1);
                    this.Cuentas.get(auxContador).agregarCuenta(aux);
                    banderaSalida=true;
                }
            }
           
           auxContador=auxContador+1;
        }
        if (banderaSalida==false)///Creacion de nueva Sucursal
        {
            this.contadorDeCeuntas=this.contadorDeCeuntas+1;
            auxPrototipo=new arrayDeCuenta();
            auxPrototipo.agregarCuenta(aux);
            this.Cuentas.add(auxPrototipo);
            JOptionPane.showMessageDialog(null,"se a registado Correctamente la nueva Sucursal:"+aux.getNombreDeSucursal(),"Registro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public Cuenta eliminarSucursal(String nombreDeSucursal)
    {
        Cuenta aux=new Cuenta();
        int auxContador=0;
        String auxString=null;
        arrayDeCuenta auxPrototipo=null;
        Cuenta auxCuenta=null;
        
        aux.setNombreDeSucursal(nombreDeSucursal);
        
        while (this.contadorDeCeuntas>auxContador)          
        {
            if (this.Cuentas.get(auxContador)!=null)
            {
                auxPrototipo=this.Cuentas.get(auxContador);
                auxCuenta=auxPrototipo.getCuentas().get(0);
                auxString=auxCuenta.getNombreDeSucursal();
                if (auxString.equals(nombreDeSucursal))
                {
                    this.Cuentas.get(auxContador).agregarCuenta(null);
                }
            }
           
           auxContador=auxContador+1;
        }
        return auxCuenta;
    }
     public void eliminarCuenta(String nombreDeSucursal, String numeroCuenta)
    {
        Cuenta aux=new Cuenta();
        int auxContador=0;
        String auxString=null;
        arrayDeCuenta auxPrototipo=null;
        Cuenta auxCuenta=null;
        int auxContadorCuenta=0;
        
        aux.setNombreDeSucursal(nombreDeSucursal);
        
        while (this.contadorDeCeuntas>auxContador)          
        {
            if (this.Cuentas.get(auxContador)!=null)
            {
                auxPrototipo=this.Cuentas.get(auxContador);
                auxCuenta=auxPrototipo.getCuentas().get(0);
                auxString=auxCuenta.getNombreDeSucursal();
                if (auxString.equals(nombreDeSucursal))
                {
                    while (this.contadorDeCeuntas>auxContadorCuenta)
                    {
                        
                        if (auxPrototipo.buscarCuenta(numeroCuenta)!=null)
                        {
                            auxCuenta.setNumeroCuenta(null);
                        }else
                        {
                            JOptionPane.showMessageDialog(null,"No se ha encontrado el numero de cuenta: "+numeroCuenta,"Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
           
           auxContador=auxContador+1;
        }
    }
    
}




class arrayDeCuenta
{
    private ArrayList <Cuenta> Cuenta=new ArrayList <Cuenta>();
    private int contadorDeDimenciones=0;

    public ArrayList<Cuenta> getCuentas() {
        return Cuenta;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuenta = Cuentas;
    }

    public int getContadorDeDimenciones() {
        return contadorDeDimenciones;
    }

    public void setContadorDeDimenciones(int contadorDeDimenciones) {
        this.contadorDeDimenciones = contadorDeDimenciones;
    }
    
    public void agregarCuenta(Cuenta dato)
    {
        Cuenta aux=dato;
        int auxContador=0;

        while (this.contadorDeDimenciones>=auxContador)          
        {
           if(this.Cuenta.get(auxContador).getNombreDeSucursal()==null)
           {
               this.Cuenta.add(aux);
               this.contadorDeDimenciones=this.contadorDeDimenciones+1;
           }
           auxContador=auxContador+1;
        }
    }
    public Cuenta buscarCuenta(String numeroCuenta)
    {
        Cuenta aux=new Cuenta();
        int auxContador=0;
        String auxString=null;
        Cuenta auxCuenta=null;
        boolean bandera=false;
        
        aux.setNombreDeSucursal(numeroCuenta);
        
        while (this.contadorDeDimenciones>auxContador)          
        {
            if (this.Cuenta.get(auxContador)!=null)
            {
                auxString=this.Cuenta.get(auxContador).getNumeroCuenta();
                if (auxString.equals(numeroCuenta))
                {
                    auxCuenta.setNumeroCuenta(null);
                    bandera=true;
                }
                
            }
           auxContador=auxContador+1;
        }
        
        return auxCuenta;
    }
}


class Cuenta
{
   private String nombreDeSucursal=null;
   private String infoCuenta=null;
   private String numeroCuenta=null;
   private float saldo=0;

    public String getNombreDeSucursal() {
        return nombreDeSucursal;
    }

    public void setNombreDeSucursal(String nombreDeSucursal) {
        this.nombreDeSucursal = nombreDeSucursal;
    }

    public String getInfoCuenta() {
        return infoCuenta;
    }

    public void setInfoCuenta(String infoCuenta) {
        this.infoCuenta = infoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}