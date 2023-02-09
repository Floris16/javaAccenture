package com.corso.oop.es9.subentities;

import com.corso.oop.es9.entities.Animale;
import com.corso.oop.es9.interfaces.Volatile;

public class Piccione extends Animale implements Volatile {

	@Override
	public String verso() {
		return "prrr";
	}

	@Override
	public String doveVivo() {
		// TODO Auto-generated method stub
		return Volatile.super.doveVivo();
	}

	@Override
	public String toString() {
		return "Piccione [nome=" + this.getNome() + ", verso()=" + verso() + ", doveVivo()=" + doveVivo() + ", vola()=" + vola() + "]";
	}

	@Override
	public String vola() {
		// TODO Auto-generated method stub
		return "sto volando";
	}

}
