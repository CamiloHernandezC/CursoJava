package com.misiontic.main;

public class Multiplicar {
	
	public static void main(String[] args) {
		
		int resultado = multiplicar (6, 4);
		System.out.println(resultado);

	}
	private static int multiplicar(int i, int j) {
		int resultado=0;
		for (int a=0; a<j; a++) {
			resultado = sumar (resultado,i);
		}
		
		return resultado;
	}
		
	private static int sumar(int i,int j) {
		int resultado = i+j;
		return resultado;
	}
}