package equipo;

import java.util.Objects;

public abstract class Jugador {
	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();

	public String getNombre() {
		return nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Jugador jugador = (Jugador) obj;
		return dorsal == jugador.dorsal && Objects.equals(nombre, jugador.nombre)
				&& Objects.equals(equipo, jugador.equipo);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Dorsal: " + dorsal + ", Equipo: " + equipo;
	}
}
