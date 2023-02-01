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

	public Carta getCartainmano() {
		return cartainmano;
	}

	public void setCartainmano(Carta cartainmano) {
		this.cartainmano = cartainmano;
	}

	public String getNome() {
		return nome;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	
}
