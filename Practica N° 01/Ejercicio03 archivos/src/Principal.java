import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    
    JButton miboton;
    JButton miboton2;
    JButton miboton3;
    
    public Principal(){
      setLayout(null);
      miboton=new JButton("Registrar Producto");
      miboton.setBounds(40,50,180,50);
      add(miboton);
      miboton.addActionListener(this);
      
      miboton2=new JButton("Hacer Pedido");
      miboton2.setBounds(40,110,180,50);
      add(miboton2);
      miboton2.addActionListener(this);
      
      miboton3=new JButton("Salir");
      miboton3.setBounds(40,170,180,50);
      add(miboton3);
      miboton3.addActionListener(this);
    }
    
    
    //VARIABLES
    int codigo;
    String descripcion;
    int stock;
    Fecha fecha;
    
    Producto producto;
    Producto productos[]=new Producto[10];
    int indice=-1;
    
    
    int opc = 0;
    int cod;
    int cantidad;
    int i;
    boolean marca;
    
    int dia;
    int mes;
    int anno;
    
    
    //Buscar producto en el array
    public Producto buscarP (int codigo){
             Producto auxProducto=null;
             boolean noEncontrado=true;
             int i=0;
             if(indice!=-1){
                 i=0;
                 while(i<=indice && noEncontrado){
                     if(productos[i].getCodigo()==(codigo)){
                         auxProducto =productos[i];
                         noEncontrado=false;
                     }
                     i++;
                 }
             }
             return auxProducto;
         }
    
    public void guardarProducto(Producto producto){
         indice=indice+1;
         productos[indice]=producto;
     }
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==miboton){
           codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código: "));
           descripcion=JOptionPane.showInputDialog("Ingrese la descripción del producto :");
           stock=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
           dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
           mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
           anno=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
           fecha=new Fecha(dia, mes, anno);
           producto=new Producto(codigo, descripcion, stock, fecha);
           guardarProducto(producto);
        }
        if(e.getSource()==miboton2){
            cod=1;
            while(cod !=0){
                cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código: "));
                producto=buscarP(cod);
                if(producto!=null){
                    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea: "));
                    if(productos[i].getStock()<cantidad){
                        JOptionPane.showMessageDialog(null,"NO HAY CANTIDAD SUFICIENTE");
                    }
                    else{
                        producto.removerProducto(cantidad);
                        JOptionPane.showMessageDialog(null,"PEDIDO SUMINISTRADO");
                        JOptionPane.showMessageDialog(null,"QUEDAN EN STOCK  "+producto.getStock() +"  UNIDADES");
                    }           
                }
                else{
                    JOptionPane.showMessageDialog(null,"EL PRODUCTO NO EXISTE");           
                }
                if(cod==0){
                
                    JOptionPane.showMessageDialog(null,"PROCESO TERMINADO");           
                }
            }  
        }
        if(e.getSource()==miboton3){
           System.exit(0); 
        }
    }

    public static void main(String[] args) {
        Principal mf=new Principal();
        mf.setBounds(20, 30, 270, 340); // x,y,ancho,alto
        mf.setTitle("Programa número 3");
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
