package com.misiontic.main;

public class Main {
	
	public static void main(String[] args) {
		
		Animal cat = new Animal.Builder().weight(6).happiness(100).build();

		Food apple = new Food(5);
		
		Veterinary veterinary = new Veterinary();
		Medicine m = veterinary.prescribeMedicine(cat);
		cat.eat(apple);
		System.out.println("la medicina que me recetan es: " );
		
		System.out.println("hambre gatico: " + cat.getHungry());
		System.out.println(Math.floor((100 - 50)/10));
		System.out.println(Math.ceil(5.25));

	}

}
