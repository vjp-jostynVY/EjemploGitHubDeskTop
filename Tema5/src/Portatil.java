/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
    public class Portatil extends Ordenador {
    private double peso;
    
    public Portatil(int ram, int disco, String procesador, String grafica,
                    double precio, double peso) {

        super(ram, disco, procesador, grafica, precio);
        this.peso = peso;
    }

    public String toString() {
        return "Portátil -> " + super.toString() + ", Peso: " + peso;
        }
      }
  


  

