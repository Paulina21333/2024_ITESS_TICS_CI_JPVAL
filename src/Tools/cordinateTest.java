
package Tools;


public class cordinateTest {
    public  static void main (String ...args){
        cordinate coor = new cordinate (-2,2,-2,2,1080,960);
        
        System.out.println("Test conter");
        System.out.println("xr: 0 --> xs: "+coor.toScreenx(0));
        System.out.println("yr: 0 --> ys: "+coor.toScreeny(0));
    }
}
