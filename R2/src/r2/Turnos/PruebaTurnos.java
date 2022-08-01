
package r2.Turnos;

import java.util.Arrays;

public class PruebaTurnos {
    
    public static void main(String[] args) {
        
        String[] turnos =  new String[] {"A0", "A1", "A2", "A3", "A4","A5","A6", "A7", "A8", "A9", "A10","A11"};
    TurnoVirtual turno= new TurnoVirtual(turnos);
    

// Pantallazo 2
turno.atenderProximoTurno();
turno.atenderProximoTurno();
turno.atenderProximoTurno();
turno.atenderProximoTurno();

// Pantallazo 3
turno.agregarTurnoPerdido();
turno.atenderProximoTurno();
turno.agregarTurnoPerdido();
turno.atenderProximoTurno();
turno.agregarTurnoPerdido();
// Pantallazo 4
turno.cambiarEstadoTurno();
turno.atenderProximoTurno();
turno.cambiarEstadoTurno();
System.out.print("Turnos: ");

System.out.println(Arrays.toString(turno.getTurnos()));

System.out.print("Turnos Perdidos: ");

System.out.println(Arrays.toString(turno.getTurnosPerdidos()));

System.out.print("Estado del Turno Virtual: ");
System.out.println(turno.isEstadoTurnoVirtual());

System.out.print("Turno en Atención: ");

System.out.println(turno.getTurnoEnAtencion());
System.out.print("Cantidad de turnos atendidos:");
System.out.println(turno.getCantidadTurnosAtendidos());
}
        
    }
    
    
