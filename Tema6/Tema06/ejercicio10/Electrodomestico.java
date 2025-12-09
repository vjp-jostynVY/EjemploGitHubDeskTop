/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio10;

/**
 *
 * @author alumno
 */
    import java.util.function.Function;

public class Electrodomestico implements ConsumoEnergetico {

    private float kwh;
    private float precioKwh;
    private String eficiencia;

    // Función para obtener el factor de eficiencia (programación funcional)
    private static final Function<String, Float> factoresEficiencia = ef -> {
        return switch (ef) {
            case "A++" -> 0.5f;
            case "A+" -> 0.7f;
            case "A" -> 1f;
            case "B" -> 1.2f;
            default -> 1f; // por si ponen algo raro
        };
    };

    public Electrodomestico(float kwh, float precioKwh, String eficiencia) {
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }

    @Override
    public float calcularConsumo(float horasDeUso) {
        float factor = factoresEficiencia.apply(eficiencia);
        return horasDeUso * kwh * factor;
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        return calcularConsumo(horasDeUso) * precioKwh;
    }
}

