
package manejoarbol;

public class ArbolBinario 
{
     private boolean valid=false;
     private  Nodo nodoaux,nodoAux2;
    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public boolean esArbolVacio()
    {
    if(this.raiz==null)
    {
    return true;
    }
    else
    {
    return false;
    }
    }
    
    public Nodo insertar(Nodo nodo,String info)
    {
        if(nodo==null)
        {
        nodo=new NodoDoble(info);
        }
       else
        {
        if(Integer.parseInt(info)<Integer.parseInt(nodo.getInfo()))
        {
           ((NodoDoble)nodo).setNodoPreview(insertar(((NodoDoble)nodo).getNodoPreview(),info));
        }
        else
        {
        ((NodoDoble)nodo).setNodoNext(insertar(((NodoDoble)nodo).getNodoNext(),info));
        }
        }
       
    return nodo;
    }

    public void recorridoPreorden(Nodo nodo)
    {
    if(nodo!=null)
    {
    System.out.print(nodo.getInfo()+", ");
    if(((NodoDoble)nodo).getNodoPreview()!=null)
    {
    recorridoPreorden(((NodoDoble)nodo).getNodoPreview());
    }
    if(nodo.getNodoNext()!=null)
    {
    recorridoPreorden(((NodoDoble)nodo).getNodoNext());
    }
    }
    
    }

 public void recorridoInorden(Nodo nodo)
    {
    if(nodo!=null)
    {
    
    if(((NodoDoble)nodo).getNodoPreview()!=null)
    {
    recorridoInorden(((NodoDoble)nodo).getNodoPreview());
    }
    System.out.print(nodo.getInfo()+", ");
    if(nodo.getNodoNext()!=null)
    {
    recorridoInorden(((NodoDoble)nodo).getNodoNext());
    }
    
    }
    
    }

  public void recorridoPostorden(Nodo nodo)
    {
    if(nodo!=null)
    {
    
    if(((NodoDoble)nodo).getNodoPreview()!=null)
    {
    recorridoPreorden(((NodoDoble)nodo).getNodoPreview());
    }
    if(nodo.getNodoNext()!=null)
    {
    recorridoPreorden(((NodoDoble)nodo).getNodoNext());
    }
    System.out.print(nodo.getInfo()+", ");
    }
    
    }
  
  public  boolean busqueda(Nodo nodo, String infobusqueda,int i)
  {
     
      if(nodo!=null)
    {
        if(Integer.parseInt(infobusqueda)==Integer.parseInt(nodo.getInfo()))
        {
        System.out.println("El elemento esta en el nivel "+ i);
        valid=true;
        }
        else
        {
            if(Integer.parseInt(infobusqueda)<Integer.parseInt(nodo.getInfo()))
            {
            busqueda(((NodoDoble)nodo).getNodoPreview(),infobusqueda,i+1);
            }
            else
            {
            busqueda(((NodoDoble)nodo).getNodoNext(),infobusqueda,i+1);
            }
        }
    }
      else
      {
      System.out.println("No hay elementos en la lista o no se encuentra el elemento que buscas");
      }
      return valid;
  }

  public void borrado(Nodo nodo,String infobusqueda,Nodo nodoAux,int direccion)
  {
 
      if(nodo!=null)
    {
        if(Integer.parseInt(infobusqueda)==Integer.parseInt(nodo.getInfo()))
        {
            if(nodo.getNodoNext()==null && ((NodoDoble)nodo).getNodoPreview()==null)
            {
            valid=true;
            switch(direccion)
            {
                case 0:
                    nodo=null;
                    break;
                    
                case 1:
                    ((NodoDoble)nodoAux).setNodoPreview(null);
                    break;
                    
                case 2:
                    ((NodoDoble)nodoAux).setNodoNext(null);
                    break;    
            }
            }
        else
            {
                
            if(((NodoDoble)nodo).getNodoPreview()==null && nodo.getNodoNext()!=null )
                {
                    nodoAux=nodo;
                    nodoAux2=nodoAux.getNodoNext();
                   while(((NodoDoble)nodoAux2).getNodoPreview()!=null)
                   {
                   nodoAux=nodoAux2;
                   nodoAux2=((NodoDoble)nodoAux2).getNodoPreview();
                   }
                      if(nodoAux2.getNodoNext()==null)
                      {
                            System.out.println("Si entró");
                      nodo.setInfo(nodoAux2.getInfo());
                      ((NodoDoble)nodoAux).setNodoPreview(null);
                      }
                      else
                      {
                      nodo.setInfo(nodoAux2.getInfo());
                      ((NodoDoble)nodoAux).setNodoPreview(nodoAux2.getNodoNext());
                      ((NodoDoble)nodoAux2).setNodoNext(null);
                      }
                }
            else
            {
            if((((NodoDoble)nodo).getNodoPreview()!=null && nodo.getNodoNext()==null )||(nodo.getNodoNext()!=null && ((NodoDoble)nodo).getNodoPreview()!=null))
                {
                    nodoAux=nodo;
                    nodoAux2=((NodoDoble)nodoAux).getNodoPreview();
                   while(((NodoDoble)nodoAux2).getNodoNext()!=null)
                   {
                   nodoAux=nodoAux2;
                   nodoAux2=((NodoDoble)nodoAux2).getNodoNext();
                   }
                      if(((NodoDoble)nodoAux2).getNodoPreview()==null)
                      {
                            System.out.println("Si entró");
                      nodo.setInfo(nodoAux2.getInfo());
                      ((NodoDoble)nodoAux).setNodoPreview(null);
                      }
                      else
                      {
                      nodo.setInfo(nodoAux2.getInfo());
                      ((NodoDoble)nodoAux).setNodoNext(nodoAux2.getNodoNext());
                      ((NodoDoble)nodoAux2).setNodoPreview(null);
                      }
                }
            }
            }
        }
        else
        {
            if(Integer.parseInt(infobusqueda)<Integer.parseInt(nodo.getInfo()))
            {
                direccion=1;
                nodoAux=nodo;
            borrado(((NodoDoble)nodo).getNodoPreview(),infobusqueda,nodoAux,direccion);
            }
            else
            {
                direccion=2;
                nodoAux=nodo;
            borrado(((NodoDoble)nodo).getNodoNext(),infobusqueda,nodoAux,direccion);
            }
        }
    }
  }
  
}
