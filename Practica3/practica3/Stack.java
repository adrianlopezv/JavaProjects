
package practica3;


public class Stack extends Lista
{
    public Stack (int nele)
	{
		super("Stack",nele);
	}
	
	public boolean Push(int ele)
	{
		int i;
		if(this.getCuantos()>=this.getNumeroElementos())
		{
			return false;
		}
		else
		{
                    for(i=0;i<this.getCuantos();i++)
                    {
                    this.addElemento(this.getElemento(i),i+1);
                    }
                    this.addElemento(ele, 0);
		return true;	
		}
	}
	
	public int Pop()
	{
	int x,i,j;
	x=this.getElemento(0);
        j=(this.getCuantos()-1);
        for(i=0;i>j;i++)
        {
        this.addElemento(this.getElemento(i+1),i);
        }
        return x;	
	}
}
