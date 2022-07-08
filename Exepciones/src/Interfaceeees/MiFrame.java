
package Interfaceeees;
import java.awt.*;
import java.awt.event.*;
public class MiFrame extends Frame
{
    private Panel panelNorte;
    private Button b1,b2,b3,b4,b5,b6;
    private TextField mensajes;
    public MiFrame()
    {
    super("Mi ventana...");
    
    b1=new Button("Boton 1");
    b2=new Button("Boton 2");
    b3=new Button("Boton 3");
    b4=new Button("Boton 4");
    b5=new Button("Boton 5");
    b6=new Button("Boton 6");
    
    panelNorte=new Panel();
    
    mensajes=new TextField(50);
    }
    
    public void presentarFrame()
    {
    setSize(500,500);
    setBackground(Color.BLUE);
    
    panelNorte.add(b1);
    panelNorte.add(b6);
    
    mensajes.setText("Aqui van mensajes");
    
    add(panelNorte,BorderLayout.NORTH);
    add(mensajes,BorderLayout.SOUTH);
    add(b3,BorderLayout.EAST);
    add(b4,BorderLayout.WEST);
    add(b5,BorderLayout.CENTER);
    
     b1.addActionListener(new ManjeadorBotones());
         b3.addActionListener(new ManjeadorBotones());
     b4.addActionListener(new ManjeadorBotones());
     b5.addActionListener(new ManjeadorBotones());
     b6.addActionListener(new ManjeadorBotones());

    addWindowListener(new ManejadorVentana());
    
    setVisible(true);
    }
    
    private class ManejadorVentana extends WindowAdapter
    {
    public void windowClosing(WindowEvent e) 
    {
    System.exit(0);
    }
    }
    
    private class ManjeadorBotones implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
        Button boton=(Button)e.getSource();
        mensajes.setText(boton.getLabel());
        }
    
    }
    
    public static void main(String args[])
    {
    MiFrame f=new MiFrame();
    f.presentarFrame();
    }
    
}
