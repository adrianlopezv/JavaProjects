package grafos;
import java.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        Scanner entradastr=new Scanner(System.in);
        int opcion=0,n=0,x=0,opcion2=0,bandera=0,opcion3=1; 
        
        try
        {
        System.out.println("Ingresa el numero de vertices");
        x=entrada.nextInt();
                GrafoNoDirigido grafo1= new GrafoNoDirigido(x);
        GrafoDirigido grafo2 = new GrafoDirigido(x);
        char nombre='A',nodoinicio,nodofinal;
        char nombres[]=new char[x];
        boolean existe=false;
        String listanombres="",listadelistas="";
        for(int w=0;w<x;w++)
        {
        nombres[w]=nombre;
        NodoSimple nodo=new NodoSimple(Character.toString(nombre));
        nombre++; 
        }
        for(int j=0;j<x;j++)
        {
        listanombres+=nombres[j];
        
        }
        {
               System.out.println("1.-Grafo dirigido\n2.-Grafo no dirigido");
       opcion2=entrada.nextInt();
       switch(opcion2)
        {
           case 1:
       while(n<x)
       {  
           do
           {
           System.out.println("1.-Agregar conexion a nodos\n2.-Imprimir la matriz de adyacencias\n3.-Imprimir la lista de adyacencias\n"
                   + "4.-Pasar al siguiente nodo\n5.-Salir");
           opcion=entrada.nextInt();
           switch(opcion)
           {
               case 1:
                   System.out.println("Tienes "+x+" nodos\nSus nombres son:\n"+listanombres+"\nEstas en el nodo "+nombres[n]
                   +"\nIngrese e nombre del nodo al que quiere conectar con el nodo actual");
                   nombre=entradastr.next().charAt(0);
                   nombre=Character.toUpperCase(nombre);
                   int y=0,peso;
                   if(nombres[n]!=nombre) {
                   while(nombre!=nombres[y]&&y<x-1)
                   { 
                       y++;
                   }
                   if(nombre!=nombres[y])
                   { 
                   System.out.println("Ese nodo no existe");
                   }
                   else
                   {
                   System.out.println("Que peso tendra el enlace?(Un numero menor a 1000)");
                   peso=entrada.nextInt();
                  boolean b =grafo2.AgregarAMat(n, y, peso,bandera,opcion2);
                  if(b==true)
                  {
                  grafo2.AgregarLista(n, y, nombres[y]);
                  }
                   }
                   }else {System.out.println("No se puede realizar esta conexion");}
          
                   break;
                   
               case 2:
                   System.out.println(grafo2.getMatrizAdyacencias().toString());
                   break;
                   
                   case 3:
                       listadelistas="";
                   for(int w=0;w<x;w++)
                   {
                   listadelistas+=grafo2.getListaAdyacencia(w).toString()+"\n";
                   }
                   System.out.println(listadelistas);
                   break;
                   
                   case 4:
                       System.out.println();
                   break;
                   case 5: n=1000;
                		   opcion=6;
                   break;
               default:
                   System.out.println("Esta opcion no existe, favor de selccionar otra");
                   break;
           }
           }while(opcion<4);
       
           n++;
       }
       System.out.println("Con grafos dirigidos se puede aplicar el método de Floyd, gusta que le mostremos la ruta con menor"
               + "peso utilizando este metodo?\n1.-Si\nOtro numero para salir");
       opcion=entrada.nextInt();
       switch(opcion)
       {
           case 1:
               do
               {
               do
                {
               System.out.println("Nombre del nodo de inicio?");
                nodoinicio=entradastr.next().charAt(0);
                nodoinicio=Character.toUpperCase(nodoinicio);
                System.out.println("Nombre del nodo de final?");
                nodofinal=entradastr.next().charAt(0);
                 nodofinal=Character.toUpperCase(nodofinal);
                if(nodoinicio!=nodofinal)
                {
                existe=grafo2.MetodoFloyd(grafo2,x,nodoinicio,nodofinal);

                }
                else
                {
                System.out.println("No pueden tener el mismo nombre");
                }
               }while(existe==false);
               System.out.println("1.-Seleccionar otra ruta\nOtro numero para salir");
               opcion3=entrada.nextInt();
               }while(opcion3==1);
               
                
                              break;
               
           default:
               System.out.println("Gracias! Hasta luego");
               break;
       }
       break;
       
           case 2:
        	   while(n<x)
    	       {  
    	           do
    	           {
    	           System.out.println("1.-Agregar conexion a nodos\n2.-Imprimir la matriz de adyacencias\n3.-Imprimir la lista de adyacencias\n"
    	                   + "4.-Pasar al siguiente nodo");
    	           opcion=entrada.nextInt();
    	           switch(opcion)
    	           {
    	               case 1:
    	                   System.out.println("Tienes "+x+" nodos\nSus nombres son:\n"+listanombres+"\nEstas en el nodo "+nombres[n]
    	                   +"\nIngrese e nombre del nodo al que quiere conectar con el nodo actual");
    	                   nombre=entradastr.next().charAt(0);
    	                   nombre=Character.toUpperCase(nombre);
    	                   int y=0,peso;
    	                   if(nombres[n]!=nombre) {
    	                   while(nombre!=nombres[y]&&y<x-1)
    	                   { 
    	                       y++;
    	                   }
    	                   if(nombre!=nombres[y])
    	                   { 
    	                   System.out.println("Ese nodo no existe");
    	                   }
    	                   else
    	                   {
    	                   System.out.println("Que peso tendra el enlace?(Un numero menor a 1000)");
    	                   peso=entrada.nextInt();
    	                  boolean b= grafo1.AgregarAMat(n, y, peso,bandera,opcion2);
    	                  if(b==true)
    	                  {
    	                  grafo1.AgregarLista(n, y, nombres[y]);
    	                  }
    	                   }
    	                   }else {System.out.println("No se puede realizar esta conexion");}
    	          
    	                   break;
    	                   
    	               case 2:
    	                   System.out.println(grafo1.getMatrizAdyacencias().toString());
    	                   break;
    	                   
    	                   case 3:
    	                       listadelistas="";
    	                   for(int w=0;w<x;w++)
    	                   {
    	                   listadelistas+=grafo1.getListaAdyacencia(w).toString()+"\n";
    	                   }
    	                   System.out.println(listadelistas);
    	                   break;
    	                   case 5: n=1000;
                		   opcion=6;
                		   break;
    	                   case 4:
    	                       System.out.println();
    	                   break;
    	               default:
    	                   System.out.println("Esta opcion no existe, favor de selccionar otra");
    	                   break;
    	           }
    	           }while(opcion<4);
    	       
    	           n++;
    	       }
        	   System.out.println("Con grafos no dirigidos se puede aplicar el metodo de Kruskal, gusta que le mostremos la ruta con menor"
                       + "peso utilizando este metodo?\n1.-Si\nOtro numero para salir");
               opcion=entrada.nextInt();
               switch(opcion)
               {
                   case 1:
                	   grafo1.MetodoKruskal();
                       break;
                       
                   default:
                       System.out.println("Gracias! Hasta luego");
                       break;
               }

               break;
           default:
               System.out.println("Opcion no valida");
               break;
        }
        }


        }catch(InputMismatchException ex)
        {
        System.out.println("No ingreso un numero, favor de ingresarlo");
        }
        
        


}
  
 
}