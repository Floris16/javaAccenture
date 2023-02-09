package com.corso.oop.es10.subentities;

import com.corso.oop.es10.entities.Guerriero;
import com.corso.oop.es10.enums.Armi;

public class Nano extends Guerriero {
	private static final int FORZA = 9;
	private static final int ABILITA = 2;
	
	public Nano() {
		super(FORZA, ABILITA, Armi.ASCIA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaValore() {
		// TODO Auto-generated method stub
		return FORZA+ABILITA+Armi.ASCIA.ordinal()+rng()+1;
	}

}
