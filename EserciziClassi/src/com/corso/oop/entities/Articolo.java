package com.corso.oop.entities;

public class Articolo {
	String marca;
	String modello;
	double costo;
	private double prezzoVendita;
	
	public Articolo() {
		this.marca="";
		this.modello="";
	}
	
	public Articolo(String marca, String modello, double costo) {
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
		this.prezzoVendita=costo*2;
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
