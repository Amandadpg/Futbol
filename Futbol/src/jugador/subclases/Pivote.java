package jugador.subclases;

import jugador.Centrocampista;

public class Pivote extends Centrocampista {
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pases, int intercepciones) {
		super(nombre, dorsal, equipo, pases);
		this.intercepciones = intercepciones;
	}

	public void mostrarDatos() {
		System.out.println("PIVOTE - " + super.toString() + ", Intercepciones: " + intercepciones);
	}

	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Pivote other = (Pivote) obj;
		return intercepciones == other.intercepciones;
	}

	public String toString() {
		return super.toString() + ", Intercepciones: " + intercepciones;
	}
}
