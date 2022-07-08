package nodo.tipoNodo;
import nodo.Nodo;

public class NodoHorario extends Nodo {
    
    protected String horario;
    protected NodoInfo info;
    protected NodoHorario prevHorario;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    
    public NodoInfo getInfo() {
        return info;
    }

    public void setInfo(NodoInfo info) {
        this.info = info;
    }

    public NodoHorario getPrevHorario() {
        return prevHorario;
    }

    public void setPrevHorario(NodoHorario prevHorario) {
        this.prevHorario = prevHorario;
    }

}

