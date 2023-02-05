package com.corso.oop.entities;

public class Articolo {
	protected String marca;
	protected String modello;
	protected double costo;
	private double prezzoVendita;
	protected int numeroArticolo;
	private static int nextArt=0;
	
	
	public Articolo() {
		this.marca="";
		this.modello="";
	}
	
	public Articolo(String marca, String modello, double costo) {
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
		this.prezzoVendita=costo*2;
		this.numeroArticolo=nextArt++;
	}
	
	public Articolo(Articolo myArt) {
		this.marca = myArt.marca;
		this.modello = myArt.modello;
		this.costo = myArt.costo;
		this.prezzoVendita=myArt.prezzoVendita;
		this.numeroArticolo=myArt.numeroArticolo;
	}
	
	

	public int getNumeroArticolo() {
		return numeroArticolo;
	}

	public void setNumeroArticolo(int numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
		this.prezzoVendita=2*costo;
	}

	public double getPrezzoVendita() {
		return prezzoVendita;
	}

	@Override
	public String toString() {
		return "Articolo [marca=" + marca + ", modello=" + modello + ", costo=" + costo + ", prezzoVendita="
				+ prezzoVendita + "]";
	}
	
	
}
