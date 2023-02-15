package com.corso.oop.exceptions;

public class CodaVuotaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CodaVuotaException() {
		System.err.println("La coda è vuota");
	}
}
