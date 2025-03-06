package jugador;

import equipo.Jugador;

public abstract class Centrocampista extends Jugador {
	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pases) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pases;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Centrocampista other = (Centrocampista) obj;
		return pasesCompletados == other.pasesCompletados;
	}

	public String toString() {
		return super.toString() + ", Pases: " + pasesCompletados;
	}
}

