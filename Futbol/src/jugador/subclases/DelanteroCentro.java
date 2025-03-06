package jugador.subclases;

import jugador.Delantero;

public class DelanteroCentro extends Delantero {
	private int golesPenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesPenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesPenalti = golesPenalti;
	}

	public void mostrarDatos() {
		System.out.println("DELANTERO CENTRO - " + super.toString() + ", Goles penalti: " + golesPenalti);
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		DelanteroCentro other = (DelanteroCentro) obj;
		return golesPenalti == other.golesPenalti;
	}

	public String toString() {
		return super.toString() + ", Goles penalti: " + golesPenalti;
	}
}
