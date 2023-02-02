package com.corso.oop.entities;

public class Cliente {
	final String nome;
	
	
	public Cliente() {
		this.nome="";
	}
	
	public Cliente(String nome) {
		this.nome=nome;;
	}

	public String getNome() {
		return nome;
	}
}
