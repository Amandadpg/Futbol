package jugador.subclases;

import jugador.Centrocampista;

public class Mediapunta extends Centrocampista {
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pases, int asistencias) {
		super(nombre, dorsal, equipo, pases);
		this.asistencias = asistencias;
	}

	public void mostrarDatos() {
		System.out.println("MEDIAPUNTA - " + super.toString() + ", Asistencias: " + asistencias);
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Mediapunta other = (Mediapunta) obj;
		return asistencias == other.asistencias;
	}

	public String toString() {
		return super.toString() + ", Asistencias: " + asistencias;
	}
}
