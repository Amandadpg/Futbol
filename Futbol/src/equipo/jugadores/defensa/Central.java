package equipo.jugadores.defensa;

public class Central extends Defensa{
	
	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas = entradas;
	}

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	@Override
	public String toString() {
		return "Central [nombre=" + getNombre() + 
								"dorsal= " + getDorsal() + 
								"equipo" + getEquipo() + 
								"DisputasRealizadas= " + getDisputasRealizadas() + 
								"entradas=" + entradas + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Datos del central:" + 
								"Nombre: " + this.getNombre() + 
								"Dorsal: " + this.getDorsal() + 
								"Posición: central" + "Estadistica concreta: entradas" +
								"Disputas realizadas: " + this.getDisputasRealizadas() + 
								"Entradas: " + this.entradas);
		
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Central central = (Central) obj;
	        return entradas == central.entradas;
	    }
	
	

}
