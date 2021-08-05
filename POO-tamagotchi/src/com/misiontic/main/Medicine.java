package com.misiontic.main;

import java.util.Objects;

public final class Medicine {
	
	//Item 16 pag 99
	private final String name;
	private final int healing;
	
	//GETTERS
	public String getName() {		return name;	}
	public int getHealing() {		return healing;	}
	
	public Medicine(String name, int healing) {
		super();
		this.name = name;
		this.healing = healing;
	}

	/**
	 * Best practice for hashcode - page 72
	 * You can improve the performance making the parameters immutable and caching the hashCode page 74.
	 */
	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + Integer.hashCode(healing); 
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicine other = (Medicine) obj;
		return healing == other.healing && Objects.equals(name, other.name);
	}
	
	
	
}
