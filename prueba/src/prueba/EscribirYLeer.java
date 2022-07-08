
package prueba;


import java.io.*;

public class EscribirYLeer
{

    public static void main(String[] args)
    {
        EscribirYLeer eyl = new EscribirYLeer();
        
         String ruta = "mascotas.txt";
        File archivo = new File(ruta);
        if(archivo.exists())
        {
         eyl.leeFichero("mascotas.txt");
        }
        else
        {
            eyl.anhadeFichero("mascotas.txt");
        eyl.escribeFichero("mascotas.txt");
        }
        
        
    }

    public void escribeFichero(String fichero)
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(fichero));
            for (int i = 0; i <5; i++)
            {
                // ojo, se hace un new por cada Persona. El new dentro
                // del bucle.
                Persona p = new Persona(i);
                oos.writeObject(p);
            }
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
 
    public void anhadeFichero (String fichero)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, sólo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            Persona p = new Persona(5);
            for (int i = 5; i < 10; i++)
            {
                p.setPersona(i);   // Se rellenan los datos de Persona.
                oos.writeUnshared(p);
            }
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    
    public void leeFichero(String fichero)
    {
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Persona)
                    System.out.println(aux);
                aux = ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
    }
}
