
package practica1b;

import java.util.Scanner;

public class VFecha {
    public static void main(String args[])
{
Scanner dat=new Scanner(System.in);
Fecha y=new Fecha();
Boolean b;
do
{
	System.out.print("Ingresa la fecha de esta forma, dia,mes (numerico) y aÃ±o completo ");
	b=y.setDiaC(dat.nextInt(),dat.nextInt(),dat.nextInt());
	if(b==false)
	{
		System.out.println("Fecha no vÃ¡lida");
	}

}while(b==false);

	System.out.println(y.getFechaCompleta());
	}
}
