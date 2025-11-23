/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class ejercicio25 {
    public class Ordenador {

    protected int memoriaRAM;
    protected int capacidadDisco;
    protected String modeloProcesador;
    protected String modeloGrafica;
    protected double precio;

    public Ordenador(int memoriaRAM, int capacidadDisco, String modeloProcesador, String modeloGrafica, double precio) {
        this.memoriaRAM = memoriaRAM;
        this.capacidadDisco = capacidadDisco;
        this.modeloProcesador = modeloProcesador;
        this.modeloGrafica = modeloGrafica;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "RAM: " + memoriaRAM + "GB, Disco: " + capacidadDisco + "GB, CPU: " + modeloProcesador +
                ", GPU: " + modeloGrafica + ", Precio: " + precio + "€";
        
    }
    }
}

