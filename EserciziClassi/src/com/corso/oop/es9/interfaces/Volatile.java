package com.corso.oop.es9.interfaces;

public interface Volatile {
	public String vola();
	
	public default String doveVivo() {
		return "vivo nel cielo";
	}
}
