package com.corso.oop.entities;

public class Giocatore {
	String nome;
	Carta cartainmano;
	int punteggio;
	
	public Giocatore() {
	}
	
	public Giocatore(String nome) {
		this.nome=nome;
	}

	public int getPunteggio() {
		return punteggio;
	}
	
	
}
