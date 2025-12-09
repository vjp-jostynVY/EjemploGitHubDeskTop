/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio09;

/**
 *
 * @author alumno
 */
    public class Vehiculo implements Gravable {
    private int cc;
    private String matricula;
    private String dniPropietario;

    public Vehiculo(int cc, String matricula, String dniPropietario) {
        this.cc = cc;
        this.matricula = matricula;
        this.dniPropietario = dniPropietario;
    }

    @Override
    public double calcularImpuesto() {
        if (cc < 1000) {
            return 12;
        } else if (cc <= 1499) {
            return 34;
        } else if (cc <= 1999) {
            return 71;
        } else if (cc <= 2999) {
            return 122;
        } else {
            return 152;
        }
    }

    @Override
    public void gravar() {
        // vacío
    }
    }