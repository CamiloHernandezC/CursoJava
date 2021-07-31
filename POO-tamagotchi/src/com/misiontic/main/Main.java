package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		Animal cat = new Animal();		
		cat.weight = 10;
		cat.happiness = 100;//va de 0 a 100, 0 es triste; 100 es feliz.
		cat.health = 100;//va de 0 a 100, 0 muerto, 100 muy saludable.
		cat.hungry = 0;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
		cat.sleep = 0; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento

		
		Veterinary veterinary = new Veterinary();
		Medicine m = veterinary.prescribeMedicine(cat);
		System.out.println("la medicina que me recetan es: " + m.name);
		
		System.out.println("hambre gatico: " + cat.hungry);
		System.out.println(Math.floor((100 - 50)/10));
		System.out.println(Math.ceil(5.25));

	}

}
