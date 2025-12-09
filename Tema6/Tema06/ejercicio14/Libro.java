/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio14;

/**
 *
 * @author alumno
 */
public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.prestado = false; // siempre inicia sin prestar
    }

    @Override
    public void prestar() {
        System.out.println("Prestando libro...");
        prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo libro...");
        prestado = false;
    }

    @Override
    public void mostrarPrestado() {
        if (prestado) {
            System.out.println("El libro está prestado.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }
    }
    