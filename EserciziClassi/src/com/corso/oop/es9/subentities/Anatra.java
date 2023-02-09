package com.corso.oop.es9.subentities;

import com.corso.oop.es9.entities.Animale;
import com.corso.oop.es9.interfaces.*;

public class Anatra extends Animale implements Acquatico, Volatile {

	@Override
	public String verso() {
		return "quack";
	}

	@Override
	public String doveVivo() {
		return null;
	}

	@Override
	public String toString() {
		return "Anatra [nome=" + this.getNome() + ", verso()=" + verso() + ", doveVivo()=" + doveVivo() + ", vola()=" + vola()
				+ ", nuota()=" + nuota() + "]";
	}

	public String vola() {
		// TODO Auto-generated method stub
		return "sto volando";
	}

	@Override
	public String nuota() {
		// TODO Auto-generated method stub
		return Acquatico.super.nuota();
	}

	
}
