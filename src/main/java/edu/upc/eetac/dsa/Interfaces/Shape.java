package edu.upc.eetac.dsa.Interfaces;

/**
 * Created by marc on 20/02/16.
 * Cuando utilizamos 'final' declaramos la variable como constante
 *
 * El uso de 'static' se pone para no crear cada rato la variable en memoria durante cada las declaraciones de
 * objeto. Util en este caso cuando el valor de pi es constante y queremos que solo se guarde una vez en memoria.
 *
 * Para hacer variables en interface las declaramos como metodos.
 */
public interface Shape {
    public double area();
    public String nombre();
    public final static double PI = 3.1416;
}
