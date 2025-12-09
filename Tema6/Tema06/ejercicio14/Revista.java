/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio14;

/**
 *
 * @author alumno
 */
public class Revista extends Publicacion {

    private int numero;

    public Revista(String codigo, String titulo, int añoPublicacion, int numero) {
        super(codigo, titulo, añoPublicacion);
        this.numero = numero;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número: " + numero);
    }
    }


