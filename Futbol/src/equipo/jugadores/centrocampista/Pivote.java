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
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del pivote:");
		System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Posición: pivote" );
        System.out.println("Estadistica concreta: intercepciones");
        System.out.println("Pases completados: " + this.getPasesCompletados());
        System.out.println("Intercepciones: " + this.intercepciones);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Pivote pivote = (Pivote) obj;
        return intercepciones == pivote.intercepciones;
    }

}
