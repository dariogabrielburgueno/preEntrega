package com.techlab.menu;

import com.techlab.productos.Alimento;
import com.techlab.productos.Bebida;
import com.techlab.productos.Inventario;
import com.techlab.productos.Producto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menuManager {

    static Scanner sc = new Scanner(System.in);
    Inventario inventario=new Inventario();

    public void empezarMenu(){
        while(true){

            try{
                mostrarMenu();
                int entrada= sc.nextInt();
                interactuarMenu(entrada);

            }
            catch(InputMismatchException e){
                System.out.println("Ingrese un número con el teclado");
                System.out.println("");
                sc.nextLine();
            }


        }
    }
    public void mostrarMenu(){
        System.out.println("SISTEMA DE GESTIÓN - TECHLAB");
        System.out.println("1 - Agregar producto");
        System.out.println("2 - Listar productos");
        System.out.println("3 - Buscar/Actualizar producto");
        System.out.println("4 - Eliminar producto");
        System.out.println("5 - Crear un pedido");
        System.out.println("6 - Listar pedidos");
        System.out.println("7 - Salir");
        System.out.println("Elija una opción: ...");
    }

    public void interactuarMenu(int entrada){
        switch (entrada){
            case 1: agregarProducto();

                break;
            case 2: listarProductos();

                break;
            case 3: buscarProducto();

                break;
            case 4: eliminarProducto();
                System.out.println("en proceso");
                break;
            case 5: //crearPedido();
                System.out.println("en proceso");
                break;
            case 6: //listarPedidos();
                System.out.println("en proceso");
                break;
            case 7: //salir();
                System.out.println("en proceso");
                break;
            default:
                System.out.println("Elija una opción del menú");
        }
    }
    public void agregarProducto(){
        System.out.println("Ingrese 1 para agregar una bebida.");
        System.out.println("Ingrese 2 para agregar un alimento.");
        int opcionP= sc.nextInt();
        if (opcionP==1){

            sc.nextLine();
            Bebida bebida=new Bebida();
            System.out.println("Ingrese nombre de bebida: ");
            bebida.setNombre(String.valueOf(sc.nextLine()));
            System.out.println("Ingrese precio de la bebida: ");
            bebida.setPrecio(Integer.parseInt(sc.nextLine()));
            System.out.println("Ingrese volumen de la bebida: ");
            bebida.setVolumen(sc.nextInt());
            System.out.println("Ingrese cantidad de stock de la bebida: ");
            bebida.setCantStock(sc.nextInt());

            inventario.agregarBebida(bebida);
            inventario.agregarAlInventario(bebida);



        }else if(opcionP==2){
            sc.nextLine();
            Alimento alimento=new Alimento();
            System.out.println("Ingrese nombre del alimento: ");
            alimento.setNombre(String.valueOf(menuManager.sc.nextLine()));
            System.out.println("Ingrese precio del alimento: ");
            alimento.setPrecio(Integer.parseInt(menuManager.sc.nextLine()));
            System.out.println("Ingrese el peso del alimento: ");
            alimento.setPeso(menuManager.sc.nextInt());
            System.out.println("Ingrese cantidad de stock del alimento: ");
            alimento.setCantStock(menuManager.sc.nextInt());

            inventario.agregarAlimento(alimento);
            inventario.agregarAlInventario(alimento);
        }


    }
    public void listarProductos(){
        for (Producto e:inventario.getListaProductos()){
            System.out.println("Id: "+e.getId()+"- Nombre: "+e.getNombre()+"- Precio: "+e.getPrecio()+"- Stock: "+e.getCantStock());

        }
    }

    public void buscarProducto(){
        System.out.println("Ingrese Id del producto a buscar: ");
        int id=sc.nextInt();
        for (Producto e: inventario.getListaProductos()){
            if (e.getId()==id){
                System.out.println("*");
                System.out.println("Id: "+e.getId()+"- Nombre: "+e.getNombre()+"- Precio: "+e.getPrecio()+"- Stock: "+e.getCantStock());
            }
        }
    }

    public void eliminarProducto (){
        System.out.println("Ingrese Id del producto a eliminar: ");
        int id=sc.nextInt();
        for (int e=0;e<inventario.getListaProductos().size();e++){
            if (inventario.getListaProductos().get(e).getId()==id){
                System.out.println(inventario.getListaProductos().get(e).getId()+" eliminado");
                inventario.eliminarDeInventario(inventario.getListaProductos().get(e));



            }
        }
    }
}


