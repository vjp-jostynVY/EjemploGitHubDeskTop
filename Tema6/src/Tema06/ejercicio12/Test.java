/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio12;

/**
 *
 * @author alumno
 */
    public class Test {
    public static void main(String[] args) {

        // Crear objetos
        Serie s1 = new Serie("Sousou no Frieren", "Kanehito Yamada");
        Estudio e1 = new Estudio("", "GTA VI");
        Videojuego v1 = new Videojuego("Genshin Impact", "Aventura", 60, e1);

        // === Pruebas con Serie ===
        System.out.println("\n=== PRUEBAS CON SERIE ===");
        ContenidoAlquiler contenido = s1;  // polimorfismo

        System.out.println("Estado entregado: " + contenido.esEntregado());
        contenido.entregar();
        contenido.valorar();
        System.out.println("Estado entregado: " + contenido.esEntregado());
        contenido.devolver();
        System.out.println("Estado entregado: " + contenido.esEntregado());

        // === Pruebas con Videojuego ===
        System.out.println("\n=== PRUEBAS CON VIDEOJUEGO ===");
        contenido = v1;

        System.out.println("Estado entregado: " + contenido.esEntregado());
        contenido.entregar();
        contenido.valorar();
        System.out.println("Estado entregado: " + contenido.esEntregado());
        contenido.devolver();
        System.out.println("Estado entregado: " + contenido.esEntregado());
    }
    }
    
