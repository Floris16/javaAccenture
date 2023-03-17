package com.corso.bibliotecadao.entities;

import java.util.Objects;

public class Utente {

	private long idUtente;
	private String nome;
	private String cognome;
	
	
	public Utente() {
		super();
	}

	public Utente(long idUtente, String nome, String cognome) {
		super();
		this.idUtente = idUtente;
		this.nome = nome;
		this.cognome = cognome;
	}
	

	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}




	public long getIdUtente() {
		return idUtente;
	}




	public void setIdUtente(long idUtente) {
		this.idUtente = idUtente;
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


	public void setCognome(String congnome) {
		this.cognome = congnome;
	}


	

	@Override
	public String toString() {
			String s = String.format("%10s\t%20s\t%20s\n", idUtente, nome, cognome);
			return s;

	}




	@Override
	public int hashCode() {
		return Objects.hash(idUtente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return idUtente == other.idUtente;
	}
	
	

}
