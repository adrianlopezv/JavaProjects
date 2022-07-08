
package listas;

import java.util.Scanner;


public class Listas {

   
 
    public static void main(String[] args)
    {
        String dato,dato1;
    Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    Lista listasimple=new Lista();
    do
    {
        System.out.println(listasimple);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Inicio\n2.-Insertar Final\n3.-Insertar Despues de\n4"
            + ".-Borrar al inicio\n5.-Borrar al final\n6.-Borrado especifico\n7.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listasimple.insertarInicio(new Nodo(dato));
            break;
        case 2:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listasimple.insertarFinal(new Nodo(dato));
            break;
        case 3:
            if(listasimple.getNodoRaiz()==null)
         {
            System.out.println("No hay nada a lado, por lo tanto no se puede ingresar");
         }
        else
            {
            System.out.println("Dato de nodo a ingresar");
           dato=entradastr.nextLine();
           System.out.println("Ingresa el nodo en el que quieres insertarlo");
           dato1=entradastr.nextLine();
           listasimple.insertarDespuesde(new Nodo(dato),new Nodo(dato1));
            }
            
            break;
        case 4:
            listasimple.borrarAlInicio();
            break;
        case 5:
            listasimple.borrarAlFinal();
            break;
        case 6:
              if(listasimple.getNodoRaiz()==null)
         {
            System.out.println("No hay nada que borrar");
         }
        else
            {
                       System.out.println("Ingresa el nodo que quieres borrar");
           dato1=entradastr.nextLine();
           listasimple.borrarDespuesde(new Nodo(dato1));
            }

            break;
            
        case 7:
            System.out.println("Gracias,hasta luego!");
            break;
            
             default:
            System.out.println("Esa opcion no existe, favor de seleccionar otra");
            break;
            
    }
    }while(opcion!=7);
    }
}
