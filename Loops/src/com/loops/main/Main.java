package com.loops.main;

public class Main {

	
	public static void main(String[] args) {
		
		//FOR
		/*Syxtax: 
		  	for(int <variableName> = <initial value>; <exit condition>; <incremental function>){
				code block;
			}
		 */
		/*
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i: "+i);
		}
		
		
		//FOR EACH - PENDIENTE LUEGO DE VER COLLECTIONS
		
		//WHILE
		/*
		int i = 0;
		 while(i < 100) {
			System.out.println("i: " + i);
			i++;
		 }
		
		
		int i = 0;
		int j = 100;
		while(i < 100 || j > 0) {
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			i++;
			if(j<0) {
				j=0;
			}else {
				j=j-5;
			}
		}
		*/
		//DO-WHILE
		
		//EJERCICIO
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
			for(int j = 0; j < 2; j=j+1) {
				System.out.println("j: "+j);
			}
			System.out.println("termino el for interior");
		}	
	}

	static int i1 = 1;
	static int i0 = 0;
	static int i  = 0;
	private static int fibonacci() {
		// TODO Auto-generated method stub
		//CODIGO PARA LA FIBONNACIO
			i = i1 + i0;
			i0 = i1;
			i1 = i;
		return i;
	}

}
