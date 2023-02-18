package com.corso.oop.tests;

import com.corso.oop.entities.Casello;
import com.corso.oop.exceptions.CodaVuotaException;
import com.corso.oop.exceptions.TooHeavyException;
import com.corso.oop.factories.Factory;
import com.corso.oop.interfaces.SoggettoPagante;
import com.corso.oop.utilities.Utilities;

public class Menu {
	public Menu() {
		Casello casello = new Casello(0);
		int scelta, transitante;
		String nome, cognome;
		SoggettoPagante s = null;
		
		do {
			System.out.println("Menù\n"
					+"1)Crea nuovo soggetto transitante\n"
					+"2)Aggiungi transitante in coda\n"
					+"3)Aggiorna l'orologio\n"
					+"4)Rimuovi transitante dalla coda\n"
					+"5)Stampa casello\n"
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
					s = Factory.factoryPersona();
					System.out.println(s.toString());
					break;
				case 2:
					s = Factory.factoryAuto();
					System.out.println(s.toString());
					break;
				case 3:
					s = Factory.factoryMoto();
					System.out.println(s.toString());
					break;
				case 4:
					try {
						s = Factory.factoryTir();
						System.out.println(s.toString());
					} catch (TooHeavyException e) {
						e.getMessage();
					}
					break;
				case 0:
					break;
				}
				break;
			case 2:
				casello.aggiungiInCoda(s);
				break;
			case 3:
				casello.aggiornaOre(Utilities.leggiInt("Ore?"), Utilities.leggiInt("Minuti?"));
				break;
			case 4:
				try {
					casello.rimuovi();
				} catch (CodaVuotaException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			case 5:
				casello.toString();
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
