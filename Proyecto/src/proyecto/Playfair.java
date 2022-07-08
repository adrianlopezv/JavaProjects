
package proyecto;

public class Playfair extends Criptografia implements Matriz {
    private int x,z,y,w;
    private char matriz[][] = new char[5][5];
    private  char [] palabra,palabraaux,espacios,clav,clavaux;
    private char[] abecedario={'A','B','C','D','E','F','G','H','I','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private String textoplano,textoplanoaux,codice="",codiceaux="",clave,claveaux,auxiliar="";
private int r,c,aux;
    private String descifrado;
 
    
    public Playfair()
    {
    super("Playfair");
    }
    
    public void setClave(String clave)
    {
           claveaux=clave;
           
        clave=clave.toUpperCase();
        this.clave=clave.toUpperCase();
        this.claveaux=claveaux.replace(" ","");
        this.claveaux=claveaux.replace('J', 'I');
        claveaux=claveaux.toUpperCase();
        this.clav=claveaux.toCharArray();//Esta es la que nos sirve para sacar la matriz
        this.clavaux=this.clav;
        int b=0,cont=0;//b es bandera
        for(int i=0; i<clavaux.length;i++)
        {
            for(int j=1; j<i && b==0;j++)
            {
                if(clavaux[i]==clavaux[j])
                {
                    b=1;
                }
            }
                if(b==0)
                {
                    this.clav[cont]=this.clavaux[i];
                    cont++;
                }
            b=0;
        }
        
       
    }
    
       public void setTextoPlano(String textoplano)
    {
        
        textoplanoaux=textoplano;
        int i;
        this.z=textoplanoaux.length();
        this.textoplano=textoplano;
        this.palabraaux=textoplano.toCharArray();
        textoplanoaux=this.textoplano.toUpperCase();
        this.textoplanoaux=textoplanoaux.replace(" ","");
        this.textoplanoaux=textoplanoaux.replace('J', 'I'); //Quitamos las J
        //System.out.println("textoplanoaux entra: "+this.textoplanoaux);
        for(i = 0; i<textoplanoaux.length() ;i++)
        {
            if((i+1)!=textoplanoaux.length())
            {
                if(textoplanoaux.charAt(i) ==this.textoplanoaux.charAt(i+1))//Hay letras iguales
                {
                    auxiliar = auxiliar + this.textoplanoaux.charAt(i) + 'X';  //Si los hay meto x entre medio
                }
                if(textoplanoaux.charAt(i)!= this.textoplanoaux.charAt(i+1))
                {
                    this.auxiliar = auxiliar + this.textoplanoaux.charAt(i) + this.textoplanoaux.charAt(i+1); 
                    i++;
                }
            }
        }
        this.x=this.textoplanoaux.length();
        if(x%2 != 0)
        {
            i=this.textoplanoaux.length()-1;
            this.auxiliar = auxiliar + this.textoplanoaux.charAt(i);
            //System.out.println(auxiliar);
            this.textoplanoaux= this.auxiliar;
            this.textoplanoaux=this.textoplanoaux+'X';
        }
        System.out.println("Texto plano aux sale: "+this.textoplanoaux);
        this.x=this.textoplanoaux.length();
    }
       
    public String getTextoPlano()
    {
        return this.textoplano;
    }
    
  public String getClave()
    {
        return clave;
    }
  
    public void setAbecedario()
    {
        //AquÃ­ genero la matriz de playfair
        String texto ="";
        for(int i=0;i<this.clav.length;i++)
        {
            if(texto.indexOf(this.clav[i])==-1 && this.clav[i]!=' ')
            { texto+=this.clav[i];}
        }
        for(int i=0;i<this.abecedario.length;i++)
        {
         if(texto.indexOf(this.abecedario[i])==-1)
         {texto+=this.abecedario[i];}
        }

        this.clave = texto;
     }
    
    public void setMatriz()
    {
        int m;
        int b=0,a=0;
        for(m=0;m<this.clave.length();m++)
        {
            this.matriz[a][b]=this.clave.charAt(m);
            b++;
            if(b==5||b==10||b==15||b==20)
            {
                a++;
                b=0;
            }
        }
         for(int i=0;i<5;i++)
        {
            for(int j=0; j<5;j++)
            {
                System.out.print(this.matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public char[][] getMatriz()
    {
        return this.matriz;
    }
    
    public String codificar()
    {
        String texto;
        String aux="";
        texto=this.textoplanoaux;
        for(int i=0;i<texto.length();i=i+2)
        {
            char letra1,letra2,cod1,cod2;
            int reng1=0,reng2=0,col1=0,col2=0,a=0,b=0;
            letra1=texto.charAt(i);
            letra2=texto.charAt(i+1);
            for(int col=0;col<5 && a!=2 ;col++)
            {
                for(int reng=0;reng<5 && b==0;reng++)
                {
                    //System.out.println("Aqui entro"+aux);
                    if(letra1 == this.matriz[col][reng])
                    {
                        col1=col;
                        reng1=reng;
                        a++;
                    }
                    if(letra2==this.matriz[col][reng])
                    {
                        col2=col;
                        reng2=reng;
                        b=1;
                        a++;
                    }
                }
                b=0;
            }
    
            if(reng1==reng2)
            {
                if(reng1<4)
                {
                    aux=aux+this.matriz[col1+1][reng1];
                }
                if(reng1==4)
                {
                    aux=aux+this.matriz[0][reng1];
                }
                if(reng2<4)
                {
                    aux=aux+this.matriz[col2+1][reng2];
                }
                if(reng2==4)
                {
                    aux=aux+this.matriz[0][reng2];
                }
            }
            if(col1==col2)
            {
                if(col1<4)
                {
                    aux=aux+this.matriz[col1][reng1+1];
                }
                if(col1==4)
                {
                    aux=aux+this.matriz[col1][0];
                }
                if(col2<4)
                {
                    aux=aux+this.matriz[col2][reng2+1];
                }
                if(col2==4)
                {
                    aux=aux+this.matriz[col2][0];
                }
            }
            if(col1!=col2 && reng1!=reng2)
            {
                aux=aux+this.matriz[col1][reng2];
                aux=aux+this.matriz[col2][reng1];
            }
        }
        this.codice=aux;
        return this.codice;
    }
    
    public String decodificar()
    {
        String texto;
        String aux="";
        texto=this.textoplanoaux;
        for(int i=0;i<texto.length();i=i+2)
        {
            char letra1,letra2,cod1,cod2;
            int reng1=0,reng2=0,col1=0,col2=0,a=0,b=0;
            letra1=texto.charAt(i);
            letra2=texto.charAt(i+1);
            for(int col=0;col<5 && a!=2 ;col++)
            {
                for(int reng=0;reng<5 && b==0;reng++)
                {
                    if(letra1 == this.matriz[col][reng])
                    {
                        col1=col;
                        reng1=reng;
                        a++;

                    }
                    if(letra2==this.matriz[col][reng])
                    {
                        col2=col;
                        reng2=reng;
                        b=1;
                        a++;
                    }
                }
                b=0;
            }
            if(reng1==reng2)
            {
                if(reng1>0)
                {
                    aux=aux+this.matriz[col1+1][reng1];
                }
                if(reng1==0)
                {
                    aux=aux+this.matriz[4][reng1];
                }
                if(reng1==4)
                {
                    aux=aux+matriz[col1][0];
                }
                if(reng2>0)
                {
                    aux=aux+this.matriz[col2+1][reng2];
                }
                if(reng2==0)
                {
                    aux=aux+this.matriz[4][reng2];
                }
                if(reng2==4)
                {
                    aux=aux+matriz[col2][0];
                }
            }
            if(col1==col2)
            {
                if(col1>0)
                {
                    aux=aux+this.matriz[col1][reng1+1];
                }
                if(col1==0)
                {
                    aux=aux+this.matriz[col1+1][reng1];
                }
                if(col1==4)
                {
                    aux=aux+matriz[0][reng1];
                }
                if(col2>0)
                {
                    aux=aux+this.matriz[col2][reng2+1];
                }
                if(col2==0)
                {
                    aux=aux+this.matriz[col2+1][reng2];
                }
                  if(col2==4)
                {
                    aux=aux+matriz[0][reng2];
                }
            }
            if(col1!=col2 && reng1!=reng2)
            {
                aux=aux+this.matriz[col1][reng2];
                aux=aux+this.matriz[col2][reng1];
            }
        }
        this.codice=aux;
     
        return this.codice;
    }

    public void Cifrar() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void Descifrar() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setMatrizCodice() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
