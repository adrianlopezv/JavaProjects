
package manejoarbol;


public class NodoDoble extends Nodo
{
private Nodo nodoPreview;

public NodoDoble(String info)
{
super(info);
}

    public Nodo getNodoPreview() {
        return nodoPreview;
    }


    public void setNodoPreview(Nodo nodoPreview) {
        this.nodoPreview = nodoPreview;
    }



}
