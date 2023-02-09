package com.corso.oop.es9.interfaces;

public interface Terrestre {
	public default String corri() {
		return "sto correndo";
	}
	
	public default String doveVivo() {
		return "vivo sulla terra";
	}
}
