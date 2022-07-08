
package listas;


public class Nodo 
{
private String info;
private Nodo nodoSig;

public Nodo(String info)
{
this.info=info;
}

  
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

  
    public Nodo getNodoSig() {
        return nodoSig;
    }

 
    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }


}
