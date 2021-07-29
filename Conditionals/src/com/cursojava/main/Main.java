package com.cursojava.main;

public class Main {
	
	
	public static void main(String[] args) {
		
		

		/*Syntaxis
		 * OBLIGATORIO
			if (<condicion que debe ser o dar como resultado un boolean>) {
				<bloque de código>
			}
		 *OPCIONAL
		 	else{
		 		<otro bloque de código>
		 	}
		
		*/
		// If sin else
		/*
		System.
		out.println("inicio");
		
		boolean mostrarMensaje = true;
		
		if(mostrarMensaje) {
			System.out.println("Cumplió la condicion");
		}
		
		System.out.println("final");
		*/
		
		//If con else
		/*
		System.out.println("inicio");
		
		if(5 > 10) {
			System.out.println("Cumplió la condicion");
		}else {
			System.out.println("NO Cumplió la condicion");
		}
		
		System.out.println("final");
		*/
			
		//EJERCICIO
		/*
		
		int temperatura = -1;
		
		if (temperatura > 25) {
		    System.out.println("Hace calor!!!");
		}else {
			if(temperatura < 0) {
				System.out.println("Hace mucho frio");
			}else {
				System.out.println("Está templado");
			}
		}
		System.out.println("final");
		
		/*
		
		
		// Si haceSol es vedadero  
		if (haceSol) {
		    System.out.println("No te olvides la sombrilla");
		}
		        
		// Si esta nevando o hace sol
		if (nevando || haceSol) {
		    System.out.println("Que bien");
		}
		        
		// Si nevando y la temperatura esta entre 20 y 30
		if (nevando && (temperatura >= 20 && temperatura <= 30)) {
		    System.out.println("No me lo creo");
		}
		        
		// Si la temperatura es menor que 0 o mayor que 30 y hace sol
		if ((temperatura < 0 || temperatura > 30) && haceSol) {
		    System.out.println("Mejor me quedo en casa");
		}
		
		if(mujer) {
			if(edad > 57) {
				if(semanasCotizadas > 1200) {
					System.out.println("se puede pensionar");
				}else {
					System.out.println("no se puede pensionar");
				}
			}else {
				System.out.println("no se puede pensionar");
			}
		}else {//significa que es hombre
			if(edad > 62) {
				if(semanasCotizadas > 1200) {
					System.out.println("se puede pensionar");
				}else {
					System.out.println("no se puede pensionar");
				}
			}else {
				System.out.println("no se puede pensionar");
			}
		}*/
	}

}
