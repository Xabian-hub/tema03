package com.alejandropobes.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float lado1;
        float lado2;
        float lado3;
        System.out.println("Por favor introduce el tamaño de cada lado de tu triangulo");

        System.out.println("Primer lado en Cm");
        lado1 = Float.parseFloat(System.in);
        System.out.println("Segundo lado en Cm");
        lado2 = Float.parseFloat(System.in);
        System.out.println("Tercer lado en Cm");
        lado3 = Float.parseFloat(System.in);
        scanner.close();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("!Tu triangulo es un equilatero¡");
        } else if (lado1 == lado2) {
            
        }


    }
}