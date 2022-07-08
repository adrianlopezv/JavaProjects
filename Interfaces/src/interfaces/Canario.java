
package interfaces;


public class Canario extends Animal implements InterfaceVolar
{
    public Canario()
    {
    super("Piolin");
    }
    
    public void queHace()
    {
    System.out.println("Molestar a Sylvestre");
    }

     public void volar()
 {
     System.out.println("Vuela cuando me da la gana");
 }
    public void aterrizar()
    {
    System.out.println("Aterrizo de panzaso ");
    }
    public void despegar()
    {
    System.out.println("Despego cuando Sylvestre esta en modo gamer ");
    }
    
}
