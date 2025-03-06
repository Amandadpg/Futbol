package jugador;

import equipo.Jugador;

public abstract class Defensa extends Jugador {
	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputas;
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Defensa other = (Defensa) obj;
		return disputasRealizadas == other.disputasRealizadas;
	}

	public String toString() {
		return super.toString() + ", Disputas: " + disputasRealizadas;
	}
}
