package com.alejandropobes.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int suma = 0;
            int numero;

            do {
                System.out.print("Introduce un número (0 para terminar): ");
                numero = scanner.nextInt();
                suma += numero;
            } while (numero != 0);
            scanner.close();

            System.out.println("La suma de todos los números introducidos es: " + suma);
        }
    }