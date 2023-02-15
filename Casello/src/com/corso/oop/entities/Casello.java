package com.corso.oop.entities;

import java.time.LocalDateTime;
import java.util.LinkedList;

import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.SoggettoPagante;

public class Casello {
	private double cassa;
	private LinkedList<SoggettoPagante> coda;
	private LocalDateTime orologio;
	
	
	public Casello(double cassa) {
		super();
		this.cassa = cassa;
		this.coda = new LinkedList<>();
		this.orologio = LocalDateTime.now();
	}
	
	public void aggiungiInCoda(SoggettoPagante transitante) {
		coda.addLast(transitante);
		
		try {
			riceviPagamento(transitante);
		} catch (CodaVuotaException e) {
			e.getMessage();
		}
	}
	
	public void riceviPagamento(SoggettoPagante transitante) throws CodaVuotaException {
		try {
			cassa+=transitante.getTariffa();
		}catch(Exception cde) {
			throw new CodaVuotaException();
		}
	}
	
	public void aggiornaOre (int ore, int minuti) {
		if (ore < 0 && minuti < 0) {
			System.err.println("Input sbagliato");
			return;
		}
			
		this.orologio.plusHours(ore);
		this.orologio.plusMinutes(minuti);
	}
	
	public void rimuovi() {
		this.coda.removeFirst();
	}
}
