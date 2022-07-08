
package transposicion.columnar;
import java.util.Scanner;

public class TransposicionColumnar 
{

    public static void main(String[] args)
    {
        int r,c;
        OperacionesTC operacionestc=new OperacionesTC();
        String frase,f;
        Scanner dat=new Scanner(System.in);
        Scanner datstr=new Scanner(System.in);
       
        System.out.println("Que quiere?\n1.-Cifrar\n2.-Descifrar");
        switch(dat.nextInt())
        {
            case 1: 
                System.out.println("Ingrese el numero de renglones que desea");
      r=dat.nextInt();
      System.out.println("Ingrese el numero de columnas que desea");
      c=dat.nextInt();
      
      operacionestc.setMatriz(r,c);
      
      System.out.println("Ingrese la frase a cifrar");
      
      operacionestc.setTextoPlano(datstr.nextLine());
      
     operacionestc.setMatrizTextoPlano();
     
      operacionestc.getMatrizTextoPlano();
      
      operacionestc.Cifrar();
      
      System.out.println(operacionestc.getCifrado());
      
      break;
            case 2: 
                 System.out.println("Ingrese el numero de renglones que desea");
      r=dat.nextInt();
      System.out.println("Ingrese el numero de columnas que desea");
      c=dat.nextInt();
      
      operacionestc.setMatriz(r,c);
      
       System.out.println("Ingrese la frase a descifrar");
       
       operacionestc.setCodice(datstr.nextLine());
      
     operacionestc.setMatrizCodice();
     
      operacionestc.getMatrizCodice();
      
      operacionestc.Descifrar();
      
      System.out.println(operacionestc.getDescifrado());
                break;
                
        }
       

    }
    
}
