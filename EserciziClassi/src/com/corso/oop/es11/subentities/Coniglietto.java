package com.corso.oop.es11.subentities;

import com.corso.oop.es11.entities.Tamagotchi;

public class Coniglietto extends Tamagotchi{
	final static private String SPECIE="Coniglietto";
	final static private double PESO=0.1;
	final static private double ALTEZZA=10;
	
	final static private double MOD_P=0.02;
	final static private double MOD_A=0.015;

	public Coniglietto(String nome) {
		super(nome, SPECIE, PESO, ALTEZZA);
	}
	
	@Override
	public void mangia() {
		this.setAltezza(getAltezza()+MOD_A);
		this.setPeso(getPeso()+MOD_P);
		super.mangia();
	}
	
	@Override
	public void gioca() {
		if (this.checkPeso(MOD_P) && this.checkEnergia()) {
			this.setPeso(getPeso()-MOD_P);
			super.gioca();
		}
	}

	
}
