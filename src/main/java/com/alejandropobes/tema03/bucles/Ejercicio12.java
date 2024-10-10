package com.alejandropobes.tema03.bucles;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.print("Introduce el número máximo de intentos: ");
        int intentosMaximos = scanner.nextInt();

        int intentosRealizados = 0;
        boolean acertado = false;

        // Bucle para que el usuario adivine el número
        while (intentosRealizados < intentosMaximos && !acertado) {
            intentosRealizados++;

            System.out.print("Introduce un número entre 1 y 100: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
                acertado = true;
            } else if (numeroUsuario < numeroSecreto) {

                System.out.println("El número es mayor.");
            } else {

                System.out.println("El número es menor.");
            }
        }
        scanner.close();
        // Si el usuario no ha acertado después de agotar los intentos
        if (!acertado) {
            System.out.println("Lo siento, has agotado los " + intentosMaximos + " intentos. El número era " + numeroSecreto + ".");
        }

    }
}
