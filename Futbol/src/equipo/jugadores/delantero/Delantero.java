package equipo.jugadores.delantero;

import equipo.Jugador;

public abstract class Delantero extends Jugador{
	
	private int goles; 

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	

}
