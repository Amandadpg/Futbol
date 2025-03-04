package equipo.jugadores.centrocampista;

public class Pivote extends Centrocampista{
	
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public String toString() {
		return "Pivote [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "pasesCompletados= " + getPasesCompletados() + "intercepciones=" + intercepciones + "]";
	}
	
	

}
