/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Calificacion {
    public static void main(String[] args) {
// importo el Scanner y Creo el objeto entrada para leer datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);
      
    // Pido la nota al usuario mostrando mensaje en pantalla
        System.out.print("Por favor, introduzca la nota del alumno (0-10): ");
        int nota = entrada.nextInt(); // Uso int porque son numeros enteros y lo guardo en nota

        
        // Uso switch para mostrar la calificación según la nota
        switch (nota) {
           // Pongo case ya que cada uno representa un numero exacto
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Calificación: Suspenso");
                break; // Pongo break porque este detiene el switch
            case 5: case 6:
                System.out.println("Calificación: Bien");
                break;
            case 7: case 8:
                System.out.println("Calificación: Notable");
                break;
            case 9: case 10:
                System.out.println("Calificación: Sobresaliente");
                break;
         // luego puse el default ya que con este se ejecuta si la nota no esta entre 0 y 10.
            default:
                System.out.println("Error: la nota introducida no es válida");
        }
    }
}
