import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Controller {
	//Set -> no permite repetidos
	//List -> si permite repetidos; tiene un método get que me permitiria obtener cartas del mazo más facil
	List<Carta> mazo;
	
	
	

	//Cartas: (Clase - palo; valor); Enum; List<String>; String[]
	//1,2,3,4,5,6,7,8,9,10,J,Q,K,A (4 palos - Diamantes, Picas, Corazones, Treboles
	
	//Jugador: Cartas
	
	/*
	class Jugador{
		List<Carta> cartas
		Carta[] cartas;
		Carta carta1;
		Carta carta2;
		
		List<String> cartas;
		String[] cartas;
	}
	*/
	
	public static void main(String[] args) {
		inicializarMazo();
		
		
		//repartir 2 cartas a cada jugador
		
		//repartir 3 cartas para la mesa
		//repartir otra carta para la mesa
		//repartir otra carta para la mesa
		
		//determinarGanador
	}
	
	public void inicializarMazo() {
		mazo = new HashSet<>();
		Carta carta1 = new Carta();
		carta1.setPalo(Palo.DIAMANTE);
		mazo.add(carta1);
		
	}
	
	//1ra aproximación
	public void repartirAjugadores() {
		//Siempre van a ser 2
	}
	
	public void repartirALaMesa(int numeroDeCartas) {
		//aleatoria en un List
		mazo.get(new Random().nextInt(mazo.size()));
		
		//aleatoria en un Set
		int size = mazo.size();
		int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
		int i = 0;
		for(Carta carta: mazo)
		{
		    if (i == item)
		        return carta;
		    i++;
		}
		
		
	}
	
	//2da posibilidad
	public void repartir(int numeroDeCartas, boolean aQuien) {
		//aQuien -false -> jugadores
		//aQuien -true -> mesa
	}
	
	
	public void determinarGanador() {
		
	}
	
	
}
