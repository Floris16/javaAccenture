package com.corso.oop.exceptions;

public class TooLightException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TooLightException() {
		System.err.println("Carico < 0");
	}
}
