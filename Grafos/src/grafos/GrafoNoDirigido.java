
package grafos;

public class GrafoNoDirigido implements Grafos {
	private ListaAdyacencia [] listaAdyacencia;
	 private MatrizAdyacencias matrizAdyacencias;
	 public GrafoNoDirigido(int x) {
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
		 boolean m=matrizAdyacencias.AgregarAMat(renglon, columna, peso, b, 2);
		 return m;
	 }
	 public void AgregarLista(int n, int y, char nom) {
		 listaAdyacencia[n].insertarFinal(nom);
		 listaAdyacencia[y].insertarFinal(listaAdyacencia[n].getNodoRaiz().getInfo().charAt(0));
	 }
	public ListaAdyacencia getListaAdyacencia(int x) {
		return listaAdyacencia[x];
	}

	public MatrizAdyacencias getMatrizAdyacencias() {
		return matrizAdyacencias;
	}

        public void MetodoKruskal()
        {
        
        }
}

