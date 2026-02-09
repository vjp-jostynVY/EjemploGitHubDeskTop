/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class PositivoNegativo {
    public static void main(String[] args) {
       // Importo Scanner y creo un objeto llamado entrada para poder leer lo que escribe el usuario
        Scanner entrada = new Scanner(System.in);

        // Muestro un mensaje para pedir al usuario que introduzca un numero
        System.out.print("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt(); //Uso int para poner un numero entero

        // Uso if para comprobar una condición
        if (numero > 0) {
            // Puse que el numero es mayor que 0 es positivo
            System.out.println("El número introducido es positivo");
        // Uso else if para poder comprobar otra condición distinta
        } else if (numero < 0) {
            // El número es menor que 0, es negativo
            System.out.println("El número introducido es negativo");
        // Por ultimo uso else en caso en que no se cumpla ninguna condicion anterior.
        } else {
            // Aqui puse si no es positivo ni negativo es 0
            System.out.println("El número introducido es cero");
        }

    }
}


