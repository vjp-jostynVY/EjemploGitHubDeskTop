/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio12;

/**
 *
 * @author alumno
 */
    public final class Videojuego extends ContenidoAlquiler {

    private int horasEstimadas;
    private Estudio estudio;

    // Constructor por defecto
    public Videojuego() {
        super();
        this.horasEstimadas = 10;
        this.estudio = new Estudio();
    }

    // Constructor con título y horas
    public Videojuego(String titulo, int horasEstimadas) {
        super(titulo, "");
        this.horasEstimadas = horasEstimadas;
        this.estudio = new Estudio();
    }

    // Constructor con todos los atributos excepto entregado
    public Videojuego(String titulo, String genero, int horasEstimadas, Estudio estudio) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.estudio = estudio;
    }

    @Override
    public float valorar() {
        System.out.println("\nValorando el videojuego: " + titulo);
        int exclusivos = pedirValor("Contenidos exclusivos");
        int gameplay = pedirValor("Gameplay");
        int innovacion = pedirValor("Innovación");

        float media = (exclusivos + gameplay + innovacion) / 3f;
        System.out.println("Valoración media: " + media);

        return media;
    }

    @Override
    public void entregar() {
        if (!entregado) {
            entregado = true;
            System.out.println("Has alquilado " + titulo + " de " + estudio.getNombre());
        } else {
            System.out.println(titulo + " no está disponible.");
        }
    }

    @Override
    public void devolver() {
        if (entregado) {
            entregado = false;
            System.out.println(titulo + " de " + estudio.getNombre() +
                    " devuelto correctamente.\nSi te ha gustado, prueba el último lanzamiento: "
                    + estudio.getUltimoLanzamiento());
        } else {
            System.out.println("No puedes devolver este videojuego porque no está alquilado.");
        }
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }
    }
    
