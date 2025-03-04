package equipo.jugadores.delantero;

public class Extremo extends Delantero{
	
	private Puesto puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, Puesto puesto) {
		super(nombre, dorsal, equipo, goles);
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
		return "Extremo [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "goles= " + getGoles() + "puesto=" + puesto + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del extremo:");
		System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Posición: extremo" );
        System.out.println("Estadistica concreta: " + this.getPuesto());
        System.out.println("Goles: " + this.getGoles());
        System.out.println("Puesto: " + this.puesto);
	}

}
