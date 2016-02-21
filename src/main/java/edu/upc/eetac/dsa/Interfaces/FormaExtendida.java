package edu.upc.eetac.dsa.Interfaces;

/**
 * Created by marc on 21/02/16.
 * Para crear el nombre utilizaremos una implentación de shape y haremos otra classe extendida
 * para crear el rctangulo o el circulo
 */
public abstract class FormaExtendida implements Shape {
    String nombre;

    public FormaExtendida (String nom)
    {
        this.nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }
}

