package edu.upc.eetac.dsa.Threads;

/**
 * Created by marc on 22/02/16.
 * Recurso: http://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
 *
 * Tenemos dos tipos de classes para crear threads.
 * - Provide a Run object. The Run interface defines a single method,
 * run, meant to contain the code executed in the thread. The Run object
 * is passed to the Thr constructor. [implements].
 *
 * - Subclass Thr. The Thr class itself implements Run, though its run method
 * does nothing. An application can subclass Thr, providing its own implementation
 * of run [extends]
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        //Crear thread Runnable
        Thread runnable = new Thread(new Run());

        //Creamos thread Thread
        Thr thr = new Thr();

        //Activación
        runnable.start();
        thr.start();

        //Espera
        runnable.join();
        thr.join();

        System.out.println("Terminado");
    }

}
