package com.huerto.model;

public class Planta {

    private Integer idPlanta;

    private enum Especie{
        TOMATE, LECHUGA, ZANAHORIA, MANGO;
    }
    private Especie especie;
    public Planta(){

    }

    public Planta(Especie especie, Integer idPlanta) {
        this.especie = especie;this.idPlanta = idPlanta;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Integer getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(Integer idPlanta) {
        this.idPlanta = idPlanta;
    }
}
