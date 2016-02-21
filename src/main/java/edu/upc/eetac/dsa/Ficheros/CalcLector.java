package edu.upc.eetac.dsa.Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by marc on 21/02/16.
 *
 * Las Excepciones especiales las introducimos extendiendo la classa Exception y colocando
 * throws en la linea del metodo.
 *
 *
 */
public class CalcLector {
    BufferedReader inputStream = null;

    public double Lector(String path) throws FileParsingException, BigNumberException{
        int sumatorio = 0;
        int cuentas = 0;
        try {
            //El inputstream es el modelo donde alojaremos la lectura del fichero mediente un Reader
            inputStream = new BufferedReader(new FileReader(path));

            String l;
            while ((l = inputStream.readLine()) != null) {
                int leido = Integer.parseInt(l);
                if (leido > 1000)
                {
                    //Activamos la excepcion
                    throw new BigNumberException();
                }
                sumatorio = sumatorio + leido;
                cuentas++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");

        }
        catch (IOException e) {
            //Declaración para llamar las excepcion
            throw new FileParsingException();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Fallo cierre Lector");
            }
        }
        return Calc(sumatorio, cuentas);
    }

    public double Calc (int sumatorio, int cuentas)
    {
        double mediana = (sumatorio/cuentas);
        return mediana;
    }

}
