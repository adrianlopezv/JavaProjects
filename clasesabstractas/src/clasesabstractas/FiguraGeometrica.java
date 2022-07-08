
package clasesabstractas;


public abstract class FiguraGeometrica 
{
    protected String tipo;
    protected double area;
    public FiguraGeometrica(String tipo)
    {
    this.tipo=tipo;
    }
    
    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public double getArea()
    {
        return area;
    }
    
    public abstract void calcularArea();
}
