//JUANA PAULINA VALENCIA LARA 
//TI-201
//29-02-2024
package POO.U5_ARREGLOS;

import java.util.Scanner;

public class NomAltEdad {

    public static void main(String[] args) {
        Scanner tel = new Scanner(System.in);
        int n1;

        System.out.println("\nEspecifica el número de personas: ");
        n1 = tel.nextInt();
        tel.nextLine();

        String[][] a = new String[n1][3];

        for (int i = 0; i < n1; i++) {
            System.out.print((i + 1) + ". Nombre: ");
            a[i][0] = tel.nextLine();

            System.out.print((i + 1) + ". Edad: ");
            a[i][1] = tel.nextLine();

            System.out.print((i + 1) + ". Altura: ");
            a[i][2] = tel.nextLine();
        }

        System.out.println("\n| Nombre   | Edad |Altura  |");

        for (int i = 0; i < n1; i++) {
            System.out.printf("| %-8s | %-4s | %-6s |\n", a[i][0], a[i][1], a[i][2]);
        }
    }
}
