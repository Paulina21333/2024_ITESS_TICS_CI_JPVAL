package POO.U5_ARREGLOS;

public class ArrBidi {
    public static void main(String[] args) {
        int numero[][] = new int[5][3];
        int matriz[][] = { 
            {8, 9, 10, 6},
            {1, 2, 3, 6},
            {0, 0, 0, 6},
            {0, 0, 0, 6}
        };
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
