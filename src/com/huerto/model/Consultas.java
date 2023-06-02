package com.huerto.model;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Consultas {
    private DatabaseManager databaseManager;

    public Consultas(){
        databaseManager = DatabaseManager.getInstance();
    }

    /**
     *
     * @param dni
     * @param nombre
     */
    public void insertarCliente(String dni, String nombre){
        Connection conexion = databaseManager.getConnection();
        try{
            String consulta = "INSERT INTO cliente (dni, nombre) VALUES (?,?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, dni);
            st.setString(2, nombre);
            st.executeUpdate();
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            cerrarConexion();
        }
    }
    /*
    /**
     * @return
     */
    public ArrayList<DatosHuerto> listaHuertos(){
        ArrayList<DatosHuerto> lista = new ArrayList<>();
        Connection conexion = databaseManager.getConnection();
        ResultSet resultSet = null;
        try{
            String consulta = "select planta_id, idHuerto from tener";
            PreparedStatement st = conexion.prepareStatement(consulta);
            resultSet = st.executeQuery();

            while(resultSet.next()){
                DatosHuerto datosHuertos = new DatosHuerto();
                datosHuertos.setPlanta_id(resultSet.getInt("planta_id"));
                datosHuertos.setIdHuerto(resultSet.getInt("idHuerto"));
                lista.add(datosHuertos);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            cerrarConexion();
        }
        return lista;
    }

    public void cerrarConexion(){
        databaseManager.close();
    }
}