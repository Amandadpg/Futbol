package jugador.subclases;

import jugador.Delantero;

public class Extremo extends Delantero {
	private String puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto.toLowerCase();
	}

	public void mostrarDatos() {
		System.out.println("EXTREMO " + puesto.toUpperCase() + " - " + super.toString());
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Extremo other = (Extremo) obj;
		return puesto.equals(other.puesto);
	}

	public String toString() {
		return super.toString() + ", Puesto: " + puesto;
	}
}
