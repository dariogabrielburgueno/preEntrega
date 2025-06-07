package com.techlab.cliente;

public class Cliente {

    private int contadorCliente = 1;
    private int idCliente = 0;
    private String nombre, apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        idCliente = contadorCliente++;
    }
    public Cliente(){
        idCliente = contadorCliente++;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

}
