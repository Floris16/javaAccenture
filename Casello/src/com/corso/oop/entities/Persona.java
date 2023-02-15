package com.corso.oop.entities;

import java.time.LocalDateTime;

import com.corso.oop.interfaces.SoggettoPagante;

public class Persona implements SoggettoPagante{
	private String nome;
	private String cognome;
	public static final double TARIFFA = 2.5;
	private LocalDateTime oraIngresso;
	
	public Persona(String nome, String cognome, LocalDateTime oraIngresso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.oraIngresso = oraIngresso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public double getTariffa() {
		// TODO Auto-generated method stub
		return TARIFFA;
	}

	@Override
	public LocalDateTime getOra() {
		// TODO Auto-generated method stub
		return this.oraIngresso;
	}

	@Override
	public void setOra(LocalDateTime ora) {
		// TODO Auto-generated method stub
		this.oraIngresso=ora;
	}
	
}
