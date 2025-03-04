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
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del delantero centro:");
		System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Posición: delantero centro" );
        System.out.println("Estadistica concreta: goles de penalti");
        System.out.println("Goles: " + this.getGoles());
        System.out.println("Goles de penalti: " + this.golesDePenalti);
	}

}
