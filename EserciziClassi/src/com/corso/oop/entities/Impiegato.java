package com.corso.oop.entities;

public class Impiegato extends Persona{
	

	double retribuzioneAnn;
	int annoAssunzione;
	String numeroIdentif;
	
	public Impiegato() {
		super();
	}

	public Impiegato(String n, String c, String cF, int g, int m, int a, double retribuzioneAnn, int annoAssunzione,
			String numeroIdentif) {
		super(n, c, cF, g, m, a);
		this.retribuzioneAnn = retribuzioneAnn;
		this.annoAssunzione = annoAssunzione;
		this.numeroIdentif = "";
	}

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale
				+ ", dataNascita=" + dataNascita + ", retribuzioneAnn=" + retribuzioneAnn + ", annoAssunzione="
				+ annoAssunzione + ", numeroIdentif=" + numeroIdentif + "]";
	}

	public double getRetribuzioneAnn() {
		return retribuzioneAnn;
	}

	public void setRetribuzioneAnn(double retribuzioneAnn) {
		this.retribuzioneAnn = retribuzioneAnn;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}

	public String getNumeroIdentif() {
		return numeroIdentif;
	}

	public void setNumeroIdentif(String numeroIdentif) {
		this.numeroIdentif = numeroIdentif;
	}
}
