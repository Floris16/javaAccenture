package com.corso.oop.es11.entities;

import com.corso.oop.es11.interfaces.Azioni;

public abstract class Tamagotchi implements Azioni{
	private final int ENERGIAINIZ = 3;
	
	private String nome;
	private String specie;
	private double peso;
	private double altezza;
	private static int energia;
	
	public Tamagotchi(String nome, String specie, double peso, double altezza) {
		this.nome = nome;
		this.specie = specie;
		this.peso = peso;
		this.altezza = altezza;
		Tamagotchi.energia = this.ENERGIAINIZ;
	}
	
	public Tamagotchi() {
	}

	public String getNome() {
		return nome;
	}

	public String getSpecie() {
		return specie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public static int getEnergia() {
		return energia;
	}

	public static void setEnergia(int en) {
		energia = en;
	}

	@Override
	public String toString() {
		return "Tamagotchi [nome=" + nome + ", specie=" + specie + ", peso=" + peso + ", altezza=" + altezza + ", energia="+ Tamagotchi.energia +"]";
	}
	
	public boolean checkEnergia() {
		if (Tamagotchi.getEnergia()>1)
			return true;
		System.err.println("Non hai abbastanza energia");
		return false;
	}
	
	public boolean checkPeso(double modifier) {
		if (this.getPeso()-modifier>0)
			return true;
		System.err.println("Pesi troppo poco!");
		return false;
	}
	
	
	
}
