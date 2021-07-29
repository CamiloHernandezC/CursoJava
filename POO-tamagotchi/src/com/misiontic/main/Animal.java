package com.misiontic.main;

import java.awt.Color;

public class Animal {
	int cantidadDePatas = 4;
	Color colordePelo;
	float peso;
	static int felicidad;//va de 0 a 100, 0 es triste; 100 es feliz.
	int salud;//va de 0 a 100, 0 muerto, 100 muy saludable.
	int hambre;//va de 0 a 100, 0 es famelico y 100 es muy lleno.
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	private void comer() {
		if(hambre >= 100) {
			hambre = 100;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			salud = salud -2;
		}else {
			if(hambre + 5 > 100) {
				hambre = 100;
			}else {
				hambre = hambre +5;
			}
		}
		
	}
	private void dormir() {
		
	}
	private void irAlDoctor() {
		
	}
	private void ejercitar() {
		
	}
	private void jugar() {
		
	}

}
