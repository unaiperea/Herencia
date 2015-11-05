package Abstracta;

import Abstracta.Abstracta;
/**
 * 
 * @author Curso
 *
 */
public class Hija extends Abstracta{

	/**
	 * En una clase hija se puede ampliar el �mbito pero nunca restringiro m�s
	 * Puede ser protected o public (si lo ampliamos)
	 * Pero nunca restringirlo: private
	 */
	@Override //Para sobrreescribirlo habr� que poner protected o public ya que est� fuera del paquete
	protected void saludar(){
		System.out.println("Hola soy tu hijo");
	}
	
	@Override //Sobreescribe el m�todo de la clase hija
	public void saludoPersonalizado(){
		
		//Acceso a los atributos del padre
		super.publico = "Veo el atributo"; //S�lo se puede poner super.attr y NO super.super.attr
		//privado = "No lo veo";
		
		System.out.println("Hola soy la clase hija");
	}
	
}
