package com.corso.oop.es12.entities;

import java.util.ArrayList;
import java.util.Collections;

public class Museo {
	private String nome;
	private ArrayList<Opera> sala;
	private int dimMaxSala;
	private ArrayList<Opera> deposito;
	
	public Museo(String nome, int dimSala) {
		this.nome=nome;
		this.sala=new ArrayList<Opera>();
		this.dimMaxSala=dimSala;
		this.deposito=new ArrayList<Opera>();
	}
	
	public void Carica(Opera opera) {
		if (this.sala.size()>=this.dimMaxSala) {
			System.err.println("Non c'è abbastanza spazio nella sala");
			System.out.println("Metto l'opera nel deposito");
			
			this.deposito.add(opera);
			return;
		}
		
		this.sala.add(opera);
		opera.esponi();
	}
	
	public Opera sposta(int posizione) {
		
		if(posizione<0 || posizione>=this.sala.size() || this.sala.get(posizione)==null) {
			System.err.println("L'opera è già nel deposito");
			return null;
		}
		
		Opera o=this.sala.get(posizione);
		this.deposito.add(o);
		this.sala.remove(o);
		o.riponi();
		return o;
	}
	
	public Opera cerca(String titolo) {
		//cerco prima nel deposito
		for (Opera o : this.deposito) 
			if (o.getTitolo().equalsIgnoreCase(titolo))
				return o;
		//controllo nella sala
		for (Opera o : this.sala)
			if (o.getTitolo().equalsIgnoreCase(titolo))
				return o;
		
		return null;
	}
	
	public String stampaSala() {
		String s="";
		for (Opera o : this.sala)
			s+=o.toString() + "(indice=" + this.sala.indexOf(o) + ")\n";
		return s;
	}
	
	public String stampaDeposito() {
		String s="";
		for (Opera o : this.deposito)
			s+=o.toString() + "(indice=" + this.deposito.indexOf(o) + ")\n";
		return s;
	}
	
	public void riordinaDeposito() {
		Collections.sort(deposito);
	}
}
