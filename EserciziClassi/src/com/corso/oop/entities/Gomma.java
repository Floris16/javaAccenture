package com.corso.oop.entities;

public class Gomma extends Articolo{
	double dimensioni;
	String forma;
	
	public Gomma() {
		super();
		this.forma="";
	}
	public Gomma(String marca, String modello, double costo, String forma, double dimensioni) {
		super(marca, modello, costo);
		this.dimensioni=dimensioni;
		this.forma=forma;
	}

	@Override
	public String toString() {
		return "Gomma [marca=" + marca + ", modello=" + modello + ", costo=" + costo + ", prezzoVendita="
				+ this.getPrezzoVendita() + ", dimensioni=" + dimensioni + ", forma=" + forma + "]";
	}
}
