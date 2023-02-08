package com.corso.oop.es11.subentities;

import com.corso.oop.es11.entities.Tamagotchi;

public class Cagnolino extends Tamagotchi{
	final static private String SPECIE="Cagnolino";
	final static private double PESO=0.3;
	final static private double ALTEZZA=20;

	final static private double MOD_P=0.025;
	final static private double MOD_A=0.02;
	
	public Cagnolino(String nome) {
		super(nome, SPECIE, PESO, ALTEZZA);
	}
	
	public Cagnolino() {
		super("ilMioTamagotchi", SPECIE, PESO, ALTEZZA);
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
