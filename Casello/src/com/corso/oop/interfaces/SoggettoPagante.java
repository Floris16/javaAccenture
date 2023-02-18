package com.corso.oop.interfaces;

import java.time.LocalDateTime;

public interface SoggettoPagante {
	public double getTariffa();
	public String toString();
	
	public LocalDateTime getOraIngresso();
	public void setOraIngresso(LocalDateTime ora);
	
	public LocalDateTime getOraUscita();
	public void setOraUscita(LocalDateTime ora);
	
}
