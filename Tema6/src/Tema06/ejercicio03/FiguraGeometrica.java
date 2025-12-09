/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio03;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    }


