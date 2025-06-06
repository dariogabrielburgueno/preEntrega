package com.techlab.main;

import com.techlab.productos.Alimento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

       empezarMenu();



    }

public static void empezarMenu(){
    while(true){

        try{
         mostrarMenu();
        int entrada=sc.nextInt();
        interactuarMenu(entrada);
        sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Ingrese un número con el teclado");
        }


    }
}
public static void mostrarMenu(){
    System.out.println("SISTEMA DE GESTIÓN - TECHLAB");
    System.out.println("1 - Agregar producto");
    System.out.println("2 - Listar productos");
    System.out.println("3 - Buscar/Actualizar producto");
    System.out.println("4 - Eliminar pproducto");
    System.out.println("5 - Crear un pedido");
    System.out.println("6 - Listar pedidos");
    System.out.println("7 - Salir");
    System.out.println("Elija una opción: ...");
    }

public static void interactuarMenu(int entrada){
        switch (entrada){
            case 1: //agregarProducto();
                System.out.println("en proceso");
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
}


