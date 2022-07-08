
package nodo;

public class Nodo
{
private String info;
private Nodo nextNodo;

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


    public Nodo getNextNodo() {
        return nextNodo;
    }


    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }

}
