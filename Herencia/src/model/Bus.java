package model;

public class Bus extends Vehiculo{

	private int tarifa = 2000;
	
	@Override
	public void cobrar() {
		// cobrar la tarifa unica al inicar
		
	}
	
	public Bus() {
		super();
		setPuestos(20);
	}

}
