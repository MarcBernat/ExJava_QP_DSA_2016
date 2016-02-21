package edu.upc.eetac.dsa.Interfaces;

/**
 * Created by marc on 20/02/16.
 */
public class AppIntherance {
    /**
     * Puntos clave: interface, abstract, super, @Overrride
     */

    /**
     * La interfaces permite declarar constantes que van a estar disponibles para todas las clases que queramos
     * (implementando esa interfaz). Nos ahorra código evitando tener que escribir las mismas declaraciones de
     * constantes en diferentes clases.
     *
     * Para esta classe meteremos la area y el numero Pi
     *
     * Cuando utilizamos 'final' declaramos la variable como constante
     *
     * El uso de 'static' se pone para no crear cada rato la variable en memoria durante cada las declaraciones de
     * objeto. Util en este caso cuando el valor de pi es constante y queremos que solo se guarde una vez en memoria.
     *
     * Normalmente las interfaces son todo publicas.
     */

    /**
     * Para modificar el valor de la interface tenmos que realizar una classe abstracta.
     * Which should you use, abstract classes or interfaces?

     Consider using abstract classes if any of these statements apply to your situation:
     -You want to share code among several closely related classes.
     -You expect that classes that extend your abstract class have many common methods or fields,
     or require access modifiers other than public (such as protected and private).
     -You want to declare non-static or non-final fields. This enables you to define methods that can access
     and modify the state of the object to which they belong.

     Consider using interfaces if any of these statements apply to your situation:
     -You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
     -You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
     -You want to take advantage of multiple inheritance of type.


     PAra nuestro caso -> You want to declare non-static or non-final fields. This enables you to define methods that can access
     and modify the state of the object to which they belong.

     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3, 5);
        for (Shape shape : shapes)
            System.out.println("I'm a " + shape.nombre() + " with area = " + shape.area());
    }
}
