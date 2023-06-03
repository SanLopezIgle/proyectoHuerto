package com.huerto.controller;

import java.sql.PreparedStatement;
import com.huerto.model.Consultas;
import com.huerto.model.DatabaseManager;
import com.huerto.model.DatosHuerto;
import com.huerto.model.Huerto;
import com.huerto.view.HuertoCatalogoIU;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Array;
import java.net.ConnectException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import javax.swing.table.DefaultTableModel;

public class HuertoCatalogoController {
    /*
}
    private HuertoCatalogoIU vista;
    private Consultas consulta;
    private Connection conexion;
    private DefaultTableModel modeloTabla;

    //private DatabaseManager modelo;

    public HuertoCatalogoController(HuertoCatalogoIU vista) {
      

    /*
    private HuertoCatalogoIU vista;
    private Consultas consulta;
    private Connection conexion;
    private DefaultTableModel modeloTabla;
*/
    //private DatabaseManager modelo;
    /*
    public HuertoCatalogoController(HuertoCatalogoIU vista) {
        this.vista = vista;
        this.conexion = (Connection) DatabaseManager.getInstance().getConnection();
        this.modeloTabla = (DefaultTableModel) vista.jTable1.getModel();
        //cargarTabla();
    }
    *

    /**
     * Método que muestra en la tabla de la interfaz los datos de los huertos
     * que tenemos en la BD
     */


    HuertoCatalogoIU catalogo = new HuertoCatalogoIU();
    Consultas consulta = new Consultas();
    public void cargarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) catalogo.jTable1.getModel();
        ArrayList<DatosHuerto> listaHuertos = consulta.listaHuertos();
        modelo.setRowCount(0);
        for(DatosHuerto elemento : listaHuertos){
            Object datos[] = new Object[2];
            datos[0] = elemento.getPlanta_id();
            datos[1] = elemento.getIdHuerto();

            modelo.addRow(datos);
        }
    }

}
