package com.corso.oop.es10.subentities;

import com.corso.oop.es10.entities.Guerriero;
import com.corso.oop.es10.enums.Armi;

public class Uomo extends Guerriero {
	private static final int FORZA = 6;
	private static final int ABILITA = 5;
	
	public Uomo() {
		super(FORZA, ABILITA, Armi.SPADA);
		
	}

	@Override
	public int calcolaValore() {
		
		return FORZA+ABILITA+Armi.SPADA.ordinal()+rng()+1;
	}

	
	

}
