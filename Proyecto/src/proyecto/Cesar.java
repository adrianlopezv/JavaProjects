
package proyecto;

public class Cesar extends Criptografia implements Arreglos
{
    private char [] abecedario=new char[26],abecedariomodificado=new char[26];
    private char [] abecedariomayusculas=new char[26],abecedariomodificadominusculas=new char[26];
    private char [] mensajeaux,espacios,mensajeoriginalaux;
    private String codificacion="",decodificacion="";
    private int x;
    
    public Cesar()
    {
    super("Cesar");
    }
    
    public void Cifrar()
    {
    mensajeaux= mensaje.toCharArray();
    x=mensaje.length();
    for (int y=0;y<x;y++)
        {
            for(int q=0;q<26;q++)
            {
                if(mensajeaux[y]==(abecedario[q]))
                {
                  codificacion+=this.abecedariomodificadominusculas[q];
                }
                else
                {
                if(mensajeaux[y]==(abecedariomayusculas[q]))
                {
                  codificacion+=this.abecedariomodificado[q];
                }
                }
               
            }
         
        } 
    int q=0;
    int z=mensajeoriginal.length();
    mensajeoriginalaux=mensajeoriginal.toCharArray();
         espacios=codificacion.toCharArray();
         codificacion="";
         for(int y=0;y<z;y++)
         {
         if(mensajeoriginalaux[y]==' ')
         {
             codificacion+=" ";
             
         }
         else
         {
             codificacion+=""+espacios[q];
             q++;
         }
         
         }
    }
    
    public void Descifrar()
    {
           mensajeaux= mensaje.toCharArray();

      for (int y=0;y<mensaje.length();y++)
        {
            for(int q=0;q<26;q++)
            {
                if(mensajeaux[y]==this.abecedariomodificado[q])
                {
                  decodificacion+=this.abecedariomayusculas[q];
                }
                else
                {
                if(mensajeaux[y]==this.abecedariomodificadominusculas[q])
                {
                  decodificacion+=this.abecedario[q];
                }
                }
                
                
            }
         
        }
         int q=0;
             int z=mensajeoriginal.length();
         mensajeoriginalaux=mensajeoriginal.toCharArray();
         espacios=getDecodificacion().toCharArray();
         decodificacion="";
         for(int y=0;y<z;y++)
         {
         if(mensajeoriginalaux[y]==' ')
         {
             decodificacion+=" ";
             
         }
         else
         {
             decodificacion+=""+espacios[q];
             q++;
         }
         
         }
        

    }
    
    public void setAbecedario()
    {
        int i=0;
     for(char letra='a'; letra <= 'z'; ++letra) 
    {
        this.abecedario[i]=letra;
        i++;
    }
     
    }
    
    public void setAbecedarioMayusculas()
    {
            int i=0;
     for(char letra='A'; letra <= 'Z'; ++letra) 
    {
        this.abecedariomayusculas[i]=letra;
        i++;
    }
    }
     
    public void setAbecedarioModificado(int opcion)
    {
        int i=0,j;
        char letra1,letra;
    letra1='A';
    for(j=0;j<opcion;j++)
    {
    letra1+=1;
    }
    for(letra=letra1; letra <='Z'; ++letra)
    {
        this.abecedariomodificado[i]=letra;
        i++;
    }
    letra1-=1;
    for(letra='A';letra<=letra1;letra++)
    {
    this.abecedariomodificado[i]=letra;
        i++;
    }
    
    }

    public void setAbecedarioModificadoMinusculas(int opcion)
    {
 int i=0,j;
         char letra1,letra;
    letra1='a';
    for(j=0;j<opcion;j++)
    {
    letra1+=1;
    }
    for(letra=letra1; letra <='z'; ++letra)
    {
        this.abecedariomodificadominusculas[i]=letra;
        i++;
    }
    letra1-=1;
    for(letra='a';letra<=letra1;letra++)
    {
    this.abecedariomodificadominusculas[i]=letra;
        i++;
    }
    
    }
    
    public char[] getAbecedario()
    {
    return this.abecedario;
    }
    
    public char[] getAbecedariomodificado()
    {
    return this.abecedariomodificado;
    }

    public char[] getAbecedariomayusculas() {
        return abecedariomayusculas;
    }

    public char[] getAbecedariomodificadominusculas() {
        return abecedariomodificadominusculas;
    }

    public String getCodificacion() {
        return codificacion;
    }

    public String getDecodificacion() {
        return decodificacion;
    }
}
