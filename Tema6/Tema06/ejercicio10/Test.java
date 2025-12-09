/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio10;

/**
 *
 * @author alumno
 */
    public class Test {
    public static void main(String[] args) {

        Electrodomestico nevera = new Electrodomestico(1.2f, 0.18f, "A++");
        Electrodomestico microondas = new Electrodomestico(2.0f, 0.18f, "A+");
        Electrodomestico lavadora = new Electrodomestico(1.5f, 0.18f, "B");

        float horas = 5;

        System.out.println("Nevera:");
        System.out.println("Consumo: " + nevera.calcularConsumo(horas) + " kWh");
        System.out.println("Factura: " + nevera.calcularFactura(horas) + " €");

        System.out.println("\nMicroondas:");
        System.out.println("Consumo: " + microondas.calcularConsumo(horas) + " kWh");
        System.out.println("Factura: " + microondas.calcularFactura(horas) + " €");

        System.out.println("\nLavadora:");
        System.out.println("Consumo: " + lavadora.calcularConsumo(horas) + " kWh");
        System.out.println("Factura: " + lavadora.calcularFactura(horas) + " €");
    }
    }


