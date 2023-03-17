package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.corso.oop.enums.CategoriaAuto;
import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.*;

public class Auto implements Veicolo {
	private String targa;
	private CategoriaAuto tipo;
	private ArrayList<Persona> aBordo;
	private LocalDateTime oraIngresso;
	private LocalDateTime oraUscita;
	

	public Auto(CategoriaAuto tipo, String targa, LocalDateTime oraIngresso) {
		super();
		this.targa=targa;
		this.tipo = tipo;
		this.aBordo = new ArrayList<>();
		this.oraIngresso = oraIngresso;
		this.setOraUscita(null);
	}
	

	public void addPasseggero(String nome, String cognome) throws TooManyPassengersException{
		if (this.aBordo.size()<this.tipo.getCAPIENZAMASSIMA())
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

	@Override
	public double getTariffa() {
		// TODO Auto-generated method stub
		return tipo.getTariffa() + (Persona.TARIFFA * this.aBordo.size());
	}

	public CategoriaAuto getTipo() {
		return tipo;
	}

	public void setTipo(CategoriaAuto tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Persona> getaBordo() {
		return aBordo;
	}

	public void setaBordo(ArrayList<Persona> aBordo) {
		this.aBordo = aBordo;
	}

	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", tipo=" + tipo + ", aBordo=" + aBordo() + ", oraIngresso=" + oraIngresso
				+ ", oraUscita=" + oraUscita + ", getTariffa()=" + getTariffa() + "]";
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
		// TODO Auto-generated method stub
		return aBordo;
	}
	
	@Override
	public void addPasseggeri (Persona s) {
		try {
			this.addPasseggero(s.getNome(), s.getCognome());
		} catch (TooManyPassengersException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
}
