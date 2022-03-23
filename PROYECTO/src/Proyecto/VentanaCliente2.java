
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author ALVAREZ LOYOLA BRUNO
 */

public class VentanaCliente2 extends JFrame
{
    public VentanaCliente2()
    {
        setTitle("VENTANA PEDIDOS");
        setSize(600,650);
        setLocationRelativeTo(null);
        setResizable(false);
        DatosPedido muestrate3 = new DatosPedido();
        add(muestrate3);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}

class DatosPedido extends JPanel implements ActionListener
{
    JLabel logoAy, imagen5, ingresaPedido, paolo,benavente, peredo, peru;
    JButton mostrarRecomPlatos, mostrarTPlatos;
    JButton mostrarRecomPostres,mostrarTPostres;
    JButton cancelarP, confirmar, atras2, aceptar3;
    JTextField cajaCodigo;
    JTextArea muestrame;
    
    public DatosPedido()
    {
        setLayout(null);
        
        mostrarRecomPlatos = new JButton("<html><center> MOSTRAR PLATOS RECOMENDADOS <html>");
        mostrarRecomPlatos.setFont(new Font("american captain",0,20));
        mostrarRecomPlatos.setBackground(Color.red);
        mostrarRecomPlatos.setForeground(Color.white);
        mostrarRecomPlatos.setBounds(35,180,130,70);
        add(mostrarRecomPlatos);
        
        mostrarTPlatos = new JButton("<html><center> MOSTRAR TODOS LOS PLATOS <html>");
        mostrarTPlatos.setFont(new Font("american captain",0,20));
        mostrarTPlatos.setBackground(Color.red);
        mostrarTPlatos.setForeground(Color.white);
        mostrarTPlatos.setBounds(175,180,110,70);
        add(mostrarTPlatos);
        
        mostrarRecomPostres = new JButton("<html><center> MOSTRAR POSTRES RECOMENDADOS <html>");
        mostrarRecomPostres.setFont(new Font("american captain",0,20));
        mostrarRecomPostres.setBackground(Color.red);
        mostrarRecomPostres.setForeground(Color.white);
        mostrarRecomPostres.setBounds(300,180,130,70);
        add(mostrarRecomPostres);
        
        mostrarTPostres = new JButton("<html><center> MOSTRAR TODOS LOS POSTRES<html>");
        mostrarTPostres.setFont(new Font("american captain",0,20));
        mostrarTPostres.setBackground(Color.red);
        mostrarTPostres.setForeground(Color.white);
        mostrarTPostres.setBounds(445,180,110,70);
        add(mostrarTPostres);
        
        cancelarP = new JButton("CANCELAR PEDIDO");
        cancelarP.setFont(new Font("american captain",0,20));
        cancelarP.setBackground(Color.red);
        cancelarP.setForeground(Color.white);
        cancelarP.setBounds(135,550,160,40);
        add(cancelarP);
        
        confirmar = new JButton("CONFIRMAR PEDIDO");
        confirmar.setFont(new Font("american captain",0,20));
        confirmar.setBackground(Color.red);
        confirmar.setForeground(Color.white);
        confirmar.setBounds(135,500,160,40);
        add(confirmar);
        
        atras2 = new JButton("ATRÁS");
        atras2.setFont(new Font("american captain",0,25));
        atras2.setBackground(Color.red);
        atras2.setForeground(Color.white);
        atras2.setBounds(310,525,100,40);
        add(atras2);
        
        ingresaPedido = new JLabel();
        ingresaPedido.setText("INGRESA TU PEDIDO POR CODIGO:");
        ingresaPedido.setFont(new Font("american captain", 0, 26));
        ingresaPedido.setBounds(50,290,255,25); 
        ingresaPedido.setForeground(Color.red);
        add(ingresaPedido);
        
        
        cajaCodigo = new JTextField();
        cajaCodigo.setBounds(310,287,60,25);
        add(cajaCodigo);
        
        aceptar3 = new JButton("ACEPTAR");
        aceptar3.setFont(new Font("american captain",0,22));
        aceptar3.setBackground(Color.red);
        aceptar3.setForeground(Color.white);
        aceptar3.setBounds(385,285,110,30);
        add(aceptar3);
        
        muestrame = new JTextArea();
        muestrame.setBounds(85,330,420,150);
        add(muestrame);
        
        logoAy = new JLabel();
        ImageIcon logo4 = new ImageIcon("ayquerico3.png");
        logoAy.setBounds(190,30,220,120);
        logoAy.setIcon(new ImageIcon(logo4.getImage().getScaledInstance(220,120,Image.SCALE_SMOOTH)));
        add(logoAy);
        
        paolo = new JLabel();
        ImageIcon jugador1 = new ImageIcon("pg9.png");
        paolo.setBounds(15,20,220,140);
        paolo.setIcon(new ImageIcon(jugador1.getImage().getScaledInstance(220,140,Image.SCALE_SMOOTH)));
        add(paolo);
        
        benavente = new JLabel();
        ImageIcon jugador2 = new ImageIcon("benavente.png");
        benavente.setBounds(380,25,240,140);
        benavente.setIcon(new ImageIcon(jugador2.getImage().getScaledInstance(240,140,Image.SCALE_SMOOTH)));
        add(benavente);
        
        peredo = new JLabel();
        ImageIcon jugador3 = new ImageIcon("peredo.png");
        peredo.setBounds(35,490,115,123);
        peredo.setIcon(new ImageIcon(jugador3.getImage().getScaledInstance(115,123,Image.SCALE_SMOOTH)));
        add(peredo);
        
        
        peru = new JLabel();
        ImageIcon bandera = new ImageIcon("peru.png");
        peru.setBounds(430,510,130,80);
        peru.setIcon(new ImageIcon(bandera.getImage().getScaledInstance(130,80,Image.SCALE_SMOOTH)));
        add(peru);
        
        
        
        imagen5 = new JLabel();
        ImageIcon fondo5 = new ImageIcon("restaurant7.png");
        imagen5.setBounds(0,0,600,650);
        imagen5.setIcon(new ImageIcon(fondo5.getImage().getScaledInstance(600,650,Image.SCALE_SMOOTH)));
        add(imagen5);
        
        ///******** FIN ETIQUETAS **********//
        
        //********* ACTION LISTENER *******//
        
        confirmar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==confirmar)
       {
        VentanaClienteFinal muestrame4 = new VentanaClienteFinal();
        muestrame4.setVisible(true);
       }
    }
    
}