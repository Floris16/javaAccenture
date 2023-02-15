package com.corso.oop.exceptions;

public class TooManyPassengersException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TooManyPassengersException() {
		System.err.println("Il veicolo è pieno, non è possibile aggiungere altri passeggeri");
	}
}
