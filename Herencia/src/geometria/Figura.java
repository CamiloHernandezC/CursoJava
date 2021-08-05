package geometria;

public class Figura {
	
	private String nombre;
	
	public Figura(String n) {
		nombre = n;
	}
	
	public void area() {
		System.out.println("Voy a calcular el area de la Figura: " + nombre);
	}
	
	public void perimetro() {
		System.out.println("Voy a calcular el perimetro de la FIgura: "+ nombre);
	}
}
