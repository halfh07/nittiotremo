package nittiotremo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventanita_Usuarios extends JFrame implements ActionListener 
{

private JRadioButton alta,baja,cambio;
    private JLabel txtusuario,txtcontraseña,txtnombre,txtapellido,txtpuesto,txtpass,txtaviso,txtaviso2;
    private JTextField cajausuario,cajacontraseña,cajanomnre,cajatelefono,cajapuesto;
    private JPasswordField cajapass;
    private JButton aceptar;
    
    public Ventanita_Usuarios()
    {
        configurar_usuarios();
        inicializar_usuarios();
    }
    
    private void configurar_usuarios()
    {
        this.setTitle ("Control Usuarios");
                        this.setSize(550,300);
                        this.setLocationRelativeTo(null);
                        this.setLayout(null);
                        this.setResizable(false);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void inicializar_usuarios()
    {
        txtusuario= new JLabel();
        txtcontraseña= new JLabel();
        txtnombre= new JLabel();
        txtapellido= new JLabel();
        txtpuesto= new JLabel();
        txtpass=new JLabel();
        txtaviso= new JLabel();
        txtaviso2=new JLabel();
        
        cajausuario=new JTextField();
        cajacontraseña=new JTextField();
        cajanomnre=new JTextField();
        cajatelefono=new JTextField();
        cajapuesto=new JTextField();
        cajapass=new JPasswordField();
        
        alta= new JRadioButton();
        baja= new JRadioButton();
        cambio= new JRadioButton();
        aceptar=new JButton();

        ButtonGroup grupo1=new ButtonGroup();
        
        grupo1.add(alta);
        grupo1.add(baja);
        grupo1.add(cambio);
        
        alta.setText("Alta");
        alta.setBounds(55,20,75,25);
        
        baja.setText("Baja");
        baja.setBounds(130,20,75,25);
        
        cambio.setText("Cambios");
        cambio.setBounds(205,20,75,25);
        
        txtusuario.setText("Usuario");
        txtusuario.setBounds(55,50,100,25);
        cajausuario.setBounds(155,50,100,25);
        
        txtcontraseña.setText("Contraseña");
        txtcontraseña.setBounds(55,75,100,25);
        cajacontraseña.setBounds(155,75,100,25);
        
        txtnombre.setText("Nombre");
        txtnombre.setBounds(55,100,100,25);
        cajanomnre.setBounds(155,100,100,25);
        
        txtapellido.setText("Apellido");
        txtapellido.setBounds(55,125,100,25);
        cajatelefono.setBounds(155,125,100,25);
        
        txtpuesto.setText("Puesto");
        txtpuesto.setBounds(55,150,100,25);
        cajapuesto.setBounds(155,150,100,25);
        
        txtpass.setText("Contraseña");
        txtpass.setBounds(300,85,100,25);
        cajapass.setBounds(400,85,100,25);
        
        aceptar.setText("Aceptar");
        aceptar.setBounds(300,135, 200,25);
        aceptar.addActionListener(this);
        
        txtaviso.setText("**Para bajas y modificaciones basta con el codigo y campo que se modificara :)");
        txtaviso.setBounds(25,185,1000,25);
        txtaviso2.setText("**Para cualquier movimiento es necesario confirmar con la contraseña de administrador");
        txtaviso2.setBounds(25,220,1000,25);
        
        this.add(txtusuario);
        this.add(txtcontraseña);
        this.add(txtnombre);
        this.add(txtapellido);
        this.add(txtpuesto);
        this.add(txtpass);
        this.add(txtaviso);
        this.add(txtaviso2);
        
        this.add(cajausuario);
        this.add(cajacontraseña);
        this.add(cajanomnre);
        this.add(cajatelefono);
        this.add(cajapuesto);
        this.add(cajapass);
        
        this.add(alta);
        this.add(baja);
        this.add(cambio);
        this.add(aceptar);
    
}

    @Override
    public void actionPerformed(ActionEvent bleep) 
    {
        
        
    }
}
