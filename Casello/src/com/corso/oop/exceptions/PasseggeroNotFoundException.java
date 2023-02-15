package com.corso.oop.exceptions;

public class PasseggeroNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PasseggeroNotFoundException() {
		System.err.println("Error 404: Passenger not found");
	}
}
