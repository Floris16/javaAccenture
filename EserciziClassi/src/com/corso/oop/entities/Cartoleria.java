package com.corso.oop.entities;

import java.util.ArrayList;

public class Cartoleria {
	ArrayList<Articolo> magazzino;
	int indexOf;
	
	public Cartoleria() {
		this.magazzino=new ArrayList<Articolo>();
	}
	
	public void caricaArticolo(Articolo myArt) {
		this.magazzino.add(myArt);
	}
	
	public void scaricaArticolo(Articolo myArt) {
		int index=ricercaArticolo(myArt);
		if (index==-1) {
			System.out.println("Articolo non presente");
			return;
		}
		scaricaArticolo(index);
	}
	
	public void scaricaArticolo(int index) {
		this.magazzino.remove(index);
	}
	
	
	public void svuotaMagazzino() {
		this.magazzino.clear();
	}
	
	public int ricercaArticolo(Articolo myArt) {
		int index;
		for (Articolo thisArt : this.magazzino) {
			if (thisArt==myArt) {
				index=this.magazzino.indexOf(thisArt);
				return index;
			}
		}
		System.out.println("Articolo non presente in magazzino");
		return -1;
	}
	
	public ArrayList<Integer> ricercaMarca(String marca) {
		ArrayList<Integer> marche = new ArrayList<Integer>();
		for (Articolo thisArt : this.magazzino)
			if (marca.equals(thisArt.getModello()))
				marche.add(this.magazzino.indexOf(thisArt));
		System.out.println("Trovati " + marche.size());
		return marche;	
	}
	
	public ArrayList<Integer> ricercaModello(String modello) {
		ArrayList<Integer> modelli = new ArrayList<Integer>();
		for (Articolo thisArt : this.magazzino)
			if (modello.equals(thisArt.getModello()))
				modelli.add(this.magazzino.indexOf(thisArt));
		System.out.println("Trovati " + modelli.size());
		return modelli;	
	}
	
	public ArrayList<Integer> ricercaPerPrezzi(double prezzo) {
		ArrayList<Integer> costi = new ArrayList<Integer>();
		for (Articolo thisArt : this.magazzino)
			if (thisArt.getCosto()<=prezzo)
				costi.add(this.magazzino.indexOf(thisArt));
		System.out.println("Trovati " + costi.size() + " che costano meno di " + prezzo);
		return costi;	
	}
	
	public ArrayList<Integer> ricercaPenna() {
		ArrayList<Integer> penne = new ArrayList<Integer>();
		for (Articolo thisArt : this.magazzino)
			if (thisArt instanceof Penna)
				penne.add(this.magazzino.indexOf(thisArt));
		System.out.println("Trovati " + penne.size());
		return penne;
	}
	
	public ArrayList<Integer> ricercaColorePenna(String colore) {
		ArrayList<Integer> indiciPenne = ricercaPenna();
		ArrayList<Integer> colori = new ArrayList<Integer>();
		for (int i : indiciPenne) {
			Penna penna = (Penna) this.magazzino.get(i);
			if (penna.colore.equals(colore))
				colori.add(i);
			
		}
		System.out.println("Trovati " + colori.size());
		return colori;	
	}
	
	public ArrayList<Integer> ricercaGomme() {
		ArrayList<Integer> gomme = new ArrayList<Integer>();
		for (Articolo thisArt : this.magazzino)
			if (thisArt instanceof Gomma)
				gomme.add(this.magazzino.indexOf(thisArt));
		System.out.println("Trovati " + gomme.size());
		return gomme;
	}
	
	public ArrayList<Integer> ricercaPerDimensioniGomma(double dimensione) {
		ArrayList<Integer> indiciGomme = ricercaGomme();
		ArrayList<Integer> dimensioni = new ArrayList<Integer>();
		for (int i : indiciGomme) {
			Gomma gomma = (Gomma) this.magazzino.get(i);
			if (gomma.dimensioni<=dimensione)
				dimensioni.add(i);
			
		}
		System.out.println("Trovati " + dimensioni.size());
		return dimensioni;	
	}
	
	public ArrayList<Integer> ricercaFormaGomma(String forma) {
		ArrayList<Integer> indiciGomme = ricercaGomme();
		ArrayList<Integer> forme = new ArrayList<Integer>();
		for (int i : indiciGomme) {
			Gomma gomma = (Gomma) this.magazzino.get(i);
			if (gomma.forma.equals(forma))
				forme.add(i);
			
		}
		System.out.println("Trovati " + forme.size());
		return forme;	
	}
	
	public void stampaArticoli() {
		for (Articolo thisArt : this.magazzino) {
			System.out.println(thisArt);
		}
	}
	public void stampaArticoli(ArrayList<Integer> articoli) {
		for (int indice : articoli) {
			System.out.println(this.magazzino.get(indice));
		}
	}
	
	
	public void stampaCosti() {
		double totale=0;
		for (Articolo thisArt : this.magazzino) {
			totale+=thisArt.getCosto();
		}
		System.out.println(totale);
	}
	
	public void stampaRicavi() {
		double totale=0;
		for (Articolo thisArt : this.magazzino) {
			totale+=thisArt.getPrezzoVendita();
		}
		System.out.println(totale);
	}

	@Override
	public String toString() {
		return "Cartoleria [magazzino=" + magazzino + "]";
	}
}
