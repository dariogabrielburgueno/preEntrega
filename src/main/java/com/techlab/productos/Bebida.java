package com.techlab.productos;

public class Bebida extends Producto{
    private int volumen;
    public Bebida(String nombre,double precio, int cantStock,int volumen){
        super(nombre,precio,cantStock);
        this.volumen=volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
