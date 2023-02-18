package com.corso.oop.exceptions;

import com.corso.oop.interfaces.Veicolo;

public class NotAVeichleException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NotAVeichleException(Veicolo v) {
		System.out.println(checkPersona(v));
	}
	
	public boolean checkPersona(Veicolo v) {
		if (v.getPasseggeri().size()==0)
			return false;
		return true;
	}
	
	
}	
