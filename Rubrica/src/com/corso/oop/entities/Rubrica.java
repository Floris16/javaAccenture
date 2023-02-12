package com.corso.oop.entities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Rubrica {
	TreeMap<String, Contatto> rubrica;

	public Rubrica() {
		this.rubrica=new TreeMap<>();
	}
	
	public void addContatto(String nome, int numero, String email) {
		if (this.rubrica.containsKey(nome))
			return;
		this.rubrica.put(nome,new Contatto(nome,numero,email));
	}
	
	public void deleteContatto(String nome) {
		if (this.rubrica.containsKey(nome)) {
			this.rubrica.remove(nome);
			System.out.println("Success");
		} else
			System.err.println("Error 404: " + nome + " not found");
	}
	
	public void updateContatto(Contatto myContatto) {
		this.rubrica.replace(myContatto.getNome(), myContatto);
	}

	@Override
	public String toString() {
		return "Rubrica [rubrica=" + rubrica + "]";
	}
	
	public Contatto ricercaNome(String nome) {
		if (this.rubrica.containsKey(nome))
			return this.rubrica.get(nome);
		return null;
	}
	
	public Contatto ricercaNumero(int numero) {
		
		Set<String> contatti = rubrica.keySet();
		Iterator<String> iter = contatti.iterator();
		
		while (iter.hasNext()) {
			String s = iter.next(); 
			if (this.rubrica.get(s).getNumero()==numero)
				return this.rubrica.get(s);
		}
		
		return null;
	}
	
	public Contatto ricercaEmail(String email) {
		Set<String> contatti = rubrica.keySet();
		
		for (String nomi : contatti)
			if (this.rubrica.get(nomi).getEmail().equalsIgnoreCase(email))
				return this.rubrica.get(email);
		
		return null;
	}	
}
