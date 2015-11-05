package Abstracta;

public class HijoBastardo  extends PadreBastardo{

	int c;

	public HijoBastardo() {
		super(); //Llama a Object, si no lo ponemos lo hace el compilador
		this.c = -3; //Se puede obviar la ref this. Se podría utilizar el this cuando el parámetro tiene el mismo nombre. Por éso en los getters y setters es bueno ponerlo
	}
	
	/**
	 * @param c
	 */
	public HijoBastardo(int c) {
		super(); //Llama a Object, si no lo ponemos lo hace el compilador
		this.c = c; //Se puede obviar la ref this. Se podría utilizar el this cuando el parámetro tiene el mismo nombre. Por éso en los getters y setters es bueno ponerlo
		
	}

	
	public static void main(String[] args){
		HijoBastardo hb = new HijoBastardo();
		System.out.println((hb.toString()));
		String nombres[] ={"Juan", "Maria", "Antonio","Victoria"};
		System.out.println( "La longuitud del array es= " + nombres.length );
		
	}
	
	
	/*Clase interna*/
	class BastardinInterna{
		
		int j;
		
		void saludo(){
			System.out.println("Soy un  bastardin");
		}
	}
}
