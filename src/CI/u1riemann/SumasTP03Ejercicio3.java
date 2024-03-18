
package CI.u1riemann;


public class SumasTP03Ejercicio3 extends SumasRiemann {

    public SumasTP03Ejercicio3(double[] x, double[] w) {
        super(x, w);
    }
  
    public double funcion(double x) {
        return 3*Math.cos(0.5*x);
    }
}