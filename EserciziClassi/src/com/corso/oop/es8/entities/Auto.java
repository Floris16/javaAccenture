package com.corso.oop.es8.entities;

public class Auto extends Veicolo {

	public Auto() {
		super();
	}

	public Auto(int targa, int oraArrivo, int oraScadenza) {
		super(targa, oraArrivo, oraScadenza);
		
	}
	public double calcolaTariffa(int ore) {
		double tariffa = 1*ore;
		
		return tariffa;
	}

	@Override
	public String toString() {
		return ("\nVeicolo: Auto"+super.toString());
	}
	
	
	
}
