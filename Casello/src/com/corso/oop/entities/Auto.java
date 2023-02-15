package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.corso.oop.enums.CategoriaAuto;
import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.SoggettoPagante;

public class Auto implements SoggettoPagante {
	private String targa;
	private CategoriaAuto tipo;
	private ArrayList<Persona> aBordo;
	private LocalDateTime oraIngresso;
	

	public Auto(CategoriaAuto tipo, String targa, LocalDateTime oraIngresso) {
		super();
		this.targa=targa;
		this.tipo = tipo;
		this.aBordo = new ArrayList<>();
		this.oraIngresso = oraIngresso;
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
		return "Auto [targa=" + targa + ", tipo=" + tipo + ", aBordo=" + aBordo + ", getTariffa()=" + getTariffa()
				+ ", getTipo()=" + getTipo() + "]";
	}

	@Override
	public LocalDateTime getOra() {
		// TODO Auto-generated method stub
		return this.oraIngresso;
	}

	@Override
	public void setOra(LocalDateTime ora) {
		// TODO Auto-generated method stub
		this.oraIngresso=ora;
	}

	
}
