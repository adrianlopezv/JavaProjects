
package clasesabstractas;

public class Cuadrado extends Figura2D
{
    private double lado;
    
    public Cuadrado(double lado)
    {
    super("Cuadrado");
    this.lado=lado;
    }
    
    public double getLado() {
        return lado;
    }
 public void calcularArea()
 {
 this.area=lado*lado;
 }
 public void calcularPerimetro()
 {
 this.perimetro=4*lado;
 }
 
}
