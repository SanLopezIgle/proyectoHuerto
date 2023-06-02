package com.huerto.model;

import javax.swing.*;
import java.util.ArrayList;

public class DatosHuerto {
    private Integer idHuerto;
    private Integer planta_id;

    public DatosHuerto(){}

    public DatosHuerto(Integer idHuerto, Integer planta_id){
        this.idHuerto = idHuerto;
        this.planta_id = planta_id;
    }

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
