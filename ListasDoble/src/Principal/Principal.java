
package Principal;
import java.util.Scanner;
import lista.tipoLista.*;
import nodo.tipoNodo.*;
public class Principal 
{
    public static void main(String[] args)
    {
    Scanner entrada=new Scanner(System.in);
    int opcion1=0;
    
    do
    {
    System.out.println("Seleccione el tipo de Nodo que requiere:\n 1.-Nodo Doble\n 2.-Nodo Simple\n 3.-Salir");
    opcion1=entrada.nextInt();
    switch(opcion1)
    {
        case 1:
            MenuNodoDoble();
            break;
            
        case 2:
            MenuNodoSimple();
            break;
            
        case 3:
            System.out.println("Gracias! Hasta luego");
            break;
    }
    
    
    }while(opcion1!=3);
    
    }  
    
    public static void MenuNodoSimple()
    {
    
        System.out.println("En proceso :)");
    
    }
    
    public static void MenuNodoDoble()
    {
       Scanner entrada=new Scanner(System.in);
    int opcion1=0;
    
    do
    {
    System.out.println("Seleccione el tipo de Lista que requiere:\n 1.-Lista Simple\n 2.-Lista Circular\n 3.-Menu anterior");
    opcion1=entrada.nextInt();
    switch(opcion1)
    {
        case 1:
            MenuListaSimpleND();
            break;
            
        case 2:
            MenuListaCircularND();
            break;
            
        case 3:
            break;
    }
    
    
    }while(opcion1!=3);
    }
    
    public static void MenuListaSimpleND()
    {
            Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    String dato,dato1;
        ListaSimple listasimple=new ListaSimple();
    do
    {
        System.out.println(listasimple);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Inicio\n2.-Insertar Final\n3.-Insertar Despues de\n4"
            + ".-Borrar al inicio\n5.-Borrar al final\n6.-Borrado especifico\n7.-Menu anterior");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listasimple.insertarInicio(new NodoDoble(dato));
            break;
        case 2:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listasimple.insertarFinal(new NodoDoble(dato));
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
           listasimple.insertarDespuesde(new NodoDoble(dato),new NodoDoble(dato1));
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
           listasimple.borrarDespuesde(new NodoDoble(dato1));
            }

            break;
            
        case 7:
            break;
            
             default:
            System.out.println("Esa opcion no existe, favor de seleccionar otra");
            break;
            
    }
    }while(opcion!=7);
    }
    
    public static void MenuListaCircularND()
    {
    String dato,dato1;
    Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    ListaCircular listacircular=new ListaCircular();
    do
    {
        System.out.println(listacircular);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Inicio\n2.-Insertar Final\n3.-Insertar Despues de\n4"
            + ".-Borrar al inicio\n5.-Borrar al final\n6.-Borrado especifico\n7.-Menu anterior");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listacircular.insertarInicio(new NodoDoble(dato));
            break;
        case 2:
            System.out.println("Dato de nodo a ingresar");
            dato=entradastr.nextLine();
            listacircular.insertarFinal(new NodoDoble(dato));
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
           listacircular.insertarDespuesde(new NodoDoble(dato),new NodoDoble(dato1));
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
           listacircular.borrarDespuesde(new NodoDoble(dato1));
        }
            break;
            
        case 7:
            break;
        default:
            System.out.println("Esa opcion no existe, favor de seleccionar otra");
            break;
            
    }
    }while(opcion!=7);
        
    }
    
    public static void MenuListaSimpleNS()
    {
          
    }
    
    public static void MenuListaCircularNS()
    {
    
    }
    
}
