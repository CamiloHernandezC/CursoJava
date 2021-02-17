import java.util.List;

public class Main {
	
	private static Ficha pn1 = new Peon(true, 0, 1);
	private static Ficha pn2 = new Peon(true, 1, 1);
	private static Ficha pn3 = new Peon(true, 2, 1);
	private static Ficha pn4 = new Peon(true, 3, 1);
	private static Ficha pn5 = new Peon(true, 4, 1);
	private static Ficha pn6 = new Peon(true, 5, 1);
	private static Ficha pn7 = new Peon(true, 6, 1);
	private static Ficha pn8 = new Peon(true, 7, 1);
	
	private static Ficha pb1 = new Peon(false, 0, 6);
	private static Ficha pb2 = new Peon(false, 1, 6);
	private static Ficha pb3 = new Peon(false, 2, 6);
	private static Ficha pb4 = new Peon(false, 3, 6);
	private static Ficha pb5 = new Peon(false, 4, 6);
	private static Ficha pb6 = new Peon(false, 5, 6);
	private static Ficha pb7 = new Peon(false, 6, 6);
	private static Ficha pb8 = new Peon(false, 7, 6);
	
	private static Ficha[][] tablero = new Ficha[8][8];

	public static void main(String[] args) {
		
		
		/**/
		tablero[pn1.getX()][pn1.getY()] = pn1;
		tablero[pn2.getX()][pn2.getY()] = pn2;
		.
		.
		.
		
		/**/
		tablero[0][1] = new Peon(true);
		tablero[0][2] = new Peon(true);
		.
		.
		.
		
	}
	


}
