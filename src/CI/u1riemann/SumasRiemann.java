package CI.u1riemann;

public class SumasRiemann {
    private double[] x;
    private double[] w;
    private double[] dx;
    private double[] fw;
    private double suma; // Change from double[] to double for suma

    public SumasRiemann(double[] x, double[] w) {
        this.x = x;
        this.w = w;
        // Create space in memory
        dx = new double[w.length];
        fw = new double[w.length];
    }

    public void calcular() {
        setSuma(0);
        for (int i = 0; i < getDx().length - 1; i++) { // Fix the loop condition
            dx[i] = getX()[i + 1] - getX()[i];
            fw[i] = funcion(getW()[i]);
            setSuma(getSuma() + getFw()[i] * getDx()[i]);
        }
    }

    public double funcion(double x) {
        return 1.0;
    }

    public void imprimir() {
        System.out.println("i  |  wi  | fwi |  fwi*dxi");
        for (int i = 0; i < getDx().length - 1; i++) { // Fix the loop condition
            System.out.println(i + "  |  " + getW()[i] + "  |  " +
                    getFw()[i] + "  |  " + getFw()[i] * getDx()[i]);
        }
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getW() {
        return w;
    }

    public double[] getDx() {
        return dx;
    }

    public double[] getFw() {
        return fw;
    }

    public double getSuma() { // Change the return type to double
        return suma;
    }

    public void setSuma(double suma) { // Change the parameter type to double
        this.suma = suma;
    }
}
