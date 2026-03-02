/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema04;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ejercicio1 {
    // Creamos un método (subprograma)
    // int numero: es el parámetro que recibe el método
    public static String verificarNumero(int numero) {

        // Usamos if porque necesitamos tomar una decisión
        // según el valor del número
        // numero >= 0 significa que puede ser positivo o cero
        if (numero >= 0) {

            // return se usa para devolver un valor
            // En este caso devuelve el texto "positivo"
            return "positivo";

        } else {
            // else se ejecuta cuando la condición del if es falsa
            // Si no es >= 0, entonces es negativo
            return "negativo";
        }
    }

    // Método principal donde inicia el programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner llamado teclado
        // Lo usamos para leer lo que el usuario escribe
        Scanner entrada = new Scanner(System.in);

        // Mostramos mensaje en pantalla
        System.out.print("Por favor, introduzca un numero: ");

        // Usamos int porque trabajamos con números enteros
        // nextInt() permite leer un número entero desde el teclado
        int numero = entrada.nextInt();

        // Llamamos al método verificarNumero
        // Le enviamos el número que escribió el usuario
        // Guardamos lo que devuelve el método en una variable String
        String resultado = verificarNumero(numero);

        // Mostramos el resultado final en pantalla
        System.out.println("El número introducido es " + resultado);

        
    }
}

