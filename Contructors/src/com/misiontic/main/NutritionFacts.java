package com.misiontic.main;

public class NutritionFacts {
	private final int servingSize; // (mL) required
	private final int servings; // (per container) required
	private final int calories; // (per serving) optional
	private final int fat; // (g/serving) optional
	private final int sodium; // (mg/serving) optional
	private final int carbohydrate; // (g/serving) optional

	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0, 0, 0, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int carbohydrate) {
		this(servingSize, servings, 0, 0, 0, carbohydrate);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

}
