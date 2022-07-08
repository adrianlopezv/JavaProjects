
package listas;
import java.util.Scanner;

public class Listas {

  
    public static void main(String[] args)
    {
    Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    Lista listasimple=new Lista();
    do
    {
        System.out.println(listasimple);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Inicio\n2.-Insertar Final\n3.-Insertar Despues de\n4.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            System.out.println("Dato de nodo a ingresar");
            String dato=entradastr.nextLine();
            listasimple.insertarInicio(new Nodo(dato));
            break;
        case 2:
            System.out.println("Dato de nodo a ingresar");
            //String dato=entradastr.nextLine();
            
            break;
        case 3:
            System.out.println("Dato de nodo a ingresar");
           // String dato=entradastr.nextLine();
            
            break;
        case 4:
            System.out.println("Gracias");
            break;
            
    }
    }while(opcion!=4);
    }
    
}
