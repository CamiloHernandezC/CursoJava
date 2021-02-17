
public class Carro extends Articulo {

	public Carro(int price) {
		super(4, price);
	}
	
	public double descuento(double descuento) {
		descuento += 0.1;
		return super.descuento(descuento);
	}
}
