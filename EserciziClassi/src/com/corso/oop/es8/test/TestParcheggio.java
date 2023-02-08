package com.corso.oop.es8.test;

import com.corso.oop.es8.entities.*;
import com.corso.oop.es8.utility.*;

public class TestParcheggio {

	public static void main(String[] args) {

		Veicolo v1 = new Auto(1111, 8, 12);
		Veicolo v2 = new Auto(5555, 10, 13);
		Veicolo v3 = new Bus(1234, 9, 13, 40);
		Veicolo v4 = new Camion(6565, 9, 13, 3, 1);
		Veicolo v5 = new Camion(6565, 9, 11, 5, 0);
		Veicolo v6 = new Auto(1311, 8, 12);

		Veicolo[] veicoli = { v1, v2, v3, v4, v5, v6 };

		Parcheggio parking = new Parcheggio();

		for (Veicolo v : veicoli) {
			parking.entraVettura(v);
		}

		// controllo i veicoli nel parcheggio
		System.out.println(parking);

		int ore = 3;
		for (int i = 0; i < ore; i++) {
			parking.aggiornaOra();
		}

		System.out.println("L'ora corrente è: " + parking.getOraCorrente() + "\n");

		parking.esceVettura(v4);

		// genero codice promozione finché non trova una targa corrispondente
		boolean check;
		int numIterazioni = 0;
		do {
			check = parking.promozione();
			numIterazioni++;
		} while (check != true);
		System.out.println(numIterazioni);

	}

	static int targa;
	static int oraUscita;
	static int tipoVeicolo;

	public void testingPark() {
		Parcheggio parking = new Parcheggio();
		System.out.println("Benvenuto nel PARCHEGGIO!");
		String istruzioni = "0 Visualizza i veicoli nel parcheggio" + "1 Entra un veicolo" + "2 - Esce un veicolo"
				+ "3 Dai una promozione ad un veicolo" + "4 Visualizza i veicoli presenti da più ore"
				+ "5 Esci dal programma";
		int command = 0;

		do {
			System.out.println(istruzioni);
			command = Utility.scanInt("Inserisci un comando:");
			switch (command) {

			case 0:
				System.out.println(parking);
				break;

			// ENTRA VEICOLO
			case 1:
				TestParcheggio.targa = Utility.scanInt("Inserisci la targa del veicolo: ");
				oraUscita = Utility.scanInt("Inserisci l'ora di uscita: ");
				tipoVeicolo = -1;

				do {
					tipoVeicolo = Utility
							.scanInt("Che tipo di veicolo sta entrando?" + "\n1 - Auto" + "\n2 Bus" + "\n3 Camion");
					switch (tipoVeicolo) {
					case 1:
						Veicolo v1 = new Auto(targa, parking.getOraCorrente(), oraUscita);
						break;
					case 2:
						int posti = Utility.scanInt("Quanti posti ha il bus? ");
						Veicolo v2 = new Bus(targa, parking.getOraCorrente(), oraUscita, posti);
						break;
					case 3:
						int tonn = Utility.scanInt("\nQuanti tonnellate pesa il camion? ");
						int ref = -1;
						do {
							ref = Utility.scanInt("\nIl camion ha il refrigeratore? (0/1) ");
							if (ref != 0 || ref != 1) {
								System.err.println("\nHai inserito un valore non accettato.");
								ref = -1;
							}
						} while (ref == -1);

						Veicolo v3 = new Camion(targa, parking.getOraCorrente(), oraUscita, tonn, ref);
						break;
					default:
						System.out.println("Inserire un tipo accettato.");
						tipoVeicolo = -1;
					}
				} while (tipoVeicolo == -1);
				break;

			// ESCE VEICOLO
			case 2:
				targa = Utility.scanInt("Inserisci la targa del veicolo: ");
				parking.esceVettura(targa);
				break;
			
			// DAI PROMOZIONE
			case 3:
				boolean check;
				int numIterazioni = 0;
				do {
					check = parking.promozione();
					numIterazioni++;
				} while (check != true);
				System.out.println(numIterazioni);

				break;
				
			// VISUALIZZA SPENDACCIONI
			case 4:
				parking.statVetture();
				break;

			case 5:
				System.out.println("Programma terminato. Torna a trovarci!");
				break;

			default:
				System.err.println("Comando non riconosciuto.");
				break;
			}

		} while (command != 5);

	}

}
