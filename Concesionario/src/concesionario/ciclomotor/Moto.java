package concesionario.ciclomotor;

import java.util.Objects;

import concesionario.Vehiculo;

public class Moto extends Vehiculo{
	
	private String tipo;
	
	public Moto(String marca, String modelo, String matricula, String tipo) {
		super(marca, modelo, matricula);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public String toString() {
		return "Moto [marca=" + this.getMarca() + ",modelo=" + this.getModelo() + ", matricula=" + this.getMatricula() + "tipo=" + tipo + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		return Objects.equals(tipo, other.tipo);
	}
	

}
