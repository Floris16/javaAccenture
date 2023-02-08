package com.corso.oop.es12.subentities;

import com.corso.oop.es12.entities.Opera;

public class Statua extends Opera{
	private String materiale;
	private double altezza;

	public Statua(String autore, String titolo, String materiale, double altezza) {
		super(autore, titolo);
		this.materiale = materiale;
		this.altezza = altezza;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Statua [materiale=" + materiale + ", altezza=" + altezza + super.toString();
	}

	@Override
	public int compareTo(Opera arg0) {
		return super.getTitolo().compareToIgnoreCase(arg0.getTitolo());
	}

	
	
	
	
}
