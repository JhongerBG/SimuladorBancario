/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class gestorDeCuentas {
    
    Scanner sc = new Scanner(System.in);
    
    List<CuentaBancaria> listaCuentas = new ArrayList<>();
    
    public void crearCuentaAhorro(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--- REGISTRO DE CUENTA DE AHORROS ---");
        
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el documento de identificación: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial = 0;
        sc.nextLine(); // Limpiar el scanner
        
        CuentaAhorro nuevaCuentaAhorro = new CuentaAhorro(numCuenta, titular, saldoInicial);
        
        // 4. Guardar la cuenta en la lista
        listaCuentas.add(nuevaCuentaAhorro);
        
        System.out.println("Cuenta de Ahorros creada con exito para " + nombre + "!");
    }
    
    public void crearCuentaCorriente(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--- REGISTRO DE CUENTA CORRIENTE ---");
        
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el documento de identificación: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial = 0;
        sc.nextLine(); // Limpiar el scanner
        
        CuentaCorriente nuevaCuentaCorriente = new CuentaCorriente(numCuenta, titular, saldoInicial);
        
        // 4. Guardar la cuenta en la lista
        listaCuentas.add(nuevaCuentaCorriente);
        
        System.out.println("Cuenta de Corriente creada con exito para " + nombre + "!");
    }
    
    public void crearCuentaEmpresarial(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--- REGISTRO DE CUENTA EMPRESARIAL ---");
        
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el documento de identificación: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial = 0;
        sc.nextLine(); // Limpiar el scanner
        
        CuentaEmpresarial nuevaCuentaEmpresarial = new CuentaEmpresarial(numCuenta, titular, saldoInicial);
        
        // 4. Guardar la cuenta en la lista
        listaCuentas.add(nuevaCuentaEmpresarial);
        
        System.out.println("Cuenta de Corriente creada con exito para " + nombre + "!");
    }
    
    public void consultarCuentasCreadas(){
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n================ LISTADO GENERAL DE CUENTAS ================");
        if(listaCuentas.isEmpty()){
            System.out.println("NO SE HA CREADO NINGUNA CUENTA!! D:");
        }else{
            for (CuentaBancaria cuenta : listaCuentas) {
                System.out.println("Numero de Cuenta: " + cuenta.getNumeroCuenta() +
                                   " | Titular: " + cuenta.getTitular().getNombreTitular() + // Accedes a la Persona y luego a su nombre
                                   " | Tipo: " + cuenta.getTipoCuenta() +
                                   " | Saldo: $" + cuenta.getSaldo() +
                                   " | Estado: " + (cuenta.isEstado() ? "Activa" : "Inactiva"));
            }
        }
        System.out.println("============================================================");
    }
}
