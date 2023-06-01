package com.huerto.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    /**
     *
     */
    public void mostrarTablaHuertos(){
        Connection conexion = databaseManager.getConnection();
        try{
            String consulta = "SELECT h.idHuerto, p.especie FROM huerto h INNER JOIN planta p ON h.planta_id = p.idPlanta";
            PreparedStatement st = conexion.prepareStatement(consulta);
            ResultSet resultado = st.executeQuery();

            // sout

            while(resultado.next()){
                int idHuerto = resultado.getInt("idHuerto");
                String especie = resultado.getString("especie");
                // sout
            }
            resultado.close();
            st.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            cerrarConexion();
        }
    }

    /**
     *
     * @param idHuerto
     * @param idPlanta
     */
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