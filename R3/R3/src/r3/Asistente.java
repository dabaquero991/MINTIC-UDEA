
package r3;

import java.util.Random;

public class Asistente {
    // Crear atributos de Asistente CLASE PADRE
    
    protected String idTiquete;
    protected String nombreCompleto;
    protected String direccionResidencia;
    protected String credenciales="";

// Constructor Asistente    
    
    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia){
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
    }

    // Metodo Asistente
        
     public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
    
     // Getter and Setters
     
    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
}
