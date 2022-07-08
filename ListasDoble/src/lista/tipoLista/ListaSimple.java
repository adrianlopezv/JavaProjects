
package lista.tipoLista;
import lista.Lista;
import nodo.tipoNodo.NodoDoble;

public class ListaSimple implements Lista
{
    private NodoDoble nodoRaiz,nodoAnterior;
    
    
public void insertarInicio(NodoDoble nodo)
{
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
nodoAnterior=null;
}
else
{
nodo.setNextNodo(this.nodoRaiz);
nodoRaiz.setPreviewNodo(nodo);
this.nodoRaiz=nodo;
nodoRaiz.setPreviewNodo(null);
}
    
}
 
public void insertarFinal(NodoDoble nodo)
{
NodoDoble nodoAux;
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
nodoRaiz.setPreviewNodo(null);
}
else
{
nodoAux=nodoRaiz;
    while(nodoAux.getNextNodo()!=null)
    {
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    }
    nodoAux.setNextNodo(nodo);
    nodo.setPreviewNodo(nodoAux);
    nodo.setNextNodo(null);
}
    
}

public void insertarDespuesde(NodoDoble nodo,NodoDoble referencia)
{

NodoDoble nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=(NodoDoble)nodoAux.getNextNodo();
boolean b=true;
int b1=0;
if(nodoAux.getInfo().equals(referencia.getInfo()))
{
b=false;
}
else
{
while(!nodoAux.getInfo().equals(referencia.getInfo())&& nodoAux2.getNextNodo()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=(NodoDoble)nodoAux.getNextNodo();
        if(nodoAux.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        }
        }
}

if(nodoAux2.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        b1=1;
        }

if(b1==1)
{
insertarFinal(nodo);
}
else
{
if(b==false)
{
nodo.setNextNodo(nodoAux2);
nodoAux2.setPreviewNodo(nodo);
nodoAux.setNextNodo(nodo);
nodo.setPreviewNodo(nodoAux);
}
else
{
System.out.println("Ese elemento no existe");
}
}
}

public void borrarAlInicio()
{
        if(this.nodoRaiz==null)
{
System.out.println("No hay nada que borrar");
}
        else
        {
            if(nodoRaiz.getNextNodo()==null)
            {
            nodoRaiz=null;
            nodoAnterior=null;
            }
            else
            {
               NodoDoble nodoAux=nodoRaiz;
            nodoRaiz=(NodoDoble)nodoRaiz.getNextNodo();
            nodoAux.setNextNodo(null);
            nodoRaiz.setPreviewNodo(null);
            }
      
        }
   
}

public void borrarAlFinal()
{ 
        if(this.nodoRaiz==null)
{
System.out.println("No hay nada que borrar");
}
        else
        {
            if(nodoRaiz.getNextNodo()==null)
            {
            nodoRaiz=null;
            }
        else
            {
         NodoDoble nodoAux,nodoAux2;
    nodoAux=nodoRaiz;
    while(nodoAux.getNextNodo().getNextNodo()!=null)
    {
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    }
    nodoAux2=(NodoDoble)nodoAux.getNextNodo();
    nodoAux.setNextNodo(null);
    nodoAux2.setPreviewNodo(null);
            }
        }
}

public void borrarDespuesde(NodoDoble referencia)
{
    boolean b=true;
NodoDoble nodoAux,nodoAux2,nodoAux3;
nodoAux=nodoRaiz;
nodoAux2=(NodoDoble)nodoAux.getNextNodo();
if(nodoAux.getInfo().equals(referencia.getInfo()))
{
    borrarAlInicio();
}
else
{
while(!nodoAux2.getInfo().equals(referencia.getInfo())&&nodoAux2.getNextNodo()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=(NodoDoble)nodoAux.getNextNodo();
        if(nodoAux.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        }
if(b==false)
{
nodoAux.setNextNodo(nodoAux2.getNextNodo());
nodoAux3=(NodoDoble)nodoAux2.getNextNodo();
nodoAux3.setPreviewNodo(nodoAux);
nodoAux2.setNextNodo(null);
nodoAux2.setPreviewNodo(null);

}
else
{
System.out.println("Ese elemento no existe");
}
}

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
    NodoDoble nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux!=null)
    {
    listaString+=nodoAux.getInfo()+",";
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    }
    }
return listaString;
}

public NodoDoble getNodoRaiz()
{
return nodoRaiz;
}

 
}
