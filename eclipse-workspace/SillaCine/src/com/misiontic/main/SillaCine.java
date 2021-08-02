package com.misiontic.main;


public class SillaCine {
	
	private int id_silla;
	private int numero;
	private String sala;
	
	
	public SillaCine(int id_silla, int numero, String sala) {
		this.id_silla = id_silla;
		this.numero = numero;
		this.sala = sala;
	}

	public String esMultiplo() {
		
		int resto1 = numero % 3; 
		int resto2 = numero % 2;
		if (resto1 == 0) {
			System.out.println("Se�or usuario, en este caso, usted tiene derecho a un boleto adicional para otra pel�cula"); 
			
		} else {
			if (resto2 == 0) {
				System.out.println("Se�or usuario, en este caso, usted tiene derecho a un 30% en el valor de la boleta"); 	
			} else {
				if (resto1 == 0 && resto2 == 0) {
					System.out.println("Se�or usuario, en este caso, usted tiene derecho a una boleta para ver otra pel�cula. Adem�s de tambi�n, un 30% en la boleta de esta pel�cula."); 	
				}else {
					System.out.println("El n�mero debe ser m�ltiplo de 3 o 2"); 
				}
			}
		}
		return esMultiplo();
		
	}
	int getId_silla() {
		return id_silla;
	}
	
	void setId_silla(int id_silla) {
		this.id_silla = id_silla;
		
	}
	
	int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		this.numero=numero;
	}

	String getSala() {
		return sala;
	}
	
	void setSala(String sala) {
		this.sala = sala;
	}
	
}
