package com.misiontic.main;

public class Coche {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private double precio;//ESTE VALOR ESTA EN EUROS
	private double descuento = 2000;
	
	private Piloto piloto;
	
		
	public Coche(String marca, String modelo, String color, String matricula, double precio, double descuento, Piloto piloto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.precio = precio;
		this.descuento = descuento;
		this.piloto = piloto;
	}
	
	public Coche(String marca, String modelo, String color, String matricula, double precio, Piloto piloto) {
		this(marca,modelo,color,matricula,precio,0,piloto);
		
	}

	public double getDescuento() {
		return descuento;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("rojo")) {
			this.color = color;
		}
		else {
			System.out.println("ESO NO ES UN COLOR VALIDO");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public void arrancar() {
		
	}
	
	public void detenerse() {
		
	}
	
	public void acelerar() {
		
	}
	
	public void frenar(){
		
	}
}
