/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio04;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DIRECTA ===");

        Perro perro = new Perro("Firulais", 3, 10.5);
        Lobo lobo = new Lobo("Lobo Gris", 5, 35.0);
        Leon leon = new Leon("Simba", 7, 190.0);
        Gato gato = new Gato("Michi", 2, 4.3);

        mostrarInfo(perro);
        mostrarInfo(lobo);
        mostrarInfo(leon);
        mostrarInfo(gato);
    

        System.out.println("\n=== PRUEBA CON POLIMORFISMO ===");

        Animal animal;

        animal = new Perro("Rex", 4, 12.0);
        mostrarInfo(animal);

        animal = new Lobo("Alpha", 6, 40.0);
        mostrarInfo(animal);

        animal = new Leon("Nala", 5, 150.0);
        mostrarInfo(animal);

        animal = new Gato("Pelusa", 1, 3.2);
        mostrarInfo(animal);
    }

    // Método auxiliar para no repetir código
    public static void mostrarInfo(Animal a) {
        System.out.println("-------------------------");
        a.mostrarDatos();
        System.out.println("Sonido: " + a.mostrarSonido());
        System.out.println("Alimentación: " + a.mostrarAlimentacion());
        System.out.println("Hábitat: " + a.mostrarHabitat());
        System.out.println("Nombre científico: " + a.mostrarNombreCientifico());
    }
    } 
    
