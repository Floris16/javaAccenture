package com.corso.oop.interfaces;

import java.util.ArrayList;

import com.corso.oop.entities.Persona;

public interface Veicolo extends SoggettoPagante {
	public ArrayList<Persona> getPasseggeri();
	public void addPasseggeri (Persona s);
}
