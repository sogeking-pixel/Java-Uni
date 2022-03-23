
package Default;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Almacen extends JFrame implements ActionListener{
    Product[] listProduct = new Product[100];
    Order[] listOrder = new Order[100];    
    Product product = null;
    Order order = null;
    int iteratorLP, iteratorLO;
    
    JButton btAddProduct; //agregar Productos
    JButton btRemoveProduct; //remover productos
    JButton btGenerateOrder; //genera el pedido de los objetos que están pordebajo del límite.
    JButton btAddNewProduct;
    
    JTextArea txtBox;   
    JScrollPane scroll;
    
    public Almacen(){
        setLayout(null);
        
        btAddNewProduct = new JButton("Agregar Nuevo Producto");
        btAddNewProduct.setBounds(130,50,150,25);
        btAddProduct = new JButton("Agregar Producto");
        btAddProduct.setBounds(130,90,150,25);
        btRemoveProduct =new JButton("Remover Producto");
        btRemoveProduct.setBounds(130,130,150,25);
        btGenerateOrder = new JButton("Generar Pedido");
        btGenerateOrder.setBounds(130,170,150,25);
        
        txtBox = new JTextArea();
        
        scroll = new JScrollPane(txtBox);
        scroll.setBounds(320,50,150,150);
        
        add(btAddNewProduct);
        add(btAddProduct);
        add(btRemoveProduct);
        add(btGenerateOrder);
        add(scroll);
        btAddNewProduct.addActionListener(this);
        btAddProduct.addActionListener(this);
        btRemoveProduct.addActionListener(this);
        btGenerateOrder.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getSource() == btAddNewProduct){
           iteratorLP = getIteratorLP();
           int code = Integer.parseInt(JOptionPane.showInputDialog("Código del nuevo producto:"));
           String description = JOptionPane.showInputDialog("Agrege uan descripción:");
           int stock = Integer.parseInt(JOptionPane.showInputDialog("Agrege el stock:"));
           int minStock = Integer.parseInt(JOptionPane.showInputDialog("Minimo de Stock"));
           product = new Product(code, description, stock, minStock);
           listProduct[iteratorLP]= product;
       }else{
            if(e.getSource() == btAddProduct){
                if(listProduct[0] == null){
                    JOptionPane.showMessageDialog(null,"La lista se encuentra vacia","Advertencia!",JOptionPane.WARNING_MESSAGE);
                }else{
                    int codeB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto: "));
                    int i=0, enc=0;
                    while(enc==0 && listProduct[i]!= null)
                    {
                        if(listProduct[i].compareCodes(codeB)==true)
                        {
                          int cantAdd = Integer.parseInt(JOptionPane.showInputDialog(listProduct[i].toString()));
                          if(cantAdd > 0){
                              listProduct[i].addStock(cantAdd);
                              JOptionPane.showMessageDialog(null,listProduct[i].toString(),"La Operacón fue un éxito",JOptionPane.INFORMATION_MESSAGE);
                          }
                          enc=1;
                        }
                        i++;
                    }
                    
                      
                        
                    if(listProduct[i] == null&& (enc==0)){
                        
                        JOptionPane.showMessageDialog(null,"No se encontro "+codeB+" en la Lista de Productos.","Error",JOptionPane.ERROR_MESSAGE);
                          
                    }
                }
            }else{
                if(e.getSource() == btRemoveProduct){
                    if(listProduct[0] == null){
                    JOptionPane.showMessageDialog(null,"La lista se encuentra vacia","Advertencia!",JOptionPane.WARNING_MESSAGE);
                    }else{
                        int codeB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto que removera: "));
                        int i=0,enc=0;
                        while(enc==0 && listProduct[i]!= null)
                        {
                            if(listProduct[i].compareCodes(codeB) == true){
                                int cantRem = Integer.parseInt(JOptionPane.showInputDialog(listProduct[i].toString()));
                                if((cantRem > 0) && (cantRem<=listProduct[i].getStock())){
                                  listProduct[i].removeStock(cantRem);
                                  JOptionPane.showMessageDialog(null,listProduct[i].toString(),"La Operacón fue un éxito",JOptionPane.INFORMATION_MESSAGE);
                              }
                                enc=1;
                            }
                            i++;
                        }
                        
                        if((listProduct[i]==null) && (enc==0)){    
                            JOptionPane.showMessageDialog(null,"No se encontro "+codeB+" en la Lista de Productos.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }else{
                    
                    if(e.getSource() == btGenerateOrder){
                        int i=0,j=0;
                        
                        while(i<100 && listProduct[i]!=null){
                            if(listProduct[i].getStock() < listProduct[i].getMinStock()){
                                Order pedido = new Order(listProduct[i].getCode(), listProduct[i].getMinStock());
                                listOrder[j]=pedido;
                                txtBox.append(listOrder[j].toString()+"\n\n");
                                j++;
                            }
                            i++;
                        }
                    }
                    
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        almacen.setBounds(700,300,600,350);
        almacen.setTitle("Almacen");
        almacen.setVisible(true);
        almacen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private int getIteratorLP(){
        if(listProduct[0]!= null){
            int i=0;
            while((listProduct[i]!=null)&&(i!= 100)){
                i++;
            }
            return i;
        }
        return 0;
    }
}
