
public class Peon extends Ficha{

	public Peon(boolean color) {
		super(color);
	}

	@Override
	public boolean puedoMover(int filaActual, int columnaActual, int filaDestino, int columnaDestino) {
		if(filaDestino < filaActual+1 && columnaActual == columnaDestino) {
			return true;
		}
		return false;
	}

}
