package com.misiontic.main;

import java.util.HashSet;

public class Veterinary {
	
	static HashSet<Medicine> medicines = new HashSet<Medicine>();
	
	public Veterinary() {
		
		
	}
	
	public Medicine prescribeMedicine(Animal pet) {
		int triage = (100 - pet.getHealth()) 
				+ (100 - pet.getSleep())/10 
				+ (100 - pet.getHungry())/10;
		
		return medicines.stream()
				.filter(x -> x.getHealing() > triage)
				.sorted()
				.findFirst()
				.get();
	}
}
