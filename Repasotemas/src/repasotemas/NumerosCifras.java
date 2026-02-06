/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasotemas;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class NumerosCifras {
    public static void main(String[] args) {
        // Creo el Scanner para poder leer datos desde el teclado
        Scanner entrada = new Scanner(System.in); 

        // Declaro la variable int para guardar el número.
        int numero;

        // Pido al usuario un numero de 4 cifras.
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        numero = entrada.nextInt();

        // Obtenemos cada cifra usando división y módulo (%)
        int primera = numero / 1000;           // Dividimos entre 1000 → nos queda la primera cifra
        int segunda = (numero / 100) % 10;     // Dividimos entre 100 y sacamos el resto de 10 → segunda cifra
        int tercera = (numero / 10) % 10;      // Dividimos entre 10 y sacamos el resto de 10 → tercera cifra
        int cuarta = numero % 10;              // Módulo 10 → nos da el resto de la división entre 10 → la última cifra

        // Mostramos cada cifra por pantalla
        System.out.println("La primera cifra es: " + primera);
        System.out.println("La segunda cifra es: " + segunda);
        System.out.println("La tercera cifra es: " + tercera);
        System.out.println("La cuarta cifra es: " + cuarta);

    }
  }

