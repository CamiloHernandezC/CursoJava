
public class Peon extends Ficha{

	public Peon(boolean color) {
		super(color);
	}

	@Override
	public void mover() {
		//setY(getY()+1);
		//Cambiar la posición en la matriz
		//Si esa posición está ocupada no se puede mover porque eso sería comer
		
		//Si esa posición está ocupada por una ficha contraria, puede remplazar la ficha en la matriz
		//si el movimeinto es en diagonal hacia adelante
		//de lo contrario si está ocupada por una ficha rival y el movimeinto no es en diagonal ascendente no se puede mover
	}

}
