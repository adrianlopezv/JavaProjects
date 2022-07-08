package nodo;

public class Nodo {
    protected Nodo nextNodo;
	
    public void setNextNodo(Nodo nodo){
	this.nextNodo = nodo;
    }
    
    public Nodo getNextNodo(){
	return this.nextNodo;
    }
    
}