package com.techlab.menu;

import com.techlab.productos.Alimento;
import com.techlab.productos.Bebida;
import com.techlab.productos.Inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menuManager {

    static Scanner alimento = new Scanner(System.in);
    Inventario inventario=new Inventario();

    public void empezarMenu(){
        while(true){

            try{
                mostrarMenu();
                int entrada= alimento.nextInt();
                interactuarMenu(entrada);

            }
            catch(InputMismatchException e){
                System.out.println("Ingrese un número con el teclado");
                System.out.println("");
                alimento.nextLine();
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
            case 2: //listarProductos();
                System.out.println("en proceso");
                break;
            case 3: //buscarProducto();
                System.out.println("en proceso");
                break;
            case 4: //eliminarProducto();
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
        int opcionP= alimento.nextInt();
        if (opcionP==1){

            alimento.nextLine();
            Bebida bebida=new Bebida();
            System.out.println("Ingrese nombre de bebida: ");
            bebida.setNombre(String.valueOf(alimento.nextLine()));
            System.out.println("Ingrese precio de la bebida: ");
            bebida.setPrecio(Integer.parseInt(alimento.nextLine()));
            System.out.println("Ingrese volumen de la bebida: ");
            bebida.setVolumen(alimento.nextInt());
            System.out.println("Ingrese cantidad de stock de la bebida: ");
            bebida.setCantStock(alimento.nextInt());

            inventario.agregarBebida(bebida);
            inventario.agregarAlInventario(bebida);



        }else if(opcionP==2){
            alimento.nextLine();
            Alimento alimento=new Alimento();
            System.out.println("Ingrese nombre del alimento: ");
            alimento.setNombre(String.valueOf(menuManager.alimento.nextLine()));
            System.out.println("Ingrese precio del alimento: ");
            alimento.setPrecio(Integer.parseInt(menuManager.alimento.nextLine()));
            System.out.println("Ingrese el peso del alimento: ");
            alimento.setPeso(menuManager.alimento.nextInt());
            System.out.println("Ingrese cantidad de stock del alimento: ");
            alimento.setCantStock(menuManager.alimento.nextInt());

            inventario.agregarAlimento(alimento);
            inventario.agregarAlInventario(alimento);
        }


    }
}


