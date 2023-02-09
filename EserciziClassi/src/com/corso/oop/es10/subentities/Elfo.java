package com.corso.oop.es10.subentities;

import com.corso.oop.es10.entities.Guerriero;
import com.corso.oop.es10.enums.Armi;

public class Elfo extends Guerriero {
	private static final int FORZA = 2;
	private static final int ABILITA = 9;
	public Elfo() {
		super(FORZA, ABILITA, Armi.ARCO);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calcolaValore() {
		// TODO Auto-generated method stub
		return FORZA+ABILITA+Armi.ARCO.ordinal()+rng()+1;
	}

}
