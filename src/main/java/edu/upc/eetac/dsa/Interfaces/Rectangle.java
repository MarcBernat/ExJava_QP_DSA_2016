package edu.upc.eetac.dsa.Interfaces;

/**
 * Created by marc on 20/02/16.
 */
public class Rectangle extends FormaExtendida{

    int a;
    int b;

    public Rectangle(int a1, int b1) {
        super("Rectangulo");
        this.a = a1;
        this.b = b1;
    }

    public double area(){
        return a * b;
    }

    public String nombre(){
        return nombre;
    }
}
