/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos abstractos
    public abstract String mostrarSonido();
    public abstract String mostrarAlimentacion();
    public abstract String mostrarHabitat();
    public abstract String mostrarNombreCientifico();

    // Método para mostrar datos generales
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }
    }


