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
    //DEBUG
    public void Debug(){
    Persona titular = new Persona("Johan", 22500293);
    CuentaEmpresarial nuevaCuentaEmpresarial = new CuentaEmpresarial(13286767, titular, 200000);
        
    // 4. Guardar la cuenta en la lista
    listaCuentas.add(nuevaCuentaEmpresarial);
    
    }
    //FIN DEBUG
    public void crearCuentaAhorro(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--- REGISTRO DE CUENTA DE AHORROS ---");
        
        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el documento de identificacion: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial;
        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = sc.nextDouble();
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
        
        System.out.print("Ingrese el documento de identificacion: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial;
        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = sc.nextDouble();
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
        
        System.out.print("Ingrese el documento de identificacion: ");
        int documento = sc.nextInt();
        sc.nextLine(); // Limpiar el scanner
        
        // Creamos el objeto de la Persona para esta cuenta
        Persona titular = new Persona(nombre, documento);
        
        System.out.print("Ingrese el numero de cuenta a asignar: ");
        int numCuenta = sc.nextInt();
        
        double saldoInicial;
        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = sc.nextDouble();
        sc.nextLine(); // Limpiar el scanner
        
        CuentaEmpresarial nuevaCuentaEmpresarial = new CuentaEmpresarial(numCuenta, titular, saldoInicial);
        
        // 4. Guardar la cuenta en la lista
        listaCuentas.add(nuevaCuentaEmpresarial);
        
        System.out.println("Cuenta Empresarial creada con exito para " + nombre + "!");
    }
    
    public void DepositarYBuscarCuenta(){
        
        String tipoDeCuenta = "TipoCuenta";
        int numCuenta;
        char menusel;
        int indice;
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--------DEPOSITAR A UNA CUENTA--------\n");
        System.out.println("a - Cuenta ahorro");
        System.out.println("b - Cuenta corriente");
        System.out.println("c - Cuenta empresarial");
        System.out.print("\nIngresa el tipo de cuenta a la que desea depositar:\n>>");
        menusel = sc.next().charAt(0);
        
        switch (menusel) {
            case 'a':
                tipoDeCuenta = "Ahorro";
                break;
            case 'b':
                tipoDeCuenta = "Corriente";
                break;
            case 'c':
                tipoDeCuenta = "Empresarial";
                break;
            default:
                System.out.println("TIPO DE CUENTA NO VALIDA!!");
                break;
        }
        
        System.out.print("Ingrese el numero de la cuenta a la que desea depositar:\n>>");
        numCuenta = sc.nextInt();
        
        for(int i=0;i < listaCuentas.size(); i++){
            if(listaCuentas.get(i).getNumeroCuenta() == numCuenta){
                if(listaCuentas.get(i).getTipoCuenta().equals(tipoDeCuenta)){
                    indice = i;
                    char opc;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("\n--------DEPOSITAR A UNA CUENTA--------\n");
                    System.out.println("Titular: " + listaCuentas.get(indice).getTitular().getNombreTitular());
                    System.out.println("Numero de cuenta: " + listaCuentas.get(indice).getNumeroCuenta());
                    System.out.println("Tipo de cuenta: " + tipoDeCuenta  + "\n\n");

                    System.out.print("Ingresa el monto que desea depositar: \n>>");
                    double monto = sc.nextDouble();

                    System.out.println("Desea depositar $" + monto + "en esta cuenta(si|no)?");
                    opc = sc.next().toLowerCase().charAt(0);
                    sc.nextLine();

                    if(opc == 's'){
                        switch(tipoDeCuenta){
                            case "Ahorro":
                                listaCuentas.get(indice).depositar(monto);
                                System.out.println("Deposito realizado con exito!!");
                                System.out.print("Presiona ENTER para regresar al menu principal...");
                                sc.nextLine();
                            break;
                            case "Corriente":
                                listaCuentas.get(indice).depositar(monto);
                                System.out.println("Deposito realizado con exito!!");
                                System.out.print("Presiona ENTER para regresar al menu principal...");
                                sc.nextLine();
                            break;
                            case "Empresarial":
                                if(monto >= 100000){
                                    listaCuentas.get(indice).depositar(monto);
                                    System.out.println("Deposito realizado con exito!!");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                    
                                }else{
                                    System.out.println("MONTO DE DEPOSITO INVALIDO!!");
                                    System.out.println("EL MONTO MINIMO DEBE DE SER: 100.000");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }
                            break;
                        }
                    }
                }else{
                    System.out.println("EL NUMERO DE CUENTA NO ESTA ASOCIADA A UNA CUENTA TIPO " + tipoDeCuenta.toUpperCase());
                    System.out.print("Presiona ENTER para regresar al menu principal...");
                    sc.nextLine();
                }
            }else{
                System.out.println("NO HAY REGISTRADA NINGUNA CUENTA CON ESE NUMERO!!");
                System.out.print("Presiona ENTER para regresar al menu principal...");
                sc.nextLine();
            }
        }
    }
    
    public void RetirarYBuscarCuenta(){
        String tipoDeCuenta = "TipoCuenta";
        int numCuenta;
        char menusel;
        int indice;
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n-----RETIRAR DINERO DE UNA CUENTA-----\n");
        System.out.println("a - Cuenta ahorro");
        System.out.println("b - Cuenta corriente");
        System.out.println("c - Cuenta empresarial");
        System.out.print("\nIngresa el tipo de cuenta de la que desea hacer el retiro:\n>>");
        menusel = sc.next().charAt(0);
        
        switch (menusel) {
            case 'a':
                tipoDeCuenta = "Ahorro";
                break;
            case 'b':
                tipoDeCuenta = "Corriente";
                break;
            case 'c':
                tipoDeCuenta = "Empresarial";
                break;
            default:
                System.out.println("TIPO DE CUENTA NO VALIDA!!");
                break;
        }
        
        System.out.print("Ingrese el numero de la cuenta a la que desea hacer el retiro:\n>>");
        numCuenta = sc.nextInt();
        
        for(int i=0;i < listaCuentas.size(); i++){
            if(listaCuentas.get(i).getNumeroCuenta() == numCuenta){
                if(listaCuentas.get(i).getTipoCuenta().equals(tipoDeCuenta)){
                    indice = i;
                    char opc;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("\n-----RETIRAR DINERO DE UNA CUENTA-----\n");
                    System.out.println("Titular: " + listaCuentas.get(indice).getTitular().getNombreTitular());
                    System.out.println("Numero de cuenta: " + listaCuentas.get(indice).getNumeroCuenta());
                    System.out.println("Tipo de cuenta: " + tipoDeCuenta  + "\n\n");

                    System.out.print("Ingresa el monto que desea retirar: \n>>");
                    double monto = sc.nextDouble();

                    System.out.println("Desea depositar $" + monto + "en esta cuenta(si|no)?");
                    opc = sc.next().toLowerCase().charAt(0);
                    sc.nextLine();

                    if(opc == 's'){
                        switch(tipoDeCuenta){
                            case "Ahorro":
                                CuentaAhorro cuentaA = (CuentaAhorro) listaCuentas.get(indice);
                                if(cuentaA.confirmarRetiro(monto) == true){
                                    listaCuentas.get(indice).retirarMonto(monto);
                                    System.out.println("Retiro realizado con exito!!");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }else{
                                    System.out.println("MONTO DE RETIRO INVALIDO!!");
                                    System.out.println("EL SALDO DE LA CUENTA NO PUEDE BAJAR DE LOS: 20.000");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }
                            break;
                            case "Corriente":
                                CuentaCorriente cuentaC = (CuentaCorriente) listaCuentas.get(indice);
                                if(cuentaC.confirmarRetiro(monto) == true){
                                    listaCuentas.get(indice).retirarMonto(monto);
                                    System.out.println("Retiro realizado con exito!!");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }else{
                                    System.out.println("MONTO DE RETIRO INVALIDO!!");
                                    System.out.println("EL SALDO DE LA CUENTA NO PUEDE BAJAR DE LOS: 20.000");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }
                            break;
                            case "Empresarial":
                                CuentaCorriente cuentaE = (CuentaCorriente) listaCuentas.get(indice);
                                if(cuentaE.confirmarRetiro(monto) == true){
                                    listaCuentas.get(indice).retirarMonto(monto);
                                    System.out.println("Retiro realizado con exito!!");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }else{
                                    System.out.println("MONTO DE RETIRO INVALIDO!!");
                                    System.out.println("EL SALDO DE LA CUENTA NO PUEDE BAJAR DE LOS: 20.000");
                                    System.out.print("Presiona ENTER para regresar al menu principal...");
                                    sc.nextLine();
                                }
                            break;
                        }
                    }
                }else{
                    System.out.println("EL NUMERO DE CUENTA NO ESTA ASOCIADA A UNA CUENTA TIPO " + tipoDeCuenta.toUpperCase());
                    System.out.print("Presiona ENTER para regresar al menu principal...");
                    sc.nextLine();
                }
            }else{
                System.out.println("NO HAY REGISTRADA NINGUNA CUENTA CON ESE NUMERO!!");
                System.out.print("Presiona ENTER para regresar al menu principal...");
                sc.nextLine();
            }
        }
    }
    
    public void CerrarCuenta(){
        String tipoDeCuenta = "TipoCuenta";
        int numCuenta;
        char menusel;
        int indice;
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--------CANCELAR  UNA  CUENTA--------\n");
        System.out.println("a - Cuenta ahorro");
        System.out.println("b - Cuenta corriente");
        System.out.println("c - Cuenta empresarial");
        System.out.print("\nIngresa el tipo de cuenta a la que desea depositar:\n>>");
        menusel = sc.next().charAt(0);
        
        switch (menusel) {
            case 'a':
                tipoDeCuenta = "Ahorro";
                break;
            case 'b':
                tipoDeCuenta = "Corriente";
                break;
            case 'c':
                tipoDeCuenta = "Empresarial";
                break;
            default:
                System.out.println("TIPO DE CUENTA NO VALIDA!!");
                break;
        }
        
        System.out.print("Ingrese el numero de la cuenta a la que desea depositar:\n>>");
        numCuenta = sc.nextInt();
        
        for(int i=0;i < listaCuentas.size(); i++){
            if(listaCuentas.get(i).getNumeroCuenta() == numCuenta){
                if(listaCuentas.get(i).getTipoCuenta().equals(tipoDeCuenta)){
                    indice = i;
                    char opc;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("\n--------CANCELAR  UNA  CUENTA--------\n");
                    System.out.println("Titular: " + listaCuentas.get(indice).getTitular().getNombreTitular());
                    System.out.println("Numero de cuenta: " + listaCuentas.get(indice).getNumeroCuenta());
                    System.out.println("Tipo de cuenta: " + tipoDeCuenta  + "\n\n");

                    System.out.println("Desea CANCELAR esta cuenta(si|no)?");
                    opc = sc.next().toLowerCase().charAt(0);
                    sc.nextLine();
                    if(opc == 's'){
                        listaCuentas.get(indice).cerrarCuenta();
                    }
                }
            }
        }
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
                                   " | Estado: " + (cuenta.getEstado() ? "Activa" : "Inactiva"));
            }
        }
        System.out.println("============================================================");
    }
}
