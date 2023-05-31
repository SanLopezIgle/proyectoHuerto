package com.huerto.model;

public class Cliente {
    // Atributos cliente
    private String dni;
    private String nombre;

    // Constructores cliente
    public Cliente(){

    }


    public Cliente(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    // Getters y setters cliente

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
