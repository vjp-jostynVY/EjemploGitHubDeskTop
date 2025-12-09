/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio12;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public abstract class ContenidoAlquiler implements Alquilable {

    protected String titulo;
    protected boolean entregado;
    protected String genero;

    public ContenidoAlquiler() {
        this.titulo = "";
        this.entregado = false;
        this.genero = "";
    }

    public ContenidoAlquiler(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    // Método común para leer valores del 1 al 5
    protected int pedirValor(String categoria) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Valora " + categoria + " (1-5): ");
            valor = sc.nextInt();
        } while (valor < 1 || valor > 5);
        return valor;
    }

    // Método que cada subclase implementará
    public abstract float valorar();
    }
    
