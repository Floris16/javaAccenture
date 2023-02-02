package com.corso.oop.entities;

import java.util.ArrayList;
import java.util.Date;

public class Ordine {
	Date dataOrdine;
	int numero;
	Cliente cliente;
	ArrayList<Articolo> listaArticoli;
	
	public Ordine() {
		this.dataOrdine=new Date();
		this.numero=0;
		this.cliente=new Cliente();
		this.listaArticoli=new ArrayList<Articolo>();
	}

	public Ordine(Date dataOrdine, int numero, Cliente cliente, ArrayList<Articolo> listaArticoli) {
		this.dataOrdine = dataOrdine;
		this.numero = numero;
		this.cliente = cliente;
		this.listaArticoli = listaArticoli;
	}
	
	
	
	
}
