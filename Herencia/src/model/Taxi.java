package model;

public class Taxi extends VehiculoPublico{
	
	public Taxi() {
		super();
		setPuestos(4);
	}

	@Override
	public void cobrar() {
		//cobrar por distancia
	}

}
