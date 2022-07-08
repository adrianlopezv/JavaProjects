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
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
}
else
{
nodoAux=nodoRaiz;
    while(nodoAux.getNodoSig()!=null)
    {
    nodoAux=nodoAux.getNodoSig();
    }
    nodoAux.setNodoSig(nodo);
}
    
}

public void insertarDespuesde(Nodo nodo,Nodo referencia)
{

Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
boolean b=true;
int b1=0;
while(!nodoAux.getInfo().equals(referencia.getInfo())&& nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfo().equals(referencia.getInfo()))
        {
        b=false;
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
nodo.setNodoSig(nodoAux2);
nodoAux.setNodoSig(nodo);
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
            if(nodoRaiz.getNodoSig()==null)
            {
            nodoRaiz=null;
            }
            else
            {
               Nodo nodoAux=nodoRaiz;
nodoRaiz=nodoRaiz.getNodoSig();
nodoAux.setNodoSig(null);
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
            if(nodoRaiz.getNodoSig()==null)
            {
            nodoRaiz=null;
            }
        else
            {
         Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux.getNodoSig().getNodoSig()!=null)
    {
    nodoAux=nodoAux.getNodoSig();
    }
    nodoAux.setNodoSig(null);
            }
        }
}

public void borrarDespuesde(Nodo referencia)
{
    boolean b=true;
Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
if(nodoAux.getInfo().equals(referencia.getInfo()))
{
    nodoRaiz=nodoAux2;
nodoAux=null;
}
else
{
while(!nodoAux2.getInfo().equals(referencia.getInfo())&&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
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
nodoAux.setNodoSig(nodoAux2.getNodoSig());
nodoAux2.setNodoSig(null);
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

public Nodo getNodoRaiz()
{
return nodoRaiz;
}

}
