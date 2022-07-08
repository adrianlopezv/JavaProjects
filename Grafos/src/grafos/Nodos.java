
package grafos;
import java.awt.*;
public class Nodos extends ElementosGrafos
{
    private String nombreNodo;
    private static int numeroNodo=0;
    
    public Nodos(Point puntoInicial)
    {
    super(puntoInicial);
    char letra=(char)(numeroNodo+65);
    this.nombreNodo=" "+letra;
    this.nombreNodo=this.nombreNodo.trim();
    numeroNodo++;
    }

    public String getNombreNodo() {
        return nombreNodo;
    }
    
    public void dibujar(Graphics g)
    {
    g.setColor(Color.WHITE);
    g.fillOval((int)this.puntoInicial.getX(),(int) this.puntoInicial.getY(),50, 50);
    g.setColor(Color.RED);
    g.drawString(this.nombreNodo, (int)this.puntoInicial.getX()+20, (int)this.puntoInicial.getY()+30);
    
    }
    
    public boolean contieneA(Point p)
    {
    if((p.getX()>=this.puntoInicial.getX()  && p.getX()<=this.puntoInicial.getX()+50)
            &&(p.getY()>=this.puntoInicial.getY() && p.getY()<=this.puntoInicial.getY()+50))
        {
            return true;
        }
    else
     {
        return false;
     }
    }
}
