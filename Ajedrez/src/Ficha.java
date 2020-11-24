
public abstract class Ficha {
	
	private boolean color;//0 blanco; 1 negro
	

	public Ficha(boolean color) {
		super();
		this.color = color;
	}

	public abstract void mover();

}
