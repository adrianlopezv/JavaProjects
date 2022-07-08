
package grafos;

public class NodoSimple
{
    private String info;
private NodoSimple nodoSig;

public NodoSimple(String info){
this.info=info;
}

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoSimple getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(NodoSimple nodoSig) {
        this.nodoSig = nodoSig;
    }

}
