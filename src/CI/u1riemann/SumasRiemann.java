/*
 * ITESS-TICS
 * ENERO - JUNO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
 * CALCULO DE SERIES de RIEMANN
 * JUANA PAULINA VALENCIA LARA 
 * 23 / FEBRERO / 2024
 */

package CI.u1riemann;


public class SumasRiemann {
    private double[] x;
    private double[] w;
    private double[] dx;
    private double[] fw;
    private double suma;

    public SumasRiemann(double[] x, double[] w) {
        this.x = x;
        this.w = w;
        
        // crear espacio de memoria
        dx = new double[w.length];
        fw = new double[w.length];
    }
    
    public void calcular() {
        // calcular dx,  fw, suma
        setSuma(0);
        for (int i = 0; i < getDx().length; i++) {
            getDx()[i] = getX()[i+1] - getX()[i];
            getFw()[i] = funcion(getW()[i]);
            setSuma(getSuma() + getFw()[i]*getDx()[i]);
        }
    }

    public double funcion(double x) {
        return 1.0;
    }
    
    public void imprimir() {
        System.out.println("i  |  dxi  |  wi  |  fwi  |  fwi*dxi");
        
        for (int i = 0; i < getW().length; i++) {
            System.out.println(i + "  |  " + getDx()[i] + "  |  " +  getW()[i] + "  |  " +
                    getFw()[i] + "  |  " + getFw()[i]*getDx()[i]);
        }
        System.out.println("Suma: " + getSuma());
        
        
    }

    /**
     * @return the x
     */
    public double[] getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double[] x) {
        this.x = x;
    }

    /**
     * @return the w
     */
    public double[] getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(double[] w) {
        this.w = w;
    }

    /**
     * @return the dx
     */
    public double[] getDx() {
        return dx;
    }

    /**
     * @param dx the dx to set
     */
    public void setDx(double[] dx) {
        this.dx = dx;
    }

    /**
     * @return the fw
     */
    public double[] getFw() {
        return fw;
    }

    /**
     * @param fw the fw to set
     */
    public void setFw(double[] fw) {
        this.fw = fw;
    }

    /**
     * @return the suma
     */
    public double getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(double suma) {
        this.suma = suma;
    }
}