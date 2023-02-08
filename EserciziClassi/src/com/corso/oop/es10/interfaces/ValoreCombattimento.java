package com.lotr.contracts;

import java.util.Random;

public interface ValoreCombattimento {

	public int calcolaValore();
	public default int rng() {
		Random rng = new Random();
		return rng.nextInt(1,11);
		
	}
	
}
