package jugador.subclases;

import jugador.Defensa;

public class Central extends Defensa {
	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputas, int entradas) {
		super(nombre, dorsal, equipo, disputas);
		this.entradas = entradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("CENTRAL - " + super.toString() + ", Entradas: " + entradas);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Central other = (Central) obj;
		return entradas == other.entradas;
	}

	@Override
	public String toString() {
		return super.toString() + ", Entradas: " + entradas;
	}
}
