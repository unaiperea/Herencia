package Abstracta;

public class PadreBastardo{

	int a;
	int b;
	
	public PadreBastardo(){
		super(); //Llama a Object, si no lo ponemos lo hace el compilador
		this.a = -1; //Se puede obviar la ref this. Se podría utilizar el this cuando el parámetro tiene el mismo nombre. Por éso en los getters y setters es bueno ponerlo
		this.b = -2;
	}
	
	public PadreBastardo( int a, int b){
		super(); //Llama a Object, si no lo ponemos lo hace el compilador
		this.a = a; //Se puede obviar la ref this. Se podría utilizar el this cuando el parámetro tiene el mismo nombre. Por éso en los getters y setters es bueno ponerlo
		this.b = b;
	}
	@Override
	public String toString() {
		return "HijoBastardo [a=" + a + ", b=" + b + "]";
	}

	
	
}
