package com.huerto.controller;

import com.huerto.view.HuertoCatalogoIU;
import com.huerto.view.HuertoIU;
import com.huerto.view.HuertoPersonalizadoIU;

import java.awt.event.ActionListener;

public class HuertoController{

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

    /**
     * Metodo que abre la ventana de HuertoCatalagoUI
     */
    private void abrirHuertoCatalogoUI(){
        catalogoIU.setVisible(true);
        personalizadoIU.setVisible(false);
    }

    /**
     * Metodo que abre la ventana de HuertoPersonalizadoUI
     */
    private void abrirHuertoPersonalizadoUI(){
        personalizadoIU.setVisible(true);
        catalogoIU.setVisible(false);
    }
}
