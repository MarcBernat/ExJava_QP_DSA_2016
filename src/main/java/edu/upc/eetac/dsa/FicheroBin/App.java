package edu.upc.eetac.dsa.FicheroBin;

import java.io.IOException;

/**
 * Created by marc on 21/02/16.
 */
public class App {
     public static void main(String[] args) throws IOException {
     Binario binario = null;
     Bin bin = new Bin();
     String path = "/home/marc/IdeaProjects/ExJava/src/main/java/edu/upc/eetac/dsa/FicheroBin/bin.txt";

     //Hacemos el Guardado
     binario = new Binario(3, 7.5, 'a');
     bin.Guardar(path, binario);

     //Hacemos la Lectura
     binario = bin.Lectura(path);

     System.out.println("Integro leido = " + binario.getIntegro());
     System.out.println("Decimal leido = " + binario.getDecimal());
     System.out.println("Caracter leido = " + binario.getCaracter());

    }


}
