
package proyecto;

public class TextoCifrado extends Texto
{
    Criptografia criptografia;
    private String textoplano;
    private String textocifrado;
    Criptografia cripto;
    
    public TextoCifrado(String mensaje)
     {
     super(mensaje);
     }
    
    public String getTextoplano() 
    {
        return textoplano;
    }

    public void setTextoplano(String textoplano) 
    {
        this.textoplano = textoplano;
    }

    public String getTextocifrado() 
    {
        return textocifrado;
    }

    public void setTextocifrado(String textocifrado) 
    {
        this.textocifrado = textocifrado;
    }

public void setCriptografia(Criptografia criptografia)
{
this.cripto=criptografia;
}

public Criptografia getCriptografia()
{
return cripto;
}



}
