package edu.upc.eetac.dsa.FicheroBin;

import java.io.*;

/**
 * Created by marc on 21/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html
 */
public class Bin {

    //Metodos para la funcionalidad
    public Binario Lectura(String path) throws IOException
    {
        Binario bin = null;
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(path));
            bin = new Binario (dis.readInt(), dis.readDouble(), dis.readChar());
            }
        catch (IOException e){
            System.out.println("Error al leer");
        }
        catch (NullPointerException e)
        {
            System.out.println("Error al leer");
        }
        finally {
            dis.close();
        }
        return bin;
    }

    public void Guardar(String path, Binario bin) throws IOException {
        DataOutputStream dos= null;
        try {
            dos = new DataOutputStream(new FileOutputStream(path));
            dos.writeInt(bin.getIntegro());
            dos.writeDouble(bin.getDecimal());
            dos.writeChar(bin.getCaracter());
        }
        catch (IOException e)
        {
            System.out.println("Error al guardar");
        }
        catch (NullPointerException e)
        {
            System.out.println("Error al guardar");
        }
        finally {
            dos.close();
        }
    }
}
