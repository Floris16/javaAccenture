package com.corso.oop.es7.entities;

public class Azienda extends Cliente{
	double conto;

	public Azienda() {
		super();
	}

	public Azienda(String denominazione, double conto) {
		super(denominazione);
		this.conto=conto;
	}
	
	public boolean scalaSoldi(double prezzo) {
		if (prezzo>this.conto) {
			System.out.println("Non hai abbastanza soldi.");
			return false;
		}
		this.conto-=prezzo;
		return super.scalaSoldi(prezzo);
	}
}
