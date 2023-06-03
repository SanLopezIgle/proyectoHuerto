package com.huerto.controller;

import java.awt.event.ActionListener;
import java.sql.Connection;

import com.huerto.controller.*;
import com.huerto.model.*;
import com.huerto.view.*;


public class HuertoController{
    
    public static void main(String[] args){
        View.mostrarHuertoIU();
    }
    
    public static void abrirCatalogo(){
        View.mostrarHuertoCatalogoIU();
    }
    
    public static void abrirPersonalizado(){
        View.mostrarHuertoPersonalizadoIU();
    }
    
    
    /*

    private HuertoIU principal;
    private HuertoCatalogoIU catalogoIU;
    private HuertoPersonalizadoIU personalizadoIU;

    public HuertoController (HuertoIU principal, HuertoCatalogoIU catalogoIU, HuertoPersonalizadoIU personalizadoIU){
        this.principal = principal;
        this.catalogoIU = catalogoIU;
        this.personalizadoIU = personalizadoIU;

        // Asignamos los controladores a los botones
        principal.getbHuertoCatalogo().addActionListener(e -> abrirHuertoCatalogoUI());
        principal.getbHuertoPersonalizado().addActionListener(e -> abrirHuertoPersonalizadoUI());
    }
*/
}
