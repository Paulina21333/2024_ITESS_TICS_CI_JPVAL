// calculo de series de Riemann 
//Juana Paulina Valencia Lara 
//
package CI.u1riemann;

public class SumasRimann {
protected double [] x ;
protected double [] w ;
protected double []dx ;
protected double [] fw ;
protected double [] suma ;

    public SumasRimann(double[] x, double[] w) {
        this.x = x;
        this.w = w;
        //Crear espacio de memoria 
        dx = new double [w.length];
        fw  = new double [w.length];
        
        
    }
    public void calcular () {
        suma=0;
        for (int  i = 0; i< dx.length; i++){
            dx[i] = x[i+1] -x[i];
            fw[i] = funcion (w[i]);
            suma += fw[i]*dx[i];
   
        }
        
    }
        public double funcion(double x){
            return 1.0;
  
        }
        public void imprimir() {
            System.out.println("i  |  wi  | fwi |  fwi*dxi");
            for (int i = 0;  i  < 10;  i++){
            System.out.println(i+ "  i  " + w[i]  +"  |  "+
                    fw[i] + "  |  " + fw[i]*dx[i]);
        }
        }
        
        
       
}


    
            
            
    

