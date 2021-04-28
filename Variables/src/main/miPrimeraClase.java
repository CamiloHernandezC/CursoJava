package main;

public class miPrimeraClase {

	/*
	 * Punto de inicio
	 */
	public static void main(String[] args) {
		
		//<type> <variable name>
		int edadDePensionSegunLaLey = 65;
		
		//<variable name> = <valor>
		//edadDePensionSegunLaLey = 5;
		
		String nombre = "Nicolas Mogollon";
		
		System.out.println("edad: " + "62");
		System.out.println("edad: " + "63");
		System.out.println("edad: " + "26");
		System.out.println("");
		System.out.println("edad: " + edadDePensionSegunLaLey);
		System.out.println("edad: " + edadDePensionSegunLaLey);
		System.out.println("edad: " + edadDePensionSegunLaLey);
		
		boolean sePuedePensionar = darResultado(true, true);
		System.out.println("se puede pensionar?: "+ sePuedePensionar);
		
	
	}
	
	public static boolean darResultado(boolean semanas, boolean edad) {
		return semanas && edad;	
	}

	
}
