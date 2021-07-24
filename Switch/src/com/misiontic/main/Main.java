package com.misiontic.main;

public class Main {

	public static void main(String[] args) {
		
		String dia = "lunes";
		
		switch (dia) {
			case "lunes":case "martes":case "miercoles":case "jueves":case "viernes": {
				System.out.println("Hoy es un dia entre semana semana");
				break;
			}
			case "sabado":case "domingo":{
				System.out.println("No es un día entre semana");
				break;
			}
		}
		/*
		int temperatura = 28;
		switch (dia) {
			case "lunes": {
				funcion()
				System.out.println("Hoy es el inicio de la semana");
				if(temperatura > 25) {
					System.out.println("y además es un día soleado");
					break;
				}
				System.out.println("y además es un día nublado");
			}
			case "martes": {
				System.out.println("Hoy es el segundo día de la semana");
				break;
			}
			case "viernes": {
				System.out.println("Por fin viernes!");
				break;
			}
			//OPCIONAL
			default:{
				System.out.println("No es un día entre semana");
			}
		}
		*/
		
		/*
		if(dia == "lunes") {
			System.out.println("Hoy es el inicio de la semana");
		}else if(dia == "martes") {
			System.out.println("hoy es martes");
		}else {
			System.out.println("no es entre semana");
		}*/
		
		
		System.out.println("aqui estoy continuando");
		

	}

}
