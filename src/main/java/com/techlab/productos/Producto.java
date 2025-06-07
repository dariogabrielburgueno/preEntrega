package com.techlab.productos;

public class Producto {
    protected String nombre;
    private static int contadorId=1;
    private final int id;
    protected double precio;
    protected int cantStock;


    public Producto(String nombre,double precio,int cantStock) {

        this.nombre = nombre;
        this.id=contadorId++;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public Producto(){
        this.id=contadorId++;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }


}
