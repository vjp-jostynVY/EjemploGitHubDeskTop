/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio14;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // === Crear Revista con datos del usuario ===
        System.out.println("=== Crear Revista ===");
        System.out.print("Código: ");
        String codRev = sc.nextLine();

        System.out.print("Título: ");
        String titRev = sc.nextLine();

        System.out.print("Año publicación: ");
        int añoRev = sc.nextInt();

        System.out.print("Número: ");
        int numRev = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Revista r1 = new Revista(codRev, titRev, añoRev, numRev);

        System.out.println("\nDatos de la revista creada:");
        r1.mostrarDatos();


        // === Crear Libro con datos del usuario ===
        System.out.println("\n=== Crear Libro ===");
        System.out.print("Código: ");
        String codLib = sc.nextLine();

        System.out.print("Título: ");
        String titLib = sc.nextLine();

        System.out.print("Año publicación: ");
        int añoLib = sc.nextInt();
        sc.nextLine();

        Libro l1 = new Libro(codLib, titLib, añoLib);

        System.out.println("\nDatos del libro creado:");
        l1.mostrarDatos();


        // === Prestar y devolver ===
        System.out.println("\n--- Prestando libro ---");
        l1.prestar();
        l1.mostrarDatos();

        System.out.println("\n--- Devolviendo libro ---");
        l1.devolver();
        l1.mostrarDatos();


        // === Polimorfismo ===
        System.out.println("\n=== POLIMORFISMO ===");

        Publicacion pubRev = new Revista("R002", "National Geographic", 2024, 150);
        Prestable pubLib = new Libro("L002", "El Quijote", 2020);

        System.out.println("\nDatos revista (Publicacion):");
        pubRev.mostrarDatos();

        System.out.println("\nOperaciones libro (Prestable):");
        pubLib.prestar();
        pubLib.mostrarPrestado();
        pubLib.devolver();
        pubLib.mostrarPrestado();

        sc.close();
    }
    }
    
