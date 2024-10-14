package com.alejandropobes.tema03.bucles;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas (0-23): ");
        int h = scanner.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int m = scanner.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int s = scanner.nextInt();

        // Comprobar si la hora es válida
        if (esHoraValida(h, m, s)) {
            System.out.println("La hora introducida es válida: " + h + "h " + m + "m " + s + "s.");
        } else {
            System.err.println("La hora introducida no es válida.");
        }
        scanner.close();
    }

    // Metodo para comprobar si la hora es válida
    public static boolean esHoraValida(int h, int m, int s) {
        // Comprobar que las horas están en el rango 0-23, minutos y segundos en el rango 0-59
        return (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
    }
}
