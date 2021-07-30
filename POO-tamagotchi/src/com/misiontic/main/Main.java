package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		Animal gato = new Animal();		
		gato.peso = 10;
		gato.felicidad = 100;//va de 0 a 100, 0 es triste; 100 es feliz.
		gato.salud = 100;//va de 0 a 100, 0 muerto, 100 muy saludable.
		gato.hambre = 0;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
		gato.sueno = 0; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento

		
		System.out.println("hambre gatico: " + gato.hambre);
		

	}

}
