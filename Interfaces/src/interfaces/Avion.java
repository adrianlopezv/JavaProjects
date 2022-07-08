
package interfaces;

public class Avion extends Vehiculo implements InterfaceVolar
{
 public Avion()
 {
 super("Avion");
 }
 
 public void queHace()
 {
 System.out.println("Vuela");
 }
 
 public void volar()
 {
     System.out.println("Vuela con las "+InterfaceVolar.numeroAlas);
 }
    public void aterrizar()
    {
    System.out.println("Aterriza con el tren de aterrizaje ");
    }
    public void despegar()
    {
    
    }
}
