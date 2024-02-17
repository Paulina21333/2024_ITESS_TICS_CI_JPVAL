package CI.u1teoremaf;

public class AreaAproximationTest {
    public static void main(String[] args) {
        AreaAproximation ap = new AreaAproximation(1, 3, 10);
        
        ap.computeArea();
        ap.print();
        System.out.println(ap.getArea());
    }
}
