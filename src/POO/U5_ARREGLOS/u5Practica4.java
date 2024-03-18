//JUANA PAULINA VALENCIA LARA
//TI-201
//POO
//06-03-2023
package POO.U5_ARREGLOS;

import java.util.Scanner;

public class u5Practica4 {

    public static void main(String[] args) {
        u5Practica4 ti = new u5Practica4();
        ti.matriz();
    }

    public void matriz() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas");
        int n = in.nextInt();
        in.nextLine();
        String cadena, arrcadena[];
        String datos[][] = new String[n][5];

        for (int i = 0; i < datos.length; i++) {
            System.out.print("fila " + (i + 1) + ": ");
            cadena = in.nextLine();
            arrcadena = cadena.split(",");
            for (int j = 0; j < arrcadena.length && j < datos[i].length; j++) {
                datos[i][j] = arrcadena[j];
            }
            System.out.println("");
        }

        System.out.println("Matriz Original");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t|");
            }
            System.out.println("");
        }

        System.out.println("Matriz Inversa");
        for (int i = datos.length - 1; i >= 0; i--) {
            for (int j = datos[i].length - 1; j >= 0; j--) {
                System.out.print(datos[i][j] + "\t|");
            }
            System.out.println("");
        }
    }
}
