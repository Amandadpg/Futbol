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
		return "DelanteroCentro [nombre=" + getNombre() + 
										"dorsal= " + getDorsal() + 
										"equipo" + getEquipo() + 
										"goles= " + getGoles() + 
										"golesDePenalti=" + golesDePenalti + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del delantero centro:" + 
								"Nombre: " + this.getNombre() +
								"Dorsal: " + this.getDorsal() +
								"Posición: delantero centro" +
								"Estadistica concreta: goles de penalti" +
								"Goles: " + this.getGoles() +
								"Goles de penalti: " + this.golesDePenalti);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        DelanteroCentro dc = (DelanteroCentro) obj;
        return golesDePenalti == dc.golesDePenalti;
    }

}
