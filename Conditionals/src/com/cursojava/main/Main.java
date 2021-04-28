package com.cursojava.main;

public class Main {
	
	private static int temperatura = -1;

	public static void main(String[] args) {
		
		// Si la temperatura es mayor que 25
		if (temperatura < 25) {
		    System.out.println("Hace calor!!!");
		}else {
			if(temperatura < 0) {
				System.out.println("Hace mucho frio");
			}else {
				System.err.println("Está templado");
			}
		}
			        
		
		
		
		
		
		
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
*/
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + temperatura;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Main other = (Main) obj;
		if (temperatura != other.temperatura)
			return false;
		return true;
	}

}
