/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio02;

/**
 *
 * @author alumno
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("=== PRUEBA DIRECTA DE OBJETOS ===");

        Alumno a = new Alumno("Carlos", "1A");
        Profesor p = new Profesor("María", "Matemáticas");

        System.out.println(a.saludar());
        System.out.println(p.saludar());


        System.out.println("\n=== PRUEBA USANDO POLIMORFISMO ===");

        Persona persona;

        persona = new Alumno("Lucía", "2B");
        System.out.println(persona.saludar());

        persona = new Profesor("Jorge", "Historia");
        System.out.println(persona.saludar());
    }
    }


