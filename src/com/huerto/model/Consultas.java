package com.huerto.model;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.huerto.view.*;

public class Consultas {
    private DatabaseManager databaseManager;
    ResultSet resultSet;

    public Consultas(){
        databaseManager = DatabaseManager.getInstance();
    }

    
    public boolean insertarCliente(Cliente cliente){
        Connection conexion = databaseManager.getConnection();
        try{
            String consulta = "insert into cliente (dni, nombre) values (?,?)";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.setString(1, cliente.getDni().toUpperCase());
            st.setString(2, cliente.getNombre().toUpperCase());
            st.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        }finally {
            cerrarConexion();
        }
    }

    public ArrayList<DatosHuerto> listaHuertos(){
        Connection conexion = databaseManager.getConnection();
        ArrayList<DatosHuerto> listaHuertos = new ArrayList<>();
        try{
            String consulta = "select * from tener";
            PreparedStatement st = conexion.prepareStatement(consulta);
            resultSet = st.executeQuery();
            while(resultSet.next()){
                DatosHuerto datos = new DatosHuerto();
                datos.setPlanta_id(resultSet.getInt("idPlanta"));
                datos.setIdHuerto(resultSet.getInt("idHuerto"));
                listaHuertos.add(datos);
            }
        }catch (SQLException e){
            e.getMessage();
        }finally {
            cerrarConexion();
        }
        return listaHuertos;
    }

    public void cerrarConexion(){
        databaseManager.close();
    }
}