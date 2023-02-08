package com.corso.oop.es11.subentities;

import com.corso.oop.es11.entities.Tamagotchi;

public class Gattino extends Tamagotchi{
	final static private String SPECIE="Gattino";
	final static private double PESO=0.1;
	final static private double ALTEZZA=10;
	
	final static private double MOD_P=0.015;
	final static private double MOD_A=0.01;

	public Gattino(String nome) {
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
