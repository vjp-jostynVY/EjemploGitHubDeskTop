/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio06;

/**
 *
 * @author alumno
 */
    public class Persona implements Transformable {
    private String nombre;
    private String apellidos;
    private String alias;

    // Constructor
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }

    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
        String todas = nombre + apellidos + alias;
        int contador = 0;
        for (int i = 0; i < todas.length(); i++) {
            char c = Character.toLowerCase(todas.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vocales en Persona: " + contador);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = nombre;
        if (apellidos.length() > masLarga.length()) masLarga = apellidos;
        if (alias.length() > masLarga.length()) masLarga = alias;
        return masLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return nombre.equals(cadena) || apellidos.equals(cadena) || alias.equals(cadena);
    }
    }
    
