
/**
 * ITESS-TICS ENERO-JUNIO 2024 CALCULO INTEGRAL- UNIDAD 1 TEOREMA FUNDAMENTAL DE CALCULO
 * SERIES 
 * JUANA PAULINA VALENCIA LARA
 * 16 DE FEBRERO DEL 2024
 */
package CI.u1Series;

/**
 *
 * @author pauvalencia
 */
public class SerieAdd {
private int iIni;
private int iEnd;
private int n;
private int []i;
private int f[];
private int total[];

    public SerieAdd(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        n = iEnd-iIni+1;
        i = new int [n];
        f = new int [n];
    }
public void compute (){
    
    int index = 0;
    total = 0 ;
    for (int i = iIni; i<= iEnd; i++){
        this.i[index]= i;
        //Modificar para una nueva serie
        f [index]=i*i+1;
        total += f [index];
        index++;
        
    }
}
        
 public void print (){
     System.out.println("Index   |   i   |   f   ");
     for (int index = 0; index <n; index++)
         System.out.println(index+"    |    |"+ i[index]+ "    |    "+ f [index]);
     
     System.out.println("Total:  "+ total);


 }    

}

