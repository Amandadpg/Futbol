package equipo;

public class Equipo {
    private Jugador[] alineacion;

    public Equipo() {
        alineacion = new Jugador[11];
    }

    public void añadirJugador(int posicion, Jugador jugador) {
        if (posicion < 0 || posicion >= 11) {
            throw new IllegalArgumentException("Posición inválida");
        }
        alineacion[posicion] = jugador;
    }

    public void mostrarAlineacion() throws Exception {
        String[] posiciones = {
            "Portero",
            "Lateral izquierdo",
            "Central 1",
            "Central 2",
            "Lateral derecho",
            "Pivote 1",
            "Pivote 2",
            "Mediapunta",
            "Extremo izquierdo",
            "Extremo derecho",
            "Delantero centro"
        };

        for (int i = 0; i < 11; i++) {
            if (alineacion[i] == null) {
                throw new Exception("Falta jugador en posición: " + i + " - " + posiciones[i]);
            }
        }

        System.out.println("\nALINEACIÓN:");
        for (int i = 0; i < 11; i++) {
            System.out.println(i + ": " + posiciones[i] + " - " + 
                alineacion[i].getNombre() + " (" + alineacion[i].getDorsal() + ")");
        }
    }

    public Jugador[] getAlineacion() {
        return alineacion;
    }
}

