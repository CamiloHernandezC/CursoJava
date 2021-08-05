package geometria;

public class Cuadrado extends Rectangulo {

	
	public Cuadrado() {
		super("Cuadrado");
	}

	@Override
	public void area() {
		super.area();
		System.out.println("Area cuadrado");
	}
}
