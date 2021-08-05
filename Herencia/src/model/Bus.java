package model;

public class Bus extends VehiculoPublico{

	private int tarifa;
	
	@Override
	public void cobrar() {
		// cobrar la tarifa unica al inicar
		
	}
	
	public Bus(int tarifa) {
		super();
		this.tarifa = tarifa;
		setPuestos(20);
	}

}
