package com.techlab.pedidos;

import com.techlab.productos.Producto;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<LineaPedido> pedidoArmado=new ArrayList<>();
    private Producto producto=new Producto();
    private int cant;


    public Pedido(){}

    public Pedido(Producto producto, int cant){
        this.producto=producto;
        this.cant=cant;
    }

    public ArrayList<LineaPedido> getPedidoArmado() {
        return pedidoArmado;
    }

    public void agregarPedido(LineaPedido lineaPedido){
        pedidoArmado.add(lineaPedido);
    }

    public int getCant() {
        return cant;
    }
}
