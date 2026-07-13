package com.mycompany.simuladorbancario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALUMNO
 */
public class Persona {
    private String nombreTitular;
    private int documentoDeIdentificacion;
    
    public Persona(String nombreTitular, int documentoDeIdentificacion) {
        this.nombreTitular = nombreTitular;
        this.documentoDeIdentificacion = documentoDeIdentificacion;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setDocumento(int documentoDeIdentificacion) {
        this.documentoDeIdentificacion = documentoDeIdentificacion;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public int getDocumento() {
        return documentoDeIdentificacion;
    }
}
