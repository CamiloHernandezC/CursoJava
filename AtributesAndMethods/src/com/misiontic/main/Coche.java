package com.misiontic.main;

public class Coche {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private double precio;//ESTE VALOR ESTA EN EUROS
	private double descuento = 2000;
	
	private Piloto piloto;
	
		
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
		switch (color) {
		case "azul":case "amarillo": case "rojo":{
			this.color = color;
		}
		default:
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
