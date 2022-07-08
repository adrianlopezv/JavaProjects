
package practica3;

public class Queue extends Lista
{
    public Queue(int nele)
	{
		super("Queue",nele);
	}
	
	public boolean Push(int ele)
	{
            if(this.esListaLlena()==true)
                    {
                    return false;
                    }
            else 
            {
               this.addElemento(ele, this.getCuantos());
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
