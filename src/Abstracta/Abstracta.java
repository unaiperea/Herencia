//Al meterla en el package herencia
package Abstracta;


public abstract class Abstracta {

	
	private String privado;
	public String publico;
	/**
	 * Saludo gen�rido implementado para todas las clases hijas
	 */
	protected void saludar(){
		System.out.println("Hola");
	}
	
	
	/**
	 * Saludo personalizado sin implementar
	 * puesto que es la clase hija la encargada de hcerlo
	 * No est� implementado
	 */
	public abstract void saludoPersonalizado();
	/*{
		System.out.println("Hola soy la clase Hija");
	}*/
	
	public static void main(String[] args) {
		//No es instanciable, porque no est� 100% implementada
		//Abstracta obj = new Abstracta();
	}
}
