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
	
	

}
