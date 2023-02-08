package com.corso.oop.es9.entities;

import com.corso.oop.es9.interfaces.Terrestre;

public class Gatto extends Animale implements Terrestre{

	@Override
	public String verso() {
		return "miao";
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
