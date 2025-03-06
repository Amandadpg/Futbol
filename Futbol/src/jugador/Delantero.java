package jugador;

import equipo.Jugador;

public abstract class Delantero extends Jugador {
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	public int getGoles() {
		return goles;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Delantero other = (Delantero) obj;
		return goles == other.goles;
	}

	@Override
	public String toString() {
		return super.toString() + ", Goles: " + goles;
	}
}

