
package lista;
import nodo.tipoNodo.*;
import nodo.Nodo;
public interface Lista 
{
     public void insertarInicio(NodoDoble nodo);
     
     public void insertarFinal(NodoDoble nodo);

public void insertarDespuesde(NodoDoble nodo,NodoDoble referencia);

public void borrarAlInicio();

public void borrarAlFinal();

public void borrarDespuesde(NodoDoble referencia);

public String toString();

public Nodo getNodoRaiz();

     
}
