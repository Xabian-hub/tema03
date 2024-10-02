package com.alejandropobes.tema03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("En este programa debe de introducir dos numeros reales \n");
        System.out.println("Por favor introduce el primer numero");
        numero1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Por favor introduce el segundo numero");
        numero2 = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (numero1 < numero2)
            System.out.println(numero1 + "\n" + numero2);
        else
            System.out.println(numero2 + "\n" + numero1);
        }
    }
