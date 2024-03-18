//JUANA PAULINA VALENCIA LARA 
//TI-201
//POO
//26-02-2024
package POO.U5_ARREGLOS;


public class ListaDeNum {

    public static void main(String[] args) {
       
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }

        System.out.println("Contenido del primer array:");
        imprimirArray(array1);

        System.out.println("Contenido del segundo array (invertido):");
        imprimirArray(array2);
    }

    private static void imprimirArray(int[] arr) {
        
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
