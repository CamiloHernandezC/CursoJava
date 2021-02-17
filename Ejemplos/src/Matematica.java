
public abstract class Matematica {

	
	
	private final double GRAVEDAD_TIERRA = 9.8;
	
	public abstract double division();
	
	public final int multiplicar(int x, int y) {
		//return x*y;
		int resultado = 0;
		for(int i=0; i<y; i++) {
			resultado += x;
		}
		return resultado;
	}

	public double getGravedad() {
		return GRAVEDAD_TIERRA;
	}

}


