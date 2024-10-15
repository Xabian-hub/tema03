package com.alejandropobes.tema03.ansi;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número real: ");

        double numero = scanner.nextDouble();

        System.out.printf("El número con dos decimales es: %.2f%n", numero);
        scanner.close();
    }
}
