/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;
import java.util.Scanner; 

/**
 *
 * @author alumno
 */
public class ejercicio24 {
    public static void main(String[] args) {
        // Creo el objeto entrada para leer lo que escribe el usuario
        Scanner entrada = new Scanner(System.in); 
        
        // Uso int porque trabajamos con números enteros
        int numero;  
        int contador = 0; // luego uso la variable para contar cuántos múltiplos de 3 se muestran
 
        // Muestro mensaje por pantalla
        System.out.println("Introduce un número mayor que 0:");
        
        // Guardo el número que introduce el usuario
        numero = entrada.nextInt();  

        // Uso while porque necesito repetir la pregunta
        // mientras el número sea menor o igual que 0
        while (numero <= 0) {

            System.out.println("Error. El número debe ser mayor que 0.");
            System.out.println("Vuelve a introducir un número mayor que 0:");
            
            numero = entrada.nextInt(); // Vuelvo a leer el número

        }

        // Uso for porque sé que quiero recorrer los números desde 1 hasta numero
        for (int i = 1; i <= numero; i++) {

            // Uso if para comprobar si el número es múltiplo de 3
            // Un número es múltiplo de 3 si al dividirlo entre 3 el resto es 0
            if (i % 3 == 0) {

                System.out.println(i); // Imprimo el múltiplo de 3
                contador++; // Aumento el contador cada vez que encuentro uno

            }
        }

        // Al final informo del total de números mostrados
        System.out.println("Total de múltiplos de 3 encontrados: " + contador);
    }
}

