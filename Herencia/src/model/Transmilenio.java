package model;

public class Transmilenio extends Bus{
	
	public Transmilenio(String placa) {
		super(2500);
		setPuestos(50);
		setPlaca(placa);
	}
	
	@Override
	public boolean estaLleno() {
		return getOcupantes() == getPuestos() * 3;
	}
	
}
