
package r4;

import java.util.ArrayList;

public class Solucion {
    public static Object[] reporte (ArrayList<Corredor> carrera){
        
        double promedio = 0;
        double suma = 0;
        double mejortiempo = carrera.get(0).getTiempoMeta();
        String mejorCorredor = carrera.get(0).getNombreCompleto();
        double peortiempo = carrera.get(0).getTiempoMeta();
        String peorCorredor = carrera.get(0).getNombreCompleto();
       
        
        // Logica
        for (int i = 0; i < carrera.size(); i++) {
            if   (carrera.get(i).getTiempoMeta() < peortiempo){
                peortiempo = carrera.get(i).getTiempoMeta();
                peorCorredor = carrera.get(i).getNombreCompleto();
                
            }
            if (carrera.get(i).getTiempoMeta() > mejortiempo){
            mejortiempo = carrera.get(i).getTiempoMeta();
            mejorCorredor = carrera.get(i).getNombreCompleto();
        }
            
            suma = suma + carrera.get(i).getTiempoMeta();
        }
        
        promedio = suma/carrera.size();
        
        // Retorno de valores
        Object[] resultado ={ 
            promedio,
            peorCorredor,
            peortiempo,
            mejorCorredor,
            mejortiempo,
           
            
        };
        return resultado;
    }
}
