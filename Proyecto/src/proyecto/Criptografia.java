
package proyecto;

public abstract class Criptografia 
{
protected String tipo;
protected String textoplano;
protected String mensaje,mensajeoriginal;


    public Criptografia(String tipo)
    {
this.tipo=tipo;
}

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getTextoplano()
    {
        return textoplano;
    }

    public void setTextoplano(String textoplano)
    {
        this.textoplano = textoplano;
    }

    public String getMensaje() 
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
   public void setMensajeOriginal(String mensaje)
   {
   this.mensajeoriginal=mensaje;
   }
   public String getMensajeOriginal()
   {
   return mensajeoriginal;
   }
    
    public abstract void Cifrar();
    public abstract void Descifrar();

}
