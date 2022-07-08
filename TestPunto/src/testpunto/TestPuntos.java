
package testpunto;

import java.util.Scanner;
import Punto.Punto;
import Punto.tipo.Punto2D;
import Punto.tipo.Punto3D;

public class TestPuntos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Punto puntos[]=new Punto[5];
		
		int opc = 0;
		
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
			switch(opc)
                        {
			case 1:
                            System.out.println("ingresa el numero del punto que quieres (de 0-4)");
                            punto = pedirPunto(0, entrada);
                            calcularOpcion(0,opc,punto,puntos);
                            break;
			case 2:
                            System.out.println("ingresa el numero del punto que quieres (de 0-4)");
                            System.out.println("La distancia es: "+((Punto2D)punto).calcularPuntomedio(puntos[entrada.nextInt()]));
			break;
                        case 3: punto = pedirPunto(1, entrada);
				     calcularOpcion(1, opc, punto, puntos);
			default: break;
			}
		}while(opc<4);
	}
	
	public static void menuPunto3D(Scanner entrada, Punto puntos[]){
		Punto punto = null;
		int opc = 0;
		do
                {
			System.out.println("1. Distancia entre dos puntos");
			System.out.println("2. Punto Medio");
			System.out.println("3. Cosenos Directos");
			System.out.println("4. Regresar al menu principal");
			System.out.print("Opcion: ");
			opc = entrada.nextInt();
			switch(opc)
                        {
			case 1: punto = pedirPunto(2, entrada);
				     calcularOpcion(2, opc, punto, puntos);
                                     break;
			case 2: punto = pedirPunto(2, entrada);
				     calcularOpcion(2, opc, punto, puntos);
                                     break;
			case 3: punto = pedirPunto(2, entrada);
				     calcularOpcion(2, opc, punto, puntos);
                                     break;
			default: break;
			}
		}while(opc<4);
	}	
	
        public static Punto pedirPunto(int tipo,Scanner entrada)
        {
            double x,y,z;
        Punto punto=null;
        if(tipo==0)
        {
        System.out.print("Dame el punto x: ");
        x = entrada.nextDouble();
        System.out.print("Dame el punto y: ");
        y = entrada.nextDouble();              
        punto = new Punto2D(x,y);
        }
        else
        {
                   System.out.print("Dame el punto x: ");
            x = entrada.nextDouble();
            System.out.print("Dame el punto y: ");
            y = entrada.nextDouble();
            System.out.print("Dame el punto z: ");
            z = entrada.nextDouble();
            punto = new Punto3D(x,y,z);
        }
        return punto;
        }

	public static void calcularOpcion(int tipo,int opc,Punto punto,Punto puntos[])
        {
            
            double distancia,pendiente;
            Punto puntomedio;
        if(tipo == 0)
        {
            switch(opc)
            {   
                case 1:
                  distancia = ((Punto2D)punto).calcularDistanciaPuntos((Punto2D)puntos[0]);
                    System.out.println("La distancia es: " + distancia);
                  break;
                case 2: 
                    puntomedio = ((Punto2D)punto).calcularPuntomedio((Punto2D)puntos[0]);
                    System.out.println("El punto medio es: " + puntomedio.toString());
                  break;
                case 3: 
                    pendiente = ((Punto2D)punto).calcularPendiente((Punto2D)puntos[0]);
                    System.out.println("La pendiente es: " + pendiente);
                  break;
                default: 
                  break;
            }
        }
             
        if(tipo == 1)
        {
            switch(opc)
            {
                case 1: 
                    distancia = ((Punto3D)punto).calcularDistanciaPuntos((Punto3D)puntos[1]);
                    System.out.println("La distancia es: " + distancia);
                  break;
                case 2: 
                    puntomedio = ((Punto3D)punto).calcularPuntomedio((Punto3D)puntos[1]);
                    System.out.println("El punto medio es: " + puntomedio.toString());
                  break;
                case 3:
                    double cosenos[] = ((Punto3D)punto).calcularCosenosDirectos((Punto3D)puntos[1]);
                    System.out.println("El coseno alfa es: " + cosenos[0]);
                    System.out.println("El coseno beta es: " + cosenos[1]);
                    System.out.println("El coseno gamma es: " + cosenos[2]);
                  break;
                default: 
                  break;
            }   
        }  
        }
		
}

