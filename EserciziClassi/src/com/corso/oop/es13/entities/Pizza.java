package com.corso.oop.es13.entities;

import java.util.ArrayList;

public class Pizza {
	private String nome;
	private ArrayList<Ingrediente> ingredienti;
	private static double prezzoBase;
	
	public Pizza(String nome) {
		this.nome=nome;
		this.ingredienti=new ArrayList<Ingrediente>();
	}
	
	public void aggiungiIngrediente(Ingrediente ingr) {
		this.ingredienti.add(ingr);
	}
	
	public boolean hasIngredientiCongelati() {
		for(Ingrediente thisIngr : ingredienti)
			if (thisIngr.isCongelato())
				return true;
		return false;
	}

	public double getPrezzo() {
		double prezzoFinale=prezzoBase;
		for (Ingrediente thisIngr : ingredienti) {
			prezzoFinale+=thisIngr.getPrezzo();
		}
		
		return prezzoFinale;
	}

	public static void setPrezzoBase(double prezzoBase) {
		Pizza.prezzoBase = prezzoBase;
	}

	@Override
	public String toString() {
		return "Pizza [nome=" + nome + ", ingredienti=" + ingredienti + "]\n";
	}
	
	
}
