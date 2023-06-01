package com.huerto.controller;

import com.huerto.model.Consultas;
import com.huerto.model.DatabaseManager;
import com.huerto.model.Huerto;
import com.huerto.view.HuertoCatalogoIU;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class HuertoCatalogoController {
    private HuertoCatalogoIU vista;
    private Consultas consulta;

    public HuertoCatalogoController(HuertoCatalogoIU vista, Consultas consulta) {
        this.vista = vista;
        this.consulta = consulta;
    }

    /**
     * Método que muestra en la tabla de la interfaz los datos de los huertos
     * que tenemos en la BD
     */
    private void mostrarDatosHuerto(){
        ArrayList<String[]> datosHuerto = consulta.mostrarTablaHuertos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID HUERTO");
        modelo.addColumn("ESPECIE PLANTA");

        for (String [] fila : datosHuerto){
            modelo.addRow(fila);
        }

        vista.jTable1.setModel(modelo);
    }
}
