package com.misiontic.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hello World");

	
	
	Scanner sc = new Scanner(System.in); //Se crea el lector
	
    System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario
    
    String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato
    
    System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario
    
    int edad = sc.nextInt(); //Se guarda la edad directamente con nextInt()
    
    //Nótese que ya no hubo necesidad de usar parseInt() pues nextInt nos retorna un entero derectamente
    
    System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
	

	}

}
