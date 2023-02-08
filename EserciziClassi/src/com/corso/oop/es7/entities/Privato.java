package com.corso.oop.es7.entities;

public class Privato extends Cliente{

	public Privato() {
		super();
	}

	public Privato(String nome) {
		super(nome);
	}
	
	@Override
	public boolean scalaSoldi(double prezzo) {
		System.out.printf("Hai pagato %.2f€",prezzo);
		return super.scalaSoldi(prezzo);
	}
}
