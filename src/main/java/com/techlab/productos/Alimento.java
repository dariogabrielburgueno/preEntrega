package com.techlab.productos;

public class Alimento extends Producto{
    private double peso;
    public Alimento(String nombre,int id, double precio,int cantStock,double peso){
        super();
        this.peso=peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
}
