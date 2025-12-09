/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio01;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora {

    private double sumando;

    public Suma(double numero, double sumando) {
        super(numero); // Llama al constructor de Calculadora
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero + sumando;
        System.out.println("Resultado de la suma: " + resultado);
    }
    }


