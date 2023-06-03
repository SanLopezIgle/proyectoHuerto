package com.huerto.model;

import java.util.ArrayList;

public class Huerto {
    // Atributos huerto
    private Integer idHuerto;
    private Integer planta_id;

    // Constructores huerto
    public Huerto(){

    }
    public Huerto(Integer idHuerto, Integer planta_id) {
        this.idHuerto = idHuerto;
        this.planta_id = planta_id;
    }

    // Getters y setters huerto
    public Integer getIdHuerto() {
        return idHuerto;
    }
    public void setIdHuerto(Integer idHuerto) {
        this.idHuerto = idHuerto;
    }

    public Integer getPlanta_id() {
        return planta_id;
    }
    public void setPlanta_id(Integer planta_id) {
        this.planta_id = planta_id;
    }
}
