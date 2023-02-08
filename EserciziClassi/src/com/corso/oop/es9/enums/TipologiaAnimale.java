package com.corso.oop.es9.enums;

public enum TipologiaAnimale {
	Terrestre(0),
	Volatile(1),
	Acquatico(2);
	

	final int index;
	
	TipologiaAnimale(int i) {
		this.index=i;
	}
	

	public int getIndex() {
		return index;
	}

}
