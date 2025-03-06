package equipo.jugadores.delantero;

import equipo.Jugador;

public abstract class Delantero extends Jugador {
    
    private int goles;

    public Delantero(String nombre, int dorsal, String equipo, int goles) {
        super(nombre, dorsal, equipo);
        if (goles < 0) {
            throw new IllegalArgumentException("Los goles no pueden ser negativos.");
        }
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        if (goles < 0) {
            throw new IllegalArgumentException("Los goles no pueden ser negativos.");
        }
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Delantero {nombre=" + getNombre() + 
               ", dorsal=" + getDorsal() + 
               ", equipo=" + getEquipo() + 
               ", goles=" + goles + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Delantero)) return false;
        if (!super.equals(obj)) return false;
        Delantero delantero = (Delantero) obj;
        return goles == delantero.goles;
    }

}
