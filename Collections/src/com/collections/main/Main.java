package com.collections.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	/*
	array []
	tuplas ()
	diccionarios {key:value}
	
	List -> colecciones datos que pueden estar duplicados
		ArrayList -> tienen orden segun el ingreso 
		
	Set -> colecciones sin duplicados
		HashSet -> no tiene un orden en particular
		LinkedHashSet -> tienen un ordenamieto segun el ingreso
		TreeSet ->
	Map<key, value>  -> almacenan una clave valor
		HashMap
		*/
	

	static List<String> miLista;
	
	public static void main(String[] args) {
		
		miLista = new ArrayList<String>();
		
		miLista.add("item 0");
		miLista.add("item 1");
		miLista.add("item 2");
		
		for(int i = 0; i< miLista.size(); i++) {
			System.out.println(miLista.get(i));
		}
		
		/*
		 miLista.add(0, "5to elemento");
		
		miLista.add("6to elemento");
		miLista.add(1, "6to elemento");
		/*
		*/
		
		/*
		List<Auto> miListaDeCosasParaVender = new ArrayList<>();
		
		Auto elCarroDeMauro = new Auto();
		elCarroDeMauro.setKilometraje(65000);
		elCarroDeMauro.setModelo(2018);
		elCarroDeMauro.setMarca("chevrolet");
		
		Auto elCarroDeNico = new Auto();
		elCarroDeNico.setKilometraje(30000);
		elCarroDeNico.setModelo(2015);
		elCarroDeNico.setMarca("toyota");
		
		Auto elCarroDeCamilo = new Auto();
		elCarroDeCamilo.setKilometraje(200000);
		elCarroDeCamilo.setModelo(1980);
		elCarroDeCamilo.setMarca("Peageut");
		
		//set... cambia el valor de un atributo
		//get... obtiene el valor de ese atributo
		
		miListaDeCosasParaVender.add(elCarroDeMauro);
		miListaDeCosasParaVender.add(elCarroDeNico);
		miListaDeCosasParaVender.add(0, elCarroDeCamilo);
		
		
		//Mostrar los carros para vender
		for(int i = 0; i < miListaDeCosasParaVender.size(); i++) {
			
			System.out.println(miListaDeCosasParaVender.get(i).getKilometraje());
			System.out.println(miListaDeCosasParaVender.get(i).getModelo());
			System.out.println(miListaDeCosasParaVender.get(i).getMarca());
		}
		
		System.out.println("For each---------------");
		
		for(Auto item : miListaDeCosasParaVender) {
			System.out.println(item.getKilometraje());
			System.out.println(item.getModelo());
			System.out.println(item.getMarca());
		}
		*/			  
	}

}
