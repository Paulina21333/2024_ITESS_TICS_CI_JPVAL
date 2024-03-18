//JUANA PAULINA VALENCIA LARA 
//TI-201
//POO
//26-02-2024
package POO.U5_ARREGLOS;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int calif[] = new int[6];
        int suma = 0;
        float promedio;

        System.out.println("CALIFICACIONES DE PRIMER PARCIAL\n");
        System.out.println("CALIFICACIÓN DE CALCULO INTEGRAL: ");
        calif[0] = s.nextInt();
        System.out.println("CALIFICACIÓN DE ALGEBRA LINEAL:  ");
        calif[1] = s.nextInt();
        System.out.println("CALIFICACIÓN DE PROGRAMACION ORIENTADA A OBJETOS: ");
        calif[2] = s.nextInt();
        System.out.println("CALIFICACIÓN DE MATEMATICAS DISCRETAS II: ");
        calif[3] = s.nextInt();
        System.out.println("CALIFICACIÓN DE CONTABILIDAD Y COSTOS: ");
        calif[4] = s.nextInt();
        System.out.println("CALIFICACIÓN DE PROBABILIDAD Y ESTADISTICA: ");
        calif[5] = s.nextInt();

        for (int i = 0; i < calif.length; i++) {
            suma += calif[i];
        }
        
        promedio = (float) suma / calif.length;
        System.out.println("EL PROMEDIO DEL PRIMER PARCIAL ES: " + promedio);
    }
}
