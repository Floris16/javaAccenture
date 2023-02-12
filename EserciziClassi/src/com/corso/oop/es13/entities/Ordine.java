package com.corso.oop.es13.entities;

import java.util.ArrayList;

public class Ordine {
	private int numeroTavolo;
	private ArrayList<Pizza> elencoPizze;
	
	public Ordine(int numeroTavolo) {
		super();
		this.numeroTavolo = numeroTavolo;
		this.elencoPizze = new ArrayList<Pizza>();
	}

	public int getNumeroTavolo() {
		return numeroTavolo;
	}

	public ArrayList<Pizza> getElencoPizze() {
		return elencoPizze;
	}

	public void addPizza(Pizza p) {
		this.elencoPizze.add(p);
		System.out.println("Pizza aggiunta all'ordine");
	}
	
	public double getTotale() {
		double totale=0;
		for(Pizza p : elencoPizze) {
			totale+=p.getPrezzo();
		}
		return totale;
	}

	@Override
	public String toString() {
		return "Ordine [numeroTavolo=" + numeroTavolo + ", elencoPizze=" + elencoPizze + ", totale=" + getTotale()
				+ "]";
	}
}
