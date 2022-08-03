
package r3;

public class Preferencial extends Asistente{
    
    // Atributos Preferencial
    
    private boolean participaSorteo = false;
    
    // Constructor Preferencial
     
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }
    
    // Metdodo Preferencial
    
    public void participarSorteo(){
        
       if(isParticipaSorteo()){
           setParticipaSorteo(false);
       }
       else {
           setParticipaSorteo(true);
       }
    }
    
    // Getters And Setters
    
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
   
       
    
    
}
