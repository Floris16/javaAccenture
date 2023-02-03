package com.corso.oop.entities;

public class Penna extends Articolo {
	String colore;

	public Penna(String colore) {
		super();
		this.colore = "";
	}

	public Penna(String marca, String modello, String colore, double costo) {
		super(marca, modello, costo);
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Penna [numArticolo=" + numeroArticolo + ", marca=" + marca + ", modello=" + modello + ", costo=" + costo + ", prezzoVendita="
				+ this.getPrezzoVendita() + ", colore=" + colore + "]";
	}

	
	
	
}
