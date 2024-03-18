//JUANA PAULINA VALENCIA LARA 
//TI-201
//POO
//26-02-2024
package POO.U5_ARREGLOS;

import java.util.ArrayList;
import java.util.List;

public class LISTADENOM {

    private List<String> nombres;

    public LISTADENOM() {
        nombres = new ArrayList<>();
        nombres.add("PAU");
        nombres.add("JESSE");
        nombres.add("KAREN");
        nombres.add("LEO");
        nombres.add("JULIAN");
        nombres.add("ISAAC");
        nombres.add("ESTEBAN");
        nombres.add("GIOVANNI");
        nombres.add("ALEX");
        nombres.add("ADRIAN");
        nombres.add("OMAR");
        nombres.add("GABY");
    }

    public List<String> seleccionarNombresAlAzar(int cantidad) {
        List<String> nombresSeleccionados = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            int azarIndex = (int) (Math.random() * nombres.size());
            String nombreSeleccionado = nombres.get(azarIndex);
            nombresSeleccionados.add(nombreSeleccionado);
            nombres.remove(azarIndex);
        }

        return nombresSeleccionados;
    }

    public static void main(String[] args) {
        LISTADENOM listaDeNombres = new LISTADENOM();

        List<String> nombresSeleccionados = listaDeNombres.seleccionarNombresAlAzar(3);

        System.out.println("Nombres seleccionados al azar:");
        for (String nombre : nombresSeleccionados) {
            System.out.println(nombre);
        }
    }
}
