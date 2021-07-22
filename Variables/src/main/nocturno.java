package main;

public class nocturno {
	

	
	public static void main(String[] args) {
		//Declaration
		//<type> <name>;
		long deuda;
		
		//Assignment (Must be previously declared)
		//<name> = <value> 
		deuda = -300L;
		
		//Declaration + initialization
		//<type> <name> = <value>;
		int edadDePension = 57;
		
		edadDePension = 80;
		
		int numero2 = edadDePension;
		
		edadDePension = 0;
		numero2 = edadDePension;
		
		//System.out.println(edadDePension);
		//System.out.println(numero2);
		
		
		/*PROGRAME UN CAJERO DONDE LO PRIMERO QUE LE MUESTRA EN PANTALLA 
		ES EL SALDO, LUEGO LE DA DINERO SI LO QUE QUIERE SACAR ES MENOR 
		AL SALDO QUE TIENE
		int saldo;
		saldo = 700000;
		int retiro = 60000;
		
		System.out.println("saldo: " + saldo);
		if(retiro < saldo) {
			System.out.println("nuevo saldo:" + (saldo-retiro));
			saldo = saldo-retiro;
		}
		System.out.println("saldo que quedo: " + saldo);*/
		operacionesLogicas();

	}
	
	
	private static void operacionesLogicas() {
		boolean a = true; //1
		boolean b = false; //0
		boolean c = true;//1
		//Multiplicacion - AND - &
		System.out.println(a & b & c);
		
		//Or |
		System.out.println(a | b | c);
		
		System.out.println((a | b) & (b | c));
		
	}


	public static void operacionesTexto() {
		String a = "Camilo";
		String b = "Hernandez";
		char espacio = ' ';
		String c = a + espacio + b;
		
		//Concatenacion (Unir textos) +
		System.out.println(c);
	}
	
	
	public static void operacionesMatematicas() {
		int a = 3;
		int b = 5;
		
		//SUMA +
		int c = a + b;
		System.out.println(c);
		
		//RESTA -
		int d = a - b;
		System.out.println(d);
		
		//Multiplicacion *
		int e = a * b;
		System.out.println(e);
		
		
		//Exponente se necesita una libreria, porque esta operacion no existe naturalmente en java
		
		
		//Division /
		//de nuemeros enteros me va a dar solo la parte entera
		//si quiero los decimales debo anteponer esto (float) o (double)
		float f = (float) a / b;
		System.out.println(f);
		
		
		//La division de numeros flotantes ya naturalmente me va a dar un decimal
		float g = 10F;//10.0
		float h = 3F;//3.0
		float i = g/h;
		System.out.println(i);
		
		
		//Modulo % es lo que sobra de una division entera
		
		System.out.println(10 % 3);
		
		
		
	}
	
}
