/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio11;
   import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear suscripciones
        Suscripcion periodico = new SuscripcionPeriodico(20); // base 20€
        Suscripcion tv = new SuscripcionTV (40); // base 40€

        System.out.println("=== SISTEMA DE SUSCRIPCIONES ===");
        System.out.println("1. Suscripción Periódico");
        System.out.println("   Precio base: 20€ | IVA 10% | Precio final: " + periodico.calcularPrecio() + "€");
        System.out.println("2. Suscripción TV");
        System.out.println("   Precio base: 40€ | IVA 21% | Precio final: " + tv.calcularPrecio() + "€");

        System.out.print("\nSeleccione la suscripción que desea comprar: ");
        int opcion = sc.nextInt();

        float precioFinal = 0;

        switch (opcion) {
            case 1 -> precioFinal = periodico.calcularPrecio();
            case 2 -> precioFinal = tv.calcularPrecio();
            default -> {
                System.out.println("Opción inválida.");
                return;
            }
        }

        System.out.println("\nHas seleccionado una suscripción de " + precioFinal + " €");

        // Crear carrito con ese total
        Carrito c = new Carrito(precioFinal);

        // Procesar pago
        c.procesarPago();
    }
    } 
    
