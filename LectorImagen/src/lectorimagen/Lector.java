
package lectorimagen;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.Scanner;

public class Lector extends JFrame
{
    Imagen imagen;
    
    public Lector(Imagen imagen)
    {
    this.imagen=imagen;
    
    this.setSize(200,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    }
    public void paint(Graphics g)
    {
    g.drawImage(this.imagen.getImg(),10,20,this.getWidth()-10,this.getHeight()-10,null);
    }
    public static void main(String args[])
    {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Nombre del archivo: ");
    String stringImg=entrada.nextLine();
    
    Lector lector = new Lector(new Imagen(stringImg));
    
    }
}
