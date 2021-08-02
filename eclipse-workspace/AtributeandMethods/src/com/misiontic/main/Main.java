package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		coche1.marca = "Seat";
		coche1.modelo = "Leon";
		coche1.color = "Rojo";
		coche1.matricula = "1234BBB";
		coche1.precio = 10000;
		
		System.out.println("Coche 1: ");
		System.out.println(coche1.marca);
		System.out.println(coche1.modelo);
		System.out.println(coche1.color);
		System.out.println(coche1.matricula);
		System.out.println(coche1.precio);
		
		
		Coche coche2 = new Coche();
		coche1.marca = "Ferrari";
		coche1.modelo = "Enzo";
		coche1.color = "Rojo";
		coche1.matricula = "5555JJK";
		coche1.precio = 55000;
		
		System.out.println("Coche 2: ");
		System.out.println(coche2.marca);
		System.out.println(coche2.modelo);
		System.out.println(coche2.color);
		System.out.println(coche2.matricula);
		System.out.println(coche2.precio);

		
		Coche coche3 = new Coche();
		coche3.marca = "Renault";
		coche3.modelo = "Clio";
		coche3.color = "Gris";
		coche3.matricula = "4444GFB";
		coche3.precio = 8000;
		
		System.out.println("Coche 3: ");
		System.out.println(coche3.marca);
		System.out.println(coche3.modelo);
		System.out.println(coche3.color);
		System.out.println(coche3.matricula);
		System.out.println(coche3.precio);
	}

}
