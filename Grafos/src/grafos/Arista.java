
package grafos;

public class Arista
{
 private int peso;
 private NodoSimple inicio;
 private NodoSimple fin;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public NodoSimple getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple inicio) {
        this.inicio = inicio;
    }

    public NodoSimple getFin() {
        return fin;
    }

    public void setFin(NodoSimple fin) {
        this.fin = fin;
    }
    
}
