
package r4;

import java.util.ArrayList;
import java.util.Arrays;
import static r4.Solucion.reporte;

public class R4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Corredor> carrera = new ArrayList<>();
 carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
carrera.add(new Corredor("Juan Corredor", "28", 1.75, 24, 21));
carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));
Object retorno[] = reporte(carrera);
System.out.println(Arrays.toString(retorno));
    }
    
}
