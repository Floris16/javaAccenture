package com.corso.oop.entities;

import java.util.Date;

public class Persona {
	
	String nome;
	String cognome;
	String codiceFiscale;
	Date dataNascita;
	
	public Persona(String n, String c, String cF, Date dN) {
		nome=n;
		cognome=c;
		codiceFiscale=cF;
		dataNascita=dN;
	}
	
	@SuppressWarnings("deprecation")
	public int getAge() {
		Date now=new Date();
		
		int age=now.getYear()-this.dataNascita.getYear();
		
		return age;
	}
}
