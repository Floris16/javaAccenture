package com.corso.oop.es9.subentities;

import com.corso.oop.es9.entities.Animale;
import com.corso.oop.es9.interfaces.Terrestre;

public class Gatto extends Animale implements Terrestre{

	@Override
	public String verso() {
		return "miao";
	}

	@Override
	public String doveVivo() {
		// TODO Auto-generated method stub
		return Terrestre.super.doveVivo();
	}

	@Override
	public String toString() {
		return "Gatto [nome=" + this.getNome() + ", verso()=" + verso() + ", doveVivo()=" + doveVivo() + ", corri()=" + corri()
				+ "]";
	}

	@Override
	public String corri() {
		// TODO Auto-generated method stub
		return Terrestre.super.corri();
	}
	
	
}
