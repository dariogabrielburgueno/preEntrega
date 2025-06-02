package com.techlab.productos;

public class Producto {
    protected String nombre;
    protected int id;
    protected double precio;
    protected int cantStock;

    public Producto() {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.cantStock = cantStock;
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

    public void setId(int id) {
        this.id = id;
    }
}
