package com.corso.oop.es13.entities;

public class Ingrediente {
	private String nome;
	private boolean congelato;
	private double prezzo;
	
	
	public Ingrediente(String nome, boolean congelato, double prezzo) {
		this.nome = nome;
		this.congelato = congelato;
		this.prezzo = prezzo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isCongelato() {
		return congelato;
	}


	public void setCongelato(boolean congelato) {
		this.congelato = congelato;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Ingrediente [nome=" + nome + ", congelato=" + congelato + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
