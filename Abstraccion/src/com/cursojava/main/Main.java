package com.cursojava.main;

public class Main {

	static Matematica miObjetoMatematica = new Matematica();
	
	/*
	int 9999
	long 1000000
	char 'a'
	String "asdnadn"
	boolean true false
	float 1000000.0
	float	999.9999
	double 	999.99999999
	*/
	
	public static void main(String[] args) {
		int a = 3;
		System.out.println(miObjetoMatematica.multiplicar(a, 7));
	}
	
	public int multiplicar(int x, int y){
		return x*y;
		
	}
	
}
