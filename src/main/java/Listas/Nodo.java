package Listas;

import javax.swing.*;

public class Nodo {
    String dato;
    Nodo enlace;

    public Nodo ( String nombre){
        dato = nombre;
        enlace = null;

    }

    public Nodo (String nombre, Nodo n){
        dato = nombre;
        enlace = n;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace (Nodo n){
        enlace = n;
    }


    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", enlace=" + enlace +
                '}';
    }


}
