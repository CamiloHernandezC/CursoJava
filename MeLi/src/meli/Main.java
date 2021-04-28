package meli;


public class Main {

	public static void main(String[] args) {
		/*
		double xKenobi 		= -500;
		double yKenobi 		= -200;
		double xSkywalker 	=  100;
		double ySkywalker	= -100;
		double xSato		=  500;
		double ySato 		=  100;
		
		double distanceKenobi 		= 1000;
		double distanceSkywalker	= 1150.5;
		double distanceSato 		= 1420.7;
		/*/
		double xKenobi 		= 0;
		double yKenobi 		= 2*100*Math.sqrt(3);
		double xSkywalker 	= 100;
		double ySkywalker	= 0;
		double xSato		= -100;
		double ySato 		= 0;
		
		double distanceKenobi 		= 100*Math.sqrt(3);
		double distanceSkywalker	= 200;
		double distanceSato 		= 200;
		
		String[] message1 = {"","este","es","un","mensaje"}; 
		String[] message2 = {"este","","un","mensaje"};
		String[] message3 = {"", "", "es","","mensaje"};
		//TRILATERACION: http://repositoriodigital.uns.edu.ar/bitstream/123456789/4671/3/La%20matem%C3%A1tica%20detr%C3%A1s%20del%20GPS.pdf
		//TRASLACIÓN Y ROTACION: https://matematicasn.blogspot.com/2015/12/traslacion-y-rotacion-de-ejes-de.html#:~:text=Es%20verdad%20que%2C%20por%20una,ecuaciones%20en%20formas%20m%C3%A1s%20simples.&text=Si%20una%20ecuaci%C3%B3n%20es%20transformada,simplificaci%C3%B3n%20por%20transformaci%C3%B3n%20de%20coordenadas.
		
		double distance12 = Math.sqrt(Math.pow((xKenobi-xSkywalker),2)+ Math.pow((yKenobi-ySkywalker),2));
		double x = (Math.pow(distanceKenobi, 2)- Math.pow(distanceSkywalker, 2) 
					+ Math.pow(distance12,2))/(2*distance12);
		
		
		double tetha = Math.asin((ySkywalker-yKenobi)/distance12);
		double i = ((xSato - xKenobi)* Math.cos(tetha)) + ((ySato-yKenobi)*Math.sin(tetha));
		double j = ((ySato - yKenobi)* Math.cos(tetha)) - ((xSato-xKenobi)*Math.sin(tetha));
		
		double y =  (Math.pow(distanceKenobi, 2)- Math.pow(distanceSato, 2) 
				+ Math.pow(i,2) + Math.pow(j,2))/(2*j)-(i*x/j);
		
		double xOrigin = Utils.round(xKenobi + (x * Math.cos(tetha))-(y*Math.sin(tetha)),4);
		double yOrigin = Utils.round(yKenobi + (x * Math.sin(tetha))+(y*Math.cos(tetha)),4);
		
		System.out.println("X: "+xOrigin);
		System.out.println("Y: "+yOrigin);
		System.out.println("tetha: "+tetha);
		double firstCondition = Utils.round(Math.pow(distanceKenobi,2)-Math.pow(x,2)-Math.pow(y,2),2);
		double secondCondition = Utils.round(Math.pow(distanceSkywalker,2)-Math.pow(x-distance12,2)-Math.pow(y,2),2);
		double thirdCondition = Utils.round(Math.pow(distanceSato,2)-Math.pow(x-i,2)-Math.pow(y-j,2),2);
		System.out.println(firstCondition);
		System.out.println(secondCondition);
		System.out.println(thirdCondition);
		if(firstCondition!=0
				|| secondCondition!=0
					|| thirdCondition!=0) {
			System.out.println("mala solución");
		}
		
		
		
	}

}
