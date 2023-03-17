package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.*;

public class Moto implements SoggettoPagante, Veicolo{
	private String targa; 
	private ArrayList<Persona> aBordo;
	public final static double TARIFFA = 3.5;
	private final static int MAXPASSEGGERI = 2;
	private LocalDateTime oraIngresso;
	private LocalDateTime oraUscita;
	
	
	public Moto(String targa, LocalDateTime oraIngresso) {
		super();
		this.targa = targa;
		this.aBordo = new ArrayList<Persona>();
		this.oraIngresso = oraIngresso;
		this.oraUscita = null;
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
		return "Moto [targa=" + targa + ", aBordo=" + aBordo() + ", oraIngresso=" + oraIngresso + ", oraUscita="
				+ oraUscita + ", getTariffa()=" + getTariffa() + "]";
	}

	@Override
	public LocalDateTime getOraIngresso() {
		// TODO Auto-generated method stub
		return this.oraIngresso;
	}

	@Override
	public void setOraIngresso(LocalDateTime ora) {
		// TODO Auto-generated method stub
		this.oraIngresso = ora;
	}

	public LocalDateTime getOraUscita() {
		return oraUscita;
	}

	public void setOraUscita(LocalDateTime oraUscita) {
		this.oraUscita = oraUscita;
	}
	
	public String aBordo() {
		String s = "[";
		for (Persona p : aBordo) {
			s+=p.persona();
		}
		s+="]";
		return s;
	}

	@Override
	public ArrayList<Persona> getPasseggeri() {
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
