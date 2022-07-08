package proyecto2;
import java.util.InputMismatchException;
import lista.tipoLista.ListaCircular;
import java.util.Scanner;

public class Proyecto2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        boolean validar = false;
        ListaCircular lunes = new ListaCircular();
        lunes.crearLista();
        ListaCircular martes = new ListaCircular();
        martes.crearLista();
        ListaCircular miercoles = new ListaCircular();
        miercoles.crearLista();
        ListaCircular jueves = new ListaCircular();
        jueves.crearLista();
        ListaCircular viernes = new ListaCircular();
        viernes.crearLista();   
        ListaCircular dias[]={lunes, martes, miercoles, jueves, viernes};
        
        do{
            while (!validar){
                try{
                    validar = true;
                    System.out.println("Elija el dia de la semana:");
                    System.out.println("1. Lunes");
                    System.out.println("2. Martes");
                    System.out.println("3. Miercoles");
                    System.out.println("4. Jueves");
                    System.out.println("5. Viernes");
                    System.out.println("6. Salir");
                    
                    System.out.print("Opcion: ");
                    opcion = entrada.nextInt();
                }catch(InputMismatchException e){
                    System.err.println("El dato no es un numero. Intente de nuevo");
                    entrada.nextLine();
                    validar = false;
                    System.out.println("");
                }
            }
            switch (opcion){
                case 1: 
                    System.out.print("\tAgenda del Lunes:");
                    dias[0] = opciones(dias[0], entrada);
                    validar = false;
                  break;
                case 2: 
                    System.out.print("\tAgenda del Martes:");
                    dias[1] = opciones(dias[1], entrada);
                    validar = false;
                  break;
                case 3: 
                    System.out.print("\tAgenda del Miercoles:");
                    dias[2] = opciones(dias[2], entrada);
                    validar = false;
                  break;
                case 4: 
                    System.out.print("\tAgenda del Jueves");
                    dias[3] = opciones(dias[3], entrada);
                    validar = false;
                  break;
                case 5: 
                    System.out.print("\tAgenda del Viernes");
                    dias[4] = opciones(dias[4], entrada);
                    validar = false;
                  break;
                case 6: 
                    System.out.println("Hasta luego");
                    validar = false;
                  break;
                default: 
                    System.out.println("Opcion invalida");
                    validar = false;
                  break;
            }        
        }while(opcion != 6);  
    }
    
    public static ListaCircular opciones(ListaCircular dia, Scanner entrada) {
        int opcion = 0;
        boolean validar = false;
        
        do{
            while (!validar){
                try{
                    validar = true;
                    System.out.println("\n");
                    imprimirAgenda(dia);
                    System.out.println("\n1. Crear cita");
                    System.out.println("2. Borrar cita");
                    System.out.println("3. Cambiar el dia");
            
                    System.out.print("Opcion: ");
                    opcion = entrada.nextInt();
                }catch(InputMismatchException e){
                    System.err.println("El dato no es un numero. Intente de nuevo");
                    entrada.nextLine();
                    validar = false;
                    System.out.println("");
                }
            }
            switch(opcion){
                case 1: 
                    dia.buscarNodo();
                    validar = false;
                  break;
                case 2: 
                    dia.borrarNodo();
                    validar = false;
                  break;
                case 3: 
                  break;
                default: 
                    System.out.println("Opcion invalida.");
                    validar = false;
                  break;
            }
        }while(opcion != 3);
        System.out.print("\n");
        return dia;
    }
    
    public static void imprimirAgenda(ListaCircular dia) {
        String agenda[][] = dia.imprimirLista();
        for(int i=0; i<17; i++){
            for(int j=0; j<5; j++){
                System.out.print(agenda[i][j] + "\t");
                if(j == 3 && i!= 0){
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}