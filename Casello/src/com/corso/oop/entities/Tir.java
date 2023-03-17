package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.*;

public class Tir implements SoggettoPagante, Veicolo{
	private String targa;
	private ArrayList<Persona> aBordo;
	private double merceABordo;
	private LocalDateTime oraIngresso;
	private LocalDateTime oraUscita;
	private final static int MAXPASSEGGERI = 9; //https://it.wikipedia.org/wiki/Autocarro#Caratteristiche
	private final static int MAXCAPIENZA = 32;
	private final static double TARIFFAP = 12.5;
	private final static double TARIFFAM = 0.5;
	
	
	public Tir(String targa, double merceABordo, LocalDateTime oraIngresso) throws TooHeavyException {
		super();
		this.targa = targa;
		if (merceABordo<=MAXCAPIENZA)
			this.merceABordo = merceABordo;
		else
			throw new TooHeavyException();
		this.oraIngresso=oraIngresso;
		this.oraUscita=null;
		this.aBordo = new ArrayList<>();
	}
	
	public void addPasseggero(String nome, String cognome) throws TooManyPassengersException{
		if (this.aBordo.size()<MAXPASSEGGERI)
			this.aBordo.add(new Persona(nome, cognome, oraIngresso));
		else
			throw new TooManyPassengersException();
	}

	public void removePasseggero(String nome, String cognome) throws PasseggeroNotFoundException {
		for (Persona thisPerson : aBordo)
			if (thisPerson.getNome().equalsIgnoreCase(nome) && thisPerson.getCognome().equalsIgnoreCase(cognome)) {
				aBordo.remove(thisPerson);
				return;
			}
		throw new PasseggeroNotFoundException();
	}
	
	public void addMerce(double merce) throws TooHeavyException {
		if (this.merceABordo+merce<=MAXCAPIENZA) {
			this.merceABordo+=merce;
			return;
		}
		throw new TooHeavyException();
	}
	
	public void removeMerce(double merce) throws TooLightException {
		if (this.merceABordo-merce>=0) {
			this.merceABordo-=merce;
			return;
		}
		throw new TooLightException();
	}

	@Override
	public double getTariffa() {
		// TODO Auto-generated method stub
		return TARIFFAP + aBordo.size()*Persona.TARIFFA + merceABordo*TARIFFAM;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public ArrayList<Persona> getaBordo() {
		return aBordo;
	}

	public void setaBordo(ArrayList<Persona> aBordo) {
		this.aBordo = aBordo;
	}

	public double getMerceABordo() {
		return merceABordo;
	}

	public void setMerceABordo(double merceABordo) {
		this.merceABordo = merceABordo;
	}

	public static int getMaxpasseggeri() {
		return MAXPASSEGGERI;
	}

	public static int getMaxcapienza() {
		return MAXCAPIENZA;
	}

	public static double getTariffap() {
		return TARIFFAP;
	}

	public static double getTariffam() {
		return TARIFFAM;
	}

	@Override
	public String toString() {
		return "Tir [targa=" + targa + ", aBordo=" + aBordo + ", merceABordo=" + merceABordo + ", oraIngresso="
				+ oraIngresso + ", oraUscita=" + oraUscita + ", getTariffa()=" + getTariffa() + "]";
	}

	@Override
	public LocalDateTime getOraIngresso() {
		// TODO Auto-generated method stub
		return this.oraIngresso;
	}

	@Override
	public void setOraIngresso(LocalDateTime ora) {
		// TODO Auto-generated method stub
		this.oraIngresso=ora;
	}

	public LocalDateTime getOraUscita() {
		return oraUscita;
	}

	public void setOraUscita(LocalDateTime oraUscita) {
		this.oraUscita = oraUscita;
	}

	@Override
	public ArrayList<Persona> getPasseggeri() {
		// TODO Auto-generated method stub
		return aBordo;
	}
	
	@Override
	public void addPasseggeri(SoggettoPagante s) {
		this.addPasseggeri(s);
	}
	
	public void addPasseggeri (Persona s) {
		try {
			addPasseggero(s.getNome(), s.getCognome());
		} catch (TooManyPassengersException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
}
