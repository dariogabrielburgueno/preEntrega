package com.techlab.pedidos;

import com.techlab.productos.Producto;

import java.util.ArrayList;

public class LineaPedido {
    private Producto producto = new Producto();
    private int cant;


    public LineaPedido(Producto producto,int cant){
        this.producto=producto;
        this.cant=cant;

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
