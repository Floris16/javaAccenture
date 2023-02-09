package com.corso.oop.es9.subentities;

import com.corso.oop.es9.entities.Animale;
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
		return "Cane [nome=" + this.getNome() + ", verso()=" + verso() + ", corri()=" + corri() + ", doveVivo()=" + doveVivo()
				+ "]";
	}

	
	
}
