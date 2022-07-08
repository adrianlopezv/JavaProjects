
package practica3;


public class Lista 
{
    private String tipo;
    private int ListaArreglo[];
    private int numeroelementos;
    private int cuantos=0;
    
	public Lista(String tipo,int nele)
	{
	this.tipo=tipo;
	this.numeroelementos=nele;
	ListaArreglo =new int[nele];
	}
	
	public String getTipo()
	{
		return this.tipo;
	}
    
	public void setTip(String Tipo)
	{
	this.tipo=Tipo;	
	}
	
    public boolean addElemento(int X,int pos)
   {
		if(pos>=0 && pos<this.numeroelementos)
		{
			this.ListaArreglo[pos]=X;
			this.cuantos++;
			return true;
		}
    else
        {
        return false;
        }
        
    }
    
    public int getElemento(int pos)
	{
		if(pos>=0 && pos<this.numeroelementos)
		{
			return this.ListaArreglo[pos];
		}
		else
		{
			return -1;
		}
		
	}
	
    public int getNumeroElementos()
    {
    return this.numeroelementos;
    }
    
	public int getCuantos()
	{
		return cuantos;
	}
	
	public void setCuantos(int cuant)
	{
		this.cuantos=cuant;
	}
	
	public boolean esListaLlena()
	{
		if(this.cuantos>=this.cuantos)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean esListaVacia()
	{
		if(this.cuantos<0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
		
	public int EstaElemList(int X)
	{
		int k,p=-1;
		for(k=0;k<this.cuantos;k++)
			if(this.ListaArreglo[k]==X)
			{
				p=1;
			}
		return p;
	}
	
	public void SortLista()
	{
		int i,j,aux;
		 for (i=1; i<this.numeroelementos; i++)
		{
			aux = this.ListaArreglo[i];
         for (j=i-1; j>=0 && this.ListaArreglo[j]>aux; j--)
		 {
              this.ListaArreglo[j+1]=this.ListaArreglo[j];
          }
         this.ListaArreglo[j+1] = aux;
      }
	}

        
	public Lista Union(Lista lista)
	{
	
		
		return lista;
	}
	
	public Lista Interseccion(Lista lista)
	{
		return lista;
	}
	
	public Lista Diferencia(Lista lista)
	{
		return lista;
	}
	
	public String ToString()
	{
		int i;
		String S="";
		for(i=0;i<this.cuantos;i++)
		{
			S+=this.ListaArreglo[i]+",";
		}
		return S;
	}
}
