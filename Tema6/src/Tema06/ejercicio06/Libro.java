/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio06;

/**
 *
 * @author alumno
 */
    public class Libro implements Transformable {
    private String titulo;
    private String autor;
    private String genero;

    // Constructor
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    // Implementación de los métodos de Transformable
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
        String todas = titulo + autor + genero;
        int contador = 0;
        for (int i = 0; i < todas.length(); i++) {
            char c = Character.toLowerCase(todas.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vocales en Libro: " + contador);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = titulo;
        if (autor.length() > masLarga.length()) masLarga = autor;
        if (genero.length() > masLarga.length()) masLarga = genero;
        return masLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return titulo.equals(cadena) || autor.equals(cadena) || genero.equals(cadena);
    }
    }
    
