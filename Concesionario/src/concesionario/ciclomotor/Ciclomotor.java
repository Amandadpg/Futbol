package concesionario.ciclomotor;

import concesionario.Vehiculo;

public abstract class Ciclomotor extends Vehiculo{
	
	private int cilindrada;

	public Ciclomotor(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;

	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	
	@Override
	public String toString() {
		return "Ciclomotor [marca=" + this.getMarca() + ",modelo=" + this.getModelo() + ", matricula=" + this.getMatricula() + "cilindrada=" + this.cilindrada + "]";
	}	

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}

	
}
