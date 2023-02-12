package com.corso.oop.entities;

import java.util.HashSet;
import java.util.Objects;

public class Alunno implements Comparable<Alunno>{
	private String nome;
	private String cognome;
	private final int MATRICOLA;
	private HashSet<Materia> materie;
	private float mediaVoti;

	public Alunno(String nome, String cognome, int matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.MATRICOLA = matricola;
		this.materie = new HashSet<Materia>();
		this.mediaVoti = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMATRICOLA() {
		return MATRICOLA;
	}

	public HashSet<Materia> getMaterie() {
		return materie;
	}

	public void setMaterie(HashSet<Materia> materie) {
		this.materie = materie;
	}

	public float getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(float mediaVoti) {
		this.mediaVoti=mediaVoti;
	}
	
	public void calcolaMedia() {
		for (Materia m : this.materie)
			this.mediaVoti+=m.getVoto();
		this.mediaVoti/=this.materie.size();
		setMediaVoti(this.mediaVoti);
		
	}
	
	@Override
	public int compareTo(Alunno o) {
		return this.MATRICOLA - o.MATRICOLA;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(MATRICOLA);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunno other = (Alunno) obj;
		return MATRICOLA == other.MATRICOLA;
	}

	@Override
	public String toString() {
		String m = String.format("%.2f", mediaVoti);
		return "Alunno [nome=" + nome + ", cognome=" + cognome + ", MATRICOLA=" + MATRICOLA + ", materie=" + materie
				+ ", mediaVoti=" + m + "]";
	}
	
	
	
	
}
