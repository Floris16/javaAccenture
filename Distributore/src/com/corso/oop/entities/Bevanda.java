package com.corso.oop.entities;

import java.util.Objects;

public class Bevanda{
	private final int CODICE;
	private String nome;
	private double prezzo;
	
	
	public Bevanda(int codice, String nome, double prezzo) {
		this.CODICE = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}


	public int getCodice() {
		return CODICE;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CODICE, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bevanda other = (Bevanda) obj;
		return CODICE == other.CODICE && Objects.equals(nome, other.nome);
	}
	
	
	
}
