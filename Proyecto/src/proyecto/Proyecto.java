
package proyecto;
import java.util.Scanner;

public class Proyecto
{

    public static void main(String[] args)
    {
        int op,op1,x;
        Scanner dat=new Scanner(System.in);
        Scanner datstr=new Scanner(System.in);
        String aux;
        do
        {
        System.out.println("Que metodo quieres usar?\n1.-Atabash\n2.-Cesar\n3.-Bellaso(No se desarrollo en esta aplicacion)\n4.-Cifra Playfair"
                + "\n5.-Transposicion Columnar\n6.-Salir");
        op=dat.nextInt();
        
        switch(op)
        {
            case 1:
                System.out.println("Que deseas?\n1.-Codificar\n2.-Descifrar");
                op1=dat.nextInt();
                switch(op1)
                {
                    case 1:
                       
                        System.out.println("Ingresa texto a cifrar");
                        Texto atabash= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)atabash).setCriptografia(new Atabash());
                        Criptografia cripto= ((TextoCifrado)atabash).getCriptografia();
                        cripto.setMensajeOriginal(((TextoCifrado)atabash).getMensaje());
                        ((Atabash)cripto).setAbecedario();
                        ((Atabash)cripto).setAbecedarioModificado(26);
                        ((Atabash)cripto).setAbecedarioMayusculas();
                        ((Atabash)cripto).setAbecedarioModificadoMinusculas(26);
                        System.out.println( ((Atabash)cripto).getAbecedario());
                         System.out.println( ((Atabash)cripto).getAbecedariomodificado());
                        ((TextoCifrado)atabash).setTextoplano(atabash.getMensaje());
                        atabash.setMensaje(((TextoCifrado)atabash).getTextoplano());
                        cripto.setMensaje(atabash.getMensaje());
                        System.out.println(((Atabash)cripto).getMensaje());
                         atabash.QuitarBlancos();
                         cripto.Cifrar();
                         System.out.println(atabash.PasarMayusculas(((Atabash)cripto).getCodificacion()));
                         break;
                         
                    case 2:
                        System.out.println("Ingresa texto a descifrar");
                        Texto atabashdes= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)atabashdes).setCriptografia(new Atabash());
                        Criptografia criptodes= ((TextoCifrado)atabashdes).getCriptografia();
                        criptodes.setMensajeOriginal(((TextoCifrado)atabashdes).getMensaje());
                        ((Atabash)criptodes).setAbecedario();
                        ((Atabash)criptodes).setAbecedarioModificado(26);
                        ((Atabash)criptodes).setAbecedarioMayusculas();
                        ((Atabash)criptodes).setAbecedarioModificadoMinusculas(26);
                        System.out.println( ((Atabash)criptodes).getAbecedario());
                         System.out.println( ((Atabash)criptodes).getAbecedariomodificado());
                        ((TextoCifrado)atabashdes).setTextoplano(atabashdes.getMensaje());
                        atabashdes.setMensaje(((TextoCifrado)atabashdes).getTextoplano());
                        criptodes.setMensaje(atabashdes.getMensaje());
                        System.out.println(((Atabash)criptodes).getMensaje());
                         atabashdes.QuitarBlancos();
                         criptodes.Descifrar();
                         System.out.println(atabashdes.PasarMinusculas(((Atabash)criptodes).getDecodificacion()));
                         break;
                        
                    
                        
                }
                
                
                break;
                
            case 2:
                System.out.println("Que deseas?\n1.-Codificar\n2.-Descifrar");
                op1=dat.nextInt();
                switch(op1)
                {
                    case 1:
                       
                        System.out.println("Ingresa texto a cifrar");
                        Texto cesar= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)cesar).setCriptografia(new Cesar());
                        Criptografia cripto= ((TextoCifrado)cesar).getCriptografia();
                        cripto.setMensajeOriginal(((TextoCifrado)cesar).getMensaje());
                        ((Cesar)cripto).setAbecedario();
                        System.out.println("Ingresa contraseña");
                         x=dat.nextInt();
                        ((Cesar)cripto).setAbecedarioModificado(x);
                        ((Cesar)cripto).setAbecedarioMayusculas();
                        ((Cesar)cripto).setAbecedarioModificadoMinusculas(x);
                        System.out.println( ((Cesar)cripto).getAbecedario());
                         System.out.println( ((Cesar)cripto).getAbecedariomodificado());
                        ((TextoCifrado)cesar).setTextoplano(cesar.getMensaje());
                        cesar.setMensaje(((TextoCifrado)cesar).getTextoplano());
                        cripto.setMensaje(cesar.getMensaje());
                        System.out.println(((Cesar)cripto).getMensaje());
                         cesar.QuitarBlancos();
                         cripto.Cifrar();
                         System.out.println(cesar.PasarMayusculas(((Cesar)cripto).getCodificacion()));
                         break;
                         
                    case 2:
                        System.out.println("Ingresa texto a descifrar");
                        Texto cesardes= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)cesardes).setCriptografia(new Cesar());
                        Criptografia criptodes= ((TextoCifrado)cesardes).getCriptografia();
                        criptodes.setMensajeOriginal(((TextoCifrado)cesardes).getMensaje());
                        ((Cesar)criptodes).setAbecedario();
                         System.out.println("Ingresa contraseña");
                         x=dat.nextInt();
                        ((Cesar)criptodes).setAbecedarioModificado(x);
                        ((Cesar)criptodes).setAbecedarioMayusculas();
                        ((Cesar)criptodes).setAbecedarioModificadoMinusculas(x);
                        System.out.println( ((Cesar)criptodes).getAbecedario());
                         System.out.println( ((Cesar)criptodes).getAbecedariomodificado());
                        ((TextoCifrado)cesardes).setTextoplano(cesardes.getMensaje());
                        cesardes.setMensaje(((TextoCifrado)cesardes).getTextoplano());
                        criptodes.setMensaje(cesardes.getMensaje());
                        System.out.println(((Cesar)criptodes).getMensaje());
                         cesardes.QuitarBlancos();
                         criptodes.Descifrar();
                         System.out.println(cesardes.PasarMinusculas(((Cesar)criptodes).getDecodificacion()));
                         break;
                        
                    
                        
                }
                
                
                break;
                
                
            case 3:
                
                break;
                
            case 4:
                System.out.println("Que deseas?\n1.-Codificar\n2.-Descifrar");
                op1=dat.nextInt();
                switch(op1)
                {
                    case 1:
                        
                       System.out.println("Ingresa texto a cifrar");
                        Texto tc= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)tc).setCriptografia(new Playfair());
                        Criptografia cripto= ((TextoCifrado)tc).getCriptografia();
                        cripto.setMensajeOriginal(((TextoCifrado)tc).getMensaje());
                        System.out.println("Ingresa clave");
                        ((Playfair)cripto).setClave(datstr.nextLine());
                        ((Playfair)cripto).setTextoPlano(((TextoCifrado)tc).getMensaje());
                        System.out.println("\nMatriz:");
                        ((Playfair)cripto).setAbecedario();
                        ((Playfair)cripto).setMatriz();
                        String textoCodificado=((Playfair)cripto).codificar();
                        System.out.println("Texto codificado: "+textoCodificado);   
                        break;
         
         
         
         
         
         
        case 2:
             System.out.println("Ingresa texto a cifrar");
                        Texto tcdes= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)tcdes).setCriptografia(new Playfair());
                        Criptografia criptodes= ((TextoCifrado)tcdes).getCriptografia();
                        criptodes.setMensajeOriginal(((TextoCifrado)tcdes).getMensaje());
                        System.out.println("Ingresa clave");
                        ((Playfair)criptodes).setClave(datstr.nextLine());
                        ((Playfair)criptodes).setTextoPlano(((TextoCifrado)tcdes).getMensaje());
                        System.out.println("\nMatriz:");
                        ((Playfair)criptodes).setAbecedario();
                        ((Playfair)criptodes).setMatriz();
                        String textoCodificado2=((Playfair)criptodes).decodificar();
                        System.out.println("Texto codificado: "+textoCodificado2);   
                        break;
        }

                        break;
               
                
            case 5:
                          System.out.println("Que deseas?\n1.-Codificar\n2.-Descifrar");
                op1=dat.nextInt();
                switch(op1)
                {
                    case 1:
                        System.out.println("Ingresa texto a cifrar");
                        Texto tc= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)tc).setCriptografia(new TranspocicionColumnar());
                        Criptografia cripto= ((TextoCifrado)tc).getCriptografia();
                        cripto.setMensajeOriginal(((TextoCifrado)tc).getMensaje());
                        System.out.println("Ingresa numero de renglones deseados");
                        ((TranspocicionColumnar)cripto).setR(dat.nextInt());
                         System.out.println("Ahora columnas");
                        ((TranspocicionColumnar)cripto).setC(dat.nextInt());
                        ((TranspocicionColumnar)cripto).setMatriz();
                        ((TextoCifrado)tc).setTextoplano(tc.getMensaje());
                         tc.QuitarBlancos();
                        cripto.setMensaje(tc.getMensaje());
                        ((TranspocicionColumnar)cripto).setCodiceaux();
                         ((TranspocicionColumnar)cripto).setMatrizCodice();
                         cripto.Cifrar();
                         System.out.println(tc.PasarMayusculas(((TranspocicionColumnar)cripto).getCodificacion()));

                          
                        break;
                        
                    case 2:
                        System.out.println("Ingresa texto a descifrar");
                        Texto tcdes= new TextoCifrado(datstr.nextLine());
                        ((TextoCifrado)tcdes).setCriptografia(new TranspocicionColumnar());
                        Criptografia criptodes= ((TextoCifrado)tcdes).getCriptografia();
                        criptodes.setMensajeOriginal(((TextoCifrado)tcdes).getMensaje());
                        System.out.println("Ingresa numero de renglones deseados");
                        ((TranspocicionColumnar)criptodes).setR(dat.nextInt());
                         System.out.println("Ahora columnas");
                        ((TranspocicionColumnar)criptodes).setC(dat.nextInt());
                        ((TranspocicionColumnar)criptodes).setMatriz();
                        ((TextoCifrado)tcdes).setTextoplano(tcdes.getMensaje());
                         tcdes.QuitarBlancos();
                        criptodes.setMensaje(tcdes.getMensaje());
                        ((TranspocicionColumnar)criptodes).setCodiceaux();
                         ((TranspocicionColumnar)criptodes).setMatrizCodificacion();
                         criptodes.Descifrar();
                         System.out.println(tcdes.PasarMinusculas(((TranspocicionColumnar)criptodes).getDecodificacion()));
                        
                        break;
                }
                break;
                
            case 6:
                System.out.println("Gracias! vuelva pronto!");
                break; 
            
        }
        
        }while(op!=6);
        
        
    }
    
}
