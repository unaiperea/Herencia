package bean;

import interfaces.Ordenable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejercicio para ordenar un ArrayList de Ovejas y Aviones
 * @author Curso
 *
 */
public class OrdenarOvejasAviones {

	public static void main(String[] args) {
		Oveja ov1 = new Oveja("Clara", 35.35f); //o (float)35.35
		Oveja ov2 = new Oveja("Lucerito", 500.95f);
		
		Avion av1 = new Avion("Jumbo", 700);
		Avion av2 = new Avion("AirBus", 320);
		
		ArrayList<Ordenable> lista = new ArrayList<Ordenable>();
		lista.add(ov1);
		lista.add(ov2);
		lista.add(av1);
		lista.add(av2);
		
		//Lista sin ordenar
		System.out.println(lista.toString());
		
		//Lista ordenada
		Collections.sort((List)lista);
		System.out.println(lista.toString());
		
		//Darle la vuelta al orden
		Collections.reverse((List)lista);
		System.out.println(lista.toString());
	}
}
