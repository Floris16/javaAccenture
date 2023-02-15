package com.corso.oop.enums;

public enum CategoriaAuto {
	MINI(4, 2),
	STANDARD(5, 5),
	SUV(8.5, 7);
	
	private CategoriaAuto(double d, int i) {
		this.TARIFFA=d;
		this.CAPIENZAMASSIMA = i;
	}

	private final double TARIFFA;
	private final int CAPIENZAMASSIMA;

	public double getTariffa() {
		return TARIFFA;
	}

	public int getCAPIENZAMASSIMA() {
		return CAPIENZAMASSIMA;
	}
}
