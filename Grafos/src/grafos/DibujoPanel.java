
package grafos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DibujoPanel extends JPanel
{
    public static final int NODOS   =1;
    public static final int ARISTAS =2;
    
    private ElementosGrafos elementos[];
    private int numElementos;
    private int opcion;
    private Point inicial;
    
    public DibujoPanel()
    {
        this.elementos=new ElementosGrafos[10];
        this.numElementos=0;
        this.opcion=NODOS;
    
        setBackground(Color.BLACK);
    
        addMouseListener(new MouseHandler());
    }
 
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
    
        for(int i=0;i<this.numElementos;i++)
        {
        elementos[i].dibujar(g);
        }
    }
    
    private class MouseHandler extends MouseAdapter
    {
    public void mousePressed(MouseEvent e)
    {
        if(opcion==NODOS)
        {
            elementos[numElementos++]=new Nodos(e.getPoint());
            repaint();
        
     }
     else
           {
               if(opcion==ARISTAS) 
               {
                   Point punto=e.getPoint();
                   if(contiene(punto))
                   {
                    inicial=punto;
                   }
                inicial=e.getPoint();
              }
           }
     }
    
    public void mouseReleased(MouseEvent e)
    {
        if(opcion==ARISTAS)
         {
              Point punto2=e.getPoint();
                   if(contiene(punto2))
                   {
                    elementos[numElementos++]=new Aristas(inicial, punto2);
                   }
             
         }
        repaint();
     }
    
    }

    public boolean contiene(Point punto)
    {
        int k=0;
        do
        {
        if(elementos[k] instanceof Nodos)
        {
            if(((Nodos)elementos[k]).contieneA(punto))
            {
            return true;
            }
        }
        k++;
        }while(k<numElementos);
        
    return false;
    }
    
}
