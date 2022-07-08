
package transposicion.columnar;

import java.util.Arrays;

public class OperacionesTC 
{
    private int r,c;
    private char [][] matriz;
    private String textoplano,cifrado,codice;
    private  char fraseaux [],textoplanoaux[],codiceaux[];
     
    public void setMatriz(int r,int c)
    {
        this.r=r;
        this.c=c;
          matriz=new char[r][c];
    }

    public void setCodice(String f)
    {
    this.codice=f;
    f=f.toUpperCase();
    f=f.replace(" ","");
    codiceaux=f.toCharArray();
    }
   
    public void setTextoPlano(String f)
    {
      
    this.textoplano=f;
     f=f.toUpperCase(); 
      f=f.replace(" ","");
      fraseaux=f.toCharArray();
    }

    public void setMatrizCodice()
    {
    int k=0,i,j;
      for(i=0;i<c;i++)
      {
      for(j=0;j<r;j++)
      {
      matriz[j][i]=codiceaux[k];
      k++;
      }
    }
    }
    
    public void setMatrizTextoPlano()
{

      int k=0,i,j;
      for(i=0;i<r;i++)
      {
      for(j=0;j<c;j++)
      {
      matriz[i][j]=fraseaux[k];
      k++;
      }
      }
}

   public void getMatrizCodice()
   {
   for(int i=0;i<r;i++)
      {
      for(int j=0;j<c;j++)
      {
      System.out.print(matriz[i][j]);
      }
      System.out.println();
      }
   }
    
   public void getMatrizTextoPlano()
    {
          for(int i=0;i<r;i++)
      {
      for(int j=0;j<c;j++)
      {
      System.out.print(matriz[i][j]);
      }
      System.out.println();
      }
    }

public void Descifrar()
{
int l=codice.length()+1;
codiceaux = new char[l];
int k=-1;
for(int i=0;i<r;i++)
{
    k++;
for(int j=0;j<c;j++)
{
codiceaux[k]=matriz[i][j];
k++;
}
if(i!=r-1)
{
codiceaux[k]=' ';
}
}
}
   
public void Cifrar()
{
int l=textoplano.length()+1;
textoplanoaux = new char[l];
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

public String getDescifrado()
{
int l=this.codice.length()+1;
this.codice="";
for(int i=0;i<l;i++)
{
this.codice+=codiceaux[i];
}
this.codice=this.codice.toLowerCase();
return this.codice;
}

public String getCifrado()
{
    cifrado="";
for(int i=0;i<textoplano.length()+1;i++)
{
cifrado+=""+textoplanoaux[i];
}
return cifrado;
}


}
