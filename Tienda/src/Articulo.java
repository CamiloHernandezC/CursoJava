
public class Articulo {
	
	
	private int llantas;
	private int price;
	
	public Articulo(int llantas, int price) {
		super();
		this.llantas = llantas;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public double descuento(double descuento) {
		return price * (1-descuento);
	}

}
