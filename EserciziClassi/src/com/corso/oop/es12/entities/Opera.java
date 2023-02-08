package com.corso.oop.es12.entities;

import java.util.Objects;

public abstract class Opera implements Comparable<Opera>{
	private String autore;
	private String titolo;
	private boolean esposta;
	
	public Opera(String autore, String titolo) {
		this.autore = autore;
		this.titolo = titolo;
		this.esposta = false;
	}
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setEsposta(boolean esposta) {
		this.esposta = esposta;
	}
	public boolean isEsposta() {
		return esposta;
	}

	public void esponi() {
		this.esposta=true;
	}
	
	public void riponi() {
		this.esposta=false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autore, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Opera other = (Opera) obj;
		return Objects.equals(autore, other.autore) && Objects.equals(titolo, other.titolo);
	}

	@Override
	public String toString() {
		return ", autore=" + autore + ", titolo=" + titolo + ", esposta=" + esposta + "]";
	}
	
	
	
}
