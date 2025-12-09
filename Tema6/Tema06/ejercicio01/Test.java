/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio01;

/**
 *
 * @author alumno
 */
public class Test {
 public static void main(String[] args) {

        System.out.println("=== PRUEBA DIRECTA DE LOS OBJETOS ===");

        Suma s = new Suma(10, 5);
        s.realizarOperacion();

        Multiplicacion m = new Multiplicacion(10, 3);
        m.realizarOperacion();

        Potencia p = new Potencia(2, 4);
        p.realizarOperacion();


        System.out.println("\n=== PRUEBA USANDO POLIMORFISMO ===");

        Calculadora c;

        c = new Suma(20, 30);
        c.realizarOperacion();

        c = new Multiplicacion(7, 5);
        c.realizarOperacion();

        c = new Potencia(3, 3);
        c.realizarOperacion();
    }
}


