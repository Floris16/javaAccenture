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
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public Date getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}


	@SuppressWarnings("deprecation")
	public int getAge() {
		Date now=new Date();
		
		int age=now.getYear()-this.dataNascita.getYear();
		
		return age;
	}
}
