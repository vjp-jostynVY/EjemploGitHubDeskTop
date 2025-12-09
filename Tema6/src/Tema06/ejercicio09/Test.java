/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio09;

/**
 *
 * @author alumno
 */
    public class Test {
    public static void main(String[] args) {

        // Persona
        Persona p = new Persona("12345678A", 25000);
        double impuestoPersona = p.calcularImpuesto();
        System.out.println("Impuesto IRPF de la persona: " + impuestoPersona + " €");

        // Vehiculo
        Vehiculo v = new Vehiculo(1800, "ABC123", "12345678A");
        double impuestoVehiculo = v.calcularImpuesto();
        System.out.println("Impuesto de circulación del vehículo: " + impuestoVehiculo + " €");
    }
    }
    
