/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio06;

/**
 *
 * @author alumno
 */
    public class Test {
    public static void main(String[] args) {
        // Crear objetos normales
        Libro libro = new Libro("El Quijote", "Cervantes", "Novela");
        Persona persona = new Persona("Juan", "Pérez", "JP");

        // Probar métodos
        System.out.println(libro.concatenarTodo());
        System.out.println(libro.obtenerIniciales());
        libro.contarVocales();
        System.out.println(libro.obtenerCadenaMasLarga());
        System.out.println(libro.buscarCadena("Novela")); // true

        System.out.println("------------------");

        System.out.println(persona.concatenarTodo());
        System.out.println(persona.obtenerIniciales());
        persona.contarVocales();
        System.out.println(persona.obtenerCadenaMasLarga());
        System.out.println(persona.buscarCadena("Ana")); // false

        System.out.println("------------------");

        // Polimorfismo
        Transformable t1 = new Libro("1984", "Orwell", "Distopía");
        Transformable t2 = new Persona("Ana", "García", "AG");

        System.out.println(t1.concatenarTodo());
        t1.contarVocales();
        System.out.println(t2.obtenerIniciales());
        System.out.println(t2.buscarCadena("AG"));
    }
    }
    
