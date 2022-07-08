
package grafos;
public class ListaAdyacencia {
	 private NodoSimple nodoRaiz;

	 public ListaAdyacencia(char nombre)
	 {
	 nodoRaiz=new NodoSimple(Character.toString(nombre));
	 }
	public void insertarFinal(char nodo)
	{ 
	NodoSimple nodoAux;
	NodoSimple nodoinsertar= new NodoSimple(null);
	if(this.nodoRaiz==null)
	{
	this.nodoRaiz.setInfo(Character.toString(nodo));
	}
	else
	{ 
	nodoAux=nodoRaiz;
	    while(nodoAux.getNodoSig()!=null)
	    {
	    nodoAux=nodoAux.getNodoSig();
	    }
	    nodoinsertar.setInfo(Character.toString(nodo)); 
	    nodoAux.setNodoSig(nodoinsertar);
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
	         NodoSimple nodoAux;
	    nodoAux=nodoRaiz;
	    while(nodoAux.getNodoSig().getNodoSig()!=null)
	    {
	    nodoAux=nodoAux.getNodoSig();
	    }
	    nodoAux.setNodoSig(null);
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
	    NodoSimple nodoAux;
	    nodoAux=nodoRaiz;
	    while(nodoAux!=null)
	    {
	    listaString+=nodoAux.getInfo()+",";
	    nodoAux=nodoAux.getNodoSig();
	    }
	    }
	return listaString;
	}

	public NodoSimple getNodoRaiz()
	{
	return nodoRaiz;
	}

	     
}
