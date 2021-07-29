package com.misiontic.main;

import java.util.Scanner;

public class Main {

	//<modificador privacidad> <tipo de retorno> <nombre de la funcion> (tipos de parametro  nombre parametro)

	public static void main(String[] args) {

		
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre:  ");
        String nombre = scanner.nextLine();
        System.out.println("Edad:  ");
        int edad = scanner.nextInt();
        System.out.println("Semanas cotizadas:  ");
        int semanas = scanner.nextInt();
        System.out.println("Sexo (M o F):  ");
        String sexo = scanner.nextLine();
        calcularpension(edad, semanas, sexo);
	}

	
	private static void calcularpension(int edad, int semanas, String sexo) {
		System.out.println("calculando...");
	}


	public static int multiplicar(int x, int y) {
		return sumar(sumar(x,x), sumar(x,x)) + x;
	}
	
	public static int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}
	
	public static int exponente() {
		/*
		int resultado = 1;
		for (int i = 0; i<n; i++) {
			resultado = resultado*x;
		}*/
		
		int n, base;
		Scanner tec = new Scanner(System.in);
		System.out.println("Ingrese la base: ");
		base = tec.nextInt();
		System.out.println("Ingrese el exponente");
		n = tec.nextInt();
		tec.close();
		int resultado = (int) Math.pow(base, n);
		System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
		
		
		return resultado;
	}
	

}
