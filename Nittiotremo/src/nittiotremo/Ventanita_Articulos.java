package nittiotremo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita_Articulos extends JFrame implements ActionListener
{

    private JRadioButton alta,baja,cambio;
    private JLabel txtcodigo,txtnombre,txtcantidad,txtprecio,txtubicacion,txtpass,txtaviso,txtaviso2;
    private JTextField cajacodigo,cajanombre,cajacantidad,cajaprecio,cajaubicacion;
    private JPasswordField cajapass;
    private JButton aceptar;
    public Ventanita_Articulos()
    {
        configurar_articulos();
        inicializar_articulos();
    }
    
    private void configurar_articulos()
    {
        this.setTitle ("Control Articulos");
                        this.setSize(550,300);
                        this.setLocationRelativeTo(null);
                        this.setLayout(null);
                        this.setResizable(false);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void inicializar_articulos()
    {
        txtcodigo= new JLabel();
        txtnombre= new JLabel();
        txtcantidad= new JLabel();
        txtprecio= new JLabel();
        txtubicacion= new JLabel();
        txtpass=new JLabel();
        txtaviso= new JLabel();
        txtaviso2=new JLabel();
        
        cajacodigo=new JTextField();
        cajanombre=new JTextField();
        cajacantidad=new JTextField();
        cajaprecio=new JTextField();
        cajaubicacion=new JTextField();
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
        
        txtcodigo.setText("Codigo");
        txtcodigo.setBounds(55,50,100,25);
        cajacodigo.setBounds(155,50,100,25);
        
        txtnombre.setText("Nombre");
        txtnombre.setBounds(55,75,100,25);
        cajanombre.setBounds(155,75,100,25);
        
        txtcantidad.setText("Cantidad");
        txtcantidad.setBounds(55,100,100,25);
        cajacantidad.setBounds(155,100,100,25);
        
        txtprecio.setText("precio");
        txtprecio.setBounds(55,125,100,25);
        cajaprecio.setBounds(155,125,100,25);
        
        txtubicacion.setText("Ubicacion");
        txtubicacion.setBounds(55,150,100,25);
        cajaubicacion.setBounds(155,150,100,25);
        
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
        
        this.add(txtcodigo);
        this.add(txtnombre);
        this.add(txtcantidad);
        this.add(txtprecio);
        this.add(txtubicacion);
        this.add(txtpass);
        this.add(txtaviso);
        this.add(txtaviso2);
        
        this.add(cajacodigo);
        this.add(cajanombre);
        this.add(cajacantidad);
        this.add(cajaprecio);
        this.add(cajaubicacion);
        this.add(cajapass);
        
        this.add(alta);
        this.add(baja);
        this.add(cambio);
        this.add(aceptar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
