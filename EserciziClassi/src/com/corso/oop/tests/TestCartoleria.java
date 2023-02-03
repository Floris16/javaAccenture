package com.corso.oop.tests;

import com.corso.oop.entities.*;
import com.corso.oop.utility.Utilities;

public class TestCartoleria {
	public static void main(String[] args) {
		Articolo p1 = new Penna("Faber", "Sfera", "Nero", 
	            2);
	    Articolo p2 = new Penna("Mark", "Pilot", "Blu", 
	            1);
	    Articolo p3 = new Penna("Mar", "Pilot", "Blu", 
	            1);
	    Articolo p4 = new Penna("Ma", "Pilot", "Blu", 
	            1);
	    Articolo p5 = new Penna("M", "Pilot", "Blu", 
	            1);
	    Articolo g1 = new Gomma("Gummy", "Mod1", 1, "Tondo",
	            2);
	    Articolo g2 = new Gomma("Bear", "Mod2", 2, "Square",
	            1);
	    
	    Cartoleria cart = new Cartoleria();
	    
	    cart.caricaArticolo(p1);
	    cart.caricaArticolo(p2);
	    cart.caricaArticolo(p3);
	    cart.caricaArticolo(p4);
	    cart.caricaArticolo(p5);
	    cart.caricaArticolo(g1);
	    cart.caricaArticolo(g2);
	    
	    System.out.println(cart.toString());
	    
	    p1.setCosto(4);
	    g1.setCosto(4);
	    
	    System.out.println(p1.toString());
	    System.out.println(g1.toString());
	    
	    cart.scaricaArticolo(g2);
	    System.out.println(cart.toString());
	    
	    cart.ricercaModello("Pilot");
	    
	    //System.out.println(cart.ricercaModello("Pilot").toString());
	    
	    cart.stampaArticoli(cart.ricercaModello("Pilot"));
	    System.out.println(cart.toString());
	    
	    
	    
	    System.out.println("E' entrata una nuova azienda per effettuare un ordine!");
	    Azienda a1 = new Azienda("Accenture", 25000);
	    
	    System.out.println(a1.getNome()+" vorrebbe comprare tutte le penne blu.");
	    
	    cart.stampaArticoli(cart.ricercaColorePenna("Blu"));
	    
	    System.out.println("Ok, creiamo un nuovo ordine");
	    
	    //Ordine o1 = new Ordine(a1);
	    
	    
	    
	    System.out.println("Verifico se l'ordine può essere evaso");
	    //o1.chiudiOrdine(o1.calcolaTot());
	    
	    int sclt=0;
	    
		do {

			// TEST_Cartoleria.scelta=100;

			System.out.println("\ninserisci la tua scelta:\n" 
					+ "1)Lista articoli;\n" 
					+ "2)Ricerca Marca;\n"
					+ "3)Ricerca Modello;\n"
					+ "4)Ricerca Articolo (marca,modello);\n"
					+ "5)Aggiungi articolo al carrello;\n"
					+ "6)Evadi ordine;\n"
					+ "7)Stampa costi totali;\n"
					+ "8)Stampa ricavi totali\n" 
					+ "9)Scarica articolo da codice\n");

			sclt = Utilities.leggiInt();
			System.out.println("sclt" + sclt);
			
			String str="";

			switch (sclt) {

			case 1:
				cart.toString();
				break;
			case 2:
				str = Utilities.scanString("inserisci marca: ");
				cart.stampaArticoli(cart.ricercaMarca(str));
				break;
			case 3:
				str = Utilities.scanString("inserisci modello: ");
				cart.stampaArticoli(cart.ricercaMarca(str));
				break;
			case 4:
				str = Utilities.scanString("inserisci marca: ");
				cart.stampaArticoli(cart.ricercaMarca(str));
				str = Utilities.scanString("inserisci modello: ");
				cart.stampaArticoli(cart.ricercaMarca(str));
			case 5:
				System.out.println("Sei un privato o un'azienda? (1 o 2)");
				int i=Utilities.leggiInt();
				switch (i) {
				case 1:
					str=Utilities.scanString("Inserisci il tuo nome");
					Privato pr1 = new Privato(str);
					Ordine o1 = new Ordine(pr1);
					str=Utilities.scanString("Cosa vuoi aggiungere nell'ordine?");
					i=
				}
				
			case 6:
				String marca2, modello2, nomeAz, PIVA;
				int anno2, mese2, giorno2;
				System.out.println("inserisci marca: ");
				marca2 = sc.nextLine();
				System.out.println("inserisci modello");
				modello2 = sc.nextLine();
				System.out.println("inserisci nome azienda");
				nomeAz = sc.nextLine();
				System.out.println("inserisci nome azienda");
				PIVA = sc.nextLine();
				System.out.println("inserisci anno");
				anno2 = sc.nextInt();
				System.out.println("inserisci mese");
				mese2 = sc.nextInt();
				System.out.println("inserisci giorno");
				giorno2 = sc.nextInt();
				cart.ordinaArticoloDaAzienda(marca2, modello2, nomeAz, PIVA, anno2, mese2, giorno2);
			case 7:
				cart.stampaCostiTotali();
			case 8:
				cart.stampaRicaviTotali();
			case 9:
				String codice2;
				System.out.println("inserisci codice per rimuovere");
				codice2 = sc.nextLine();
				Cartoleria.scaricaArticolo(codice2);
			}

		} while (sclt != 0);

	}

}
