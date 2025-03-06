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
		return "Extremo [nombre=" + getNombre() + 
							"dorsal= " + getDorsal() + 
							"equipo" + getEquipo() + 
							"goles= " + getGoles() + 
							"puesto=" + puesto + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del extremo:" + 
								"Nombre: " + this.getNombre() +
								"Dorsal: " + this.getDorsal() +
								"Posición: extremo" +
								"Estadistica concreta: " + this.getPuesto() +
								"Goles: " + this.getGoles() +
								"Puesto: " + this.puesto);
	}
	
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Extremo extremo = (Extremo) obj;
        return puesto.equals(extremo.puesto);
    }

}
