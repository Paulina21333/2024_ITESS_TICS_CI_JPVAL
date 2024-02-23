package CI.u1Series;

/**
 * ITESS-TICS ENERO-JUNIO 2024 CALCULO INTEGRAL- UNIDAD 1 TEOREMA FUNDAMENTAL DE CÁLCULO
 * SERIE
 * JUANA PAULINA VALENCIA LARA
 * 16 DE FEBRERO DEL 2024
 */
public class SerieAdd {
    private int iIni;
    private int iEnd;
    private int n;
    private int[] i;
    private int[] f;
    private int total;

    public SerieAdd(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        n = iEnd - iIni + 1;
        i = new int[n];
        f = new int[n];
        total = 0;
    }

    public void calculate() {
        int index = 0;
        for (int iValue = iIni; iValue <= iEnd; iValue++) {
            this.i[index] = iValue;
            // Modificar para una nueva serie
            f[index] = iValue * iValue - 1;
            total += f[index];
            index++;
        }
    }

    public void print() {
        System.out.println("Índice|      i     |     f ");
        for (int index = 0; index < n; index++) {
            System.out.println(index + "     |      " + i[index] + "     |     " + f[index]);
        }
    }
}
