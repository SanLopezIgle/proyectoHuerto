package com.huerto.controller;

import com.huerto.model.Consultas;
import com.huerto.model.DatabaseManager;
import com.huerto.model.Huerto;
import com.huerto.view.HuertoCatalogoIU;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HuertoCatalogoController {
    private HuertoCatalogoIU vista;
    private Consultas consulta;

    private DatabaseManager modelo;

    public HuertoCatalogoController(HuertoCatalogoIU vista, Consultas consulta, DatabaseManager modelo) {
        this.vista = vista;
        this.consulta = consulta;
        this.modelo = modelo;
    }

    /**
     * Método que muestra en la tabla de la interfaz los datos de los huertos
     * que tenemos en la BD
     */
    private void mostrarDatosHuerto(){
        ArrayList<Huerto> datosHuerto = consulta.mostrarTablaHuertos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.getTableModelListeners();
        modelo.setRowCount(0);
        //modelo.addColumn("ID HUERTO");
        //modelo.addColumn("ESPECIE PLANTA");

        for (Huerto fila : datosHuerto){
             Object datos[] = new Object[2];
             datos[0] = fila.getIdHuerto();
             datos[1] = fila.getPlantas();

             modelo.addRow(datos);
        }

        vista.jTable1.setModel(modelo);
    }

    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.getTableModelListeners();
        ArrayList<Huerto> listaHuertos = consulta.mostrarTablaHuertos();
        modelo.setRowCount(0);
        for(Huerto elemento : listaHuertos){
            Object datos[] = new Object[3];
            datos[0] = elemento.getClass();
            datos[1] = elemento.getClass();

            modelo.addRow(datos);
        }
    }
}
