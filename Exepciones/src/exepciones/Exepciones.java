package exepciones;
import java.util.*;
public class Exepciones {

    public static void main(String[] args)
    {
        boolean validacion=false;
        int numero=0;
        Scanner entrada=new Scanner(System.in); 
        while(!validacion)
        {
         try 
        {
        System.out.println("Dame un numero");
        numero=entrada.nextInt();
        validacion=true;
        }
        catch(InputMismatchException e)
        {
        System.out.println("Ingreso un valor que no es numerico, ingrese un NUMERO");
        entrada.nextLine();
        validacion=false;
        }
        }
       
    }
    
}
