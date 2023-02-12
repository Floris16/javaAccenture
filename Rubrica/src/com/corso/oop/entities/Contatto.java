package com.corso.oop.entities;

public class Contatto implements Comparable<Contatto>{
	private final String NOME;
	private int numero;
	private String email;
	
	public Contatto(String nome, int numero, String email) {
		this.NOME=nome;
		this.numero=numero;
		this.email=email;
	}

	@Override
	public int compareTo(Contatto o) {
		return this.NOME.compareToIgnoreCase(o.NOME);
	}

	public String getNome() {
		return NOME;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + NOME + ", numero=" + numero + ", email=" + email + "]\n";
	}
	
	
	
}
