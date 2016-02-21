package edu.upc.eetac.dsa.Interfaces;

/**
 * Created by marc on 20/02/16.
 */
public class Circle extends FormaExtendida {
    /**
     * Aqui extendemos la classe Shape, conseguimos modificar las variables.
     *
     * También creamos el constructor para recibir el radio del circulo a calcular
     */

    double rad;

    public Circle(double radio) {
        super("Circulo");
        //Al inverso que el Override, pasamos a realizar la función de la classe forma extendida.
        this.rad = radio;
    }

    public double area(){
        return Shape.PI * rad * rad;
    }

    public String nombre(){
        return nombre;
    }
}
