package edu.upc.eetac.dsa.Threads;

/**
 * Created by marc on 22/02/16.
 */
public class Thr extends Thread {
    long tiempo = 0;
    int cuentas = 1;

    public void run() {
        for (int i = 0; i < 10; i++) {
            long tiempo = System.currentTimeMillis();
            System.out.println("Thread Runnalble con tiempo = " + tiempo + " ms. Número de veces activado: " + cuentas);
            tiempo = (long) (Math.random() * 2000);
            try {
                Thread.sleep(tiempo);
                cuentas++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
