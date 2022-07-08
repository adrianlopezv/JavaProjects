
package listascirculares;


public class ListaC
{
private Nodo nodoRaiz;
private Nodo nodoFinal;

public void insertarInicio(Nodo nodo)
{
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
this.nodoFinal=nodoRaiz;
}
else
{
nodo.setNodoSig(this.nodoRaiz);
this.nodoRaiz=nodo;
nodoFinal.setNodoSig(nodo);
} 
}

public void insertarFinal(Nodo nodo)
{
Nodo nodoAux;
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
nodoFinal=nodoRaiz;
}
else
{
nodoAux=nodoRaiz;
if(nodoRaiz==nodoFinal)
{
nodoRaiz.setNodoSig(nodo);
this.nodoFinal=nodo;
    nodoFinal.setNodoSig(nodoRaiz);
}
else
{
while(nodoAux.getNodoSig()!=nodoRaiz)
    {
    nodoAux=nodoAux.getNodoSig();
    }
    nodoAux.setNodoSig(nodo);
    this.nodoFinal=nodo;
    nodoFinal.setNodoSig(nodoRaiz);
}
    
}
}

public void insertarDespuesde(Nodo nodo,Nodo referencia)
{
     boolean b=true;
   
    Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
while(!nodoAux.getInfo().equals(referencia.getInfo())&& !nodoAux2.getInfo().equals(nodoRaiz.getInfo()))
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
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
nodo.setNodoSig(nodoAux2);
nodoAux.setNodoSig(nodo);
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
           Nodo nodoAux=nodoRaiz;
nodoRaiz=nodoRaiz.getNodoSig();
nodoAux.setNodoSig(null);
nodoFinal.setNodoSig(nodoRaiz);
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
             Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux.getNodoSig().getNodoSig()!=nodoRaiz)
    {
    nodoAux=nodoAux.getNodoSig();
    } 
    nodoFinal=nodoAux;
    nodoFinal.setNodoSig(nodoRaiz);
            }
           
   
        }
   
}

public Nodo getNodoRaiz()
{
return nodoRaiz;
}

public void borrarDespuesde(Nodo referencia)
{
    boolean b=true;
     if(nodoRaiz==nodoFinal)
            {
            nodoRaiz=null;
            nodoFinal=null;
            }
     else
     {
             Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
while(!nodoAux2.getInfo().equals(referencia.getInfo())&& nodoAux2!=nodoRaiz)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
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
nodoAux.setNodoSig(nodoAux2.getNodoSig());
nodoAux2.setNodoSig(null);
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
         Nodo nodoAux;
    nodoAux=nodoRaiz;
    
    while(!nodoAux.getNodoSig().getInfo().equals(nodoFinal.getNodoSig().getInfo()))
    {
    listaString+=nodoAux.getInfo()+",";
    nodoAux=nodoAux.getNodoSig();
    }
    listaString+=nodoFinal.getInfo();
        }
  
    }
return listaString;
}

}
