
package listascirculares;

import java.util.Scanner;


public class ListasCirculares {

    public static void main(String[] args)
    {
        String dato,dato1;
    Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    ListaC listacircular=new ListaC();
    do
    {
        System.out.println(listacircular);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Inicio\n2.-Insertar Final\n3.-Insertar Despues de\n4"
            + ".-Borrar al inicio\n5.-Borrar al final\n6.-Borrado especifico\n7.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listacircular.insertarInicio(new Nodo(dato));
            break;
        case 2:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listacircular.insertarFinal(new Nodo(dato));
            break;
        case 3:
                    if(listacircular.getNodoRaiz()==null)
         {
            System.out.println("No hay nada a lado, por lo tanto no se puede ingresar");
         }
        else
            {
             System.out.println("Dato de nodo a ingresar");
           dato=entradastr.nextLine();
           System.out.println("Ingresa el nodo en el que quieres insertarlo");
           dato1=entradastr.nextLine();
           listacircular.insertarDespuesde(new Nodo(dato),new Nodo(dato1));
               }
       
            break;
        case 4:
            listacircular.borrarAlInicio();
            break;
        case 5:
            listacircular.borrarAlFinal();
            break;
        case 6:
        if(listacircular.getNodoRaiz()==null)
         {
            System.out.println("No hay nada que borrar");
         }
        else
        {
        System.out.println("Ingresa el nodo que quieres borrar");
           dato1=entradastr.nextLine();
           listacircular.borrarDespuesde(new Nodo(dato1));
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
