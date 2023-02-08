package com.corso.oop.es8.entities;

public class Bus extends Veicolo{

	//0.10€ * capacità posto  per i Bus all'ora
	private int posti;
	
	
	
	public Bus() {
		super();
	}

	public Bus(int targa, int oraArrivo, int oraScadenza,int posti) {
		super(targa, oraArrivo, oraScadenza);
		this.posti = posti;
	}
	


	public double calcolaTariffa(int ore) {
		double tariffa = 0.10*posti;
		
		return tariffa;
	}
	
	@Override
	public String toString() {
		return ("\nVeicolo: Bus"+super.toString());
	}
}
