package com.corso.oop.es9.interfaces;

public interface Acquatico {
	public default String nuota() {
		return "sto nuotando";
	}
	
	public default String doveVivo() {
		return "vivo in acqua";
	}
	
}
