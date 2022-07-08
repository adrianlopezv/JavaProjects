
package atabash;

public class Operaciones
{
    private boolean esmayuscula;
    private int x,z;
    private  char [] palabra,palabraaux,espacios;
    private String codificacion="",decodificacion="";
    private String textoplano,textoplanoaux,codice,codiceaux;
    private char [] abecedarionormal=new char[26],abecedarionormalmayusculas=new char[26];
    private  char [] abecedarioalreves=new char[26],abecedarioalrevesminusculas=new char[26];
      
      public void CrearArreglos(int opcion )
    {
 int i=0,j;
 char letra,letra1; 
    for(letra='a'; letra <= 'z'; ++letra) 
    {
        this.abecedarionormal[i]=letra;
        i++;
    }
    i=0;
        for(letra='A'; letra <= 'Z'; ++letra) 
    {
        this.abecedarionormalmayusculas[i]=letra;
        i++;
    }
    i=0;
    if(opcion!=26)
    {
    letra1='A';
    for(j=0;j<opcion;j++)
    {
    letra1+=1;
    }
    for(letra=letra1; letra <='Z'; ++letra)
    {
        this.abecedarioalreves[i]=letra;
        i++;
    }
    letra1-=1;
    for(letra='A';letra<=letra1;letra++)
    {
    this.abecedarioalreves[i]=letra;
        i++;
    }
    i=0;
    letra1='a';
    for(j=0;j<opcion;j++)
    {
    letra1+=1;
    }
    for(letra=letra1; letra <='z'; ++letra)
    {
        this.abecedarioalrevesminusculas[i]=letra;
        i++;
    }
    letra1-=1;
    for(letra='a';letra<=letra1;letra++)
    {
    this.abecedarioalrevesminusculas[i]=letra;
        i++;
    }
    
    
    }
    else
    {
        
    for(letra='Z'; letra>='A';letra--)
    {
        this.abecedarioalreves[i]=letra;
        i++;
    }
    i=0;
        for(letra='z'; letra>='a';letra--)
    {
        this.abecedarioalrevesminusculas[i]=letra;
        i++;
    }
        
    }
    
    }
    
      public  void ImprimirArreglos()
 {
     int i;
 for(i=0;i<26;i++)
   {
     System.out.print(this.abecedarionormal[i]);
   }
   
   System.out.println();
   
      for(i=0;i<26;i++)
   {
     System.out.print(this.abecedarioalreves[i]);
   } 
      System.out.println();
 }

     public void Codificar()
 {
         for (int y=0;y<x;y++)
        {
            for(int q=0;q<26;q++)
            {
                if(palabra[y]==(abecedarionormal[q]))
                {
                  codificacion+=this.abecedarioalrevesminusculas[q];
                }
                else
                {
                if(palabra[y]==(abecedarionormalmayusculas[q]))
                {
                  codificacion+=this.abecedarioalreves[q];
                }
                }
               
            }
         
        } 
         
         
         int q=0;
         espacios=codificacion.toCharArray();
         codificacion="";
         for(int y=0;y<z;y++)
         {
         if(palabraaux[y]==' ')
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
 
    public void Decodificar()
 {
         for (int y=0;y<palabra.length;y++)
        {
            for(int q=0;q<26;q++)
            {
                if(palabra[y]==this.abecedarioalreves[q])
                {
                  decodificacion+=this.abecedarionormalmayusculas[q];
                }
                else
                {
                if(palabra[y]==this.abecedarioalrevesminusculas[q])
                {
                  decodificacion+=this.abecedarionormal[q];
                }
                }
                
                
            }
         
        }
         
         int q=0;
         espacios=decodificacion.toCharArray();
         decodificacion="";
         for(int y=0;y<z;y++)
         {
         if(palabraaux[y]==' ')
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

    public String getTextoPlano()
    {
        return textoplano;
    }

    public void setTextoPlano(String textoplano)
    {
        textoplanoaux=textoplano;
        this.z=textoplanoaux.length();
        this.palabraaux=textoplano.toCharArray();
       this.textoplanoaux=textoplanoaux.replace(" ","");
       this.x=textoplanoaux.length();
      this.palabra=textoplanoaux.toCharArray();
    }
    
    public String getCodice()
    {
        return codice;
    }

    public void setCodice(String codice)
            {
        codiceaux=codice;
        this.z=codiceaux.length();
        this.codice=codice;
        this.palabraaux=codice.toCharArray();
        //codiceaux=this.codice.toUpperCase();
       this.codiceaux=codiceaux.replace(" ","");       
        this.palabra=this.codiceaux.toCharArray();
    }

    public char[] getPalabra()
    {
        return palabra;
    }

    public void setPalabra(char[] palabra)
    {

        palabra=codice.toCharArray();
        this.palabra = palabra;
    }

    public String getCodificacion()
    {
        return codificacion;
    }

    public String getDecodificacion()
    {
        return decodificacion;
    }
 
}