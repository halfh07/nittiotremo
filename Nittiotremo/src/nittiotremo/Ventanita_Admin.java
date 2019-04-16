package nittiotremo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita_Admin extends JFrame implements ActionListener
{
    private JButton venta;
    private JButton usuarios;
    private JButton articulos;
    
    public Ventanita_Admin()
    {
        configurar_Ventanita_Admn();    
        inicializar_componentes_admn();
    }    
    private void configurar_Ventanita_Admn()
                    {
                        this.setTitle ("Menu Administrador");
                        this.setSize(350,280);
                        this.setLocationRelativeTo(null);
                        this.setLayout(null);
                        this.setResizable(false);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
    
    private void inicializar_componentes_admn()
                    {
                        venta=new JButton();
                        usuarios=new JButton();
                        articulos=new JButton(); 
                        
                        venta.setText("Punto de Venta");
                        venta.setBounds(55,30,225,50);
                        venta.addActionListener(this);
                        
                        usuarios.setText("Administrar Usuarios");
                        usuarios.setBounds(55,95,225,50);
                        usuarios.addActionListener(this);
                        
                        articulos.setText("Administrar Usiarios");
                        articulos.setBounds(55,160,225,50);
                        articulos.addActionListener(this);
                               
                        this.add(venta);
                        this.add(usuarios);
                        this.add(articulos);
                    }

    @Override
    public void actionPerformed(ActionEvent click) 
    {
   if(click.getSource()==articulos)
   {        
        Ventanita_Articulos arts = new Ventanita_Articulos();
        arts.setVisible(true);
   }
    }
    
}
