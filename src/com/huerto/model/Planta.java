package com.huerto.model;

public class Planta {
    private enum Especie{
        TOMATE, LECHUGA, ZANAHORIA, MANGO;
    }

    private Especie especie;

    public Planta(){

    }

    public Planta(Especie especie) {
        this.especie = especie;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
