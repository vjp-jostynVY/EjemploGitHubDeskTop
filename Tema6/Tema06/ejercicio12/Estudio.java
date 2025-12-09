/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio12;

/**
 *
 * @author alumno
 */
    public class Estudio {
    private String nombre;
    private String ultimoLanzamiento;

    public Estudio() {
        this.nombre = "";
        this.ultimoLanzamiento = "";
    }

    public Estudio(String nombre, String ultimoLanzamiento) {
        this.nombre = nombre;
        this.ultimoLanzamiento = ultimoLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUltimoLanzamiento() {
        return ultimoLanzamiento;
    }
    }


