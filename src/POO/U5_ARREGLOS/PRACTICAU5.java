package POO.U5_ARREGLOS;

public class PRACTICAU5 {
    public static void main(String[] args) {
        String[] nombres = {
            "KAREN", "ESTEBAN", "LEO", "JESSE",
            "OMAR", "GABY", "ISAAC", "JULIAN",
            "TURI", "ADRIAN", "GIOVANNI", "FRAN",
            "MANE", "ALEX", "PAUUU : )"
        };
        System.out.println("Nombres en horizontal:");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println(); 
      
        System.out.println("Nombres en vertical:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

