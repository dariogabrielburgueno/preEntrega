package com.techlab.productos;


import java.util.ArrayList;

public class Inventario {

    private ArrayList<Alimento> listaAlimentos=new ArrayList<>();
    private ArrayList<Bebida> listaBebidas=new ArrayList<>();
    private ArrayList<Producto> listaProductos=new ArrayList<>();

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

    public void eliminarDeInventario(Producto producto){
        for (int e=0;e<listaProductos.size();e++ ){
            if(listaProductos.get(e).getId()==producto.getId()){
                listaProductos.remove(e);
            }
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(ArrayList<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(ArrayList<Alimento> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }
}


