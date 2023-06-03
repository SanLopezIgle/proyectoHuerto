package com.huerto.model;

import com.huerto.view.HuertoCatalogoIU;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.util.ArrayList;

public class DatosHuerto {

    HuertoCatalogoIU catalogo = new HuertoCatalogoIU();
    private Integer idHuerto;
    private Integer planta_id;

    Consultas consulta = new Consultas();

    DatabaseManager db = DatabaseManager.getInstance();
    Connection connection = db.getConnection();

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
