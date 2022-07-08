package punto.tipos;
import punto.Punto;
import java.lang.Math;

public class Punto2D extends Punto {
    
    public Punto2D(double x, double y){
        super(x, y);
    }
    
    public double calcularPendiente(Punto2D punto){
        double pendiente = 0.0;
        if(this.x != punto.getX()){
            pendiente = (this.y-punto.getY())/(this.x-punto.getX());
        }
        return pendiente;
    }
    
    public double calcularDistanciaPuntos(Punto punto){
        double distancia = 0.0;
        distancia = Math.sqrt(Math.pow(this.x - punto.getX(), 2) + Math.pow(this.y - punto.getY(), 2));
        return distancia;
    }
    
    public Punto calcularPuntoMedio(Punto punto){
        return new Punto2D((this.x + punto.getX())/2, (this.y + punto.getY())/2);
    }
    
}