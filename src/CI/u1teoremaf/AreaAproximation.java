/* ITESS-TICS
/*ENERO-JUNIO 2024 CALCULO INTEGRAL- UNIDAD 1 TEOREMA FUNDAMNETAL DE CALCULO 
/* CALCULO DE APROXIMACION DE AREA 
/* JUANA PAULINA VALENCIA LARA - JESUS NICOLAS GARCIA MOLINA 
/* 09 DE FEBRERO DEL 2024 

 */
package CI.u1teoremaf;

/**
 *
 * @author pauvalencia
 */
public class AreaAproximation {

    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x;
    private double fx[];
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
            fx[i] = x[i] * x[i];
            area = area + fx[i] * dx;

        }

    }

    public double getArea() {
        return area;
    }

}
