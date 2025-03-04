package equipo.jugadores;

import equipo.Jugador;

public class Portero extends Jugador{
	
	private int paradas;

	public Portero(String nombre, int dorsal, String equipo,int paradas ) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
		
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public String toString() {
		return  "Portero [nombre=" + getNombre() + "dorsal= " + getDorsal() + "equipo" + getEquipo() + "paradas=" + paradas + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del portero:");
		System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dorsal: " + this.getDorsal());
        System.out.println("Posición: portero" );
        System.out.println("Estadistica concreta: paradas");
        System.out.println("Paradas: " + this.getParadas());
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (!super.equals(obj)) return false; 
	    Portero portero = (Portero) obj;
	    return paradas == portero.paradas; 
	}

}
