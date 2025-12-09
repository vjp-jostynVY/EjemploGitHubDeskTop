/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    // Atributo común
    protected double numero;

    // Constructor
    public Calculadora(double numero) {
        this.numero = numero;
    }

    // Método abstracto
    public abstract void realizarOperacion();
    }

    

