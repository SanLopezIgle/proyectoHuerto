package com.huerto.model;

import java.util.ArrayList;

public class Huerto {
    // Atributos huerto
    private Integer idHuerto;
    private ArrayList<Planta> plantas;

    // Constructores huerto
    public Huerto(){

    }
    public Huerto(Integer idHuerto, ArrayList<Planta> plantas) {
        this.idHuerto = idHuerto;
        this.plantas = plantas;
    }

    // Getters y setters huerto
    public Integer getIdHuerto() {
        return idHuerto;
    }
    public void setIdHuerto(Integer idHuerto) {
        this.idHuerto = idHuerto;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }
}
