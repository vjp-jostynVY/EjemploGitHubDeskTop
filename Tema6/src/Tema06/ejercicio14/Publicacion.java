/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio14;

/**
 *
 * @author alumno
 */
public class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int añoPublicacion;

    public Publicacion(String codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
    }

