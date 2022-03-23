
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ALVAREZ LOYOLA BRUNO
 */


public class VentanaClienteFinal extends JFrame
{
 
    
    public VentanaClienteFinal()
    {
        setTitle("CONFIRMAR PEDIDO");
        setSize(400,300);
        setResizable(false);
        setLocationRelativeTo(null);
        VentanaFinal colocar = new VentanaFinal();
        add(colocar);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
      
    
    class VentanaFinal extends JPanel implements ActionListener
    {
     
     JLabel namePlato, namePostre, imagen5, pagar;
     JTextArea Tplato,Tpostre,Tpagar;
     JButton cancelarPedidoF, confirmarPedidoF;
     
     public VentanaFinal()
      {
          
        setLayout(null);
        
        namePlato = new JLabel();
        namePlato.setText("NOMBRE DE PLATO:");
        namePlato.setFont(new Font("american captain", 0, 25));
        namePlato.setBounds(40,75,150,25);
        namePlato.setForeground(Color.ORANGE);
        add(namePlato);
          
        
        Tplato = new JTextArea();
        Tplato.setBounds(210,70,150,20);
        add(Tplato);
        
        namePostre = new JLabel();
        namePostre.setText("NOMBRE DE POSTRE:");
        namePostre.setFont(new Font("american captain", 0, 25));
        namePostre.setBounds(40,115,160,25);
        namePostre.setForeground(Color.RED);
        add(namePostre);
        
        Tpostre = new JTextArea();
        Tpostre.setBounds(210,112,150,20);
        add(Tpostre);
        
        confirmarPedidoF = new JButton("CONFIRMAR PEDIDO");
        confirmarPedidoF.setFont(new Font("american captain",0,20));
        confirmarPedidoF.setBackground(Color.RED);
        confirmarPedidoF.setForeground(Color.white);
        confirmarPedidoF.setBounds(25,220,160,40);
        add(confirmarPedidoF);
        
        cancelarPedidoF = new JButton("CANCELAR PEDIDO");
        cancelarPedidoF.setFont(new Font("american captain",0,20));
        cancelarPedidoF.setBackground(Color.ORANGE);
        cancelarPedidoF.setForeground(Color.white);
        cancelarPedidoF.setBounds(200,220,160,40);
        add(cancelarPedidoF);
        
        pagar = new JLabel();
        pagar.setText("TOTAL A PAGAR: ");
        pagar.setFont(new Font("american captain", 0, 25));
        pagar.setBounds(70,157,160,25);
        pagar.setForeground(Color.ORANGE);
        add(pagar);
        
        Tpagar = new JTextArea("S/. ");
        Tpagar.setBounds(210,155,100,20);
        add(Tpagar);
        
        imagen5 = new JLabel();
        ImageIcon fondo5 = new ImageIcon("clientefondo3.png");
        imagen5.setBounds(53,10,300,250);
        imagen5.setIcon(new ImageIcon(fondo5.getImage().getScaledInstance(300,250,Image.SCALE_SMOOTH)));
        add(imagen5);
       
        confirmarPedidoF.addActionListener(this);
      }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==confirmarPedidoF)
            {
                JOptionPane.showMessageDialog(null,
            "                        ¡Gracias por su preferencia!"
                    + "\nEn breves momentos degustara de nuestra exquisita sazón.");
            }
        }
     
    }
}
