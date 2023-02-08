package com.corso.oop.es7.test;

import com.corso.oop.es7.entities.*;
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
	    
	    cart.stampaArticoli(cart.ricercaModello("Pilot"));
	    System.out.println(cart.toString());
	    
	    
	    int scelta=0;
	    Ordine o1 = new Ordine();	    
		do {


			System.out.println("\ninserisci la tua scelta:\n" 
					+ "1)Lista articoli;\n" 
					+ "2)Ricerca Marca;\n"
					+ "3)Ricerca Modello;\n"
					+ "4)Ricerca Articolo (marca,modello);\n"
					+ "5)Crea ordine e aggiungi articoli al carrello;\n"
					+ "6)Evadi ordine;\n"
					+ "7)Stampa costi totali;\n"
					+ "8)Stampa ricavi totali\n" 
					+ "0)Esci");

			scelta = Utilities.leggiInt();
			
			String str="";
			String str1="";

			switch (scelta) {

			case 1:
				cart.stampaArticoli();
				break;
			case 2:
				str = Utilities.scanString("inserisci marca: ");
				cart.stampaArticoli(cart.ricercaMarca(str));
				break;
			case 3:
				str = Utilities.scanString("inserisci modello: ");
				cart.stampaArticoli(cart.ricercaModello(str));
				break;
			case 4:
				str = Utilities.scanString("inserisci marca: ");
				str1 = Utilities.scanString("inserisci modello: ");
				
				cart.stampaArticoli(cart.ricercaArticoli(str,str1));
				break;
				
				
				
				//tutti gli altri metodi di ricerca all'interno di cartoleria non sono stati implementati
			case 5:
				o1 = creaOrdine(cart);
				break;
				
			case 6:
				if (o1.getCliente()==null) {
					System.out.println("Non hai creato ancora l'ordine");
					break;
				}
				o1.chiudiOrdine(o1.calcolaTot());
				break;
			case 7:
				cart.stampaCosti();
				break;
			case 8:
				cart.stampaRicavi();
				break;
			case 0:
				System.out.println("Stai uscendo dal programma"); 
				return;
			default:
				System.err.println("Input sbagliato!");
			}
		} while (scelta != 0);

	}
	
	public static Ordine creaOrdine (Cartoleria cart){
		System.out.println("Sei un privato o un'azienda? (1 o 2)");
		int i = Utilities.leggiInt();
		String str = "";
		Ordine o1=new Ordine();
		
		do {
			switch (i) {
			case 1: 
				str=Utilities.scanString("Inserisci il tuo nome");
				Privato pr1 = new Privato(str);
				o1.setCliente(pr1);
				System.out.println("Che articolo vuoi aggiungere?");
				o1=aggiungiArticolo(cart,o1);
				break;
			
			case 2: 
				str=Utilities.scanString("Inserisci il nome dell'azienda");
				Azienda az1 = new Azienda (str, Utilities.generaDouble());
				o1.setCliente(az1);
				System.out.println("Che articolo vuoi aggiungere?");
				o1=aggiungiArticolo(cart,o1);
				break;

			default:
				System.err.println("Input non valido");
				System.out.println("Inserisci un numero che sia 1 o 2!!");
				i=Utilities.leggiInt();
			} 
		} while (i!=1 && i!=2);
		
		return o1;
		
		
	}
	
	public static Ordine aggiungiArticolo(Cartoleria cart, Ordine myOrd) {
		int i = 0;
		boolean cond;
		do {
			System.out.println("Inserisci il codice dell'articolo da aggiungere " +
					"al tuo ordine (digita -1 per stampare la lista degli articoli)");
			i=Utilities.leggiInt();
			if (i==-1) {
				cart.stampaArticoli();
				i=Utilities.leggiInt();
			}
			myOrd.aggiungiArticolo(cart.getMagazzino().get(i)); 
			cart.scaricaArticolo(cart.getMagazzino().get(i));
			
			System.out.println("Vuoi aggiungere altro? 1=si");
			i=Utilities.leggiInt();
			
			cart.stampaArticoli();
			
			cond  = (i==1) ? true : false;
		} while (cond);
		return myOrd;
	}
}

