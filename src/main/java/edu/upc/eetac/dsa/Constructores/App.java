package edu.upc.eetac.dsa.Constructores;

/**
 * Created by marc on 20/02/16.
 */
public class App {
    public static void main (String args[])
    {
        Tree [] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5, "Pino");

        for (Tree arbol : arboles)
        {
         if (arbol.getAltura() == 0 && arbol.getNombre() == null)
             System.out.println("Un árbol");
         else if (arbol.getAltura() > 0 && arbol.getNombre() == null)
             System.out.println("Un árbol de " + arbol.getAltura() + " metros");
         else if (arbol.getNombre() != null && arbol.getAltura() == 0)
             System.out.println("Un " + arbol.getNombre());
         else
             System.out.println("Un "+ arbol.getNombre() +" de " + arbol.getAltura() + " metros");

        }
    }
}
