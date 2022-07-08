
package listas;


public class Lista
{
private Nodo nodoRaiz;

public void insertarInicio(Nodo nodo)
{
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
}
else
{
nodo.setNodoSig(this.nodoRaiz);
this.nodoRaiz=nodo;
}
    
}

public void insertarFinal(Nodo nodo)
{
Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux.getNodoSig()!=null)
    {
    nodoAux=nodoAux.getNodoSig();
    }
}

public void insertarDespuesde(Nodo nodo,Nodo referencia)
{

}

public String toString()
{
    String listaString="";
    if(this.nodoRaiz==null)
    {
    listaString="lista Vacia";
    }
    else
    {
    Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux!=null)
    {
    listaString+=nodoAux.getInfo()+",";
    nodoAux=nodoAux.getNodoSig();
    }
    }
return listaString;
}

}
