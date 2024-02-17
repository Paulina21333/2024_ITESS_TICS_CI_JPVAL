package CI.u1teoremaf;

/**
 * ITESS-TICS ENERO-JUNIO 2024 CALCULO INTEGRAL- UNIDAD 1 TEOREMA FUNDAMENTAL DE CALCULO
 * CALCULO DE APROXIMACION DE AREA JUANA PAULINA VALENCIA LARA - JESUS NICOLAS GARCIA MOLINA
 * 09 DE FEBRERO DEL 2024
 */

public class AreaAproximation {

    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double[] x;
    private double[] fx;
    private double area;

    public AreaAproximation(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        x = new double[n + 1];
        fx = new double[n + 1];
    }

    public void computeArea() {
        dx = (xEnd - xIni) / n;
        area = 0;
        for (int i = 0; i <= n; i++) {
            x[i] = xIni + i * dx;
            //fx[i]=x * x[i];
            //fx [i]=Math.sqrt(9.0-x[i]*x[1];
            fx[i] = 1/x[1];
            area = area + fx[i] * dx;
        }
    }

    public void print() {
        for (int i = 0; i <= n; i++) {
            System.out.println("x[" + i + "]: " + x[i] + ", fx[" + i + "]: " + fx[i]);
        }
        System.out.println("Area: " + area);
    }

    public double getArea() {
        return area;
    }
}
