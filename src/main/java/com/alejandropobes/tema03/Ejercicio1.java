package com.alejandropobes.tema03;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
        numero = Float.parseFloat(scanner.nextLine());
        scanner.close();
        if (numero % 2 == 0)
            System.out.println("Tu numero es par");
        else
            System.out.println("Tu numero es impar");
    }
}
