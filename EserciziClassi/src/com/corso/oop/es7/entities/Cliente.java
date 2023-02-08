package com.corso.oop.es7.entities;

public abstract class Cliente {
	final String denominazione;
	
	
	public Cliente() {
		this.denominazione="";
	}
	
	public Cliente(String nome) {
		this.denominazione=nome;;
	}

	public String getNome() {
		return denominazione;
	}
	
	public boolean scalaSoldi(double prezzo) {
		return true;
	}
}