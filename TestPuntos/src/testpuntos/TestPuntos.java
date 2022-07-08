package TestPuntos;
import java.util.Scanner;

import testpuntos.Tipo;
import Testpuntos.tipo.Punto2D;
import Punto.tipo.Punto3D;

public class TestPuntos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Punto puntos[]=new Punto[5];
		
		int opc = 0;
		
		//3 Inicializar las 5 posiciones de puntos con datos dados por el programador
		puntos[0] = new Punto2D(5.5,6.9);
		puntos[1] = new Punto2D(8.4,7.9);
		puntos[2] = new Punto2D(1.2,10);
		puntos[3] = new Punto2D(9,5);
		puntos[4] = new Punto2D(-3.7,13) ;
		
		do{
			System.out.println("1. Punto 2D");
			System.out.println("2. Punto 3D");
			System.out.println("3. Salir");
			System.out.print("Opcion: ");
			opc = entrada.nextInt();
			switch(opc){
			case 1: menuPunto2D(entrada, puntos);
					break;
			case 2: menuPunto3D(entrada, puntos);
			default: break;
			}
		}while(opc<3);
	}
	
	public static void menuPunto2D(Scanner entrada, Punto puntos[]){
		Punto punto = null;
		int opc = 0;
		do{
			System.out.println("1. Distancia entre dos puntos");
			System.out.println("2. Punto Medio");
			System.out.println("3. Pendiente");
			System.out.println("4. Regresar al menu principal");
			System.out.print("Opcion: ");
			opc = entrada.nextInt();
			switch(opc){
			case 1:
                            System.out.println("ingresa el numero del punto que quieres (de 0-4)");
                            punto = pedirPunto(0, entrada.nextInt());
                            calcularOpcion(0,opc,punto,puntos);
			case 2:
                            System.out.println("ingresa el numero del punto que quieres (de 0-4)");
                            System.out.println("La distancia es: "+((Punto2D)punto).calcularPuntomedio(puntos[entrada.nextInt()]));
			case 3: punto = pedirPunto(1, entrada);
				     calcularOpcion(1, opc, punto, puntos);
			default: break;
			}
		}while(opc<4);
	}
	
	public static void menuPunto3D(Scanner entrada, Punto puntos[]){
		Punto punto = null;
		int opc = 0;
		do{
			System.out.println("1. Distancia entre dos puntos");
			System.out.println("2. Punto Medio");
			System.out.println("3. Cosenos Directos");
			System.out.println("4. Regresar al menu principal");
			System.out.print("Opcion: ");
			opc = entrada.nextInt();
			switch(opc){
			case 1:
			case 2:
			case 3: punto = pedirPunto(2, entrada);
				     calcularOpcion(2, opc, punto, puntos);
			default: break;
			}
		}while(opc<4);
	}	
	
        public static Punto pedirPunto(int tipo,int entrada)
        {
        Punto punto=null;
        if(tipo==0)
        {
        
        }
        return punto;
        }

	//			- tipo: int que especifica si se trata de Punto2D o Punto3D
	//			- entrada: Scanner que especifica el objeto para leer los datos del teclado
	public static void calcularOpcion(int tipo,int opc,Punto punto,Punto puntos)
        {
        
        }
	//5 Desarrollar el mÃ©todo calcularOpcion que regresa algo de tipo void y recibe
	//  los siguientes parÃ¡metros:
	//			- tipo: int que especifica si se trata de Punto2D o Punto3D
	//			- opc: int  que especifica que opcion se eligiÃ³: calcular distancia, punto medio, pendiente o cosenos
	//			- punto: Punto que especifica el punto desde el cual se generan los cÃ¡lculos
	//			- puntos[] : Punto que especifica el arreglo de objetos Punto dado por el programador
	
}
