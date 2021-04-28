package com.cursojava.main;

public class Humano {

	private String nombre = "Camilo";
	private int edad;
	private Sexo sexo = Sexo.MALE;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	public void crecer() {
		
	}
	
}
