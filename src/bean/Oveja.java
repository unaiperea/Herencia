package bean;

import interfaces.Ordenable;

public class Oveja implements Ordenable, Comparable<Ordenable>{
	
	private String nombre;
	private float peso;
	/**
	 * @param nombre
	 * @param peso
	 */
	public Oveja(String nombre, float peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Oveja [nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	@Override
	public int getOrdenPeso() {
		return (int)peso;
	}
	
	@Override
	public int compareTo(Ordenable o){
		return this.getOrdenPeso() - o.getOrdenPeso();
	}
}
