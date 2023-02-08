package com.corso.oop.es9.enums;

public enum SpecieAnimale {
	Cane(0),
	Gatto(1),
	Anatra(2),
	Piccione(3);
	
	final int index; 
	
	SpecieAnimale(int i) {
		this.index=i;
	}
}
