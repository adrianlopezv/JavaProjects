package punto;

public abstract class Punto {
    protected double x;
    protected double y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public abstract double calcularDistanciaPuntos(Punto punto);
    public abstract Punto calcularPuntoMedio(Punto punto);
    
    public String toString(){
        return ("( " + this.x + " , " + this.y + " )");
    }
   
}