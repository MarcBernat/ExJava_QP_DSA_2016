package edu.upc.eetac.dsa.Ficheros;

/**
 * Created by marc on 21/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
 * Line-Oriented I/O
 */
import java.io.IOException;

public class Texto {
    public static void main(String[] args) throws IOException, FileParsingException, BigNumberException {
        String path = "/home/marc/IdeaProjects/ExJava/src/main/java/edu/upc/eetac/dsa/Ficheros/num.txt";

        // Tambíen tenemos que introducir excepciones si utilizamos las classes con excepciones personalizadas
        CalcLector cl = new CalcLector();
        double mediana = cl.Lector(path);
        System.out.println("Mediana: " + mediana);
    }
}
