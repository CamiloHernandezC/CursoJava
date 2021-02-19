
public abstract class Ficha {
	
	private boolean color;//0 blanco; 1 negro
	
	public Ficha(boolean color) {
		super();
		this.color = color;
	}

	public boolean isColor() {
		return color;
	}

	public abstract boolean puedoMover(int filaActual, int columnaActual, int filaDestino, int columnaDestino);

}
