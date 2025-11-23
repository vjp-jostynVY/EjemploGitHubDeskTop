/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class subclase2 {
    public class Servidor extends Ordenador {

    private int monitor;
    private String teclado;
    private String raton;

    public Servidor(int ram, int disco, String procesador, String grafica,
                    double precio, int monitor, String teclado, String raton) {

        super(ram, disco, procesador, grafica, precio);
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String toString() {
        return "Servidor -> " + super.toString() +
                ", Monitor: " + monitor + ", Teclado: " + teclado +
                ", Ratón: " + raton;
    }
}

}
