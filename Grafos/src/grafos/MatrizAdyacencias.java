
package grafos;

public class MatrizAdyacencias {
	   private int [][] matriz;
	   private int tamaño;
	   
	   public MatrizAdyacencias(int lado)
	   {
	       this.tamaño=lado;
	   matriz=new int [lado][lado];
	   
	   for(int i=0;i<lado;i++)
	   {
	       for(int j=0;j<lado;j++)
	       {
	       matriz[i][j]=1000;
	       }
	   }
	   }
	   
	    public boolean AgregarAMat(int renglon, int columna, int peso,int b, int opc)
	    {
	    	if(opc==1) {
	        if(b==0)
	        {
	         if(matriz[renglon][columna]==1000)
	        {
	        matriz[renglon][columna]=peso;
	        return true;
	        }
	    else
	        {
	        System.out.println("Aqui ya hay una conexion");
	        return false;
	        }
	        }
	       else
	        {
	        matriz[renglon][columna]=peso;
	        return true;
	        }
	    	}else {
	    		if(b==0)
		        {
		         if(matriz[renglon][columna]==1000)
		        {
		        
		        matriz[renglon][columna]=peso;
		        matriz[columna][renglon]=peso;
		        return true;
		        }
		    else
		        {
		        System.out.println("Aqui ya hay una conexion");
		        return false;
		        }
		        }
		       else
		        {
		    	
		        matriz[renglon][columna]=peso;
		        matriz[columna][renglon]=peso;
		        return true;
		        }
	    	}
	        
	    }
	     public int Regresarvalor(int renglon, int columna)
	    {
	        return matriz[renglon][columna];
	        
	    }
	    
	    public String toString()
	    {
	    String MatrizString="";
	    NodoSimple nodoAux;
	    for(int i=0;i<tamaño;i++)
	   {
	       for(int j=0;j<tamaño;j++)
	       {   
	       MatrizString+=Integer.toString(matriz[i][j])+"\t";
	       }
	       MatrizString+="\n";
	   }
	return MatrizString;
	    }
	    
}
