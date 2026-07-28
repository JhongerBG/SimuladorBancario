/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

/**
 *
 * @author ALUMNO
 */
public abstract class CuentaBancaria {
    private Persona titular;
    private int numeroCuenta;
    private String tipoCuenta;
    private boolean estado;
    protected double saldo;
    private double monto;
    
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

    public boolean getEstado() {
        return estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }
    
    
    
    public void depositar(double monto){
        
        saldo = saldo + monto;
        
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    public void retirarMonto(double monto){
    
    }
    
    public abstract boolean confirmarRetiro(double monto);
    
    public void modificarDatos(){
    
    }
    
    public void cerrarCuenta(){
        estado = false;
    }
}
