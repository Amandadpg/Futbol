package equipo.jugadores.defensa;

import equipo.Jugador;

public abstract class Defensa extends Jugador {
    
    private int disputasRealizadas;

    public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
        super(nombre, dorsal, equipo);
        if (disputasRealizadas < 0) {
            throw new IllegalArgumentException("Las disputas realizadas no pueden ser negativas.");
        }
        this.disputasRealizadas = disputasRealizadas;
    }

    public int getDisputasRealizadas() {
        return disputasRealizadas;
    }

    public void setDisputasRealizadas(int disputasRealizadas) {
        if (disputasRealizadas < 0) {
            throw new IllegalArgumentException("Las disputas realizadas no pueden ser negativas.");
        }
        this.disputasRealizadas = disputasRealizadas;
    }

    @Override
    public String toString() {
        return "Defensa [nombre=" + getNombre() + 
               ", dorsal=" + getDorsal() + 
               ", equipo=" + getEquipo() + 
               ", disputasRealizadas=" + disputasRealizadas + "]";
    }
}
