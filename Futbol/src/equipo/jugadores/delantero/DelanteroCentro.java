package equipo.jugadores.delantero;

public class DelanteroCentro extends Delantero{
	
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}

	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public String toString() {
		return "DelanteroCentro [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "goles= " + getGoles() + "golesDePenalti=" + golesDePenalti + "]";
	}
	
	

}
