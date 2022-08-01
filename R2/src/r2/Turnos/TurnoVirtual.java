
package r2.Turnos;

public class TurnoVirtual {
    
    // Crear Atributos
    
    private String turnos [];
    private String turnosPerdidos [];
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos= 1;
    
    // Crear constructores

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length]; //New String de tamaño de turnos
        for (int i = 0; i < turnosPerdidos.length; i++) {
            turnosPerdidos[i]=" ";
        }
    }
    
    
    
    // Crear metodos
    
    public void atenderProximoTurno(){
        if (estadoTurnoVirtual==true) {
            turnoEnAtencion++;
            cantidadTurnosAtendidos++;
        }
    }
    
    public void agregarTurnoPerdido(){
        int encontrado =0;
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (turnosPerdidos[i]==turnos[turnoEnAtencion]) {
                encontrado=1;
                break;
                
            }
        }
        if(encontrado==0){
            for (int i = 0; i < turnosPerdidos.length; i++){
                if (turnosPerdidos[i].equals(" ")){
                    turnosPerdidos[i]=turnos[turnoEnAtencion];
                    break;
                }
            }
        }
    }
    
     public void cambiarEstadoTurno(){
         if (estadoTurnoVirtual == true) {
             estadoTurnoVirtual= false;
             
         }else {
             estadoTurnoVirtual= true;
         
     }
     }

    // Crear getters and setters
    
    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
     
    
    
    
    
}
