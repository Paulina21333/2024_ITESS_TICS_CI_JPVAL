package CI.u1riemann;

public class SumasTP03Ejercicio6 extends SumasRiemann {

    public SumasTP03Ejercicio6(double[] x, double[] w) {
        super(x, w);
    }

    @Override
    public double funcion(double x) {
        return 3 * Math.cos(0.5 * x);
    }

    @Override
    public void imprimir() {
        System.out.println("i  |  xi  | wi | fwi |  fwi*dxi");
        for (int i = 0; i < getDx().length - 1; i++) { // Adjust the loop condition
            System.out.println(i + "  |  " + getX()[i] + "  |  " + getW()[i] + "  |  " + getFw()[i] + "  |  " + getFw()[i] * getDx()[i]);
        }
    }

    @Override
    public void calcular() {
        setSuma(0); // Use setSuma method instead of directly accessing the field
        for (int i = 0; i < getDx().length - 1; i++) { // Adjust the loop condition
            getDx()[i] = getX()[i + 1] - getX()[i];
            getFw()[i] = funcion(getX()[i]);
            setSuma(getSuma() + getFw()[i] * getDx()[i]);
        }
    }
}
