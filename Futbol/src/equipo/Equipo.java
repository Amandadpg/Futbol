package equipo;

public class Equipo {
	private Jugador[] jugadores = new Jugador[11];

	public void añadirJugador(int posicion, Jugador jugador) {
		if (posicion < 0 || posicion >= jugadores.length) {
			throw new IllegalArgumentException("Posición fuera de rango: " + posicion);
		}
		if (jugadores[posicion] != null) {
			System.out.println("Advertencia: Reemplazando jugador en la posición " + posicion);
		}
		jugadores[posicion] = jugador;
	}

	public void mostrarAlineacion() {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] != null) {
				System.out.println("Posición " + i + ":");
				jugadores[i].mostrarDatos();
			} else {
				System.out.println("Posición " + i + " vacía.");
			}
		}
	}
}
