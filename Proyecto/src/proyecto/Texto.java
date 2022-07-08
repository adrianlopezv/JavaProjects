
package proyecto;

public class Texto 
{
    protected String mensaje;
    
    public Texto(String mensaje)
    {
    this.mensaje=mensaje;
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
    
    public void QuitarBlancos()
    {
           this.mensaje=mensaje.replace(" ","");
    }
    
    public String PasarMayusculas(String mensaje)
    {
    return mensaje.toUpperCase();
    }
    
    public String PasarMinusculas(String mensaje)
    {
     return mensaje.toLowerCase();
    }
    
}
