package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.SoggettoPagante;

public class Moto implements SoggettoPagante{
	private String targa;
	private ArrayList<Persona> aBordo;
	public final static double TARIFFA = 3.5;
	private final static int MAXPASSEGGERI = 2;
	private LocalDateTime oraIngresso;
	
	
	public Moto(String targa, LocalDateTime oraIngresso) {
		super();
		this.targa = targa;
		this.aBordo = new ArrayList<Persona>();
		this.oraIngresso = oraIngresso;
	}
	
	public void addPasseggero(String nome, String cognome) throws TooManyPassengersException {
		
		for (Persona thisPerson : aBordo)
			if (thisPerson == null) {
				aBordo.add(new Persona(nome, cognome, oraIngresso));
				return;
			}
		throw new TooManyPassengersException();
	}

	public void removePasseggero(String nome, String cognome) throws PasseggeroNotFoundException {
		for (Persona thisPerson : aBordo)
			if (thisPerson.getNome().equalsIgnoreCase(nome) && thisPerson.getCognome().equalsIgnoreCase(cognome)) {
				thisPerson=null;
				return;
			}
		throw new PasseggeroNotFoundException();
	}

	@Override
	public double getTariffa() {
		// TODO Auto-generated method stub
		return TARIFFA+(Persona.TARIFFA*this.aBordo.size());
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

	public static int getMaxpasseggeri() {
		return MAXPASSEGGERI;
	}

	@Override
	public String toString() {
		return "Moto [targa=" + targa + ", aBordo=" + aBordo + ", getTariffa()=" + getTariffa() + "]";
	}

	@Override
	public LocalDateTime getOra() {
		// TODO Auto-generated method stub
		return this.oraIngresso;
	}

	@Override
	public void setOra(LocalDateTime ora) {
		// TODO Auto-generated method stub
		this.oraIngresso = ora;
	}
	
	
	
}
