/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class DesgloseEuros {
    // Método que recibe un importe y calcula billetes y monedas
    // int importe: es el parámetro que recibe el método, la cantidad de dinero
    public static void calcularBilletesMonedas(int importe) {

        // Declaramos variables para guardar cuántos billetes/monedas hay de cada tipo
        int billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0;
        int monedas2 = 0, monedas1 = 0;

        // División entera (/) nos dice cuántos billetes caben
        // Por ejemplo, 232 / 50 = 4 (billetes de 50)
        billetes50 = importe / 50;

        // Módulo (%) nos da lo que sobra después de usar los billetes
        // Por ejemplo, 232 % 50 = 32 (queda por repartir)
        importe = importe % 50;

        // Repetimos el proceso para billetes de 20
        billetes20 = importe / 20;
        importe = importe % 20;

        // Billetes de 10
        billetes10 = importe / 10;
        importe = importe % 10;

        // Billetes de 5
        billetes5 = importe / 5;
        importe = importe % 5;

        // Monedas de 2
        monedas2 = importe / 2;
        importe = importe % 2;

        // Lo que queda son monedas de 1
        monedas1 = importe;

        // Mostramos el desglose, solo si hay al menos uno de cada tipo
        System.out.println("El dinero se descompone en:");

        // if: solo imprime si hay al menos un billete/moneda de ese tipo
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado teclado
        // Scanner nos permite leer datos introducidos por el usuario
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que introduzca la cantidad de dinero
        System.out.print("Por favor, indique una cantidad de dinero: ");

        // nextInt(): lee un número entero que escriba el usuario
        // int: porque trabajamos con euros, que son enteros
        int cantidad = teclado.nextInt();

        // Llamamos al método que calcula el desglose de billetes y monedas
        calcularBilletesMonedas(cantidad);

    }
}
