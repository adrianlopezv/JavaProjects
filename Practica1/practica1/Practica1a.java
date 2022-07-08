package practica1;

import java.util.Scanner;


public class Practica1a {

    public static void main(String[] args)
    {
   Scanner dat=new Scanner(System.in);
Nombre n=new Nombre();
System.out.println("Ingresa tu nombre de pila: ");
String nombre=dat.nextLine();
n.setNombrepila(nombre);

System.out.println("Ahora ingresa tu apellido paterno: ");
n.setApellidopaterno(dat.nextLine());

System.out.println("Ahora el apellido materno: ");
n.setApellidomaterno(dat.nextLine());

System.out.print("Tu nombre es: "+n.getNombrepila());
System.out.print("Tu apellido paterno es: "+n.getApellidopaterno());
System.out.print("Tu apellido materno es: "+n.getApellidomaterno());
    }
    
}
