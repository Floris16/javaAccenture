package com.corso.oop.es12.subentities;

import com.corso.oop.es12.entities.Opera;

public class Quadro extends Opera {
	private String tecnica;

	public Quadro(String autore, String titolo, String tecnica) {
		super(autore, titolo);
		this.tecnica = tecnica;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "Quadro [tecnica=" + tecnica + super.toString();
	}

	@Override
	public int compareTo(Opera arg0) {
		return super.getTitolo().compareToIgnoreCase(arg0.getTitolo());
	}
	
	
}
