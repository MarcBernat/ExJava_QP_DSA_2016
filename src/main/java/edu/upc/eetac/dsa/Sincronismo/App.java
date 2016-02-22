package edu.upc.eetac.dsa.Sincronismo;

/**
 * Created by marc on 22/02/16.
 *
 * Desconocimiento de como se realiza
 */
public class App {
    public static void main(String[] args) {

        Buffer nBuffer = new Buffer();

        //Creamos thread Thread
        Consumidor thrConsumer = new Consumidor();
        Productor thrProducer = new Productor();

        //Activación
        thrConsumer.start();
        thrProducer.start();
    }
}
