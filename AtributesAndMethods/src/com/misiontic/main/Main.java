package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		//EJEMPLO 1
		
		Piloto piloto = new Piloto("Montoya",35);
		
		Coche coche  = new Coche("Seat","Leon","azul","1234BBB",10000,1000, piloto);
		Coche coche2 = new Coche("Renault","Clio","Rojo","ABC123",10000, piloto);
		
		//coche.setPiloto(piloto);
		
		System.out.println(coche.getPiloto().getName());
		
		/*
		Coche coche2 = new Coche();
		coche2.setMarca("Ferrari");
		coche2.setModelo("Enzo");
		coche2.setColor("rojo");
		coche2.setMatricula("5555JJK");
		coche2.setPrecio(55000);
		
		//double precioRespuesta = digameCualEsElPrecio(coche);
		//Piloto pilotoResultado = digameCualEsElPiloto(coche10000);
		*/
	}
	/*
	public static double digameCualEsElPrecio(Coche miCosito) {
		return miCosito.precio;
	}
	
	public static Piloto digameCualEsElPiloto(Coche coche) {
		return coche.piloto;
	}*/

}
