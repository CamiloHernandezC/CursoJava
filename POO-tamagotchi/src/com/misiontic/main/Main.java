package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		Animal perrito = new Animal();
		perrito.hambre = 50;
		perrito.felicidad = 50;
		
		Animal gatico = new Animal();
		gatico.hambre = 70;
		gatico.felicidad = 70;
		
		System.out.println("hambre perrito: " + perrito.hambre);
		System.out.println("hambre gatico: " + gatico.hambre);
		
		System.out.println("felicidad perrito: " + perrito.felicidad);
		System.out.println("felicidad gatico: " + gatico.felicidad);

	}

}
