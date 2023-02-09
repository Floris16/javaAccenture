package com.corso.oop.es10.entities;

import com.corso.oop.es10.enums.Armi;
import com.corso.oop.es10.interfaces.ValoreCombattimento;

public abstract class Guerriero implements ValoreCombattimento{
	private int forza;
	private int abilita;
	private Armi arma;

	
	
	public Guerriero(int forza, int abilita, Armi arma) {
		super();
		this.forza = forza;
		this.abilita = abilita;
		this.arma = arma;
	}
	
	
	
}
