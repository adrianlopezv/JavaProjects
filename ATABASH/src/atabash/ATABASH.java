
package atabash;
import java.util.Scanner;
public class ATABASH 
{
    public static void main(String[] args)
    {
        Operaciones operaciones=new Operaciones(); 
        Scanner datint=new Scanner(System.in);
        int op;
        System.out.println("Que metodo quiere usar?\n1.-ATABASHI\n2.-Numeracion de Cesar\n3.-Salir");
        op=datint.nextInt();
        switch(op)
        {
            case 1:
            MenuAtabashi(operaciones);
            break;
            
            case 2:
                MenuCesar(operaciones);
                break;
            case 3:
                System.out.println("Gracias! vuelva pronto!");
                break;
                
        }        
      

    } 
 
    public static void MenuAtabashi(Operaciones operaciones)
    {
      operaciones.CrearArreglos(26);
      operaciones.ImprimirArreglos();
      MenuOper(operaciones);
    }

public static void MenuCesar(Operaciones operaciones)
{
     Scanner datint=new Scanner(System.in);
    System.out.println("\n Ingresa el numero de letra en la que quieres comenzar la codificacion");
    operaciones.CrearArreglos(datint.nextInt());
    operaciones.ImprimirArreglos();
        MenuOper(operaciones);
}

public static void MenuOper(Operaciones operaciones)
{
    int op;
     Scanner datint=new Scanner(System.in);
     Scanner dat=new Scanner(System.in);
 System.out.println("Que deseas?\n1.-Cifrar\n2.-Decifrar\n");
 op=datint.nextInt();
 switch(op)
 {
     case 1:
          System.out.println("\n Ingresa palabra a cambiar");
        operaciones.setTextoPlano(dat.nextLine());
        operaciones.Codificar();
        System.out.println(operaciones.getCodificacion());
        break;
        
     case 2:
                
        System.out.println("\n Ingresa palabra a decodificar");
        operaciones.setCodice(dat.nextLine());
        operaciones.Decodificar();
        System.out.println(operaciones.getDecodificacion());
        break;
        
     default:break;
         
 }
}
}
