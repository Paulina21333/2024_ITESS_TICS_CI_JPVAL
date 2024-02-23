package POO.U5_ARREGLOS;

import java.util.Scanner;

public class PRACTICA_U5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la longitud del arreglo: ");
        int n = lector.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = lector.nextInt();
        }

        System.out.println("Arreglo ingresado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}