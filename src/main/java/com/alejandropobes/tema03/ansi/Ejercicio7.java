public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena1 = "";

        for (int i = 1; i <= 9; i++) {
            cadena1 += i;
            System.out.printf("%9s", cadena1);
            for (int j = cadena1.length() - 1; j >= 0; j--) {
                System.out.print(cadena1.charAt(j));
            }
            System.out.println();
        }
    }
}
