
package r3;

import java.util.Random;

public class VIP extends Asistente{
    
    // Atributos VIP
    
    private boolean[] pantallas;
    private String credencialesPrevia;
    
 // Constructor VIP
    
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.credencialesPrevia = "";
        pantallas = new boolean[3];
    } 
    
    // Metodos VIP    
    
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        if(pantalla>=1 && pantalla<=3){
            if(pantallas[pantalla-1]){
                pantallas[pantalla-1]=false;   
            }else{
                pantallas[pantalla-1]=true;
            }
        }
      
    }
    
// Getters and Setters    
    
    public boolean[] getPantallas() {
        return pantallas;
        }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    
}
