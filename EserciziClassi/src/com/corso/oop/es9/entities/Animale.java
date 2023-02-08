package com.corso.oop.es9.entities;

import com.corso.oop.es9.enums.*;

public abstract class Animale {
	String nome;
	TipologiaAnimale tipo;
	SpecieAnimale specie;
	String verso;
	
	public abstract String verso();
	
	public abstract String doveVivo();

	@Override
	public abstract String toString();
	
	
	
	
}
