package bean;

import interfaces.Ordenable;

public class Avion implements Ordenable{

	private String nombre;
	private int numPasajeros;
	/**
	 * @param nombre
	 * @param numPasajeros
	 */
	public Avion(String nombre, int numPasajeros) {
		super();
		this.nombre = nombre;
		this.numPasajeros = numPasajeros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	@Override
	public String toString() {
		return "avion [nombre=" + nombre + ", numPasajeros=" + numPasajeros
				+ "]";
	}
	
	@Override
	public int getOrdenPeso() {
		return getNumPasajeros();
	}
	
}
