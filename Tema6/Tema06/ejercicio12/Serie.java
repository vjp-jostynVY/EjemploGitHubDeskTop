/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio12;

/**
 *
 * @author alumno
 */
    public final class Serie extends ContenidoAlquiler {

    private int numeroTemporadas;
    private String creador;

    // Constructor por defecto
    public Serie() {
        super();
        this.numeroTemporadas = 3;
        this.creador = "";
    }

    // Constructor con título y creador
    public Serie(String titulo, String creador) {
        super(titulo, "");
        this.numeroTemporadas = 3;
        this.creador = creador;
    }

    // Constructor con todos los atributos excepto entregado
    public Serie(String titulo, String genero, int numeroTemporadas, String creador) {
        super(titulo, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
    }

    @Override
    public float valorar() {
        System.out.println("\nValorando la serie: " + titulo);
        int guion = pedirValor("Guion");
        int interpretacion = pedirValor("Interpretación");
        int fotografia = pedirValor("Fotografía");

        float media = (guion + interpretacion + fotografia) / 3f;
        System.out.println("Valoración media: " + media);

        return media;
    }

    @Override
    public void entregar() {
        if (!entregado) {
            entregado = true;
            System.out.println("Has alquilado " + titulo + " de " + creador);
        } else {
            System.out.println("La serie ya está alquilada y no se puede prestar.");
        }
    }

    @Override
    public void devolver() {
        if (entregado) {
            entregado = false;
            System.out.println(titulo + " de " + creador + " devuelta correctamente.");
        } else {
            System.out.println("La serie no está entregada, no se puede devolver.");
        }
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }
    }
    
