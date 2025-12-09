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
public class Carrito implements Descontable, Pagable {

    private float total;

    public Carrito(float total) {
        this.total = total;
    }

    @Override
    public void aplicarDescuento(float descuento) {
        total = total - (total * descuento / 100);
    }

    @Override
    public float pagoTarjeta() {
        return total + 5; // comisión fija
    }

    @Override
    public float pagoEfectivo() {
        return total; // sin comisión
    }

    @Override
    public float pagoPaypal() {
        return total * 1.03f; // +3%
    }

    @Override
    public void procesarPago() {
        Scanner sc = new Scanner(System.in);

        // Descuento si el total supera 50€
        if (total > 50) {
            aplicarDescuento(10);
            System.out.println("Se aplicó un descuento del 10% por compras mayores a 50€.");
        }

        System.out.println("\nMétodo de pago:");
        System.out.println("1. Tarjeta (+5€)");
        System.out.println("2. Efectivo");
        System.out.println("3. PayPal (+3%)");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        float totalFinal = 0;

        switch (opcion) {
            case 1 -> totalFinal = pagoTarjeta();
            case 2 -> totalFinal = pagoEfectivo();
            case 3 -> totalFinal = pagoPaypal();
            default -> System.out.println("Opción no válida");
        }

        System.out.println("\n💳 Pago procesado con éxito.");
        System.out.println("Total final: " + totalFinal + " €");
    }
    }  
    
