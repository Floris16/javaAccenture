package com.corso.oop.tests;

import com.corso.oop.entities.*;
import com.corso.oop.exceptions.CodaVuotaException;
import com.corso.oop.exceptions.NotAVeichleException;
import com.corso.oop.exceptions.PasseggeroNotFoundException;
import com.corso.oop.exceptions.TooHeavyException;
import com.corso.oop.exceptions.TransitanteNullException;
import com.corso.oop.factories.Factory;
import com.corso.oop.interfaces.*;
import com.corso.oop.utilities.Utilities;

public class Menu {
	public Menu() throws CodaVuotaException, TransitanteNullException, PasseggeroNotFoundException {
		Casello casello = new Casello(0);
		int scelta, transitante, sel;
		String nome, cognome;
		SoggettoPagante soggetto = null;
		Veicolo veicolo = null;
		Persona persona = null;
		
		do {
			System.out.println("Menù\n"
					+"1)Crea nuovo soggetto transitante\n"
					+"2)Aggiungi transitante in coda\n"
					+"3)Aggiungi persona in veicolo\n"
					+"4)Aggiorna l'orologio\n"
					+"5)Rimuovi transitante dalla coda\n"
					+"6)Stampa casello\n"
					+"0)Esci dal programma");
			
			scelta=Utilities.leggiInt("Fai la tua scelta");
			
			
			switch (scelta) {
			case 1:
				transitante = Utilities.leggiInt("Di che tipologia?\n"
						+"1)Persona\n"
						+"2)Auto\n"
						+"3)Moto\n"
						+"4)Tir\n"
						+"0)Annulla");
				switch (transitante) {
				case 1:
					persona = Factory.factoryPersona();
					System.out.println(persona.toString());
					break;
				case 2:
					veicolo = Factory.factoryAuto();
					System.out.println(veicolo.toString());
					break;
				case 3:
					veicolo = Factory.factoryMoto();
					System.out.println(veicolo.toString());
					break;
				case 4:
					try {
						veicolo = Factory.factoryTir();
						System.out.println(veicolo.toString());
					} catch (TooHeavyException e) {
						e.getMessage();
					}
					break;
				case 0:
					break;
				}
				break;
			case 2:
				try {
					casello.aggiungiInCoda(soggetto);
				} catch (TransitanteNullException tne) {
					tne.getMessage();
				}
				
				break;
			case 3: 
				if (soggetto == null) {
					System.err.println("Nessun passeggero creato, prima creane uno");
					break;
				}
				veicolo.addPasseggeri(persona);
				break;
			case 4:
				casello.aggiornaOre(Utilities.leggiInt("Ore?"), Utilities.leggiInt("Minuti?"));
				break;
			case 5:
				try {
					casello.rimuovi();
				} catch (CodaVuotaException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			case 6:
				System.out.println(casello.toString());
				break;
			case 0:
				System.out.println("Uscita in corso.");
				return;
			default:
				System.err.println("Input errato");
			}
		} while (scelta!=0);
		
		
	}
}
