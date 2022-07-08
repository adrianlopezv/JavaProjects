
package nodo.tipoNodo;
import nodo.Nodo;

public class NodoDoble extends Nodo
{
private Nodo previewNodo;

public NodoDoble(String info)
{
super(info);
}

    public Nodo getPreviewNodo() {
        return previewNodo;
    }

    public void setPreviewNodo(Nodo previewNodo) {
        this.previewNodo = previewNodo;
    }

}
