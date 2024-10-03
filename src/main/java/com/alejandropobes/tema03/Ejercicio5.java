package com.alejandropobes.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este programa debe de introducir su nota en el siguiente examen");
        System.out.println("Introduce tu nota");
        nota = (int)Float.parseFloat(scanner.nextLine());
        scanner.close();

        switch (nota) {
            case 0,1,2,3,4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7,8 -> System.out.println("Notable");
            case 9,10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Error, por favor introduce un numero del 0 al 10");
        }
            
        }
}

