/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio03;

/**
 *
 * @author alumno
 */
public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Perímetro = base + altura + hipotenusa
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Método que calcula la hipotenusa usando Pitágoras
    public double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    // Método para saber si es equilátero, isósceles o escaleno
    public String tipoTriangulo() {
        double h = calcularHipotenusa();

          if (base == altura && altura == h) {
            return "Equilátero";
        } else if (base == altura || base == h || altura == h) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
        }
        }
        
