package com.corso.oop.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;

import com.corso.oop.exceptions.*;
import com.corso.oop.interfaces.*;

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
	
	public void aggiungiInCoda(SoggettoPagante transitante) throws CodaVuotaException, TransitanteNullException {
		if (transitante!=null) {
			coda.addLast(transitante);
			riceviPagamento(transitante);
		} else 
			throw new TransitanteNullException();
	}
	
	public void aggiungiInCoda(Veicolo transitante) throws PasseggeroNotFoundException, TransitanteNullException, CodaVuotaException {
		if (transitante==null)
			throw new TransitanteNullException();
		
		if (transitante.getPasseggeri().size()==0)
			throw new PasseggeroNotFoundException();
		else {
			coda.addLast(transitante);
			riceviPagamento(transitante);
		}
	}
	
	public void riceviPagamento(SoggettoPagante transitante) throws CodaVuotaException {
		try {
			cassa+=transitante.getTariffa();
		}catch(Exception e) {
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
	
	public void rimuovi() throws CodaVuotaException{
		try {
			LocalDateTime oraUscita = LocalDateTime.now();
			System.out.println("Il soggetto ha attraversato il casello in " + Duration.between(this.coda.getFirst().getOraIngresso(),oraUscita));
			this.coda.getFirst().setOraUscita(oraUscita);
			System.out.println("Rimosso: " + this.coda.getFirst());
			
			this.coda.removeFirst();
		}catch(Exception e) {
			throw new CodaVuotaException();
		}
	}

	@Override
	public String toString() {
		return "Casello [cassa=" + cassa + ", coda=" + coda + ", orologio=" + orologio + "]";
	}
	
	
}
