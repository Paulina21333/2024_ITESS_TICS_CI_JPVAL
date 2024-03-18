package POO.U5_ARREGLOS;

public class arreglonom {
    public static void main(String[] args) {
        String arr[][] = {{"ISAAC", "TOÑO", "SEBAS"},
                          {"KAREN", " ", "PAU"},
                          {" ", " ", " ",}};
        arr[1][1] = "Diana";
        arr[2][0] = "Manuel";
        arr[2][1] = "Omar";
        arr[2][2] = "Frank";
        System.out.println("______________________");

        arreglonom obj = new arreglonom();
        obj.MostrararregloNom(arr);
        obj.TI201();
    }

    public void MostrararregloNom(String bidimensional[][]) {
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.print(bidimensional[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public void TI201() {
        System.out.println("Método TI201");
        
    }
}
