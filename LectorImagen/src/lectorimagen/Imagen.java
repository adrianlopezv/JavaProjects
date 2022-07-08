
package lectorimagen;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class Imagen 
{
    private String nombreArchivo;
    private BufferedImage img;
    
    public Imagen(String nombreArchivo)
    {
    this.nombreArchivo=nombreArchivo;
    try
    {
        this.img=leerImagen();
    }catch(Exception e)
        {
             System.out.println("No se pudo abrir la imagen");
        }
    }
    
    public BufferedImage leerImagen() throws IOException
    {
    return ImageIO.read(new File(this.getNombreArchivo()));
    }

    public String getNombreArchivo() 
    {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) 
    {
        this.nombreArchivo = nombreArchivo;
    }

    public BufferedImage getImg() 
    {
        return img;
    }

    public void setImg(BufferedImage img) 
    {
        this.img = img;
    }
}
