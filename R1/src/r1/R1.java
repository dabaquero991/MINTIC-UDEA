package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class R1 {

    public static void main(String[] args) {
        
        double nota;
        
        //Declarar array
        
        double  listaNotas1 [];
        
        //Declarar e instanciar un array, tamaño 10
        
        double listaNotas2[] = new double [10];
        
        //Crear ArrayDinamico
        
        ArrayList<Integer> miArrayDinamico = new ArrayList<Integer>(); 
        
        Double [] listaNotas = {4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.8};
        
//        Recorrer el array
        
        for (double valor : listaNotas) {
            System.out.println(valor);
            
        }
        
//        Valor maximo, minimo
        
        double valorMaximo;
        double valorMinimo;
        int numeroDatos;
        double promedio;
        double total = 0;
        
        valorMaximo = Collections.max(Arrays.asList(listaNotas));
        valorMinimo = Collections.min(Arrays.asList(listaNotas));
        numeroDatos = listaNotas.length;
        promedio = total/numeroDatos;
        
         
        System.out.println("Valor maximo");
        System.out.println(valorMaximo);
        System.out.println("Valor minimo");
        System.out.println(valorMinimo);
        System.out.println("Datos en el Array");
        System.out.println(numeroDatos);
        
         
    }
    
}




