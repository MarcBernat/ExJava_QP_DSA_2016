package edu.upc.eetac.dsa.Constructores;

/**
 * Created by marc on 20/02/16.
 */
public class Tree {
    private int altura;
    private String nombre;

    /**
     * Para realizar la creación de la classe tenemos
     * que crear constructores para las diferentes
     * situaciones. También get y set para los privados.
     */
    public Tree() {
    }

    public Tree(int altura) {
        this.altura = altura;
    }

    public Tree(String nombre) {
        this.nombre = nombre;
    }

    public Tree(int altura, String nombre) {
        this.altura = altura;
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
