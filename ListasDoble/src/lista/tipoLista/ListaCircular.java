package lista.tipoLista;
import lista.Lista;
import nodo.Nodo;
import nodo.tipoNodo.NodoDoble;
public class ListaCircular implements Lista
{
    private NodoDoble nodoRaiz;
private NodoDoble nodoFinal;
private NodoDoble nodoAnterior;

public void insertarInicio(NodoDoble nodo)
{
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
this.nodoFinal=nodoRaiz;
}
else
{
    nodoRaiz.setPreviewNodo(nodo);
nodo.setNextNodo(this.nodoRaiz);
this.nodoRaiz=nodo;
nodoFinal.setNextNodo(nodoRaiz);
nodoRaiz.setPreviewNodo(nodoFinal);
} 
}

public void insertarFinal(NodoDoble nodo)
{
NodoDoble nodoAux;
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
nodoFinal=nodoRaiz;
this.nodoAnterior=nodoFinal;
}
else
{
nodoAux=nodoRaiz;
if(nodoRaiz==nodoFinal)
{
nodoRaiz.setNextNodo(nodo);
this.nodoFinal=nodo;
    nodoFinal.setNextNodo(nodoRaiz);
    nodoRaiz.setPreviewNodo(nodoFinal);
    nodoFinal.setPreviewNodo(nodoRaiz);
}
else
{
while(nodoAux.getNextNodo()!=nodoRaiz)
    {
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    }
    nodoAux.setNextNodo(nodo);
    this.nodoFinal=nodo;
    nodoFinal.setPreviewNodo(nodoAux);
    nodoFinal.setNextNodo(nodoRaiz);
    nodoFinal.setPreviewNodo(nodoFinal);
}
    
}
}

public void insertarDespuesde(NodoDoble nodo,NodoDoble referencia)
{
     boolean b=true;
   
    NodoDoble nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=(NodoDoble)nodoAux.getNextNodo();
if(nodoAux2.getInfo().equals(referencia.getInfo()))
{
insertarFinal(nodo);
}
else
{
while(!nodoAux.getInfo().equals(referencia.getInfo())&& !nodoAux2.getInfo().equals(nodoRaiz.getInfo()))
        {
        nodoAux=nodoAux2;
        nodoAux2=(NodoDoble)nodoAux.getNextNodo();
        if(nodoAux2.getInfo().equals(nodoFinal.getInfo()))
        {
        b=false;
        }
        }
if(b==false)
{
System.out.println("Ese elemento no existe");
}
else
{
if(nodoAux.getInfo().equals(nodoFinal.getInfo()))
{
insertarFinal(nodo);
}
else
{
nodo.setNextNodo(nodoAux2);
nodoAux.setNextNodo(nodo);
nodoAux2.setPreviewNodo(nodo);
nodo.setPreviewNodo(nodoAux);
}
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
         if(nodoRaiz==nodoFinal)
            {
            nodoRaiz=null;
            nodoFinal=null;
            }
        else
         {
           NodoDoble nodoAux=nodoRaiz;
nodoRaiz=(NodoDoble)nodoRaiz.getNextNodo();
nodoAux.setNextNodo(null);
nodoAux.setPreviewNodo(null);
nodoFinal.setNextNodo(nodoRaiz);
nodoRaiz.setPreviewNodo(nodoFinal);
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
            if(nodoRaiz==nodoFinal)
            {
            nodoRaiz=null;
            nodoFinal=null;
            }
        else
            {
             NodoDoble nodoAux,nodoAux2;
    nodoAux=nodoRaiz;
    while(nodoAux.getNextNodo().getNextNodo()!=nodoRaiz)
    {
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    } 
    nodoAux2=(NodoDoble)nodoAux.getNextNodo();
    nodoFinal=nodoAux;
    nodoFinal.setNextNodo(nodoRaiz);
    nodoRaiz.setPreviewNodo(nodoFinal);
    nodoAux2.setNextNodo(null);
    nodoAux2.setPreviewNodo(null);
            }
           
   
        }
   
}

public NodoDoble getNodoRaiz()
{
return nodoRaiz;
}

public void borrarDespuesde(NodoDoble referencia)
{
    boolean b=true;
     if(nodoRaiz==nodoFinal)
            {
            nodoRaiz=null;
            nodoFinal=null;
            }
     else
     {
             NodoDoble nodoAux,nodoAux2,nodoAux3;
nodoAux=nodoRaiz;
nodoAux2=(NodoDoble)nodoAux.getNextNodo();
while(!nodoAux2.getInfo().equals(referencia.getInfo())&& nodoAux2!=nodoRaiz)
        {
        nodoAux=nodoAux2;
        nodoAux2=(NodoDoble)nodoAux.getNextNodo();
        if(nodoAux2.getInfo().equals(nodoFinal.getInfo()))
        {
        b=false;
        }
        }
if(b==false)
{
System.out.println("Ese elemento no existe");
}
else
{
if(nodoAux.getInfo().equals(nodoFinal.getInfo()))
{
borrarAlInicio();
}
else
{
    nodoAux3=(NodoDoble)nodoAux2.getNextNodo();
    nodoAux.setNextNodo(nodoAux3);
nodoAux3.setPreviewNodo(nodoAux);
nodoAux2.setNextNodo(null);
nodoAux2.setPreviewNodo(null);
}
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
        if(nodoRaiz.getInfo().equals(nodoFinal.getInfo()))
        {
        listaString+=nodoRaiz.getInfo()+",";
        }
        else
        {
         NodoDoble nodoAux;
    nodoAux=nodoRaiz;
    
    while(!nodoAux.getNextNodo().getInfo().equals(nodoFinal.getNextNodo().getInfo()))
    {
    listaString+=nodoAux.getInfo()+",";
    nodoAux=(NodoDoble)nodoAux.getNextNodo();
    }
    listaString+=nodoFinal.getInfo();
        }
  
    }
return listaString;
}

    
 

}
