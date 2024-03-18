//JUANA PAULINA VALENCIA LARA 
//TI-201
//29-02-2024
package POO.U5_ARREGLOS;

public class Matriz2 {
    public static void main(String[] args) {
        int matriz[][] = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1}

        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
