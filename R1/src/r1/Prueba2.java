
package r1;

import java.util.Arrays;

public class Prueba2 {
    
    
    public static double[] reporte(double[] listaNotas) {
       
        double[] resultado = new double[5];

        // Declarar variables y Arrays
        double valorMaximo = listaNotas[0]; 
        double valorMinimo = listaNotas[0]; 
        int longitud = listaNotas.length;
        double suma = 0;
            
        // Calcular maximos y minimos y sumar elemntos del array
        
        for (double numero:listaNotas) {
            valorMaximo = Math.max(valorMaximo, numero);
            valorMinimo = Math.min(valorMinimo, numero);
            suma += numero;
        }

        // Asignar las pocisiones del Array
        
        resultado[0] = suma / longitud;
        resultado[1] = valorMinimo;
        resultado[2] = valorMaximo;

         return resultado;
        
    }
    
 
}
