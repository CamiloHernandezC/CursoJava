package com.misiontic.main;

public class Animal {
	
	float weight;
	int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	int hungry;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	int sleep; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	boolean awake;
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	public void eat(Food food) {
		weight = weight + 2;
		if(hungry <= food.calories) {
			hungry = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			health = health -2;			
		}else {
			hungry = hungry - food.calories;
		}
	}
	private void eat() {
		sleep = 100;
		health = health + 1;
	}

	private void makeExercise() {
		happiness = happiness + 1;
		hungry = hungry + 10;
		health = health + 3;
		weight = weight - 1;
		sleep = sleep + 5;
		
	}
	private void play() {
		sleep = sleep + 5;
		happiness = happiness + 5;
		hungry = hungry + 5;
	}

}
