package com.corso.oop.entities;

import java.util.TreeSet;

import com.corso.oop.comparator.AlunnoBySurname;
import com.corso.oop.factories.FactoryAlunni;

public class Registro{
	private TreeSet<Alunno> registro;
	private TreeSet<Alunno> registroFinale;

	public Registro() {
		this.registro = new TreeSet<>();
		this.registroFinale= new TreeSet<>(new AlunnoBySurname());
	}
	
	public void genRegistro() {
		while (this.registro.size()<10) {
			this.aggiungiAlunno();
		}
	}
	
	public void ordina() {
		this.registroFinale.addAll(this.registro);
	}
	
	public void aggiungiAlunno() {
		FactoryAlunni f = new FactoryAlunni();
		this.registro.add(f.creaAlunno());
		ordina();
	}

	public TreeSet<Alunno> getRegistro() {
		return registro;
	}

	@Override
	public String toString() {
		String s="";
		for (Alunno a : registroFinale)
			System.out.printf("%7d %20s %20s %2.1f\n",a.getMATRICOLA(),a.getCognome(),a.getNome(),a.getMediaVoti());
		
		return s;
	}
	
	
}
