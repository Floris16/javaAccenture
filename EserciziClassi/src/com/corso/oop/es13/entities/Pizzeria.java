package com.corso.oop.es13.entities;

import java.util.ArrayList;

public class Pizzeria {
	private String nome;
	private int numeroTavoli;
	private ArrayList<Pizza> menu;
	private ArrayList<Ordine> ordini;

	public Pizzeria(String nome, int numeroTavoli, double prezzoBase) {
		this.menu = new ArrayList<Pizza>();
		this.ordini = new ArrayList<Ordine>();
		this.nome = nome;
		this.numeroTavoli = numeroTavoli;
		Pizza.setPrezzoBase(prezzoBase);
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTavoli() {
		return numeroTavoli;
	}

	public ArrayList<Pizza> getMenu() {
		return menu;
	}

	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}
	
	public void prendiOrdine (Pizza p, int numTavolo) {
		
		for (Ordine o : this.ordini)
			if (o.getNumeroTavolo()==numTavolo) {
				o.addPizza(p);
				System.out.println("Pizza aggiunta");
				return;
			}
		
		this.ordini.add(new Ordine(numTavolo));
		this.ordini.get(this.ordini.size()-1).addPizza(p);
		System.out.println("Pizza aggiunta a un nuovo ordine");
	}
	
	public Ordine getConto(int numTavolo) {
		for (Ordine o : this.ordini) {
			if (o.getNumeroTavolo()==numTavolo) {
				return o;
			}
		}
		System.err.println("Ordine non trovato");
		return null;
	}
	
	
}
