package com.alejandropobes.tema03.estructurasCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        Scanner scaner = new Scanner(System.in);
        System.out.println("En esta actividad tienes que introducir tu edad \n");
        System.out.println("Por favor introduce tu edad");
        edad = Integer.parseInt(scaner.nextLine());
        scaner.close();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
    }
}
