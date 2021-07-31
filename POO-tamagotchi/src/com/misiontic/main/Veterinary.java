package com.misiontic.main;

import java.util.HashSet;

public class Veterinary {
	
	static HashSet<Medicine> medicines = new HashSet<Medicine>();
	
	public Veterinary() {
		
		
	}
	
	public Medicine prescribeMedicine(Animal pet) {
		int triage = (100 - pet.health) 
				+ (100 - pet.sleep)/10 
				+ (100 - pet.hungry)/10;
		
		return medicines.stream()
				.filter(x -> x.healing > triage)
				.sorted()
				.findFirst()
				.get();
	}
}
