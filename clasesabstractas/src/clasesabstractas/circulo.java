
package clasesabstractas;

public class circulo extends Figura2D
{
    private double radio;
    public circulo(double radio)
    {
    super("Circulo");
    this.radio=radio;
    }
    
    public void calcularArea()
 {
 this.area=Math.PI*Math.pow(radio,2);
 }
 public void calcularPerimetro()
 {
 this.perimetro=Math.PI*2*radio;
 }

    public double getRadio() {
        return radio;
    }
}
