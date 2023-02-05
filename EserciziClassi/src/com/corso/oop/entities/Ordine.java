package com.corso.oop.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Ordine {
	private Date dataOrdine;
	private final int numero;
	private Cliente cliente;
	private ArrayList<Articolo> listaArticoli;
	private boolean effettuato;
	private static int nextOrdine=1;
	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Ordine() {
		this.dataOrdine = new Date();
		this.numero = nextOrdine++;
		this.cliente = null;
		this.listaArticoli = new ArrayList<Articolo>();
		this.effettuato = false;
	}
	
	
	public Ordine(Cliente cliente) {
		this.dataOrdine = new Date();
		this.numero = nextOrdine++;
		this.cliente = cliente;
		this.listaArticoli = new ArrayList<Articolo>();
		this.effettuato = false;
	}
	
	
	//questo costruttore mi serve per creare una copia dell'ordine, necessaria nella classe test
	public Ordine(Ordine myOrdine) {
		this.dataOrdine=myOrdine.dataOrdine;
		this.numero=myOrdine.numero;
		this.cliente=myOrdine.cliente;
		this.listaArticoli=myOrdine.listaArticoli;
		this.effettuato=myOrdine.effettuato;
	}
	
	public double calcolaTot() {
		double totale=0;
		for(Articolo thisArt : this.listaArticoli)
			totale+=thisArt.getPrezzoVendita();
		return totale;
	}
	
	
	public void chiudiOrdine(double totale) {
		if (this.cliente.scalaSoldi(totale)) {
			System.out.println("Ordine andato a buon fine.");
			this.effettuato=true;
		} else 
			System.out.println("L'ordine non è andato a buon fine.");
	}

	public int getNumero() {
		return numero;
	}
	
	public void aggiungiArticolo(Articolo myArt) {
		this.listaArticoli.add(myArt);
		
	}
}
