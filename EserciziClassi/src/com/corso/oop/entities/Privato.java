package com.corso.oop.entities;

public class Privato extends Cliente{
	double contanti;

	public Privato() {
		super();
	}

	public Privato(String nome, double contanti) {
		super(nome);
		this.contanti = contanti;
	}
	
	public void scalaSoldi(double prezzo) {
		if (prezzo>this.contanti) {
			System.out.println("Non hai abbastanza soldi.");
			return;
		}
		
		this.contanti-=prezzo;
	}
}
