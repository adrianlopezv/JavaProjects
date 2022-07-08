
package grafos;

public class GrafoDirigido implements Grafos {
    
	private ListaAdyacencia [] listaAdyacencia;
	 private MatrizAdyacencias matrizAdyacencias;
         
	 public GrafoDirigido(int x) {
		 matrizAdyacencias = new MatrizAdyacencias(x);
			listaAdyacencia= new ListaAdyacencia[x];
			char nombre='A';
			for(int w=0;w<x;w++)
	        {
	        listaAdyacencia[w]=new ListaAdyacencia(nombre); 
	        NodoSimple nodo=new NodoSimple(Character.toString(nombre));
	        nombre++; 
	        }
	 }
	 public boolean AgregarAMat(int renglon, int columna, int peso,int b, int opc) {
		 boolean m=matrizAdyacencias.AgregarAMat(renglon, columna, peso, b, 1);
		 return m;
	 }
	 public void AgregarLista(int n, int y, char nom) {
		 listaAdyacencia[n].insertarFinal(nom);
	 }
	public ListaAdyacencia getListaAdyacencia(int x) {
		return listaAdyacencia[x];
	}
	public MatrizAdyacencias getMatrizAdyacencias() {
		return matrizAdyacencias;
	}
        
        public boolean MetodoFloyd(GrafoDirigido grafo2,int x,char nodoinicio,char nodofinal)
    {
        char[]nombres=new char[x];
        int bandera=0,y=0,q=0;
        MatrizAdyacencias matrizadyacenciascopia=new MatrizAdyacencias(x);
        matrizadyacenciascopia=grafo2.getMatrizAdyacencias();
         char matriznombres[][]=new char[x][x];
         char nombre='A';
         
         for(int j=0;j<x;j++)
         {
         nombres[j]=nombre;
         nombre++;
         }
         while(nodoinicio!=nombres[y]&&y<x-1)
                   { 
                       y++;
                   }
                   if(nodoinicio!=nombres[y])
                   { 
                   System.out.println("Nodo inicio no existe");
                   return false;
                   }
                   else
                   {
                       
                   while(nodofinal!=nombres[q]&&q<x-1)
                   { 
                       q++;
                   }
                   if(nodofinal!=nombres[q])
                   {
                   System.out.println("Nodo fin no existe");
                   return false;
                   }
                        else
                        {
                          for(int i=0;i<x;i++)
                            {
                             nombre='A';
                             for(int j=0;j<x;j++)
                                {
                                   matriznombres[i][j]=nombre;
                                    nombre++;
                                }
                            }
                          for(int i=0;i<x;i++)
                            {
                               matrizadyacenciascopia.AgregarAMat(i, i, -10,bandera,1);
                            }
                          bandera=1;
                          
                          for (int k = 0; k < x; k++)
                          {
                            for (int i = 0; i < x; i++)
                            {
                               for (int j = 0; j < x; j++)
                               {

                                 if (matrizadyacenciascopia.Regresarvalor(i,k) + matrizadyacenciascopia.Regresarvalor(k,j)<
                                 matrizadyacenciascopia.Regresarvalor(i,j) && matrizadyacenciascopia.Regresarvalor(i,k)!=-10 
                                && matrizadyacenciascopia.Regresarvalor(k,j)!=-10)
                                     {
                                        matrizadyacenciascopia.AgregarAMat(i, j,matrizadyacenciascopia.Regresarvalor(i, k)
                                        + matrizadyacenciascopia.Regresarvalor(k, j),bandera,1) ;
                                        matriznombres[i][j]=matriznombres[i][k];
                                	
                                     }
                                }
                            }
    
                        }
                         System.out.println("Matriz de pesos");
                         System.out.println(matrizadyacenciascopia.toString());
                         System.out.println("Matriz de recorridos");
                         for(int w=0;w<x;w++)
                            {
                                for(int t=0;t<x;t++)
                                {
                                    System.out.print(matriznombres[w][t]);
                                 }
                             System.out.println();
                            }
       
                            int bandera1=0,peso=matrizadyacenciascopia.Regresarvalor(y, q);
                            String rutaoptima=Character.toString(nodoinicio);
                            while(bandera1==0)
                            {
                            if(matriznombres[y][q]==nodofinal)
                            {
                            rutaoptima+=", "+nodofinal;
                            bandera1=1;
                            }
                            else
                            {
                            rutaoptima+=", "+matriznombres[y][q];
                            nodoinicio=matriznombres[y][q];
                            y=0;
                            while(nodoinicio!=nombres[y]&&y<x-1)
                             { 
                                y++;
                             }
                            }
                            }
       
                    System.out.println("La ruta optima es: \n"+rutaoptima+
                    "\nCon un peso de: "+peso);
                    return true;
                        }
                   }
        
    }
}

