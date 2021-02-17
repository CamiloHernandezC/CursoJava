package solucionLeonardo;

public class Dron {

	private int x;
	private int y;
	private String orientacion;
	private int frontSide;
	
	public Dron() {
		this.x = 0;
		this.y = 0;
		this.orientacion = "norte";
	}
	
	public Dron(int x, int y, String orientacion) {
		this.x = x;
		this.y = y;
		this.orientacion = orientacion;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public int getFrontSide() {
		return frontSide;
	}

	public void setFrontSide(int frontSide) {
		this.frontSide = frontSide;
	}

	public void avanzar(int distancia) {
		switch (orientacion){
	        case "norte":
	            y += distancia;
	            break;
	        case "sur":
	            y -= distancia;
	            break;
	        case "oriente":
	            x += distancia;
	            break;
	        case "occidente":
	            x -= distancia;
	            break;
		}
	}
	
	public void procesarComando(String comando){
		
		for (String c : comando.split("")){
            switch (c) {
                case "A":
                    avanzar(1);
                    break;
                case "D":
                    girarHorario();
                    break;
                case "I":
                    girarAntihorario();
                    break;
            }
        }
	}
	
	public void girarHorario() {
		if(orientacion == "norte"){
			orientacion = "oriente";
			return;
		}
		if(orientacion == "oriente"){
			orientacion = "sur";
			return;
		}
		if(orientacion == "sur"){
			orientacion = "occidente";
			return;
		}
		if(orientacion == "occidente"){
			orientacion = "norte";
			return;
		}
	}
	
	public void girarAntihorario() {
		if(orientacion == "norte"){
			orientacion = "occidente";
			return;
		}
		if(orientacion == "occidente"){
			orientacion = "sur";
			return;
		}
		if(orientacion == "sur"){
			orientacion = "oriente";
			return;
		}
		if(orientacion == "oriente"){
			orientacion = "norte";
			return;
		}
	}
	
	
	public void turn(boolean sentido) {
		if(sentido) {
			frontSide+=90;
			if(frontSide>=360) {
				frontSide-=360;
			}
		}
		else {
			frontSide-=90;
			if(frontSide <= 0) {
				frontSide+=360;
			}
		}
	}

}
