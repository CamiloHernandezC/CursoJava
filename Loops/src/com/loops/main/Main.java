package com.loops.main;

public class Main {

	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
			for(int j = 0; j < 2; j=j+1) {
				System.out.println("j: "+j);
			}
		}		
	}

}
