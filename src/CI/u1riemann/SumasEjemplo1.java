/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CI.u1riemann;

/**
 *
 * @author pauvalencia
 */
public class SumasEjemplo1 extends SumasRiemann {
    public SumasEjemplo1 (double[]x, double[]w){
        super(x, w);
    }
    @Override 
    public double funcion(double x){
        return 10 - x*x;
    }

    @Override
    public void calcular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     */
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
