package main;

public class diurno {

	 
	 
	//Declaration
		//<type> <variable name>;
		int edadPensionMujer;
		
		//Declaration + initialization
		//<type> <variable name> = <value>;
		static int edadPension = 70;

		
		public void asignacion() {
			//Assignment
			//<variable name> = <value>;
			edadPensionMujer = 62;
		}
		

		/*
		 * Punto de inicio
		 */
		public static void main(String[] args) {
			/*
			//System.out.println("HELLO WORDL");
			
			System.out.println("La edad de la pension es:" + edadPension);
		
			//<tipo> <nombre> = <valor>;
			int fechaNacimiento = 1993;
			
			
			long edad = 28L;
			long saldo = 2147483648L;
			long vistasDeYoutube = 9000000000L;
			
			
			float pi = 3.141592F;
			double euler =  2.718;
			
			
			char c = ' ';
			char n ='8';
			String s = "Hello wordl";
			String s2 = "3";
			String s3 = "a";
					
					
			boolean t = true;
			boolean f = false;
			
			if(55 < edadPension) {
				System.out.println("No se puede pensionar");
			}
			if(70 > edadPension) {
				System.out.println("Felicitaciones usted se va a pensionar");
			}
			*/
			//operacionesMatematicas();
			//operacionesTexto();
			operacionesLogicas();
		
		}
		
		private static void operacionesLogicas() {
			boolean a = false; //0
			boolean b = false; //0
			boolean c = true;//1
			//Multiplicacion - AND - &
			System.out.println(a & b & c);
			
			//Or |
			System.out.println(a | b | c);
			
			System.out.println(a | b & c);
			
			
		}


		public static void operacionesTexto() {
			String a = 'Camilo';
			String b = "Hernandez";
			
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
			float g = 10F;
			float h = 3F;
			float i = g/h;
			System.out.println(i);
			
			//Modulo % es lo que sobra de una division entera
			
			System.out.println(20%6);
			
			
			
		}
}
