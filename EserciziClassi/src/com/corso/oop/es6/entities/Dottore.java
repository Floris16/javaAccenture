package com.corso.oop.es6.entities;

public class Dottore extends Persona{
	String specializzazione;
	double parcella;
	
	public Dottore() {
		super();
		this.specializzazione = "";
	}

	public Dottore(String n, String c, String cF, int g, int m, int a, String specializzazione, double parcella) {
		super(n, c, cF, g, m, a);
		this.specializzazione = specializzazione;
		this.parcella = parcella;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public double getParcella() {
		return parcella;
	}

	public void setParcella(double parcella) {
		this.parcella = parcella;
	}

	@Override
	public String toString() {
		return "Dottore [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", dataNascita="
				+ dataNascita + ", specializzazione=" + specializzazione + ", parcella=" + parcella + "]";
	}
}
