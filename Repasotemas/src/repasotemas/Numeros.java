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
public class Numeros {
    public static void main(String[] args) {
       // Pongo Scanner para poder leer los datos que introduce el usuario por teclado
        Scanner entrada = new Scanner(System.in); 

        // Declaro las variables donde guardaremos los 3 números y los resultados
        int numero1, numero2, numero3;
        int suma, producto;

        // Luego pido los números al usuario y los guardamos en las variables.
        System.out.print("Por favor, introduzca el primer número: ");
        numero1 = entrada.nextInt();

        System.out.print("Por favor, introduzca el segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Por favor, introduzca el tercer número: ");
        numero3 = entrada.nextInt();

        // Calculamos la suma y el producto de los numeros 
        suma = numero1 + numero2 + numero3;
        producto = numero1 * numero2 * numero3;

        // Mostramos los resultados por pantalla
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
        
    }
  }

