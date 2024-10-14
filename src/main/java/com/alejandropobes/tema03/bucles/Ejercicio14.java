package com.alejandropobes.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {

    public static void main(String[] args) {
        Random random = new Random();
        int totalLanzamientos = 1_000;

        int[] contadorNumeros = new int[6]; // Los índices 0-5 corresponden a los números 1-6
        //bucle para saber las tiradas del dado
        for (int i = 0; i < totalLanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;
            contadorNumeros[resultado - 1]++;
        }
        // Mostrar cuántas veces ha aparecido y su porcentaje
        System.out.println(" *********************************************************************************************************************");
        System.out.println("* Aqui estan los resultados de las tiradas y su porcentaje cara a cara sabiendo que se tira el dado 1 Millon de vezes *");
        System.out.println(" *********************************************************************************************************************");
        for (int i = 0; i < 6; i++) {
            int numero = i + 1;
            int apariciones = contadorNumeros[i];
            double porcentaje = (double) apariciones / totalLanzamientos * 100;
            System.out.println("El número " + numero + " se ha tirado un total de: " + apariciones + " veces asi que su porcentaje sera del (" + porcentaje + "%)");
        }
    }
}
