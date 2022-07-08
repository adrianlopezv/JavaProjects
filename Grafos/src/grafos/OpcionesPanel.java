
package grafos;

import javax.swing.*;
import java.awt.event.*;

public class OpcionesPanel extends JPanel
{
    private JRadioButton aristas,nodos;
    private ButtonGroup grupo;
    private DibujoPanel dibujo;
     
    public OpcionesPanel(DibujoPanel dibujo)
    {
    this.dibujo=dibujo;
    this.grupo=new ButtonGroup();
    this.nodos=new JRadioButton("Nodos",true);
    this.aristas=new JRadioButton("Aristas",false);
    this.grupo.add(nodos);
    this.grupo.add(aristas);
    
    add(this.nodos);
    add(this.aristas);
    
    this.nodos.addItemListener(new ItemHandler());
    this.aristas.addItemListener(new ItemHandler());
    }
    
    private class ItemHandler implements ItemListener
    {
    public void itemStateChanged(ItemEvent e)
        {
            if(e.getSource()==nodos)
            {
            dibujo.setOpcion(dibujo.NODOS);
            }
            else
            {
            dibujo.setOpcion(dibujo.ARISTAS);
            }
        }
    }
}
