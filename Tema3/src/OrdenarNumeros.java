/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class OrdenarNumeros {
    public static void main(String[] args) {

// importo el Scanner y Creo el objeto entrada para leer datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Pido los cuatro números al usuario mostrando mensajes por pantalla
        System.out.print("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt(); // Uso int porque es un número entero

        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int numero3 = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int numero4 = entrada.nextInt();

        // Guardamos los números en un arreglo para poder ordenarlos más fácilmente
        int[] numeros = {numero1, numero2, numero3, numero4};

        // Uso el método de la burbuja para ordenar de menor a mayor
        // Uso dos ciclos for porque necesitamos comparar todos los números varias veces
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Comparo dos números consecutivos
                if (numeros[j] > numeros[j + 1]) {
                    // Uso if porque solo intercambio si el número de la izquierda es mayor
                    int temp = numeros[j]; // guardo temporalmente el número mayor
                    numeros[j] = numeros[j + 1]; // pongo el menor en su lugar
                    numeros[j + 1] = temp; // pongo el mayor en la posición siguiente
                }
            }
        }

        // Por ultimo muestro los números ya ordenados
        System.out.println("El orden de los números introducidos es: " 
                           + numeros[0] + " - " 
                           + numeros[1] + " - " 
                           + numeros[2] + " - " 
                           + numeros[3]);

      
    }
}

