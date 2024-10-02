package com.alejandropobes.tema03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este programa tienes que introducir dos numeros");
        System.out.println("Por favor introduce el primer numero");
        numero1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ahora por favor introduce el segundo numero");
        numero2 = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (numero1 < numero2) {
            System.out.println("El primer numero introducido es menor al segundo");

        }else if (numero1 > numero2) {
            System.out.println("El primer numero introducido es mayor al segundo");

        }else if (numero1 == numero2) {
            System.out.println("El primer numero introducido es igual al segundo");
        }
    }
}
