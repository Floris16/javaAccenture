package com.corso.oop.entities;

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
