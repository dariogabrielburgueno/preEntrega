package com.techlab.productos;


import java.util.ArrayList;

public class Inventario {

    ArrayList<Alimento> listaAlimentos=new ArrayList<>();
    ArrayList<Bebida> listaBebidas=new ArrayList<>();
    ArrayList<Producto> listaProductos=new ArrayList<>();

    public void agregarBebida(Bebida bebida ){
        listaBebidas.add(bebida);
        System.out.println(bebida.getNombre()+" agregada con Id"+bebida.getId());
    }

    public void agregarAlimento(Alimento alimento){
        listaAlimentos.add(alimento);
        System.out.println(alimento.getNombre()+" agregado con Id"+alimento.getId());
    }

    public void agregarAlInventario(Producto producto){
        listaProductos.add(producto);
        System.out.println(producto.getNombre()+" agregado al inventario");
    }




}


