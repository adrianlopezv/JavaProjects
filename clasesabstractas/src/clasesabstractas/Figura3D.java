
package clasesabstractas;

public abstract class  Figura3D extends FiguraGeometrica
 {
    protected double volumen;
    
    public Figura3D(String tipo)
    {
    super(tipo);
    }
    
    public double getVolumen() {
        return volumen;
    }
    
    public abstract void calcularVolumen();
    
}
