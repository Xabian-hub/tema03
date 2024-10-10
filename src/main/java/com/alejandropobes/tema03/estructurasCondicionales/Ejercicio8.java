package com.alejandropobes.tema03.estructurasCondicionales;

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tirada;
        System.out.println("Que valor te ha salido al tirar el dado? (1-6)");
        tirada = Integer.parseInt(scanner.nextLine());
        scanner.close();
        switch (tirada){
            case 1 -> System.out.println("La cara contraria a la tuya es la 6" );
            case 2 -> System.out.println("La cara contraria a la tuya es la 5" );
            case 3 -> System.out.println("La cara contraria a la tuya es la 4" );
            case 4 -> System.out.println("La cara contraria a la tuya es la 3" );
            case 5 -> System.out.println("La cara contraria a la tuya es la 2" );
            case 6 -> System.out.println("La cara contraria a la tuya es la 1" );
            default -> System.err.println("ERROR Numero Incorrecto" );
        }
    }
}
