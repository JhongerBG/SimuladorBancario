/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

/**
 *
 * @author ALUMNO
 */
public class CuentaBancaria {
    private Persona titular;
    private int numeroCuenta;
    private String tipoCuenta;
    private boolean estado;
    private double saldo;
    
    public CuentaBancaria(int numeroCuenta, Persona titular, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
        this.estado = true; // Toda cuenta inicia activa
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }
    
    
    
    public void depositar(){
        
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    public void retirarMonto(){
    
    }
    
    public void modificarDatos(){
    
    }
    
    public void cerrarCuenta(){
    
    }
}
