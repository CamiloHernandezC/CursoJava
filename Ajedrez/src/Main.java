
public class Main {
	
	private static Ficha[][] tablero = new Ficha[8][8];

	public static void main(String[] args) {
		
		
		String comando = leerComando();
		
		//TODO transformar el comando a los enteros
		int filaActual = 1;
		int columnaActual = 0;
		
		int filaDestino = 7;
		int columnaDestino = 0;
		
		boolean sePuedeMover = tablero[filaActual][columnaActual].puedoMover(filaActual, columnaActual, filaDestino, columnaDestino);
		if(sePuedeMover) {
			tablero[filaDestino][columnaDestino] = tablero[filaActual][columnaActual];
			tablero[filaActual][columnaActual] = null;
		}
		
		
		
				
		
	}
	
	static String leerComando(){
		//TODO leer lo que el usuario escriba en consola
		return "1,2;1,5";
	}


}
