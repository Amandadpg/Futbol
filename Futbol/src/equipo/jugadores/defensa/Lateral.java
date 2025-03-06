package equipo.jugadores.defensa;

public class Lateral extends Defensa{
	
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, Puesto puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
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
		return "Lateral [nombre=" + getNombre() + 
								"dorsal= " + getDorsal() + 
								"equipo" + getEquipo() + 
								"disputasRealizadas= " + getDisputasRealizadas() + 
								"puesto=" + puesto + "]";
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Datos del lateral:" +
								"Nombre: " + this.getNombre() + 
								"Dorsal: " + this.getDorsal() +
								"Posición: lateral" +
								"Estadistica concreta: " + this.getPuesto() +
								"Disputas realizadas: " + this.getDisputasRealizadas() +
								"Puesto: " + this.puesto);
		
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Lateral lateral = (Lateral) obj;
	        return puesto.equals(lateral.puesto);
	    }

}
