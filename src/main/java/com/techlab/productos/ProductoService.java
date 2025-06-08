package com.techlab.productos;




public class ProductoService extends Producto{


    public void mostrarProducto(Producto e){

        System.out.println("ID -------- NOMBRE ------- PRECIO ------- CANTIDAD EN STOCK");
        System.out.println(e.getId()+"----"+e.getNombre()+"----"+e.getPrecio()+"----"+e.getCantStock());
    }
}
