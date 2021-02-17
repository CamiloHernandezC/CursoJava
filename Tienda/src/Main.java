
public class Main {

	public static void main(String[] args) {
		Articulo a = new Articulo(3, 1000);
		
		Articulo carro1 = new Carro(1000);
		Articulo moto = new Moto(2, 1000);
		
		soloReciboArticulos(carro1);
		soloReciboArticulos(moto);
		
	}
	
	
	public static void soloReciboArticulos(Articulo articulo) {
		System.out.println(articulo.descuento(0.3));
	}

}
