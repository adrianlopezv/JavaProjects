package Punto.tipo;
import Punto.Punto;

public class Punto3D extends Punto{
    
    private double z;
    public Punto3D(double x,double y,double z)
    {
    super(x,y);
    this.z=z;
    }
    
    public double getZ()
    { 
     return this.z;
    }
    
    public double[] calcularCosenosDirectos(Punto3D punto)
    {
    double cosenos[]=new double [3];
    double distancia=this.calcularDistanciaPuntos(punto);
    cosenos[0]=(punto.getX()-this.x)/distancia;
     cosenos[1]=(punto.getY()-this.y)/distancia;
      cosenos[2]=(punto.getZ()-this.z)/distancia;
    
    return cosenos;
    }

           public String toString()
       {
       return "("+this.x+","+this.y+","+this.z+")";
       }
           
    public double calcularDistanciaPuntos(Punto punto)
    {
     double distancia;
    distancia=Math.sqrt(Math.pow((this.x-punto.getX()), 2)+Math.pow((this.y-punto.getY()), 2)+Math.pow(this.z-((Punto3D)punto).getZ(), 2));
    return distancia;
    }
    
       public Punto calcularPuntomedio (Punto punto)
       {
       return new Punto3D((this.x+punto.getX())/2,(this.y+punto.getY())/2,(this.z+((Punto3D)punto).getZ())/2);
       }
       

}
