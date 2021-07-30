package com.misiontic.main;

import java.awt.Color;

public class Animal {
	
	float peso;
	int felicidad;//va de 0 a 100, 0 es triste; 100 es feliz.
	int salud;//va de 0 a 100, 0 muerto, 100 muy saludable.
	int hambre;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	int sueno; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	private void comer() {
		if(hambre <= 5) {
			hambre = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			salud = salud -2;
		}else {
			hambre = hambre - 5;
		}
	}
	private void dormir() {
		
	}

	private void ejercitar() {
		
	}
	private void jugar() {
		
	}

}
