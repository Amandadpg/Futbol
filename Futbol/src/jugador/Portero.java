package jugador;

import equipo.Jugador;


 public class Portero extends Jugador {
    private int paradas;

    public Portero(String nombre, int dorsal, String equipo, int paradas) {
        super(nombre, dorsal, equipo);
        this.paradas = paradas;
    }

    public void mostrarDatos() {
        System.out.println("PORTERO - " + super.toString() + ", Paradas: " + paradas);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Portero other = (Portero) obj;
        return paradas == other.paradas;
    }

    public String toString() {
        return super.toString() + ", Paradas: " + paradas;
    }
}
