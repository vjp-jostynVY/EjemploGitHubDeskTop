/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio03;

/**
 *
 * @author alumno
 */
public class ClaseTest {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DIRECTA DE OBJETOS ===");

        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Cuadrado cu = new Cuadrado("Verde", 4);
        TrianguloRectangulo t = new TrianguloRectangulo("Amarillo", 3, 4);

        System.out.println("Área círculo: " + c.calcularArea());
        System.out.println("Perímetro círculo: " + c.calcularPerimetro());

        System.out.println("Área rectángulo: " + r.calcularArea());
        System.out.println("Perímetro rectángulo: " + r.calcularPerimetro());

        System.out.println("Área cuadrado: " + cu.calcularArea());
        System.out.println("Perímetro cuadrado: " + cu.calcularPerimetro());

        System.out.println("Área triángulo: " + t.calcularArea());
        System.out.println("Perímetro triángulo: " + t.calcularPerimetro());
        System.out.println("Tipo triángulo: " + t.tipoTriangulo());



        System.out.println("\n=== PRUEBA CON POLIMORFISMO ===");

        FiguraGeometrica fg;

        fg = new Circulo("Negro", 7);
        System.out.println("Área: " + fg.calcularArea());
        System.out.println("Perímetro: " + fg.calcularPerimetro());

        fg = new Rectangulo("Naranja", 2, 8);
        System.out.println("Área: " + fg.calcularArea());
        System.out.println("Perímetro: " + fg.calcularPerimetro());

        fg = new Cuadrado("Plata", 10);
        System.out.println("Área: " + fg.calcularArea());
        System.out.println("Perímetro: " + fg.calcularPerimetro());

        fg = new TrianguloRectangulo("Blanco", 6, 8);
        System.out.println("Área: " + fg.calcularArea());
        System.out.println("Perímetro: " + fg.calcularPerimetro());
    }
    }
    
