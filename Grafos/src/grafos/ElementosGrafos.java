
package grafos;

import java.awt.*;

public abstract class ElementosGrafos
{
    protected Point puntoInicial;
    
    public ElementosGrafos(Point puntoInicial)
    {
        this.puntoInicial=puntoInicial;
        
    }
    
    public Point getPuntoInicial() {
        return puntoInicial;
    }
    
    public abstract void dibujar(Graphics g);
    
}
