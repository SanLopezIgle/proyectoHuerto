package com.huerto.model;

public class Cliente {
    // Atributos cliente
    private Integer idCliente;
    private String dni;
    private String nombre;

    // Constructores cliente
    public Cliente(){

    }

    public Cliente(Integer idCliente){
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String dni, String nombre){
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
    }

    // Getters y setters cliente
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

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
