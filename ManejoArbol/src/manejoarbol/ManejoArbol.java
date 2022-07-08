
package manejoarbol;
import java.util.Scanner;

public class ManejoArbol {
    public static void main(String[] args) 
    {
     Scanner entradaOpcion=new Scanner(System.in);
     Scanner entradaInfo=new Scanner(System.in);
     int opcion=0;
     ArbolBinario binario=new ArbolBinario();
     String info;
     
     do{
     if(!binario.esArbolVacio())
     {
     System.out.print("Preorden: ");
     binario.recorridoPreorden(binario.getRaiz());
      System.out.print("\nInorden: ");
     binario.recorridoInorden(binario.getRaiz());
     System.out.print("\nPostorden: ");
     binario.recorridoPostorden(binario.getRaiz());
     }
        System.out.println("\n1.- Insertar elemento\n2.- Buscar elemento\n3.- Borrar elemento\nCualquier otro numero para salir"); 
         opcion=entradaOpcion.nextInt();
         
         switch(opcion)
         {
             case 1:
                 System.out.print("Ingresa dato ");
                  info=entradaInfo.nextLine();
                 binario.setRaiz(binario.insertar(binario.getRaiz(), info));
                 break;
                 
             case 2:
                 System.out.print("Ingresa dato a buscar: ");
                  info=entradaInfo.nextLine();
                 binario.busqueda(binario.getRaiz(), info, 1);
                 break;
                 
            case 3:
                System.out.print("Ingresa dato a borrar: ");
                  info=entradaInfo.nextLine();
                boolean validacion=binario.busqueda(binario.getRaiz(), info, 1);
               
                if(validacion==true)
                { 
                  
                    binario.borrado(binario.getRaiz(), info,binario.getRaiz(),0);
                }
                 break;
            
            default:
                System.out.println("Hasta luego!");
                break;
                 
         }
     }while(opcion<4 && opcion>0);
     
    }
    
}
