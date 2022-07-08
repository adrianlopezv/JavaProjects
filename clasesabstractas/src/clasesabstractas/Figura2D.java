
package clasesabstractas;

public abstract class Figura2D extends FiguraGeometrica 
{
    protected double perimetro;
    
    public Figura2D(String tipo)
    {
    super(tipo);
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public abstract void calcularPerimetro();
}
