package nodo.tipoNodo;
import nodo.Nodo;
import lista.tipoLista.ListaSimple;

public class NodoHorario extends Nodo{
    protected String horario;
    protected NodoHorario prevHorario;
    protected ListaSimple listainfo = new ListaSimple();

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPrevHorario(NodoHorario prevHorario) {
        this.prevHorario = prevHorario;
    }
    
    public void setListainfo(ListaSimple listainfo) {
        this.listainfo = listainfo;
    }
    
    public String getHorario() {
        return horario;
    }

    public NodoHorario getPrevHorario() {
        return prevHorario;
    }
    
    public ListaSimple getListainfo() {
        return listainfo;
    }
    
}