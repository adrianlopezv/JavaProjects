
package manejoarbol;

public class Nodo {
    private Nodo nodoNext;
    private String info;
    
    public Nodo(String info)
    {
    this.info=info;
    }

    public Nodo getNodoNext() {
        return nodoNext;
    }

    public void setNodoNext(Nodo nodoNext) {
        this.nodoNext = nodoNext;
    }

    public String getInfo() {
        return info;
    }

   
    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
