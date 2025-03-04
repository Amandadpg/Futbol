package equipo.jugadores.centrocampista;

public class Mediapunta extends Centrocampista{
	
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del mediapunta:");
		System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Posición: mediapunta" );
        System.out.println("Estadistica concreta: asistencias");
        System.out.println("Pases completados: " + this.getPasesCompletados());
        System.out.println("Asistencias: " + this.asistencias);
	}

	@Override
	public String toString() {
		return "Mediapunta [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "pasesCompletados= " + getPasesCompletados() + "asistencias=" + asistencias + "]";
	}
	
	
	
	
}
