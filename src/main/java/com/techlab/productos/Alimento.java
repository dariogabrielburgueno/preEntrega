package com.techlab.productos;

public class Alimento extends Producto{
    private double peso;
    public Alimento(String nombre, double precio, int cantStock,int peso){
        super(nombre,precio,cantStock);
        this.peso=peso;
    }
    public Alimento(){

    }


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
}
