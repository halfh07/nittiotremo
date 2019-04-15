package nittiotremo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita_Login extends JFrame implements ActionListener
{
    //estas variables son de prueba mientras se vincula con base de datos
    //aunque hubiera sido mejor manejarlo por objetos
    
    String admin,usuario,mantenimiento, pass;
    
    private JLabel txtusuario;
    private JLabel txtpass;
     
    private JTextField cajausuario;
    private JTextField cajapass;
    
    private JButton entrar;
    private JButton cancelar;

        public Ventanita_Login()
        {

            configurarVentanita();    
            inicializarcomponentes();
        }
                private void configurarVentanita()
                    {
                        this.setTitle ("Login Control Papeleria");
                        this.setSize(350,250);
                        this.setLocationRelativeTo(null);
                        this.setLayout(null);
                        this.setResizable(false);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
    
                private void inicializarcomponentes()
                    {
                    txtusuario= new JLabel();
                    txtpass=new JLabel();

                    cajausuario=new JTextField();
                    cajapass=new JTextField();

                    entrar =new JButton();
                    
                    txtusuario.setText("usuario");
                    txtusuario.setBounds(55,50,100,25);
                    cajausuario.setBounds(155,50,100,25);

                    txtpass.setText("contraseña");
                    txtpass.setBounds(55, 100, 100, 25);
                    cajapass.setBounds(155,100,100,25);
                    
                    entrar.setText("aceptar");
                    entrar.setBounds(55, 150, 200,25);
                    entrar.addActionListener(this);
   
                    this.add(cajausuario);
                    this.add(txtusuario);
                    this.add(txtpass);
                    this.add(cajapass);
                    this.add(entrar);
                    }

    @Override
    public void actionPerformed(ActionEvent eventito) {
        
        
        //ejemplo de la accion 
        //tiene error y no manda el mensaje de que esta bien
        //para el admin debe crear la ventana de control general que esta abre punto de venta, alta/baja usuarios y alta/baja articulos
        //para el usuario normalsolo abre punto de venta 
        //para mantenimiento solo crea alta/baja/mod de usuarios
        if (eventito.getSource() == entrar)
        {
            
/*
            if(cajausuario.getText()==admin && cajapass.getText()==pass)
            {
                    JOptionPane.showMessageDialog(null,"EL USUARIO Y CONTRASEÑA SON CORRECTOS //SE GENERA LA SIGUIENTE VENTANA");
            }   
            else{JOptionPane.showMessageDialog(null,"uuuy no, el usuario o contraseña estan mal, introduza usuario y contraseña validos");}
*/
            
            Ventanita_Admin Menu = new Ventanita_Admin(); 
            Menu.setVisible(true); 
    }
}
}
