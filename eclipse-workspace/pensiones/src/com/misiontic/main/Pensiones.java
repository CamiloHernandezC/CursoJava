package com.misiontic.main;

import java.util.Scanner;

public class Pensiones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
	    System.out.println("Ingrese su nombre");
	    	    
	    String nombre = sc.nextLine(); 
	       
	    System.out.println("Ingrese sexo (M / F): ");
	    
	    String sexo = sc.nextLine();	
	    
	    System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");
	    
	    int edad = sc.nextInt(); 
	    
	    System.out.println("Gracias " + nombre + ". Por favor ingrese las semanas cotizadas");
	    
	    int semanas = sc.nextInt(); 
	    
	       
	    if (sexo.equalsIgnoreCase("F") & edad > 57 & semanas >=1200){
	    	
	    	System.out.println("Felicidades " + nombre + " Usted puede pensionarse." );
	    } else {
	    	if (sexo.equalsIgnoreCase("M") & edad > 62 & semanas >=1200) {
	    		System.out.println("Felicidades " + nombre + " Usted puede pensionarse." );
	    	} else {
	    	System.out.println(nombre + " Usted aún no puede pensionarse." );  
		}
	    }
		sc.close();
	}
}

