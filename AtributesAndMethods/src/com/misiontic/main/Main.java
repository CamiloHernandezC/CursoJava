package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		//EJEMPLO 1
		Coche coche = new Coche();
		coche.setMarca("Seat");
		coche.setModelo ("Leon");
		coche.setColor("azul");
		coche.setMatricula("1234BBB");
		coche.setPrecio(10000);
		
		System.out.println(coche.getDescuento());
		
		Coche coche2 = new Coche();
		coche2.setMarca("Ferrari");
		coche2.setModelo("Enzo");
		coche2.setColor("rojo");
		coche2.setMatricula("5555JJK");
		coche2.setPrecio(55000);
		
		Piloto piloto = new Piloto();
		piloto.setName("Montoya");
		piloto.setAge(35);
		coche.setPiloto(piloto);
		
		System.out.println(coche.getPiloto().getName());
		
		//double precioRespuesta = digameCualEsElPrecio(coche);
		//Piloto pilotoResultado = digameCualEsElPiloto(coche10000);
		
	}
	/*
	public static double digameCualEsElPrecio(Coche miCosito) {
		return miCosito.precio;
	}
	
	public static Piloto digameCualEsElPiloto(Coche coche) {
		return coche.piloto;
	}*/

}
