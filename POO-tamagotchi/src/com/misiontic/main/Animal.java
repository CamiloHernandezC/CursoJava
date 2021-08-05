package com.misiontic.main;

public final class Animal {
	
	private float 	weight;
	private int 	happiness;	//va de 0 a 100, 0 es triste; 100 es feliz.
	private int 	health;		//va de 0 a 100, 0 muerto, 100 muy saludable.
	private int 	hungry;		//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	private int 	sleep; 		//va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	private boolean awake;
	
	
	//GETTERS
	public float getWeight()	{	return weight;		}
	public int getHappiness() 	{	return happiness;	}
	public int getHealth() 		{	return health;		}
	public int getHungry() 		{	return hungry;		}
	public int getSleep() 		{	return sleep;		}
	public boolean isAwake() 	{	return awake;		}
	
	//SETTERS
	public void setWeight(float weight) 	{	this.weight = weight;		}
	public void setHappiness(int happiness) {	this.happiness = happiness;	}
	public void setHealth(int health) 		{	this.health = health;		}
	public void setHungry(int hungry) 		{	this.hungry = hungry;		}
	public void setSleep(int sleep) 		{	this.sleep = sleep;			}
	
	// Builder Pattern pag -34
	public static class Builder {
		private float 	weight 		= 0;
		private int 	happiness	= 100;
		private int 	health		= 100;
		private int 	hungry		= 0;
		private int 	sleep		= 0;
		private boolean awake		= true;
		
		public Builder weight(float value) {
			weight = value;
			return this;
		}
		public Builder happiness(int value) {
			happiness = value;
			return this;
		}
		public Builder health(int value) {
			health = value;
			return this;
		}
		public Builder hungry(int value) {
			hungry = value;
			return this;
		}
		public Builder sleep(int value) {
			sleep = value;
			return this;
		}
		public Builder awake(boolean value) {
			awake = value;
			return this;
		}
		
		public Animal build() {
			return new Animal(this);
		}
	}
	
	private Animal(Builder builder) {
		this.weight 	= builder.weight;
		this.happiness 	= builder.happiness;
		this.health 	= builder.health;
		this.hungry 	= builder.hungry;
		this.sleep 		= builder.sleep;
		this.awake 		= builder.awake;
	}
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	public void eat(Food food) {
		weight = weight + 2;
		if(hungry <= food.getCalories()) {
			hungry = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			health = health -2;			
		}else {
			hungry = hungry - food.getCalories();
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
	public void play() {
		sleep = sleep + 5;
		happiness = happiness + 5;
		hungry = hungry + 5;
	}

}
