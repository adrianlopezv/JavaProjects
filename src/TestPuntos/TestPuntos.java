package TestPuntos;
//1 Incluir las clases Scanner, Punto, Punto2D y Punto3D

import java.util.Scanner;
import punto.Punto;
import punto.tipos.Punto2D;
import punto.tipos.Punto3D;

public class TestPuntos {

    public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
                
        //2 Declarar y crear un arreglo de 5 posiciones de tipo Punto
        Punto puntos[] = new Punto[5];
        
	//3 Inicializar las 5 posiciones de puntos con datos dados por el programador
        puntos[0] = new Punto2D(1.2, 2.3);
        puntos[1] = new Punto3D(2.3, 3.4, 4.5);
        puntos[2] = new Punto3D(3.4, 4.5, 5.6);
        puntos[3] = new Punto3D(5.6, 6.7, 7.8);
        puntos[4] = new Punto3D(6.7, 7.8, 8.9);
		
        int opc = 0;
		
	do{
            System.out.println("\n1. Punto 2D");
            System.out.println("2. Punto 3D");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: menuPunto2D(entrada, puntos);
                    break;
		case 2: menuPunto3D(entrada, puntos);
                    break;
                default: 
                    break;
            }
	}while(opc < 3);
    }
	
    public static void menuPunto2D(Scanner entrada, Punto puntos[]){
	Punto punto = null;
	int opc = 0;
	do{
            System.out.println("\n1. Distancia entre dos puntos");
            System.out.println("2. Punto Medio");
            System.out.println("3. Pendiente");
            System.out.println("4. Regresar al menu principal");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
		switch(opc){
                    case 1: case 2: case 3: 
                        punto = pedirPunto(1, entrada);
                        calcularOpcion(1, opc, punto, puntos);
                    default: break;
		}
        }while(opc < 4);
    }
	
    public static void menuPunto3D(Scanner entrada, Punto puntos[]){
	Punto punto = null;
	int opc = 0;
	do{
            System.out.println("\n1. Distancia entre dos puntos");
            System.out.println("2. Punto Medio");
            System.out.println("3. Cosenos Directos");
            System.out.println("4. Regresar al menu principal");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: case 2: case 3: 
                    punto = pedirPunto(2, entrada);
                    calcularOpcion(2, opc, punto, puntos);
                default: break;
            }
        }while(opc < 4);
    }
        
    //4 Desarrollar el método pedirPunto que regresa un objeto de tipo Punto y recibe los siguientes parámetros: 
	//			- tipo: int que especifica si se trata de Punto2D o Punto3D
	//			- entrada: Scanner que especifica el objeto para leer los datos del teclado
	
    public static Punto pedirPunto(int tipo, Scanner entrada){
        Punto punto = null;
        if(tipo == 1){
        System.out.print("Dame el punto x: ");
        double x = entrada.nextDouble();
        System.out.print("Dame el punto y: ");
        double y = entrada.nextDouble();              
        punto = new Punto2D(x,y);
        }
        
        if(tipo == 2){
            System.out.print("Dame el punto x: ");
            double x = entrada.nextDouble();
            System.out.print("Dame el punto y: ");
            double y = entrada.nextDouble();
            System.out.print("Dame el punto z: ");
            double z = entrada.nextDouble();
            punto = new Punto3D(x,y,z);
        }
          
        return punto;
    }
       
    //5 Desarrollar el método calcularOpcion que regresa algo de tipo void y recibe los siguientes parámetros:
	//			- tipo: int que especifica si se trata de Punto2D o Punto3D
	//			- opc: int  que especifica que opcion se eligió: calcular distancia, punto medio, pendiente o cosenos
	//			- punto: Punto que especifica el punto desde el cual se generan los cálculos
	//			- puntos[] : Punto que especifica el arreglo de objetos Punto dado por el programador
   
    public static void calcularOpcion(int tipo, int opc, Punto punto, Punto puntos[]){
        
        if(tipo == 1){
            switch(opc){   
                case 1:
                    double distancia = ((Punto2D)punto).calcularDistanciaPuntos((Punto2D)puntos[0]);
                    System.out.println("La distancia es: " + distancia);
                  break;
                case 2: 
                    Punto puntoMedio = ((Punto2D)punto).calcularPuntoMedio((Punto2D)puntos[0]);
                    System.out.println("El punto medio es: " + puntoMedio.toString());
                  break;
                case 3: 
                    double pendiente = ((Punto2D)punto).calcularPendiente((Punto2D)puntos[0]);
                    System.out.println("La pendiente es: " + pendiente);
                  break;
                default: 
                  break;
            }
        }
            
        if(tipo == 2){
            switch(opc){
                case 1: 
                    double distancia = ((Punto3D)punto).calcularDistanciaPuntos((Punto3D)puntos[1]);
                    System.out.println("La distancia es: " + distancia);
                  break;
                case 2: 
                    Punto puntoMedio = ((Punto3D)punto).calcularPuntoMedio((Punto3D)puntos[1]);
                    System.out.println("El punto medio es: " + puntoMedio.toString());
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