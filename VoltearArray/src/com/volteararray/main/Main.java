package com.volteararray.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> miArray = new ArrayList<>();
		ArrayList<Integer> miArray2 = new ArrayList<>();
		
		//La casilla 1 pasa a 2 y 2 a 3
		miArray.add(15);
		miArray.add(22);
		miArray.add(4);
		miArray.add(56);
		miArray.add(71);
		miArray.add(10);
		miArray.add(2);
		miArray.add(8);
		
		miArray2.add(0);
		miArray2.add(100);
		
		//System.out.println("Así inicia:" + miArray);
		
		System.out.println("Así termina:" +  modificarArray(miArray2));

	}
	
	public static ArrayList<Integer> modificarArray(ArrayList<Integer> elNombreDeMiParametro) {
		elNombreDeMiParametro.add(0, elNombreDeMiParametro.get(elNombreDeMiParametro.size()-1));
		
		elNombreDeMiParametro.remove(elNombreDeMiParametro.size()-1);
		return elNombreDeMiParametro;
		
		//pasar el último elemento al primer lugar
		//pasar del último elemto al 0
		//casilla n a casilla 0
		//coja el elemento n y coloquelo en 0
		
	}

}
