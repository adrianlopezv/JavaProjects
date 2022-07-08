
package practtica2b;

import java.util.Scanner;


public class Menu 
{
public static void main(String args[])
{
Scanner inf=new Scanner(System.in);
Persona [] VP;
VP=new Persona[10];
String R,N;
int E,i=0,op=0,j;
do
{
	System.out.println("Selecciona la opcion deseada: \n 1.- Alta de usuario \n 2.- Baja de usuario \n 3.- Cambios en algun usuario \n 4.- Mostrar todos los datos \n 5.- Salir");
	op=inf.nextInt();
	switch(op)
	{
		case 1:
		Ingresar(VP,i);	
		i++;
		break;
		
	
		case 2:
		i=Baja(VP,i);
		
		break;
		
		case 3:
		Cambios(VP,i);
		break;
		
		case 4:
		for(j=0;j<i;j++)
		{
		E=VP[j].getEdad();
		R=VP[j].getRFC();
		N=VP[j].getNombrepila();
		Imprimir(VP,E,R,N,j);
		}
	
		break;
		
		case 5:
		System.out.print("Gracias! Hasta luego!");
		break;
		default: break;
	}
}while (op<5);

}

public static void Ingresar(Persona [] VP,int i)
{ 
	VP[i] = new Persona();
	Direccion d=new Direccion();
	Scanner dat=new Scanner(System.in);
	Scanner dat1=new Scanner(System.in);
	Boolean b;
	int j,band,ANIO,MES,DIA;
	String Validacion;
do
{
	band=0;
	System.out.print("Ingresa tu nombre de pila: ");
Validacion=dat.nextLine();

for(j=0;j<i;j++)
{
	if(Validacion.equals(VP[j].getNombrepila()))
	{
		band=1;
	}
}
if(band==1)
{
	System.out.println("Ese usuario ya existe! Ingresa otro!");
}
}while(band==1);

VP[j].setNombrepila(Validacion);

System.out.print("Ahora ingresa tu apellido paterno: ");
VP[j].setApellidopaterno(dat.nextLine());

System.out.print("Ahora el apellido materno: ");
VP[j].setApellidomaterno(dat.nextLine());

VP[i].setNombreCompleto();

	System.out.println("Ingresa tu calle: ");
d.setCalle(dat.nextLine());
System.out.println("Ingresa tu numero: ");
d.setNumero(dat.nextLine());
System.out.println("Ingresa tu colonia: ");
d.setColonia(dat.nextLine());
System.out.println("Ingresa tu delegacion: ");
d.setDelegacion(dat.nextLine());
System.out.println("Ingresa tu ciudad: ");
d.setCiudad(dat.nextLine());
System.out.println("Ingresa tu estado: ");
d.setEstado(dat.nextLine());
System.out.println("Ingresa tu pais: ");
d.setPais(dat.nextLine());

VP[i].setDireccion(d);

System.out.println("Ingresa tu email: ");
VP[i].setEmail(dat.nextLine());
do
{
	System.out.print("Ingresa tu fecha de nacimiento de esta forma, dia,mes (numerico) y aÃ±o completo ");
	DIA=dat1.nextInt();
	MES=dat1.nextInt();
	ANIO=dat1.nextInt();
	b=VP[i].setDiaCompleto(DIA,MES,ANIO);
	if(b==false)
	{
		System.out.println("Fecha no vÃ¡lida");
	}

}while(b==false);
VP[i].setFechaCompleta();
VP[i].setEdad();
VP[i].setRFC();
}

public static void Imprimir(Persona [] info,int E,String R,String N,int i)
{
	
System.out.println();
System.out.println();
System.out.println("Su nombre es:");
System.out.println(info[i].getNombreCompleto());
System.out.println("Su edad es:");
System.out.println(E);
System.out.println("Su RFC es:");
System.out.println(R.toUpperCase());
System.out.println("Su email es:");
System.out.println(info[i].getEmail());
System.out.println("Su calle es:");
System.out.println(info[i].getDireccion().getCalle());
System.out.println("Su numero es:");
System.out.println(info[i].getDireccion().getNumero());
System.out.println("Su colonia es:");
System.out.println(info[i].getDireccion().getColonia());
System.out.println("Su delegacion es:");
System.out.println(info[i].getDireccion().getDelegacion());
System.out.println("Su ciudad es:");
System.out.println(info[i].getDireccion().getCiudad());
System.out.println("Su estado es:");
System.out.println(info[i].getDireccion().getEstado());
System.out.println("Su pais es:");
System.out.println(info[i].getDireccion().getPais());
}

public static int Baja (Persona [] VP,int i)
{
	Scanner dat=new Scanner(System.in);
	int j,op;
	String Aux;
	for(j=0;j<i;j++)
	{
		Aux=VP[j].getNombrepila();
		System.out.println(j+".-"+Aux);
	}
	System.out.println("Seleccione el usuario a dar de baja");
	op=dat.nextInt();
	do
	{
		VP[op]=VP[op+1];
		op++;
	}while (op<i);
return --i;
}

public static void Cambios(Persona [] VP,int i)
{
	i--;
	Scanner dat=new Scanner(System.in);
	Scanner fflush=new Scanner(System.in);
	Boolean b;
	int j,op,op1,op2,x,pr=-100,ma=-100;
	String Aux;
	for(j=0;j<=i;j++)
	{
		Aux=VP[j].getNombrepila();
		System.out.println(j+".-"+Aux);
	}
	System.out.println("Seleccione el usuario al que desea cambiar datos");
	op=dat.nextInt();
	x=op;
	System.out.println("Â¿Que desea cambiar?\n 1)Nombre\n2)Direccion\n3)email\n4)fecha de nacimiento");
	op1=dat.nextInt();
	switch(op1)
	{
		case 1:
		System.out.println("Â¿Que desea cambiar?\n1)Nombre de pila\n2)Apellido Paterno\n3)Apellido Materno");
		op2=dat.nextInt();
		switch(op2)
		{
			case 1:
				System.out.println("Ingrese el nuevo nombre");
				VP[x].setNombrepila(fflush.nextLine());
				VP[i].setRFC();
			break;
		
			case 2:
				System.out.println("Ingrese el nuevo apellido paterno");
				VP[x].setApellidopaterno(fflush.nextLine());
				VP[i].setRFC();
			break;
		
			case 3:
				System.out.println("Ingrese el nuevo apellido materno");
				VP[x].setApellidomaterno(fflush.nextLine());
				VP[i].setRFC();
			break;
			default: break;
		}
		break;
		
		case 2:
		System.out.println("Â¿Que desea cambiar?\n1)Calle\n2)Numero\n3)Colonia\n4)Delegacion\n5)Ciudad\n6)Estado\n7)Pais");
		op2=dat.nextInt();
		switch(op2)
		{
			case 1:
				System.out.println("Ingrese la nueva calle");
				VP[x].getDireccion().setCalle(fflush.nextLine());
			break;
		
			case 2:
				System.out.println("Ingrese el nuevo numero");
				VP[x].getDireccion().setNumero(fflush.nextLine());
			break;
		
			case 3:
				System.out.println("Ingrese la nueva colonia");
				VP[x].getDireccion().setColonia(fflush.nextLine());
			break;
			
			case 4:
				System.out.println("Ingrese la nueva delegacion");
				VP[x].getDireccion().setDelegacion(fflush.nextLine());
			break;
			
			case 5:
				System.out.println("Ingrese la nueva ciudad");
				VP[x].getDireccion().setCiudad(fflush.nextLine());
			break;
			
			case 6:
				System.out.println("Ingrese la nueva estado");
				VP[x].getDireccion().setEstado(fflush.nextLine());
			break;
			
			case 7:
				System.out.println("Ingrese el nuevo pais");
				VP[x].getDireccion().setPais(fflush.nextLine());
			break;
			default: break;
		}
		break;
		
		case 3:
		System.out.println("Ingrese el nuevo email");
		VP[x].setEmail(fflush.nextLine());
		break;
		
		case 4:
		System.out.println("Â¿Que desea cambiar?\n1)Dia\n2)Mes\n3)Anio");
		op2=dat.nextInt();
		switch(op2)
		{
			case 1:
				do
				{
					System.out.print("Ingresa el dia correcto ");
					b=VP[i].setDiaCompleto(dat.nextInt(),pr,ma);
					if(b==false)
					{
						System.out.println("Fecha no vÃ¡lida");
						pr=-100;
						ma=-100;
					}

				}while(b==false);
				VP[i].setEdad();
				VP[i].setRFC();
			
			break;
			
			case 2:
			do
				{
				System.out.print("Ingresa el mes correcto ");
					b=VP[i].setDiaCompleto(pr,dat.nextInt(),ma);
					if(b==false)
					{
						System.out.println("Fecha no vÃ¡lida");
						pr=-100;
						ma=-100;
					}

				}while(b==false);
				VP[i].setEdad();
				VP[i].setRFC();
			break;
			
			case 3:
				do
				{
				System.out.print("Ingresa el anio correcto ");
					b=VP[i].setDiaCompleto(pr,ma,dat.nextInt());
					if(b==false)
					{
						System.out.println("Fecha no vÃ¡lida");
						pr=-100;
						ma=-100;
					}

				}while(b==false);
				VP[i].setEdad();
				VP[i].setRFC();
			break;
			
			default: break;
		}
		break;
	}

}
    
}
