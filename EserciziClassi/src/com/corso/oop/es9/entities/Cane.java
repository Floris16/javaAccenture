package com.corso.oop.es9.entities;

import com.corso.oop.es9.interfaces.Terrestre;

public class Cane extends Animale implements Terrestre {

	@Override
	public String verso() {
		return "baubau";
	}

	@Override
	public String corri() {
		// TODO Auto-generated method stub
		return Terrestre.super.corri();
	}

	@Override
	public String doveVivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
