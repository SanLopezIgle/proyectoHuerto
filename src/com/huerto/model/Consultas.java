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
    public ArrayList<DatosHuertos> listaHuertos(){
        ArrayList<DatosHuertos> lista = new ArrayList<>();
        Connection conexion = databaseManager.getConnection();
        ResultSet resultSet = null;
        try{
            String consulta = "select planta_id, idHuerto from tener";
            PreparedStatement st = conexion.prepareStatement(consulta);
            resultSet = st.executeQuery();

            while(resultSet.next()){
                DatosHuertos datosHuertos = new DatosHuertos();
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

    /**
     *
     * @param //idHuerto
     * @param //idPlanta
     */
    /*
    public void insertarHuerto(int idHuerto, int idPlanta){
        Connection conexion = databaseManager.getConnection();
        try{
            String consulta = "INSERT INTO huerto (idHuerto, planta_id) VALUES (?,?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setInt(1, idHuerto);
            st.setInt(2, idPlanta);
            st.executeUpdate();
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            cerrarConexion();
        }
    }
    */

    public static ArrayList<Huerto> mostrarDatosHuerto(){
        ArrayList<Huerto> huertos = new ArrayList<>();
        String consulta = "select idHuerto, planta_id from huerto";
        try{
            Connection conexion = DatabaseManager.getInstance().getConnection();
            Statement st = conexion.createStatement();
            ResultSet resultSet = st.executeQuery(consulta);
            /*
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID HUERTO");
            tableModel.addColumn("ID PLANTA");
            */
            while (resultSet.next()){
                int idHuerto = resultSet.getInt("idhuerto");
                int planta_id = resultSet.getInt("idplanta");
                //tableModel.addRow(new Object[]{idHuerto, planta_id});
                Huerto huerto = new Huerto(idHuerto, planta_id);
                huertos.add(huerto);
            }

            //tabla.getModel();

        }catch (SQLException e){
            e.printStackTrace();
        }

        return huertos;

    }

    /**
     *
     * @param idHuerto
     * @param idPlanta
     */
    public void agregarPlantaAlHuerto(int idHuerto, int idPlanta) {
        Connection conexion = databaseManager.getConnection();
        try {
            // Insertar la planta en la tabla "planta"
            String consultaPlanta = "INSERT INTO planta (idPlanta) VALUES (?)";
            PreparedStatement stPlanta = conexion.prepareStatement(consultaPlanta);
            stPlanta.setInt(1, idPlanta);
            stPlanta.executeUpdate();
            stPlanta.close();

            // Establecer la relación en la tabla "huerto"
            String consultaHuerto = "INSERT INTO huerto (idHuerto, planta_id) VALUES (?, ?)";
            PreparedStatement stHuerto = conexion.prepareStatement(consultaHuerto);
            stHuerto.setInt(1, idHuerto);
            stHuerto.setInt(2, idPlanta);
            stHuerto.executeUpdate();
            stHuerto.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
    }

    /**
     *
     */
    public void cerrarConexion(){
        databaseManager.close();
    }
}