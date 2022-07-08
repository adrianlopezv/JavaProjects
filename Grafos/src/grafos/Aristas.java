
package grafos;

import java.awt.*;
public class Aristas extends ElementosGrafos
{
    private Point puntoFinal;
    
    public Aristas(Point puntoInicial,Point puntoFinal)
    {
    super(puntoInicial);
    this.puntoFinal=puntoFinal;
    }
    
    public Point getPuntoFinal()
    {
    return puntoFinal;
    }
    public void dibujar(Graphics g)
    {
    g.setColor(Color.WHITE);
    g.drawLine((int)this.puntoInicial.getX(),(int)this.puntoInicial.getY(),(int)this.puntoFinal.getX(),(int)this.puntoFinal.getY());
    
    }
}
