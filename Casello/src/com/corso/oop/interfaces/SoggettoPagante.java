package com.corso.oop.interfaces;

import java.time.LocalDateTime;

public interface SoggettoPagante {
	
	public double getTariffa();
	
	public LocalDateTime getOra();
	public void setOra(LocalDateTime ora);
}
