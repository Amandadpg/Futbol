package equipo.jugadores.defensa;

public class Lateral extends Defensa{
	
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, Puesto puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Lateral [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "disputasRealizadas= " + getDisputasRealizadas() + "puesto=" + puesto + "]";
	}
	
	

}
