package com.corso.oop.entities;

public class Azienda extends Cliente{
	double conto;

	public Azienda() {
		super();
	}

	public Azienda(String nome, double conto) {
		super(nome);
		this.conto=conto;
	}
	
	public void scalaSoldi(double prezzo) {
		if (prezzo>this.conto) {
			System.out.println("Non hai abbastanza soldi.");
			return;
		}
		
		this.conto-=prezzo;
	}
}
