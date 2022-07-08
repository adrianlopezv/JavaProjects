
package proyecto;

import java.util.Arrays;

public class TranspocicionColumnar extends Criptografia implements Matriz
{
      private int r,c,aux;
    private char [][] matriz;
    private String textoplano,cifrado,codice,descifrado;
    private  char fraseaux [],textoplanoaux[],codiceaux[];
    
    public TranspocicionColumnar()
    {
    super("Transpocicion columnar");
    }
    
    public void setMatriz()
    {
        this.setR(r);
        this.setC(c);
          matriz=new char[r][c];
          for(int i=0;i<r;i++)
          {
          for(int j=0;j<c;j++)
          {
          matriz[i][j]='*';
          }
              
          }
    }
    
    public void Cifrar()
    {
    
textoplanoaux = new char[r*c+r-1];
int k=0;
for(int i=0;i<c;i++)
{
for(int j=0;j<r;j++)
{
textoplanoaux[k]=matriz[j][i];
k++;
}
textoplanoaux[k]=' ';
k++;
}
    }
    
    public void Descifrar()
    {
codiceaux = new char[r*c];

int k=0;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
codiceaux[k]=matriz[i][j];
k++;
}
}
aux=k;
}
    

    public void setR(int r) 
    {
        this.r = r;
    }

    public void setC(int c) 
    {
        this.c = c;
    }

    public char[][] getMatriz()
    {
        return matriz;
    }

    public void setMatrizCodice()
    {
         int k=0,i,j;
      for(i=0;i<r;i++)
      {
      for(j=0;j<c;j++)
      {
      matriz[i][j]=codiceaux[k];
      k++;
      if(k>=codiceaux.length)
      {
      j=c;
      i=r;
      }
      }
      }
      
      for(i=0;i<r;i++)
      {
      for(j=0;j<c;j++)
      {
      System.out.print(matriz[i][j]);
      }
      System.out.println();
      }
    }

        public void setMatrizCodificacion()
    {

        int k=0,i,j;

      for(i=0;i<c;i++)
      {
      for(j=0;j<r;j++)
      {
          matriz[j][i]=codiceaux[k];
      k++;
      if(k>=codiceaux.length)
      {
      j=c;
      i=r;
      
      }
    }
    }
    }
    
public String getCodificacion()
{
    cifrado="";
for(int i=0;i<r*c+r-1;i++)
{
cifrado+=""+textoplanoaux[i];
}
        
return cifrado;
}

public String getDecodificacion()
{
        descifrado="";
        int l=codiceaux.length;
        
for(int i=0;i<l;i++)
{
descifrado+=""+codiceaux[i];
}
    
return descifrado;
}

    public void setCodiceaux()
    {
       
        this.codiceaux = mensaje.toCharArray();
    }

 
    public char[] getCodiceaux() {
        return codiceaux;
    }
    
}
