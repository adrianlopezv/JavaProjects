package lista.tipoLista;
import java.util.InputMismatchException;
import lista.Lista;
import nodo.tipoNodo.NodoInfo;
import java.util.Scanner;

public class ListaSimple implements Lista {
    NodoInfo nodoRaiz = new NodoInfo();
    NodoInfo nodoCita = new NodoInfo();
    
    public void crearLista(){
        for(int i=0;i<4;i++){
            NodoInfo nodo = new NodoInfo();
            nodo.setDoctor("Vacante");
            nodo.setPaciente("Vacante");
            switch(i){
                case 0: nodo.setSala("Quirofano 1");  
                    nodoRaiz = nodo;
                  break;
                case 1: nodo.setSala("Quirofano 2");
                  break;
                case 2: nodo.setSala("Sala de Fisioterapia 1");
                  break;
                case 3: nodo.setSala("Sala de Fisioterapia 2");
                  break;
            }
            if(i != 0){
                NodoInfo nodoAux = nodoRaiz;
                while(nodoAux.getNextNodo() != null){
                    nodoAux = (NodoInfo)nodoAux.getNextNodo();
                }
                nodoAux.setNextNodo(nodo);
            }
        }
    }
    
    public void buscarNodo(){
        int b = 0;
        NodoInfo nodoAuxiliar = nodoRaiz;
        nodoCita = nodoAuxiliar;
        Scanner dataS= new Scanner(System.in);
        
        do {
            System.out.println("Que sala quieres apartar?");
            String sala = dataS.nextLine();
            nodoAuxiliar = nodoRaiz;
            while(!nodoAuxiliar.getSala().equalsIgnoreCase(sala) && nodoAuxiliar.getNextNodo() != null){
                nodoAuxiliar = (NodoInfo)nodoAuxiliar.getNextNodo();
            }
            if(!nodoAuxiliar.getSala().equalsIgnoreCase(sala)){
                System.out.println("La sala no existe, intente de nuevo\n");
            }else{
                nodoCita = nodoAuxiliar;
                if(!nodoCita.getDoctor().equalsIgnoreCase("Vacante")){
                    System.out.println("Lo lamento, esta sala ya esta reservada");
                }else{
                    b=1;
                }     
            }
        }while(b != 1);
        
        b = 0;
        do{
            System.out.println("Dame el nombre del doctor");
            String doctor = dataS.nextLine();
            nodoAuxiliar = nodoRaiz;
            while(!nodoAuxiliar.getDoctor().equalsIgnoreCase(doctor) && nodoAuxiliar.getNextNodo() != null){
                nodoAuxiliar = (NodoInfo)nodoAuxiliar.getNextNodo();
            }
            if(nodoAuxiliar.getDoctor().equalsIgnoreCase(doctor)){
                System.out.println("Este doctor esta ocupado, intente de nuevo\n");
            } else{
                nodoCita.setDoctor(doctor);
                b = 1;
            }
        }while(b != 1);
         
        b = 0;
        do{
            System.out.println("Dame el nombre del paciente");
            String paciente = dataS.nextLine();
            nodoAuxiliar = nodoRaiz;
            while(!nodoAuxiliar.getPaciente().equalsIgnoreCase(paciente) && nodoAuxiliar.getNextNodo() != null){
                nodoAuxiliar = (NodoInfo)nodoAuxiliar.getNextNodo();
            }
            if(nodoAuxiliar.getPaciente().equalsIgnoreCase(paciente)){
                System.out.println("Este paciente tiene otra cita, intente de nuevo \n");
            } else{
                nodoCita.setPaciente(paciente);
                b=1;
            }
        }while(b != 1);
    }
    
    public void borrarNodo(){
        Scanner data = new Scanner(System.in);
        Scanner dataS = new Scanner(System.in);
        NodoInfo nodoAux = nodoRaiz;
        int opcion = 0;
        boolean validar = false;
        
        while (!validar){
            try{
                validar = true;
                System.out.println("Elige un parámetro de busqueda:");
                System.out.println("1. Sala");
                System.out.println("2. Doctor");
                System.out.println("3. Paciente");
                System.out.print("Opcion: ");
                opcion = data.nextInt();
            }catch(InputMismatchException e){
                System.err.println("El dato no es un numero. Intente de nuevo");
                data.nextLine();
                validar = false;
                System.out.println("");
            }
        }
        
        switch(opcion){
            case 1:
                System.out.println("Que sala quieres buscar?");
                String sala = dataS.nextLine();
                while(!nodoAux.getSala().equalsIgnoreCase(sala) && nodoAux.getNextNodo() != null){ 
                    nodoAux = (NodoInfo)nodoAux.getNextNodo();
                }
                if(nodoAux.getNextNodo()==null){
                    System.out.println("La sala no existe");
                }else{
                    if(nodoAux.getSala().equalsIgnoreCase(sala)){
                        nodoAux.setDoctor("Vacante");
                        nodoAux.setPaciente("Vacante");
                    } 
                }
                validar = false;
              break;
            case 2:
                System.out.println("Que doctor quieres buscar?");
                String doctor = dataS.nextLine();
                while(!nodoAux.getDoctor().equalsIgnoreCase(doctor) && nodoAux.getNextNodo() != null){
                    nodoAux = (NodoInfo)nodoAux.getNextNodo();
                }
                if(nodoAux.getNextNodo()==null){
                    System.out.println("Este doctor no tiene cita a esta hora");
                }else{
                    if(nodoAux.getDoctor().equalsIgnoreCase(doctor)){
                        nodoAux.setDoctor("Vacante");
                        nodoAux.setPaciente("Vacante");
                    }
                }
                validar = false;
              break;
            case 3:
                System.out.println("Que paciente quieres buscar?");
                String paciente = dataS.nextLine();
                while(!nodoAux.getPaciente().equalsIgnoreCase(paciente) && nodoAux.getNextNodo() != null){
                    nodoAux = (NodoInfo)nodoAux.getNextNodo();
                }
                if(nodoAux.getNextNodo()==null){
                    System.out.println("Este paciente no tiene cita a esta hora");
                }else{
                    if(nodoAux.getPaciente().equalsIgnoreCase(paciente)){
                        nodoAux.setDoctor("Vacante");
                        nodoAux.setPaciente("Vacante");
                    }
                }
                validar = false;
              break;
            default:
                System.out.println("Opcion invalida");
                validar = false;
              break;
        }   
    }
    
    public String[][] imprimirLista(){
        String listaString[][] = new String[2][5];
        NodoInfo nodoAux = nodoRaiz;
        
        for(int i=0; i<4; i++){
            if(nodoAux.getDoctor().equals("Vacante")){
                listaString[0][i] = nodoAux.getDoctor() + "\t";
                listaString[1][i] = "       ";
            } else{
                listaString[0][i] = "Dr. " + nodoAux.getDoctor();
                listaString[1][i] = "Paciente: " + nodoAux.getPaciente();
            }
            nodoAux = (NodoInfo)nodoAux.getNextNodo();  
        }
        return listaString;
    } 
}