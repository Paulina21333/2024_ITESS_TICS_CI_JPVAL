
/**
 * ITESS-TICS ENERO-JUNIO 2024 CALCULO INTEGRAL- UNIDAD 1 TEOREMA FUNDAMENTAL DE CALCULO
 * SERIES 
 * JUANA PAULINA VALENCIA LARA
 * 16 DE FEBRERO DEL 2024
 */
package CI.u1Series;

import CI.u1Series.SerieAdd;

/**
 *
 * @author pauvalencia
 */
public class SerieAddTest {
    public static void main (String... args){
        SerieAdd sa = new SerieAdd(1,7);
        
        sa.calculate();
        sa.print();
    }
    
}
