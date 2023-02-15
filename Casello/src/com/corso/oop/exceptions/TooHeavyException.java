package com.corso.oop.exceptions;

public class TooHeavyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TooHeavyException() {
		System.err.println("Il tir e' troppo pesante");
	}
}
