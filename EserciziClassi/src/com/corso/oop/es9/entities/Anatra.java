package com.corso.oop.es9.entities;

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
		// TODO Auto-generated method stub
		return null;
	}

	public String vola() {
		// TODO Auto-generated method stub
		return Volatile.super.vola();
	}

	@Override
	public String nuota() {
		// TODO Auto-generated method stub
		return Acquatico.super.nuota();
	}

	
}
