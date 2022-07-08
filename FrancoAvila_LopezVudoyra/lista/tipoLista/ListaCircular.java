package lista.tipoLista;
import lista.Lista;
import nodo.tipoNodo.NodoHorario;
import nodo.tipoNodo.NodoInfo;
import java.util.Scanner;

public class ListaCircular implements Lista{
    protected NodoHorario nodoRaiz = new NodoHorario();
    protected NodoHorario nodoFinal = new NodoHorario();
    
    public void crearLista(){
        for(int i=0; i<8; i++){
            NodoHorario nodoAux = new NodoHorario();
            ListaSimple listaInfo = new ListaSimple();
            listaInfo.crearLista();
            nodoAux.setListainfo(listaInfo);
            switch(i){
                case 0: 
                    nodoAux.setHorario("07:00 a 08:00");
                    nodoRaiz = nodoAux;
                    nodoFinal = nodoRaiz;
                  break;
                case 1: nodoAux.setHorario("08:00 a 09:00");
                  break;
                case 2: nodoAux.setHorario("09:00 a 10:00");  
                  break;
                case 3: nodoAux.setHorario("10:00 a 11:00");  
                  break;
                case 4: nodoAux.setHorario("11:00 a 12:00");  
                  break;
                case 5: nodoAux.setHorario("16:00 a 17:00");  
                  break;
                case 6: nodoAux.setHorario("17:00 a 18:00");  
                  break;
                case 7: nodoAux.setHorario("18:00 a 19:00");  
                  break;
            }
            nodoFinal.setNextNodo(nodoAux);
            nodoAux.setPrevHorario(nodoFinal);
            nodoFinal = nodoAux;
            nodoAux.setNextNodo(nodoRaiz);
            nodoAux.setPrevHorario(nodoFinal);
        }
    }
    
    public void buscarNodo(){
        Scanner data = new Scanner(System.in);
        int b = 0;
        
        do{
            System.out.println("\nEn que horario deseas agendar la cita?");
            String horario = data.nextLine();
            int valido = horario.length();
              
            if(valido == 13){
                String inicio = horario.substring(0,2);
                String fin = horario.substring(8,10);
                int inicioi = Integer.parseInt(inicio);
                int fini = Integer.parseInt(fin);
        
                if(inicioi>=7 && inicioi<12){
                    if(fini>=8 && fini<13){
                        validacionHorario(inicioi,fini,0);
                        b = 1;
                    }
                } else{
                    if(inicioi>=16 && inicioi<19){
                        if(fini>17 && fini<20){
                            validacionHorario(inicioi,fini,0);
                            b = 1;
                        }
                    }
                }
                if(inicioi>=13 && inicioi<16){
                    System.out.println("El inicio y/o fin de este horario no es valido. Intente de nuevo");
                }
            }else{
                System.out.println("El formato del horario no es valido. Intente de nuevo");
            }
        }while(b != 1);
    }
    
    public void validacionHorario(int inicio, int fin, int caso){
        NodoHorario nodoAuxiliar = nodoRaiz;
        String horario = "";
        
        if(inicio<10){
            horario += "0" + inicio + ":00 a ";
        } else{
            horario += inicio + ":00 a ";
        }
        if(inicio+1<10){
            horario += "0" + (inicio+1) + ":00";
        } else{
            horario += (inicio+1) + ":00";
        }
        
        while(!nodoAuxiliar.getHorario().equalsIgnoreCase(horario) && !nodoAuxiliar.getHorario().equalsIgnoreCase(nodoFinal.getHorario())){
            nodoAuxiliar = (NodoHorario)nodoAuxiliar.getNextNodo();
        }
        
        if(caso == 0){
            if(nodoAuxiliar.getHorario().equalsIgnoreCase(horario)){
                nodoAuxiliar.getListainfo().buscarNodo();
            } 
        } else{
            if(nodoAuxiliar.getHorario().equalsIgnoreCase(horario)){
                nodoAuxiliar.getListainfo().borrarNodo();
            }
        }
        
        String doctor = nodoAuxiliar.getListainfo().nodoCita.getDoctor();
        String paciente = nodoAuxiliar.getListainfo().nodoCita.getPaciente();
        String sala = nodoAuxiliar.getListainfo().nodoCita.getSala();
        int resta = fin-inicio-1;
        
        for(int i=0; i<resta; i++){
            nodoAuxiliar = (NodoHorario)nodoAuxiliar.getNextNodo();
            NodoInfo busqueda = nodoAuxiliar.getListainfo().nodoRaiz;
            
            while(!busqueda.getSala().equalsIgnoreCase(sala)){
                busqueda = (NodoInfo)busqueda.getNextNodo();
            }
            busqueda.setDoctor(doctor);
            busqueda.setPaciente(paciente);
        }
    }
    
    public void borrarNodo(){
        Scanner dataS = new Scanner(System.in);
        int b = 0;
        
        do{
            System.out.println("\nEn que horario se encuentra la cita que desea eliminar?");
            String horario = dataS.nextLine();
            int valido = horario.length();
              
            if(valido == 13){
                String inicio = horario.substring(0,2);
                String fin = horario.substring(8,10);
                int inicioi = Integer.parseInt(inicio);
                int fini = Integer.parseInt(fin);
        
                if(inicioi>=7 && inicioi<12){
                    if(fini>=8 && fini<13){
                        validacionHorario(inicioi,fini,1);
                        b = 1;
                    }
                } else{
                    if(inicioi>=16 && inicioi<19){
                        if(fini>17 && fini<20){
                            validacionHorario(inicioi,fini,1);
                            b = 1;
                        }
                    }
                }
                if(inicioi>=13 && inicioi<16){
                    System.out.println("El inicio y/o fin de este horario no es valido. Intente de nuevo");
                }
            }else{
                System.out.println("El formato del horario no es valido. Intente de nuevo");
            }
        }while(b != 1);
    }
    
    public String[][] imprimirLista(){
        String listaString[][] = new String [19][5];
        NodoHorario nodoAux = nodoRaiz;
        
        listaString[0][0] = "Horario      ";
        listaString[0][1] = "Quirofano 1";
        listaString[0][2] = "Quirofano 2";
        listaString[0][3] = "Sala de Fisioterapia 1";
        listaString[0][4] = "Sala de Fisioterapia 2";
        
        for(int i=1; i<16; i=i+2){
            listaString[i][0] = nodoAux.getHorario();
            listaString[i+1][0] = "             ";
            String miniLista[][] = nodoAux.getListainfo().imprimirLista();
            for(int j=0;j<4;j++){
                listaString[i][j+1] = miniLista[0][j];
                listaString[i+1][j+1] = miniLista[1][j];
            }
            nodoAux = (NodoHorario)nodoAux.getNextNodo();
        }
        return listaString;
    }
}