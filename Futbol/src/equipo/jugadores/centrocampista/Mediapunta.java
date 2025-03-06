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
		System.out.println("Datos del mediapunta:" + 
								"Nombre: " + this.getNombre() + 
								"Dorsal: " + this.getDorsal() +
								"Posición: mediapunta" +
								"Estadistica concreta: asistencias" + 
								"Pases completados: " + this.getPasesCompletados() +
								"Asistencias: " + this.asistencias);
	}

	@Override
	public String toString() {
		return "Mediapunta [nombre=" + getNombre() + 
								"dorsal= " + getDorsal() + 
								"equipo" + getEquipo() + 
								"pasesCompletados= " + getPasesCompletados() + 
								"asistencias=" + asistencias + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Mediapunta mediapunta = (Mediapunta) obj;
        return asistencias == mediapunta.asistencias;
    }
	
	
}
