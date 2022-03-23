
package Proyecto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author ALVAREZ LOYOLA BRUNO
 */
public class VentanaADM extends JFrame 
{
  
    public VentanaADM()
    {
        setTitle("LOGIN");
        setSize(350,250);
        setLocationRelativeTo(null);
        setResizable(false);
        Login componentes2 = new Login();
        add(componentes2);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        
    }      
}
class Login extends JPanel implements ActionListener
 {
     JLabel enter, usuario, contraseña, imagen3;
     JButton aceptar;
     JTextField cajaUsuario;
     JPasswordField cajaContraseña;
             
     public Login()
     {
         setLayout(null);
         //setBackground(Color.orange);
         
         cajaUsuario = new JTextField();
         cajaUsuario.setBounds(135,88,100,20);
         add(cajaUsuario);
         
         cajaContraseña = new JPasswordField();
         cajaContraseña.setBounds(135,125,100,20);
         add(cajaContraseña);
         
         aceptar = new JButton();
         aceptar.setText("ACEPTAR");
         aceptar.setFont(new Font("arial black",0,12));
         aceptar.setForeground(Color.white);
         aceptar.setBackground(Color.blue);
         aceptar.setBounds(225,180,100,25);
         
         add(aceptar);
         
         enter = new JLabel();
         enter.setText("INGRESA COMO ADMINISTRADOR");
         enter.setBounds(40, 30, 280, 15);
         enter.setFont(new Font("arial black",0,14));
         enter.setForeground(Color.red);
         add(enter);
         
         usuario = new JLabel();
         usuario.setText("USUARIO: ");
         usuario.setBounds(30, 90, 90,15);
         usuario.setFont(new Font("ARIAL BLACK",0,12));
         usuario.setForeground(Color.RED);
         add(usuario);
         
         contraseña = new JLabel();
         contraseña.setText("CONTRASEÑA: ");
         contraseña.setForeground(Color.red);
         contraseña.setBounds(30, 130, 110,15);
         contraseña.setFont(new Font("ARIAL BLACK",0,12));
         add(contraseña);
         
         imagen3 = new JLabel();
         ImageIcon fondo2 = new ImageIcon("login4.png");
         imagen3.setBounds(80,10,200,200);
         imagen3.setIcon(new ImageIcon(fondo2.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
         add(imagen3);
         
         
         
         aceptar.addActionListener(this);
         
     }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        
        String user = "";
        String pass = "";
        
        user = cajaUsuario.getText();
        pass = cajaContraseña.getText();
        
        if(e.getSource() == aceptar)
        {  
       /*if(user.equals("GastonAcurio") && pass.equals("1234"))
       {
         Seleccion muestrate3 = new Seleccion();
         muestrate3.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Datos incorrectos");
       }*/
            Seleccion muestrate3 = new Seleccion();
            muestrate3.setVisible(true);
    }
 }
}