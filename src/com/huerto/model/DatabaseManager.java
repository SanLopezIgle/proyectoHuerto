package com.huerto.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

    // Atributos
    private static DatabaseManager instance;
    private Connection conexion;

    private static final String url = "jdbc:sqlite";

    /**
     * Constructor, crea la conexion con la BD
     */
    private DatabaseManager(){
        try{
            // Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(url);
        }catch (SQLException e){
            e.getMessage();
        }
    }

    /**
     * Método que utiliza el patrón singleton para asegurarse de que solo
     * haya una instancia de la BD
     * @return objeto DatabaseManager
     */
    public static synchronized DatabaseManager getInstance(){
        if(instance == null) instance = new DatabaseManager();
        return instance;
    }

    /**
     * Metodo que establece la conexion
     * @return conexion con la BD
     */
    public Connection getConnection(){
        return conexion;
    }

    /**
     * Método que cierra la conexión
     */
    public void close(){
        try{
            conexion.close();
        } catch (SQLException e){
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
