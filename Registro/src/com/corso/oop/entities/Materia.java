package com.corso.oop.entities;

import java.util.Objects;

public class Materia {
	private String nome;
	private float voto;
	
	public Materia(String nome, float voto) {
		super();
		this.nome = nome;
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getVoto() {
		return voto;
	}

	public void setVoto(float voto) {
		this.voto = voto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		String s=String.format("%.2f", voto);
		return "Materia [nome=" + nome + ", voto=" + s + "]";
	}
	
	
	
}
