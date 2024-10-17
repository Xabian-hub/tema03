package com.alejandropobes.tema03.ansi;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "";
        int colorTexto = 29;
        int colorFondo = 40;
        for (int i = 1; i <= 9; i++) {
            cadena = cadena + i;
            colorTexto++;
            System.out.printf("\u001B[1;" + colorTexto + "m" + "%9s\n" + "\u001B[0m", cadena);
        }
    }
}

