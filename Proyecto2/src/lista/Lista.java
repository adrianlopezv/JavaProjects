
package lista;
import nodo.Nodo;

public interface Lista 
{
    public void insertarInicio(Nodo nodo);
     
     public void insertarFinal(Nodo nodo);

public void insertarDespuesDe(Nodo nodo,Nodo referencia);

public void borrarAlInicio();

public void borrarAlFinal();

public void borrarDespuesDe(Nodo referencia);

public String toString();
}
