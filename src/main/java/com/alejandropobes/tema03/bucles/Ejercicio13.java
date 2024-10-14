package com.alejandropobes.tema03.bucles;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalLanzamientos;
        int caras = 0;
        int cruces = 0;
        System.out.println(" ******************************************************* ");
        System.out.println("* Introduce las veces que quieres tirar el lado al aire *");
        System.out.println(" ******************************************************* ");

        totalLanzamientos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < totalLanzamientos; i++) {
            // (0 representa "cara" y 1 representa "cruz")
            int resultado = random.nextInt(2);

            // Contar el resultado
            if (resultado == 0) {
                caras++;
            } else {
                cruces++;
            }
        }

        // Calcular los porcentajes
        double porcentajeCaras = (double) caras / totalLanzamientos * 100;
        double porcentajeCruces = (double) cruces / totalLanzamientos * 100;

        // Mostrar los resultados por pantalla
        System.out.println(" ********************************************** ");
        System.out.println("* Aqui estan los resultados de los lanzamientos*");
        System.out.println(" ********************************************** ");
        System.out.println("El porcentaje de las caras: " + porcentajeCaras + "%");
        System.out.println("El porcentaje de las cruces: " + porcentajeCruces + "%");
    }
}
