package practica3;

import java.util.Random;
import java.util.Scanner;

public class Practica3 
{

    public static void main(String[] args)
    {
       	Random aleat = new Random(System.currentTimeMillis());	
        Lista lista=null;
        Scanner dat=new Scanner(System.in);
        int op,op1,op2,al;
        String x;
        do
        {
        System.out.println("1.-Stack\n2.-Queue\n3.-Salir");
        op=dat.nextInt();
        switch(op)
        {
            case 1:
             al = aleat.nextInt(20)+1;
             System.out.println(al);
               lista =new Stack(al);
                Menu2(lista,op);
                break;
                
                
            case 2:
             al = aleat.nextInt(20)+1;
               lista =new Queue(al);
                 Menu2(lista,op);
                break;
                
            case 3:
                System.out.println("Gracias! Hasta luego!");
                break;
				
			default: 
			System.out.println("No existe esa opcion, favor de escoger la correcta");
			break;
        }
        }while (op!=3);
    }
    
    public static void Menu2(Lista lista,int op)
{
	 Scanner dat=new Scanner(System.in);
    System.out.println("El arreglo es este"+lista.ToString());
    System.out.println("1.-Operaciones Lista\n2.-Manejo Conjuntos\n3.-Menu anterior");
       int op1=dat.nextInt();
do
{
switch(op1)
{
    case 1:
        Menu3(lista,op);
    break;
    
    case 2:
    
        Menu4(lista,op);
    break;
    
    case 3:
        break;
	
	default:
            System.out.println("No existe esa opcion, favor de escoger la correcta");
            break;
}

}while(op1!=3);

}

public static void Menu3(Lista lista,int op)
{
     Scanner dat=new Scanner(System.in);
     int op1;    
     int x,y;
       boolean b;
       
     do
{
	System.out.println("El arreglo es este "+ lista.ToString());
    System.out.println("1.-Añadir Elemento\n2.-Borrar Elemento\n3.-Buscar Elemento\n4.-Ordenar Lista\n5.-Menu anterior");
       op1=dat.nextInt();
       System.out.println(op1);
switch(op1)
{
    case 1:
        if(op==2)
        {
           System.out.println("Que elemento deseas agregar"); 
           x=dat.nextInt();
        b=((Queue)lista).Push(x);
        }
        if(op==1)
        {
           System.out.println("Que elemento deseas agregar"); 
           x=dat.nextInt();
        b=((Stack)lista).Push(x);
        
        }
    break;
	
    case 2:
        if(op==2)
        {
        x=((Queue)lista).Pop();
        }
        if(op==1)
        {
           x=((Stack)lista).Pop();
        }
	break;
        
    case 3:
         System.out.println("Que elemento deseas buscar?"); 
           x=dat.nextInt();
       y=lista.EstaElemList(x);
       if(y==-1)
       {
       System.out.println("No existe ese elmento");
       }
       else
       {
       System.out.println("Esta en la posicion"+y);
       }
    break;
	
    case 4:
        lista.SortLista();
	break;
        
    case 5:
        break;
        
    default:
        System.out.println("No existe esa opcion, favor de escoger la correcta");
        break;
}

}while(op1!=5);

}


public static void Menu4(Lista lista, int op)
{
    Random aleat = new Random(System.currentTimeMillis());
     Scanner dat=new Scanner(System.in);
	System.out.println("El arreglo es este"+lista.ToString());
	Lista lista2=null;
        int al;
        String X,S="Stack",Q="Queue";
	 al = aleat.nextInt(20)+1;
	X=lista.getTipo();
        if(X.equals(Q))
        {
        lista2 =new Queue(al);
        }
        else
        {
        lista2 =new Stack(al);
        }
	 System.out.println("1.-Operaciones lista 1\n2.-Operaciones lista 2\n3.-Operaciones Conjunto\n4.-Menu anterior");
        int op1=dat.nextInt();
        do
        {
        switch(op1)
        {
        case 1:
        Menu3(lista,op);
        break;
	     
        case 2:
        Menu3(lista2,op);
	break;
	
	case 3:
            MenuOperConj(lista,lista2,op);
        break;
        case 4:
            break;
        default:
            System.out.println("No existe esa opcion, favor de escoger la correcta");
            break;
        }
        }while(op!=4);
	
}


public static void MenuOperConj(Lista lista,Lista lista2, int op)
{
     Scanner dat=new Scanner(System.in);
	System.out.println("El arreglo 1 es este"+lista.ToString());
        System.out.println("El arreglo 2 es este"+lista2.ToString());
	 System.out.println("1.-Union\n2.-Interseccion\n3.-Diferencia A-B\n4.-Diferencia B-A\n5.-Menu anterior");
       int op1=dat.nextInt();
       Lista lista3=null;
	switch(op1)
		{
	case 1:

        break;
	
        case 2:

	break;
	
	case 3:

        break;
	
        case 4:

	break;
	
        case 5:
            break;
            
	default:
            System.out.println("No existe esa opcion, favor de escoger la correcta");
            break;
	
		}
		
		
}

}
