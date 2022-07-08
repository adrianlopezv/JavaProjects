package nodo.tipoNodo;
import nodo.Nodo;

public class NodoInfo extends Nodo{
    protected String paciente;	
    protected String doctor;
    protected String sala;

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPaciente() {
        return paciente;
    }
    
    public String getDoctor() {
        return doctor;
    }

    public String getSala() {
        return sala;
    }
    
}