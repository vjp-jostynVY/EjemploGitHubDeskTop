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
public class Asignaturas {
    public static void main(String[] args) {
       // Pongo Scanner para poder leer los datos que introduce el usuario por teclado.
        Scanner entrada = new Scanner(System.in);

        // Uso double porque las notas y la media pueden contener numeros decimales
        // Y declaro las variables donde guardaremos las notas
        double programacion;
        double lenguajes;
        double basesDatos;
        double entornos;
        double sistemas;
        double ingles;
        double itinerario;
        double media;

        // Pido la nota de cada asignatura y la guardamos en su variable
        System.out.print("Por favor, introduzca la nota de Programación: ");
        programacion = entrada.nextDouble();
 
        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        lenguajes = entrada.nextDouble();

        System.out.print("Introduzca la nota de Bases de Datos: ");
        basesDatos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        sistemas = entrada.nextDouble();

        System.out.print("Introduzca la nota de Inglés Profesional: ");
        ingles = entrada.nextDouble();

        System.out.print("Por último, introduzca la nota de Itinerario Personal para la Empleabilidad: ");
        itinerario = entrada.nextDouble();

        // Aqui Calculo la nota media sumando todas las notas y dividiendolo entre 7
        media = (programacion + lenguajes + basesDatos + entornos + sistemas + ingles + itinerario) / 7;
 
        // Muestro el resultado por pantalla de la media
        System.out.println("Su nota media del curso es de: " + media);
    }
}


