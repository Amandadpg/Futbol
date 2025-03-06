package jugador.subclases;

import jugador.Defensa;

public class Lateral extends Defensa {
	private String puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputas, String puesto) {
		super(nombre, dorsal, equipo, disputas);
		this.puesto = puesto.toLowerCase();
	}

	@Override
	public void mostrarDatos() {
		System.out.println("LATERAL " + puesto.toUpperCase() + " - " + super.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Lateral other = (Lateral) obj;
		return puesto.equals(other.puesto);
	}

	@Override
	public String toString() {
		return super.toString() + ", Puesto: " + puesto;
	}
}
