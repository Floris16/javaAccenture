package com.corso.oop.entities;

public class Paziente extends Persona{
	String numeroIdentif;
	String patologia;
	
	public Paziente() {
		super();
		this.numeroIdentif = "";
		this.patologia = "";
	}

	public Paziente(String n, String c, String cF, int g, int m, int a, String numeroIdentif, String patologia) {
		super(n, c, cF, g, m, a);
		this.numeroIdentif = numeroIdentif;
		this.patologia = patologia;
	}

	public String getNumeroIdentif() {
		return numeroIdentif;
	}

	public void setNumeroIdentif(String numeroIdentif) {
		this.numeroIdentif = numeroIdentif;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", dataNascita="
				+ dataNascita + ", numeroIdentif=" + numeroIdentif + ", patologia=" + patologia + "]";
	}
	
}
