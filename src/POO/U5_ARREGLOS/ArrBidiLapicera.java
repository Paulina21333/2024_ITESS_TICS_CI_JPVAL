package POO.U5_ARREGLOS;

public class ArrBidiLapicera {
    String[][] matriz = {
        {"Lapiz      |goma     | pluma     | corrector"},
        {"marcatextos|pegamento| tijeras"}
    };

    public void imprimirMatriz() {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrBidiLapicera arrBidiLapicera = new ArrBidiLapicera();
        arrBidiLapicera.imprimirMatriz();
    }
}
