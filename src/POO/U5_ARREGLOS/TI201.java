package POO.U5_ARREGLOS;

import java.util.Arrays;

public class TI201 {
    public static void main(String[] args) {
        int[] numeros, n;
        numeros = new int[5];
        int num[] = {4, 3, 2, 1, 5, 4, 3};
        System.out.println("Arreglo original: " + Arrays.toString(num));

        num[0] = 40;
        System.out.println("Nuevo valor en la posición 0: " + num[0]);

        // Acceder a elementos del arreglo
        System.out.println("Acceder al tercer elemento: " + num[2]);

        // Iterar sobre el arreglo
        System.out.println("Iterar sobre el arreglo:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(); // Nueva línea después de imprimir los elementos

        // Arreglo de Strings
        String nombres[] = {"Isacc", "Panch", "Panchini"};
        System.out.println("Nombres: " + Arrays.toString(nombres));

        // Arreglo de decimales
        float[] decimales = new float[4];
        System.out.println("Decimales (inicializados a 0.0): " + Arrays.toString(decimales));

        // Arreglo de booleanos
        boolean[] logica = {true, false, true};
        System.out.println("Valores lógicos: " + Arrays.toString(logica));
    }
}
