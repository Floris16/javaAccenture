package com.corso.oop.entities;

import java.util.Date;

public class Persona {
	
	String nome;
	String cognome;
	String codiceFiscale;
	Date dataNascita;
	
	public Persona() {
		nome="";
		cognome="";
		codiceFiscale="";
		dataNascita=new Date();
	}
	
	public Persona(String n, String c, String cF, int g, int m, int a) {
		nome=n;
		cognome=c;
		codiceFiscale=cF;
		dataNascita=new Date (a-1900,m-1,g);
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

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", dataNascita="
				+ dataNascita + "]";
	}
	
	
}
