
package lista.tipoLista;
import lista.Lista;
import nodo.Nodo;
import nodo.tipoNodo.NodoInfo;
import java.util.Scanner;


public class ListaSimple implements Lista
{
    NodoInfo nodoRaiz;
    
    public void insertarInicio(Nodo nodo)
    {
        NodoInfo nodoAux=nodoRaiz;
        
        for(int i=0;i<8;i++)
        {
       nodoAux.setSala("Vacante");
       nodoAux.setDoctor("Vacante");
       nodoAux.setPaciente("Vacante");
       nodoAux=(NodoInfo)nodoAux.getNextNodo();
        }
    }

    public void insertarFinal(Nodo nodo)
    {
        //No existe
    }

    public void borrarAlInicio() 
    {
    //No existe
    }

    public void borrarAlFinal() 
    {
    //No existe
    }
    
public void insertarDespuesDe(Nodo nodo, Nodo referencia) 
    {
        Scanner data =new Scanner(System.in);
        Scanner datastr =new Scanner(System.in);
        int opcion;
    NodoInfo nodoAux,nodoAux2;
    nodoAux=nodoRaiz;
    System.out.println("Que quieres buscar?\n1.-Sala\2.-Doctor\3.-Paciente");
    opcion=data.nextInt();
    switch(opcion)
    {
        case 1:
            
            break;
            
        case 2:
            
            break;
            
        case 3:
            
            break;
            
        default:
            
            break;
    }
    


    }
 public void borrarDespuesDe(Nodo referencia) 
    {
    boolean b=true;
Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
if(nodoAux.getInfo().equals(referencia.getInfo()))
{
    nodoRaiz=nodoAux2;
nodoAux=null;
}
else
{
while(!nodoAux2.getInfo().equals(referencia.getInfo())&&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfo().equals(referencia.getInfo()))
        {
        b=false;
        }
if(b==false)
{
nodoAux.setNodoSig(nodoAux2.getNodoSig());
nodoAux2.setNodoSig(null);
}
else
{
System.out.println("Ese elemento no existe");
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
    Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux!=null)
    {
    listaString+=nodoAux.getInfo()+",";
    nodoAux=nodoAux.getNodoSig();
    }
    }
return listaString;
}

public Nodo getNodoRaiz()
{
return nodoRaiz;
}

    }

    public String toString()
    {
    return "PIOUIGYFUTR";
    }
}
