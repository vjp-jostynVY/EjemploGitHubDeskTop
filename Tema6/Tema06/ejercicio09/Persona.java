/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio09;

/**
 *
 * @author alumno
 */
    public class Persona implements Gravable {
    private String dni;
    private double ingresosAnuales;

    public Persona(String dni, double ingresosAnuales) {
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = 0;

        if (ingresosAnuales <= 12450) {
            impuesto = ingresosAnuales * 0.19;
        } else if (ingresosAnuales <= 20200) {
            impuesto = ingresosAnuales * 0.24;
        } else if (ingresosAnuales <= 35200) {
            impuesto = ingresosAnuales * 0.30;
        } else if (ingresosAnuales <= 60000) {
            impuesto = ingresosAnuales * 0.37;
        } else if (ingresosAnuales <= 300000) {
            impuesto = ingresosAnuales * 0.45;
        } else {
            impuesto = ingresosAnuales * 0.47;
        }

        return impuesto;
    }

    @Override
    public void gravar() {
        // vacío como pide el enunciado
    }
    }
    
