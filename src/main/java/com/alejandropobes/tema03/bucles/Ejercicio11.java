package com.alejandropobes.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Introduce un número (negativo para terminar): ");
            numero = scanner.nextInt();
            // Si el número es positivo, se suma a la suma total y se incrementa el contador
            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0); // El bucle termina cuando se introduce un número negativo

        // Comprobar si se han introducido números positivos para evitar división por cero
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se han introducido números positivos.");
        }
        scanner.close();
    }
}

