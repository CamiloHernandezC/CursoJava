package model;

public abstract class Vehiculo{

	//Atributos
	private String placa;
	private int potenciaMotor;
	private int puestos;
	private int ocupantes;
	
	
	//Getters-Setters (metodos)
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	
	public abstract void cobrar();

	public boolean estaLleno() {
		return puestos == ocupantes;
	}
}
