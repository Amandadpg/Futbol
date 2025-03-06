package equipo.jugadores.centrocampista;

import equipo.Jugador;

public abstract class Centrocampista extends Jugador {

	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		if (pasesCompletados < 0) {
			throw new IllegalArgumentException("Los pases completados no pueden ser negativos.");
		}
		this.pasesCompletados = pasesCompletados;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		if (pasesCompletados < 0) {
			throw new IllegalArgumentException("Los pases completados no pueden ser negativos.");
		}
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public String toString() {
		return super.toString() + ", Pases completados: " + pasesCompletados;
	}
}
