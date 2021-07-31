package com.misiontic.main;

import java.util.Objects;

public class Medicine {
	String name;
	int healing;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
}
