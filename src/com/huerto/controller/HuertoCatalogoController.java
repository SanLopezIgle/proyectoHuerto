package com.huerto.controller;

import com.huerto.model.Consultas;
import com.huerto.model.DatabaseManager;
import com.huerto.model.DatosHuertos;
import com.huerto.model.Huerto;
import com.huerto.view.HuertoCatalogoIU;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HuertoCatalogoController {
    private HuertoCatalogoIU vista;
    private Consultas consulta;
    //private DatabaseManager modelo;

    public HuertoCatalogoController(HuertoCatalogoIU vista) {
        this.vista = vista;
        this.consulta = new Consultas();
        //mostrarDatosHuerto();
    }

    /**
     * Método que muestra en la tabla de la interfaz los datos de los huertos
     * que tenemos en la BD
     */


    public void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) vista.jTable1.getModel();
        ArrayList<DatosHuertos> listaHuertos = consulta.listaHuertos();
        modelo.setRowCount(0);
        for(DatosHuertos elemento : listaHuertos){
            Object datos[] = new Object[3];
            datos[0] = elemento.getIdHuerto();
            datos[1] = elemento.getPlanta_id();

            modelo.addRow(datos);
        }
    }

}
