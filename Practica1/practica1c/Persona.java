
package practica1c;

import java.util.Scanner;

public class Persona 
{
public static void main(String args[])
{
Scanner dat=new Scanner(System.in);
Nombre2 n=new Nombre2();
Boolean b;
String q,R,N;
int E;
System.out.print("Ingresa tu nombre de pila: ");
String nombre=dat.nextLine();
n.setNombrepila(nombre);

System.out.print("Ahora ingresa tu apellido paterno: ");
n.setApellidopaterno(dat.nextLine());

System.out.print("Ahora el apellido materno: ");
n.setApellidomaterno(dat.nextLine());

//Aqui comienza la pedida de fecha y verificacion

do
{
	System.out.print("Ingresa tu fecha de nacimiento de esta forma, dia,mes (numerico) y aÃ±o completo ");
	b=n.setDiaC(dat.nextInt(),dat.nextInt(),dat.nextInt());
	if(b==false)
	{
		System.out.println("Fecha no vÃ¡lida");
	}

}while(b==false);

n.setFechaCompleta();
n.setNomc();
System.out.println(n.getNomc());
System.out.println(n.getEdad());
System.out.println(n.getRFC());


}    
}
