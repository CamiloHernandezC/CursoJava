package geometria;

public class Circulo extends Figura {
	private int radio = 3;
	
	public Circulo() {
		super("Circulo");
	}

	@Override
	public void area() {
		super.area();
		System.out.println(3.141592 * radio * radio);
	}
}
