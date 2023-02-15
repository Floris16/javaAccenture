package com.corso.oop.entities;

public class Tessera {
	private final int CODICE;
	private double credito;
	
	
	public Tessera(int CODICE, double credito) {
		this.CODICE = CODICE;
		this.credito = credito;
	}
	
	public void addCredito (double credito) {
		if (credito>0)
			this.credito+=credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public int getCODICE() {
		return CODICE;
	}
	
	
 }
